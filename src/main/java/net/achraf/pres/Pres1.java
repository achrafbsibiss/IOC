package net.achraf.pres;

import net.achraf.dao.DaoImpl;
import net.achraf.metier.MetierImpl;

/**
 * @author macbook
 **/
public class Pres1 {
    public static void main(String[] args){
        DaoImpl dao = new DaoImpl();
        MetierImpl  metier = new MetierImpl(); // good practice make the injection
//        metier.setDao(dao);  don't use the setter
        System.out.println("Result  = " + metier.getCalcul());
    }
}
