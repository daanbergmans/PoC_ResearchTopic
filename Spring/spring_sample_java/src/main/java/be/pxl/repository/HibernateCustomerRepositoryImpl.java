package be.pxl.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import be.pxl.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername")
	private String dbUser;
	
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUser);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Daan");
		customer.setLastName("Bergmans");
		
		customers.add(customer);
		
		return customers;
	}
	
}
