package hb01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave01 {
    public static void main(String[] args) {

        Student01 student01 = new Student01();
        student01.setId(1001);
        student01.setName("John Coffee");
        student01.setGrade(10);

        Student01 student02 = new Student01();
        student02.setId(1002);
        student02.setName("James Bond");
        student02.setGrade(10);

        Student01 student03 = new Student01();
        student03.setId(1003);
        student03.setName("Tony Stark");
        student03.setGrade(11);

        Configuration con = new
                Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student01.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(student01);
        session.save(student02);
        session.save(student03);

        tx.commit();

        //session close edilmeli edilmez ise connection acık kalır
        session.close();

        sf.close();

    }


}



