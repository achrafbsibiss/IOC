package net.achraf.pres;

import net.achraf.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author macbook
 **/
public class PresSpringAnot {
    public static void  main(String[] args){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("net.achraf.dao", "net.achraf.metier", "net.achraf.ext");


        IMetier metier = applicationContext.getBean(IMetier.class);

        System.out.println("Result = " + metier.getCalcul());
    }
}
