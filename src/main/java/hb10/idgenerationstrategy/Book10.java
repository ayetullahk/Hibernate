package hb10.idgenerationstrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book10 extends BaseEntity {


    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book10{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                '}';
    }
}
