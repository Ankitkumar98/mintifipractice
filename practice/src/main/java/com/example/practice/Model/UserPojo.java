package com.example.practice.Model;

//import jakarta.persistence.*;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserPojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    Integer userId;
    @Column(name="first_name")
    String firstName;
    @Column(name="last_name")
    String lastName;
    @Column(name="phone_no")
    Integer PhoneNo;
    @Column(name="mpin")
    String mpin;
    @Column(name="email")
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getMpin() {
        return mpin;
    }

    public void setMpin(String mpin) {
        this.mpin = mpin;
    }
}
