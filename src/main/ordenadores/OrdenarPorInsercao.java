package ordenadores;

public class OrdenarPorInsercao implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        if (array != null) {
            for (int i = 1; i < array.length; i++) {
                int salva = array[i];
                int proximo = i - 1;
                while (proximo >= 0 && array[proximo] > salva) {
                    array[proximo + 1] = array[proximo];
                    proximo = proximo - 1;
                }
                array[proximo + 1] = salva;
            }
        }
        return array;
    }
}
