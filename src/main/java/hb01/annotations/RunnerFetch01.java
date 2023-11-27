package hb01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch01 {

    public static void main(String[] args) {
        Configuration con = new
                Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student01.class);
        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

//        Student01 student01 = session.get(Student01.class, 1001);
//        Student01 student02 = session.get(Student01.class, 1002);
//        Student01 student03 = session.get(Student01.class, 1003);

//        System.out.println(student01);
//        System.out.println(student02);
//        System.out.println(student03);


        //SQL örneği
        // SQL sorgusu
//        String sqlQuery = "SELECT * FROM t_student01";

        // SQL sorgusunu çalıştırmak için
//        List<Object[]> resultList01 = session.createNativeQuery(sqlQuery).getResultList();

//        Query query1=session.createNativeQuery(sqlQuery);
//        List<Object[]> resultList02 =query1.getResultList();
//
//
//        for (Object[] row : resultList01) {
//            // Sonuçları işleyin
//            for (Object data : row) {
//                System.out.print(data + " ");
//            }
//            System.out.println();
//        }

        //HQL örneği --> Sql sorgusunda FROM dan  sonra  sınıf ismi kullanılmalı kullanılmazsa "is not mapped" alınır
//        String hqlQuery1="From Student01";
//        List<Student01> resultList3=session.createQuery(hqlQuery1,Student01.class).getResultList();
//
//        for (Student01 student01: resultList3){
//            System.out.println(student01);
//        }

//        String sglQuery2="SELECT * From  t_student01 where student_name= 'John Coffee'";
//        Object[] uniqueResult1=(Object[]) session.createNativeQuery(sglQuery2).uniqueResult();
//
//        System.out.println(Arrays.toString(uniqueResult1));
//
//        System.out.println(uniqueResult1[0]+":"+uniqueResult1[1]+":"+uniqueResult1[2]);

        //HQL ile unique result sorgulama
//        String hglQuery2="From  Student01 where name= 'John Coffee'";
//        Student01 uniqueResult2=session.createQuery(hglQuery2,Student01.class).uniqueResult();
//        System.out.println(uniqueResult2);

        //HQL ile Alias kullanma örneği
//        String hglQuery2="From  Student01 std where std.name= 'John Coffee'";
//        Student01 uniqueResult2=session.createQuery(hglQuery2,Student01.class).uniqueResult();
//        System.out.println(uniqueResult2);

        //HQL ile belirli değişkenleri alma
        //grade değeri 10 olan üğrencileri getir

//        String hqlQuery3 = "SELECT  s.id,s.name from Student01 s where s.grade=10";
//        List<Object[]> resultList4 = session.createQuery(hqlQuery3).getResultList();
//
//        for (Object[] object : resultList4) {
//            System.out.println(Arrays.toString(object));
//        }

        //String hqlQuery4="FROM Student01 s order by s.id desc";
        //List<Student01> resultList5= session.createQuery(hqlQuery4,Student01.class).getResultList();

//        for (Student01 student01:resultList5) {
//            System.out.println(student01);
//
//        }



        tx.commit();
        session.close();
        sf.close();


    }
}
