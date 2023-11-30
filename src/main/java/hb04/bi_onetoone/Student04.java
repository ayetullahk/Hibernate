package hb04.bi_onetoone;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student04 {
    @Id
    private int id;
    @Column(name = "std_name")
    private String name;
    private int grade;


    //eğer  mappedBy kullanılmaz ise her iki taraftada ilişki için sütün oluşur
    @OneToOne(mappedBy = "student")
    private Diary02 diary;

    public Diary02 getDiary() {
        return diary;
    }

    public void setDiary(Diary02 diary) {
        this.diary = diary;
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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student04{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
