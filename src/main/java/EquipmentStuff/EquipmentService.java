package EquipmentStuff;

import java.util.List;

public interface EquipmentService {
    List<Equipment> get();
    Equipment get(int id);
    void save(Equipment equipment);
    void delete(int id);
}
