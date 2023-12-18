package hb12.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch12 {

    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student12.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        System.out.println("First get for id 1");
        Student12 student1 = session.get(Student12.class, 1L);

        //clear metodu ile csche temizlendi
        //session.clear();

        System.out.println("Second get for id 1");
        Student12 student2 = session.get(Student12.class, 1L);

        System.out.println("Second get for id 2");
        Student12 student3 = session.get(Student12.class, 2L);

        tx.commit();
        session.close();
        sf.close();
    }
}
