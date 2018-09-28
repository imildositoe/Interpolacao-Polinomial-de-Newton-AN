package controller;

import model.Ascendente;
import model.Descendente;
import model.Diferencas;

/**
 *
 * @author Dercio Juizo
 * @author Imildo Sitoe
 * @author Silva Muzime
 * 
 */
public class Testes {

    public static void main(String[] args) {
        Diferencas d = new Diferencas();
        Descendente x = new Descendente();
        Ascendente y = new Ascendente();
        double a[][] = {{0, 1, 2}, {-2, 4, 12}};

        System.out.println(d.diferencas(a));
        System.out.println(x.caminhoDescendente(d.diferencas(a), 0));
        System.out.println(y.caminhoAscendente(d.diferencas(a), 3));
        System.out.println(x.getFDeX(d.diferencas(a), 0, new double[]{0, 1, 2}, 0.25));
        System.out.println(y.getFDeX(d.diferencas(a), 2, new double[]{0, 1, 2}, 1.75));
    }
}
