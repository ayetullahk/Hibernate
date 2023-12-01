package hb05.manytoone;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Student05 {
    @Id
    private int id;

    @Column(name = "student_name",nullable = false)
    private String name;

    private int grade;

    private LocalDateTime createOn;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @PrePersist
    public void prePersist() {
        createOn=LocalDateTime.now();
    }

    public LocalDateTime getCreateOn() {
        return createOn;
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student05{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", createOn=" + createOn +
                ", university=" + university +
                '}';
    }
}
