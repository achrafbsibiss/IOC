package net.achraf.ext;

import net.achraf.dao.IDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author macbook
 **/

@Component("d2")
@Primary
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Capture ....");
        double t = 12;
        return t;
    }
}
