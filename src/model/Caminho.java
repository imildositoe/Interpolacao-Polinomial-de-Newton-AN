package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author Dercio Juizo
 * @author Imildo Sitoe
 * @author Silva Muzime
 *
 */
public abstract class Caminho {

    public double getH(double[] xi) {
        BigDecimal bd = new BigDecimal((xi[1]) - (xi[0])).setScale(5, RoundingMode.HALF_EVEN);
        
        System.out.println(new BigDecimal(1.973553).setScale(5, RoundingMode.HALF_EVEN).doubleValue());
//        return Math.round(xi[1]) - (xi[0]);`
        return new BigDecimal((xi[1]) - (xi[0])).setScale(5, RoundingMode.HALF_EVEN).doubleValue();
    }

    public abstract double getTeta(double[] xi, double x);

    public abstract ArrayList getListaDeNs(double[] xi, double x, ArrayList<ArrayList> diferencas, int posicao);

    public abstract double getFDeX(ArrayList<ArrayList> diferencas, int posicao, double[] xi, double x);
}
