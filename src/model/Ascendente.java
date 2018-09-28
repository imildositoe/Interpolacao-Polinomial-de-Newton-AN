package model;

import java.util.ArrayList;

/**
 *
 * @author Dercio Juizo
 * @author Imildo Sitoe
 * @author Silva Muzime
 *
 * @see Caminho
 *
 */
public class Ascendente extends Caminho {

    public ArrayList<Double> caminhoAscendente(ArrayList<ArrayList> diferencas, int posicao) {
        ArrayList<Double> valores = new ArrayList<>();

        for (int i = 0; i < diferencas.size(); i++) {
            try {
                valores.add((double) diferencas.get(i).get(posicao--));
            } catch (IndexOutOfBoundsException e) {
            }
        }

        return valores;
    }

    public double getXNA(double[] xi, double x) {
        for (int i = 0; i < xi.length; i++) {
            if (x > xi[i] && x < xi[i + 1]) {
                return xi[i + 1];
            }
        }
        return 0;
    }
    
    public int posicaoXND(double[] xi, double x) {
        for (int i = 0; i < xi.length; i++) {
            if (x > xi[i] && x < xi[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }

    @Override
    public double getTeta(double[] xi, double x) {
        return (x - this.getXNA(xi, x)) / super.getH(xi);
    }

    @Override
    public ArrayList getListaDeNs(double[] xi, double x, ArrayList<ArrayList> diferencas, int posicao) {
        ArrayList<Double> listaDeNs = new ArrayList<>();
        double n = this.getTeta(xi, x);
        listaDeNs.add(n);
        for (int i = 1; i < this.caminhoAscendente(diferencas, posicao).size(); i++) {
            n *= ((this.getTeta(xi, x) + i) / (i + 1));
            listaDeNs.add(n);
        }
        return listaDeNs;
    }

    @Override
    public double getFDeX(ArrayList<ArrayList> diferencas, int posicao, double[] xi, double x) {
        double y = this.caminhoAscendente(diferencas, posicao).get(0);
        for (int i = 0; i < this.caminhoAscendente(diferencas, posicao).size(); i++) {
            try {
                y += ((double) this.getListaDeNs(xi, x, diferencas, posicao).get(i) * (double) this.caminhoAscendente(diferencas, posicao).get(i + 1));
            } catch (IndexOutOfBoundsException e) {
            }
        }
        return y;
    }
}
