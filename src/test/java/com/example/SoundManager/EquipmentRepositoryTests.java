package com.example.SoundManager;
import static org.assertj.core.api.Assertions.assertThat;
import EquipmentStuff.Equipment;
import EquipmentStuff.Equipment.*;
import EquipmentStuff.EquipmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;


    @DataJpaTest
    @AutoConfigureTestDatabase(replace = Replace.NONE)
    @Rollback(false)
    public class EquipmentRepositoryTests {

        @Autowired
        private TestEntityManager entityManager;

        @Autowired
        private EquipmentRepository repo;

        @Test
        public void testCreateEquipment() {
            Equipment equipment = new Equipment();
            equipment.setName("SM-58");
            equipment.setType("Mics");

            Equipment savedEquipment = repo.save(equipment);

            Equipment existEquipment = entityManager.find(Equipment.class, savedEquipment.getId());

            assertThat(equipment.getId()).isEqualTo(existEquipment.getId());

        }
    }
