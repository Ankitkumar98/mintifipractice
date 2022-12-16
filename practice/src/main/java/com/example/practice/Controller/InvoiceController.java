package com.example.practice.Controller;

import com.example.practice.DTO.InvoiceDTO;
import com.example.practice.Manager.InvoiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class InvoiceController {

    @Autowired
    InvoiceManager invoiceManager;

    @GetMapping(value="/invoiceDetails/{id}/{start}", produces = MediaType.APPLICATION_JSON_VALUE)
    public InvoiceDTO getInvoiceDetails(@PathVariable("id") Integer id,@PathVariable("start") Integer start) {
        return invoiceManager.getInvoiceDetails(id,start);
    }

}