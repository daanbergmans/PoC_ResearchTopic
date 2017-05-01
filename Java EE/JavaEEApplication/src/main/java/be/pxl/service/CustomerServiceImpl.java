package be.pxl.service;

import be.pxl.model.Customer;
import be.pxl.repository.CustomerRepository;

import javax.inject.Inject;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Inject
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
