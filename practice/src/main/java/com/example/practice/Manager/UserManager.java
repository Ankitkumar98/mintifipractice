package com.example.practice.Manager;

import com.example.practice.DAO.UserDAO;
import com.example.practice.DTO.ResponseDTO;
import com.example.practice.DTO.UserDTO;
import com.example.practice.Model.UserPojo;
import com.example.practice.config.PasswordConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {

    @Autowired
    UserDAO userDAO;

    public UserDTO getUserDetails(Integer id) {
        UserPojo user = userDAO.getUserDetails(id);
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        return userDTO;
    }

    public ResponseDTO createMpin(String password, Integer userId) {
        ResponseDTO response = new ResponseDTO();
        try{
            byte[] salt = PasswordConfig.getSalt();
            String hashedPassword = PasswordConfig.createHash(password,salt);
            UserPojo user = new UserPojo();
            user.setUserId(userId);
            user.setMpin(hashedPassword);
            //userDAO.setMpin(hashedPassword,userId);
            System.out.println("Salt :"+salt);
            System.out.println("hashedpassword : "+hashedPassword);
            response.setMessage("Mpin Successfully Saved");
            response.setStatus("true");
        }catch(Exception e){
            response.setMessage("Mpin setup failed");
            response.setStatus("false");
        }
        return response;
    }

    public ResponseDTO createUser(UserDTO userDTO){
        ResponseDTO response = new ResponseDTO();
        if(userDTO == null){
            response.setMessage("UserDTO is null");
            response.setStatus("false");
        }
        UserPojo user = new UserPojo();
        user.setUserId(userDTO.getUserId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        System.out.println(userDTO.getFirstName()+" "+userDTO.getLastName());
        try{
            userDAO.createUser(user);
            response.setMessage("User Successfully Saved");
            response.setStatus("true");
        }catch(Exception e){
            response.setMessage("User setup failed");
            response.setStatus("false");
        }
    return response;
    }
}
