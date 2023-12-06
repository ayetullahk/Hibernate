package hb06.uni_onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch06 {

    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student06.class).addAnnotatedClass(Book06.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

//        Student06 student=session.get(Student06.class,1001);
//
//        System.out.println(student);

        //öğrenci id ile kitaplara ulaşım

//        String hqlQuery1="from Book06 b where b.id=101";
//
//        Book06 book=session.createQuery(hqlQuery1, Book06.class).uniqueResult();
//
//        System.out.println(book);

//        Student06 student=session.get(Student06.class,1001);
//        student.getBookList().forEach(b-> System.out.println(b));

//        Book06 book=session.get(Book06.class,101);
//        System.out.println(book);

        //bir öğrencinin kitaplarını öğrenci id ye göre getirme

//        String hglQuery2="select b.id, b.name from Student06 s inner join  s.bookList b where s.id=1001";
//        List<Object[]> resultList=session.createQuery(hglQuery2).getResultList();
//
//        resultList.forEach(oa-> System.out.println(Arrays.toString(oa)));



        tx.commit();
        session.close();
        sf.close();
    }
}
