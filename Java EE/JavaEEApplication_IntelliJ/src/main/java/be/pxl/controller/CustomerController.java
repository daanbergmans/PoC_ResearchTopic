package be.pxl.controller;

import be.pxl.model.Customer;
import be.pxl.service.CustomerService;

import javax.inject.Inject;

public class CustomerController {

    @Inject
    CustomerService customerService;

    public Customer getCustomer() {
        return customerService.findAll().get(0);
    }

}
