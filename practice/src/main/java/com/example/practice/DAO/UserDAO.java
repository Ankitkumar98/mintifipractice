package com.example.practice.DAO;

import com.example.practice.DTO.ResponseDTO;
import com.example.practice.Model.UserPojo;
import io.swagger.models.Response;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Repository
public class UserDAO {
    @PersistenceContext
    EntityManager entityManager;
    public void setMpin(String pin,Integer id) {
       UserPojo user = getUserDetails(id);
       user.setMpin(pin);
       entityManager.merge(user);
    }

    public UserPojo getUserDetails(Integer id) {
        return entityManager.createQuery("SELECT user from UserPojo user WHERE id=:id",UserPojo.class).setParameter("id",id).getSingleResult();
    }

    public void createUser(UserPojo user){
        entityManager.merge(user);
    }
}
