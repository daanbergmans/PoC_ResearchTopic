package be.pxl.repository;

import java.util.List;

import be.pxl.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}