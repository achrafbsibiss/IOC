package net.achraf.ext;

import net.achraf.dao.IDao;

/**
 * @author macbook
 **/
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Capture ....");
        double t = 12;
        return t;
    }
}
