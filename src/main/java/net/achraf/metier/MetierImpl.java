package net.achraf.metier;

import net.achraf.dao.IDao;

/**
 * @author macbook
 **/
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(){}

    public MetierImpl(IDao dao){
        this.dao = dao;
    }

    @Override
    public double getCalcul() {
        double t = dao.getData();
        double res = t * Math.PI / 2 * Math.cos(t);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
