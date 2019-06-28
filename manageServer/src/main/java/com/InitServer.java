package com;

import com.table.Tb_User;
import com.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by wangzy on 2019/6/28.
 */
public class InitServer {

    public InitServer() {
        init();
    }

    private void init() {
        Session session = HibernateUtil.openSession();
        session.getTransaction().begin();
        Tb_User user = new Tb_User();
        user.setUsername("17621789001");
        user.setSuperPassword("123456");
        user.setPassword("123456");
        user.setLoginname("17621789001");
        user.setEnable(true);
        user.setEmail("1324633295@qq.com");
        session.saveOrUpdate(user);
        session.getTransaction().commit();
    }

}
