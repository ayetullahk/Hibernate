package hb02.embeddable;

import hb01.annotations.Student01;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave02 {
    public static void main(String[] args) {

        Student02 student01 = new Student02();
        student01.setId(1001);
        student01.setName("John Coffee");
        student01.setGrade(10);

        Address address1=new Address();
        address1.setStreet("Apple Street");
        address1.setCity("New york");
        address1.setCountry("US");
        address1.setZipCode("06852");

        student01.setAddress(address1);

        Address address2=new Address();
        address2.setStreet("elma caddasi");
        address2.setCity("elazığ");
        address2.setCountry("turkey");
        address2.setZipCode("03654");

        Student02 student02 = new Student02();
        student02.setId(1002);
        student02.setName("James Bond");
        student02.setGrade(10);

        student02.setAddress(address2);



        Configuration con = new
                Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student02.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(student01);
        session.save(student02);

        tx.commit();

        //session close edilmeli edilmez ise connection acık kalır
        session.close();

        sf.close();

    }


}



