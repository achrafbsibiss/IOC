package net.achraf.pres;

import net.achraf.dao.DaoImpl;
import net.achraf.metier.MetierImpl;
import net.achraf.net.achraf.ext.DaoImplV2;

/**
 * @author macbook
 **/
public class Pres1 {
    public static void main(String[] args){
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl  metier = new MetierImpl(dao); // good practice make the injection
//        metier.setDao(dao);  don't use the setter
        System.out.println("Result  = " + metier.getCalcul());
    }
}
