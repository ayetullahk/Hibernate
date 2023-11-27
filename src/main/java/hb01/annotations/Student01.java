package hb01.annotations;


import jakarta.persistence.*;

//bu annotations koyduğumuz sınıf veri tabanında bir tabloya karşılık gelecektir
@Entity
//eğer oluşacak tablo ismini değiştirmek istenirse name attribute ile bir tablo ismi verilir
@Table(name = "t_student01")
public class Student01 {


    //@id primary key oluşmasını sağlar
    @Id
    private int id;

    //length default=255
    //nullable=true / default
    //unique=false default
    //column annotationu zorunlu değildir ancak customize edebilmek için gerekli
    @Column(name = "student_name",length = 100,nullable = false,unique = false)
    private String name;

    //veritabanı tablosunda grade adında bir kolun oluşturulmaz
    //@Transient
    private int grade;

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

    //lob
    //private int[] image;

    public static void main(String[] args) {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}