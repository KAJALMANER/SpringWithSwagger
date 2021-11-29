package com.csi.dao;

import com.csi.model.Coustmer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CoustmerDaoImpl implements CoustmerDao {

private static SessionFactory factory= new AnnotationConfiguration().configure().buildSessionFactory();

    @Override
    public void saveData(Coustmer coustmer) {
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(coustmer);
        transaction.commit();
    }

    @Override
    public List<Coustmer> getALLData() {
        Session session=factory.openSession();
        List<Coustmer> coustmers=session.createQuery("from Coustmer").list();
        return coustmers;

    }

    @Override
    public boolean signin(Coustmer coustmer) {
        Session session=factory.openSession();
        boolean flag=false;
        List<Coustmer>custliCoustmerList=session.createQuery("from Coustmer").list();
        for (Coustmer c:custlist)
        {


        }
        return flag;
    }
}
