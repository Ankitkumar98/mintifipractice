package com.example.practice.Model;

public class InvoicePojo {

    InvoiceFundedPojo invoiceFunded;

    InvoiceUnFundedPojo invoiceUnFunded;

    public InvoiceFundedPojo getInvoiceFunded() {
        return invoiceFunded;
    }

    public void setInvoiceFunded(InvoiceFundedPojo invoiceFunded) {
        this.invoiceFunded = invoiceFunded;
    }

    public InvoiceUnFundedPojo getInvoiceUnFunded() {
        return invoiceUnFunded;
    }

    public void setInvoiceUnFunded(InvoiceUnFundedPojo invoiceUnFunded) {
        this.invoiceUnFunded = invoiceUnFunded;
    }
}
