package com.example.practice.DTO;

import com.example.practice.Model.InvoiceFundedPojo;
import com.example.practice.Model.InvoiceUnFundedPojo;

import java.util.List;

public class InvoiceDTO {
    List<InvoiceFundedPojo> invoiceFundedList;

    List<InvoiceUnFundedPojo> invoiceUnFundedList;

    public List<InvoiceFundedPojo> getInvoiceFundedList() {
        return invoiceFundedList;
    }

    public void setInvoiceFundedList(List<InvoiceFundedPojo> invoiceFundedList) {
        this.invoiceFundedList = invoiceFundedList;
    }

    public List<InvoiceUnFundedPojo> getInvoiceUnFundedList() {
        return invoiceUnFundedList;
    }

    public void setInvoiceUnFundedList(List<InvoiceUnFundedPojo> invoiceUnFundedList) {
        this.invoiceUnFundedList = invoiceUnFundedList;
    }
}
