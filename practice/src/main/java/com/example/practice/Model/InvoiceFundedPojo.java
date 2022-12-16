package com.example.practice.Model;

//import jakarta.persistence.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="invoice_funded")
public class InvoiceFundedPojo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="invoice_id")
    Integer invoiceId;
    @ManyToOne
    @JoinColumn(name="fk_user_id")
    UserPojo user;
    @OneToOne
    @JoinColumn(name="fk_retail_id")
    RetailPojo retail;
    @Column(name="credit_availed")
    Integer creditAvailed;
    @Column(name="interest_rate")
    Double rate;
    @Column(name="interest_amount")
    Double interestAmount;
    @Column(name="due_date")
    Date dueDate;
    @Column(name="invoice_amount")
    Double invoiceAmount;

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public UserPojo getUser() {
        return user;
    }

    public void setUser(UserPojo user) {
        this.user = user;
    }

    public RetailPojo getRetail() {
        return retail;
    }

    public void setRetail(RetailPojo retail) {
        this.retail = retail;
    }

    public Integer getCreditAvailed() {
        return creditAvailed;
    }

    public void setCreditAvailed(Integer creditAvailed) {
        this.creditAvailed = creditAvailed;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(Double interestAmount) {
        this.interestAmount = interestAmount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }
}
