package hb02.embeddable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//bu annotations koyduğumuz sınıf veri tabanında bir tabloya karşılık gelecektir
@Entity
//eğer oluşacak tablo ismini değiştirmek istenirse name attribute ile bir tablo ismi verilir
@Table(name = "t_student02")
public class Student02 {


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

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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
        return "Student02{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}