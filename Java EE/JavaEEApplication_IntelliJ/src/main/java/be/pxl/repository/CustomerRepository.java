package be.pxl.repository;

import be.pxl.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
