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
public class Descendente extends Caminho {

    public ArrayList<Double> caminhoDescendente(ArrayList<ArrayList> diferencas, int posicao) {
        ArrayList<Double> valores = new ArrayList<>();
        return this.caminhoDescendente(diferencas, posicao, 0, valores);
    }

    private ArrayList<Double> caminhoDescendente(ArrayList<ArrayList> diferencas, int posicao, int i, ArrayList<Double> valores) {
        if (i == diferencas.size()) {
            return valores;
        }
        try {
            valores.add((double) diferencas.get(i++).get(posicao));
        } catch (IndexOutOfBoundsException e) {

        }
        return caminhoDescendente(diferencas, posicao, i, valores);
    }

    private double getXND(double[] xi, double x) { //Pode ocorrer um IndexOutOfBound por causa do [i+1]
        for (int i = 0; i < xi.length; i++) {
            if (x > xi[i] && x < xi[i + 1]) {
                return xi[i];
            }
        }
        return 0;
    }

    @Override
    protected double getTeta(double[] xi, double x) {
        return (x - this.getXND(xi, x)) / super.getH(xi);
    }

    @Override
    protected ArrayList getListaDeNs(double[] xi, double x, ArrayList<ArrayList> diferencas, int posicao) {
        ArrayList<Double> listaDeNs = new ArrayList<>();
        double n = this.getTeta(xi, x);
        listaDeNs.add(n);
        for (int i = 1; i < this.caminhoDescendente(diferencas, posicao).size(); i++) {
            n *= ((this.getTeta(xi, x) - i) / (i + 1));
            listaDeNs.add(n);
        }
        return listaDeNs;
    }

    @Override
    public double getFDeX(ArrayList<ArrayList> diferencas, int posicao, double[] xi, double x) {
        double y = this.caminhoDescendente(diferencas, posicao).get(0);
        for (int i = 0; i < this.caminhoDescendente(diferencas, posicao).size(); i++) {
            try {
                y += (((double) this.getListaDeNs(xi, x, diferencas, posicao).get(i)) * ((double) this.caminhoDescendente(diferencas, posicao).get(i + 1)));
            } catch (IndexOutOfBoundsException e) {
            }
        }
        return y;
    }
}
