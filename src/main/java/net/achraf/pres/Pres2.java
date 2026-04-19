package net.achraf.pres;


import net.achraf.dao.IDao;
import net.achraf.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author macbook
 **/
public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));

        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metieClassName = sc.nextLine();
        Class cMetie = Class.forName(metieClassName);
        IMetier metie = (IMetier) cMetie.getConstructor(IDao.class).newInstance(dao);
//        IMetier metie = (IMetier) cMetie.getConstructor().newInstance();
//        Method setDao = cMetie.getDeclaredMethod("setDao", IDao.class);


        System.out.println(dao.getClass());
//        System.out.println(setDao.invoke(metie, dao));
        System.out.println(metie.getClass());
    }
}
