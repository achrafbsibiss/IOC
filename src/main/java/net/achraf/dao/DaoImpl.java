package net.achraf.dao;

import org.springframework.stereotype.Component;

/**
 * @author macbook
 **/

@Component("d")
public class DaoImpl implements  IDao {

    @Override
    public double getData() {
        System.out.println("Version for database");
        double data = 39;
        return data;
    }
}
