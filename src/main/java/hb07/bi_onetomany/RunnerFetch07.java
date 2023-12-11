package hb07.bi_onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch07 {

    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student07.class).addAnnotatedClass(Book07.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Student07 student= session.get(Student07.class,1001);

        //student.getBookList().forEach(System.out::println);
        //student.getBookList().forEach(b-> System.out.println(b));

        //id'si verilen öğrencilerin bilgilerini getirme

//        String sqlQuery1="select s.student_name, b.name from student07  s inner join book07 b on s.id=b.student_id";
//        List<Object[]> resultList1=session.createNativeQuery(sqlQuery1).getResultList();
//
//        for (Object[] objects : resultList1){
//            System.out.println(Arrays.toString(objects));
//        }

//        String hqlQuery1="select s.name,b.name from Student07 s inner join FETCH Book07 b on s.id=b.student";
//        List<Object[]> resultList2=session.createQuery(hqlQuery1).getResultList();
//        resultList2.forEach(oa-> System.out.println(Arrays.toString(oa)));

//        String sqlQuery="Delete from Book07";
//        int numOfRec= session.createNativeQuery(sqlQuery).executeUpdate();
//        System.out.println("Effected Row count : "+numOfRec);

//        String sqlQuery="Delete from Student07";
//        int numOfRec2= session.createNativeQuery(sqlQuery).executeUpdate();
//        System.out.println("Effected Row count : "+numOfRec2);

//        String hqlQuery1="Delete from Book07";
//        int numOfRec3= session.createQuery(hqlQuery1).executeUpdate();
//        System.out.println("Effected Row count : "+numOfRec3);
//
//        String hqlQuery2="Delete from Student07 ";
//        int numOfRec4= session.createQuery(hqlQuery2).executeUpdate();
//        System.out.println("Effected Row count : "+numOfRec4);

        //kitap ismine göre kitap silmeyi sağlayan HQL

//        String hqlQuery3="Delete from Book07 b where b.name='John''s Art Book'";
//        int numOfRec5=session.createQuery(hqlQuery3).executeUpdate();
//        System.out.println("Effected Row count : "  +numOfRec5);

//        String hqlQuery4="Delete from Book07 b where b.student=1002";//referans ile silme
//        String hqlQuery4="Delete from Book07 b where b.student.id=1002";
//        int numOfRec6=session.createQuery(hqlQuery4).executeUpdate();
//        System.out.println("Effected Row count : "  +numOfRec6);

        //kitaba sahip olmayan öğrenciyi silme
//        String hqlQuery5="Delete from Student07 s Where s.id=1001";
//        int numOfRec7=session.createQuery(hqlQuery5).executeUpdate();
//        System.out.println("Effected Row count : "  +numOfRec7);

        //kitaba sahip öğrenciyi silmede hata alınır foreign keyden kaynaklı
        /*
        ERROR: update or delete on table "student07" violates foreign key constraint
        "fk95pa12xmsmpq144c2dq69x5m1" on table "book07"*/

//        String hqlQuery6="Delete from Student07 s Where s.id=1003";
//        int numOfRec8=session.createQuery(hqlQuery6).executeUpdate();
//        System.out.println("Effected Row count : "  +numOfRec8);

//        Student07 student0=session.get(Student07.class,1003);
//        session.delete(student0);
//        student0.getBookList().set(0,null);

//        String hqlQuery7="Select s from Student07 s join Book07 b on s.id=b.student";
//        session.createQuery(hqlQuery7).getResultList();

//        String hqlQuery8="Select s from Student07 s join s.bookList";
//        session.createQuery(hqlQuery8).getResultList();

//        String hqlQuery7="Select s from Student07 s join s.bookList b where b.name like '%Book%'";
//        List<Student07> resultList1= session.createQuery(hqlQuery7).getResultList();
//
//        resultList1.forEach(b-> System.out.println(b));

        tx.commit();
        session.close();
        sf.close();
    }
}
