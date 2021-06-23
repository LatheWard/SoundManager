package EquipmentStuff;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class EquipmentDAOImpl implements EquipmentDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Equipment> get() {
        Session currrentSession  = entityManager.unwrap(Session.class);
        Query<Equipment> query = currrentSession.createQuery("From equipment", Equipment.class);
        List<Equipment> list = query.getResultList();
        return list;
    }

    @Override
    public Equipment get(int id) {
        return null;
    }

    @Override
    public void save(Equipment equipment) {

    }

    @Override
    public void delete(int id) {

    }
}
