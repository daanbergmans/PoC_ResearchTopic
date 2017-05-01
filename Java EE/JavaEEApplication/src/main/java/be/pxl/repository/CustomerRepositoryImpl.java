package be.pxl.repository;

import be.pxl.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Daan");
        customer.setLastName("Bergmans");

        customers.add(customer);

        return customers;
    }
}
