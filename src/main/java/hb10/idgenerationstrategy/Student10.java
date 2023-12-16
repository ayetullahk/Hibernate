package hb10.idgenerationstrategy;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student10 extends BaseEntity{

    //@Id
    //@GeneratedValue auto
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    //@GeneratedValue(strategy = GenerationType.TABLE)

//    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
//    @SequenceGenerator(name = "sequence",sequenceName = "student_seq",initialValue=1000, allocationSize = 10)

//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID",strategy = "uuid2") //id= "2e6a77d6-4b14-4642-80f8-30147694d25f"=128bit
//    private String id;

    @Column(name = "student_name",nullable = false)
    private String name;

    private int grade;



//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//    public String getId() {
//    return id;
//}
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student10{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
