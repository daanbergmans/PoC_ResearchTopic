package be.pxl.service;

import be.pxl.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
