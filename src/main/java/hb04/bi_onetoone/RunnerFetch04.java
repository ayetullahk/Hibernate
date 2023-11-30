package hb04.bi_onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch04 {
    public static void main(String[] args) {


        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student04.class).addAnnotatedClass(Diary02.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        //student fecth ediyoruz bir id ile
//        Student04 student = session.get(Student04.class, 1001);
//
//        //diary fecth ediyoruz
//        Diary02 diary = session.get(Diary02.class, 101);
//
//        System.out.println(student);
//        System.out.println("-----------------");
//        System.out.println(diary);
//        System.out.println("-----------------");
//        System.out.println(diary.getStudent());
//        System.out.println("-----------------");
//        System.out.println(student.getDiary());

        //inner join
//        String hqlQuery1="select s.name,d.name from Student04 s inner join FETCH Diary02 d on s.id=d.student";
//        List<Object[]> resultList1= session.createQuery(hqlQuery1).getResultList();
//
//        for (Object[] object:resultList1) {
//
//            System.out.println(Arrays.toString(object));
//
//        }
//        resultList1.forEach(oa->{
//            System.out.println(Arrays.toString(oa));
//        });

        //left join
//        String hqlQuery2="select s.name,d.name from Student04 s left join FETCH Diary02 d on s.id=d.student";
//        List<Object[]> resultList1= session.createQuery(hqlQuery2).getResultList();
//
//        resultList1.forEach(oa->{
//            System.out.println(Arrays.toString(oa));
//        });

        //right join
//        String hqlQuery3="select s.name,d.name from Student04 s right join FETCH Diary02 d on s.id=d.student";
//        List<Object[]> resultList1= session.createQuery(hqlQuery1).getResultList();
//
//
//        resultList1.forEach(oa->{
//            System.out.println(Arrays.toString(oa));
//        });
//        String hqlQuery5="from Student04 s inner join FETCH s.diary ";
//        List<Student04> resultList5=session.createQuery(hqlQuery5, Student04.class).getResultList();
//
//        for (Student04 student04:resultList5) {
//
//            System.out.println(student04);
//
//        }
        String hqlQuery6="from Diary02 d inner join FETCH d.student ";
        List<Diary02> resultList6=session.createQuery(hqlQuery6, Diary02.class).getResultList();

        resultList6.forEach(d-> System.out.println(d));

        tx.commit();
        session.close();
        sf.close();

    }
}
