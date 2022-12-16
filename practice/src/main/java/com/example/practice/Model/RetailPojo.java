package com.example.practice.Model;

//import jakarta.persistence.*;
import javax.persistence.*;

@Entity
@Table(name="retail")
public class RetailPojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="retail_id")
    Integer retailId;
    @Column(name="retail_name")
    String name;
    @Column(name="logo")
    String logo;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getRetailId() {
        return retailId;
    }

    public void setRetailId(Integer retailId) {
        this.retailId = retailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
