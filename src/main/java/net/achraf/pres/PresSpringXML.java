package net.achraf.pres;

import net.achraf.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author macbook
 **/
public class PresSpringXML {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) context.getBean("metier");

        System.out.println("Result = " + metier.getCalcul());
    }
}
