package be.pxl.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import be.pxl.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Daan");
		customer.setLastName("Bergmans");
		
		customers.add(customer);
		
		return customers;
	}

	//public void setDbUsername(String dbUsername) {
	//	this.dbUsername = dbUsername;
	//}
	
}
