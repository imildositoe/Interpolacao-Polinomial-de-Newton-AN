package model;

import java.util.ArrayList;

/**
 *
 * @author Dercio Juizo
 * @author Imildo Sitoe
 * @author Silva Muzime
 * 
 */
public abstract class Caminho {

    protected double getH(double[] xi) {
        return (xi[1]) - (xi[0]);
    }
    
    protected abstract double getTeta(double[] xi, double x);
    
    protected abstract ArrayList getListaDeNs(double[] xi, double x, ArrayList<ArrayList> diferencas, int posicao);
    
    public abstract double getFDeX(ArrayList<ArrayList> diferencas, int posicao, double[] xi, double x);
}
