package com.example.SoundManager.EquipmentStuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {
    @Autowired
    private EquipmentRepository equipRepo;

    public void saveEquipment(Equipment equipment) {
        equipRepo.save(equipment);
    }

    public void delete(long id) {
        equipRepo.deleteById(id);
    }
}