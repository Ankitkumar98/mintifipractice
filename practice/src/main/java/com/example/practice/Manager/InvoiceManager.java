package com.example.practice.Manager;

import com.example.practice.DAO.InvoiceDAO;
import com.example.practice.DTO.InvoiceDTO;
import com.example.practice.Model.InvoiceFundedPojo;
import com.example.practice.Model.InvoiceUnFundedPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InvoiceManager {

    @Autowired
    InvoiceDAO invoiceDAO;

    public InvoiceDTO getInvoiceDetails(Integer id,Integer start) {
        InvoiceDTO invoiceDTO = new InvoiceDTO();
        List<InvoiceFundedPojo> invFundedPojoList = new ArrayList<>();
        List<InvoiceUnFundedPojo> invUnFundedPojoList = new ArrayList<>();
        invFundedPojoList = invoiceDAO.getInvoiceFundedDetails(id,start);
        invUnFundedPojoList = invoiceDAO.getInvoiceUnFundedDetails(id,start);
        invoiceDTO.setInvoiceFundedList(invFundedPojoList);
        invoiceDTO.setInvoiceUnFundedList(invUnFundedPojoList);

        return invoiceDTO;
    }
}
