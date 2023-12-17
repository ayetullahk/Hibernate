package hb11.hqlcriteriapi;

import hb10.idgenerationstrategy.Book10;
import hb10.idgenerationstrategy.Student10;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class RunnerFetch11 {

    public static void main(String[] args) {

        //CRUD (create,read,update,delete)
        //C-session.save
        //R-session.get,hql,sql(select)
        //U-session.update, update query
        //D-session.delete,hql,sql

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student11.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

//        Student11 student=session.get(Student11.class,1L);
//        student.setName("Update"+student.getName());
//        session.update(student);

//        String hqlQuery1="Update Student11 s set s.name='updated with HQL' where s.id=11";
//        int numOfRec=session.createQuery(hqlQuery1).executeUpdate();
//        System.out.println("Effected Row Count: "+ numOfRec);

//        String hqlQuery2="From Student11 s where s.mathGrade<50";
//        List<Student11> resultList=session.createQuery(hqlQuery2).getResultList();
//        for (Student11 student:resultList) {
//            student.setMathGrade(50);
//            session.update(student);
//
//        }

//        int sMathGrade=80;
//        int lMathGrade=75;
//
//        String hqlQuery3="update Student11 s set s.mathGrade=:sMath where s.mathGrade<:lMath";
//        Query query=session.createQuery(hqlQuery3);
//
//        query.setParameter("sMath",sMathGrade);
//        query.setParameter("lMath",lMathGrade);
//
//        int numOfRec2=query.executeUpdate();
//        System.out.println("Effected Row Count: "+ numOfRec2);

//        int matGrade=90;
//
//        String hqlQuery4="select sum(s.mathGrade) from Student11 s where s.mathGrade>: grade";
//        Query query=session.createQuery(hqlQuery4);
//        query.setParameter("grade",matGrade);
//
//        long sumMathGrade=(long) query.uniqueResult();
//        System.out.println("Total math Grade :"+ sumMathGrade);

        CriteriaBuilder cb=session.getCriteriaBuilder();
        CriteriaQuery<Student11> criteriaQuery=cb.createQuery(Student11.class);
        Root<Student11> root=criteriaQuery.from(Student11.class);

        //criteriaQuery.select(root);

//        Query<Student11> query=session.createQuery(criteriaQuery);
//        List<Student11> resultList=query.getResultList();
//        resultList.forEach(b-> System.out.println(b));

//        criteriaQuery.select(root).where(cb.equal(root.get("name"),"Student name2"));
//
//        Query<Student11> query2=session.createQuery(criteriaQuery);
//        List<Student11> resultList2=query2.getResultList();
//        resultList2.forEach( System.out::println);

//        criteriaQuery.select(root).where(cb.greaterThan(root.get("mathGrade"),80));
//
//        Query<Student11> query3=session.createQuery(criteriaQuery);
//        List<Student11> resultList3=query3.getResultList();
//        resultList3.forEach( System.out::println);

//        criteriaQuery.select(root).where(cb.lessThan(root.get("mathGrade"),95));
//
//        Query<Student11> query4=session.createQuery(criteriaQuery);
//        List<Student11> resultList4=query4.getResultList();
//        resultList4.forEach( System.out::println);

//        Predicate predicateForName= cb.equal(root.get("id"),1l);
//        Predicate predicateForMathGrade= cb.greaterThan(root.get("mathGrade"),75);
//
//        Predicate predicateStd=cb.or(predicateForName,predicateForMathGrade);
//        criteriaQuery.where(predicateStd);
//        Query<Student11> query5=session.createQuery(criteriaQuery);
//        List<Student11> resultList5=query5.getResultList();
//        resultList5.forEach( System.out::println);

        tx.commit();
        session.close();
        sf.close();
    }
}
