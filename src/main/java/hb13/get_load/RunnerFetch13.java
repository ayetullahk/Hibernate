package hb13.get_load;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerFetch13 {

    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student13.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

//        System.out.println("Start to execute get method");
//        Student13 student=session.get(Student13.class,1L);
//        System.out.println("Finish to execute get method");
//        System.out.println("Student ID : "+student.getId());
//        System.out.println("Student Get Name : "+student.getName());
//
//        System.out.println("----------------------------------------------");
//
//        System.out.println("Start to execute load method");
//        Student13 student2=session.load(Student13.class,2L);
//        System.out.println("Finish to execute load method");
//        System.out.println("Student ID : "+student2.getId());
//        System.out.println("Student Get Name : "+student2.getName());

//        System.out.println("Start to execute get method");
//        Student13 student = session.get(Student13.class, 5L);
//        System.out.println("Finish to execute get method");
//        if (student != null) {
//            System.out.println("Student ID : " + student.getId());
//            System.out.println("Student Get Name : " + student.getName());
//        }
//
//        System.out.println("----------------------------------------------");
//
//        System.out.println("Start to execute load method");
//        Student13 student2 = session.load(Student13.class, 10L);
//        System.out.println("Finish to execute load method");
//        if (student2!=null) {
//            System.out.println("Student ID : " + student2.getId());
//            System.out.println("Student Get Name : " + student2.getName());
//        }

        //load metodu ile obje referansı alınır ve sonra delete çağrılır.
        //get çağırılmayarak db'ye hit engellenmiş olur.
        Student13 studentFound=session.load(Student13.class,1l);
        session.delete(studentFound);

        tx.commit();
        session.close();
        sf.close();
    }
}
