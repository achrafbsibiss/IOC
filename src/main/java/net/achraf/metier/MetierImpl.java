package net.achraf.metier;

import net.achraf.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author macbook
 **/

@Component("metier")
public class MetierImpl implements IMetier {

    private IDao dao;

    public MetierImpl(){}

    @Autowired
    public MetierImpl(@Qualifier("d2") IDao dao){
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
