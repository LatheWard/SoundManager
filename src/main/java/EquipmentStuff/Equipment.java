package EquipmentStuff;
import javax.persistence.*;
import java.util.ArrayList;


@Entity
@Table(name = "equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ArrayList<String> categories = new ArrayList<String>();

    public Equipment() {
        categories.add("Cables");
        categories.add("Power-Amps");
        categories.add("Speakers");
        categories.add("Mics");
        categories.add("Miscl");
    }

    @Column
    private String name;

    @Column
    private String type;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(categories.contains(type)){
            this.type = type;
        }
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

