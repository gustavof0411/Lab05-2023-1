package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int meio = array.length / 2;
        int[] metadeEsq = new int[meio];
        int[] metadeDir = new int[array.length - meio];

        for (int i = 0; i < meio; i++) {
            metadeEsq[i] = array[i];
        }
        for (int i = meio; i < array.length; i++) {
            metadeDir[i - meio] = array[i];
        }
        metadeEsq = ordene(metadeEsq);
        metadeDir = ordene(metadeDir);
        return merge(metadeEsq, metadeDir);
    }

    public int[] merge(int[] array, int[] array2) {
        int seta1 = 0;
        int seta2 = 0;
        int[] arrayMerge = new int[array.length + array2.length];
    
        for (int i = 0; i < arrayMerge.length; i++) {
            if (seta1 < array.length && (seta2 >= array2.length || array[seta1] < array2[seta2])) {
                arrayMerge[i] = array[seta1];
                seta1++;
            } else {
                arrayMerge[i] = array2[seta2];
                seta2++;
            }
        }
    
        return arrayMerge;
    }
}
    