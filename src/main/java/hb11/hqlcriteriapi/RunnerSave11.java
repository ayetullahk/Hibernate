package hb11.hqlcriteriapi;

import hb10.idgenerationstrategy.Book10;
import hb10.idgenerationstrategy.Student10;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Random;

public class RunnerSave11 {
    public static void main(String[] args) {



        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student11.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Random random=new Random();

        for (int i = 0; i < 50; i++) {
            Student11 student=new Student11();
            student.setName("Student name"+i);
            student.setMathGrade(random.nextInt(100));
            session.save(student);
        }

        tx.commit();
        session.close();
        sf.close();


    }
}
