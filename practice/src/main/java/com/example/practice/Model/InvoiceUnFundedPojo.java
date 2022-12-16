package com.example.practice.Model;

//import jakarta.persistence.*;
import javax.persistence.*;

@Entity
@Table(name="invoice_unfunded")
public class InvoiceUnFundedPojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="invoice_id")
    Long invoiceId;
    @ManyToOne
    @JoinColumn(name="fk_user_id")
    UserPojo user;
    @OneToOne
    @JoinColumn(name="fk_retail_id")
    RetailPojo retail;
    @Column(name="total_due")
    Double totalDue;
    @Column(name="no_of_invoices")
    Integer noOfInvoices;

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
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

    public Double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(Double totalDue) {
        this.totalDue = totalDue;
    }

    public Integer getNoOfInvoices() {
        return noOfInvoices;
    }

    public void setNoOfInvoices(Integer noOfInvoices) {
        this.noOfInvoices = noOfInvoices;
    }
}
