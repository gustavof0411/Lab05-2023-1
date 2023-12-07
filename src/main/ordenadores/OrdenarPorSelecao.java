package ordenadores;

public class OrdenarPorSelecao implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        if (array != null && array.length > 1) {
            for (int i = 0; i < array.length - 1; i++) {
                int indiceMenor = i;
                for (int proximo = i + 1; proximo < array.length; proximo++) {
                    if (array[proximo] < array[indiceMenor]) {
                        indiceMenor = proximo;
                    }
                }
                int salva = array[indiceMenor];
                array[indiceMenor] = array[i];
                array[i] = salva;
            }
        }
        return array;
    }
}
