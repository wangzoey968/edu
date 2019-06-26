import com.table.Tb_User;
import com.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

/**
 * Created by wangzy on 2019/6/26.
 */
public class TT {

    @Test
    public void tttt() {
        HibernateUtil.initSessionFactory();
        Session session = HibernateUtil.openSession();
        session.getTransaction().begin();
        Tb_User user = new Tb_User();
        user.setEmail("ssss");
        user.setEnable(true);
        user.setLoginname("------");
        user.setPassword("---dddddddddd");
        user.setSuperPassword("------------dddddd");
        user.setUsername("dddsseee");

        session.save(user);
        session.getTransaction().commit();
    }

}
