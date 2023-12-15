package hb09.fetchtypes;

import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student09 {

    @Id
    private int id;

    @Column(name = "student_name",nullable = false)
    private String name;

    private int grade;

    public List<Book09> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book09> bookList) {
        this.bookList = bookList;
    }

    //orphan=yetim
    //orphanRemoval=true yani eğer parent silinirse child da silinir
    //fetch = FetchType.EAGER tanımlandığında bağlı olduğu childı da çeker
    //fetch = FetchType.LIZY tanımlandığında yanlızca parente bulunan özellikleri verir
    @OneToMany(mappedBy = "student",/*orphanRemoval = true,*/cascade = CascadeType.ALL /*fetch = FetchType.EAGER*/)
    private List<Book09> bookList=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        return "Student09{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", bookList=" + bookList +
                '}';
    }
}
