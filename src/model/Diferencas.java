package model;

import java.util.ArrayList;

/**
 *
 * @author Dercio Juizo
 * @author Imildo Sitoe
 * @author Silva Muzime
 *
 */
public class Diferencas {

    public ArrayList<ArrayList> diferencas(double[][] matriz) {
        ArrayList<Double> listaDelta = new ArrayList<>();
        ArrayList<ArrayList> diferencas = new ArrayList<>();

        for (int i = 0; i < matriz[1].length; i++) {
            ArrayList<Double> listaTemporaria = new ArrayList<>();
            listaTemporaria.clear();

            if (i == 0) {
                ArrayList firstCopy = new ArrayList();
                for (int j = 0; j < matriz[1].length; j++) {
                    listaDelta.add(matriz[1][j]);
                }

                for (int j = 0; j < matriz[1].length; j++) {
                    firstCopy.add(listaDelta.get(j));
                }
                diferencas.add(firstCopy);
            } else {
                ArrayList secondCopy = new ArrayList();
                for (int j = 0; j < listaDelta.size() - 1; j++) {
                    double diferencaDividida = (listaDelta.get(j + 1)) - (listaDelta.get(j));
                    listaTemporaria.add(diferencaDividida);

                    if (j == listaDelta.size() - 2) {
                        listaDelta.clear();
                        for (int k = 0; k < listaTemporaria.size(); k++) {
                            listaDelta.add(listaTemporaria.get(k));
                        }

                        for (int k = 0; k < listaDelta.size(); k++) {
                            secondCopy.add(listaDelta.get(k));
                        }
                    }
                }
                diferencas.add(secondCopy);
            }
        }
        return diferencas;
    }
}
