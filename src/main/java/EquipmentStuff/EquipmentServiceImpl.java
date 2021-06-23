package EquipmentStuff;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EquipmentServiceImpl implements EquipmentService{

    @Transactional
    @Override
    public List<Equipment> get() {
        return null;
    }
    @Transactional
    @Override
    public Equipment get(int id) {
        return null;
    }
    @Transactional
    @Override
    public void save(Equipment equipment) {

    }
    @Transactional
    @Override
    public void delete(int id) {

    }
}
