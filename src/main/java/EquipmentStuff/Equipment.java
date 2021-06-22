package EquipmentStuff;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;

@Entity
@Table(name = "equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String[] categories = {"Cables", "Power-Amps", "Speakers", "Mics", "Misc"};

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
        boolean result = Arrays.stream(categories).anyMatch("A"::equals);
        if (result){
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

