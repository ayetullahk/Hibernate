package hb08.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch08 {

    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student08.class).addAnnotatedClass(Book08.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

//        Student08 student= session.get(Student08.class,1001);
//        System.out.println(student.getBookList());

//        Book08 book= session.get(Book08.class,101);
//        System.out.println(book.getStudents());

//        String hqlQuery1="select s from Student08 s join fetch s.bookList b";
//        List<Student08>resultList1=session.createQuery(hqlQuery1).getResultList();
//        resultList1.forEach(o-> System.out.println(o));

        //isteğe göre alanlar seciliyor burada join fetch kullanılmalı
        String hqlQuery2="select s.name, b.name from Student08 s join  s.bookList b";
        List<Object[]>resultList2=session.createQuery(hqlQuery2).getResultList();
        resultList2.forEach(o-> System.out.println(Arrays.toString(o)));

//        for (Object[] objects:resultList2){
//            System.out.println(Arrays.toString(objects));
//        }



        tx.commit();
        session.close();
        sf.close();
    }
}
