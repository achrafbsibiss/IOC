package net.achraf.dao;

/**
 * @author macbook
 **/
public class DaoImpl implements  IDao {

    @Override
    public double getData() {
        System.out.println("Version for database");
        double data = 39;
        return data;
    }
}
