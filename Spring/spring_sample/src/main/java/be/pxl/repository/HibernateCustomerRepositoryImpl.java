package be.pxl.repository;

import java.util.ArrayList;
import java.util.List;

import be.pxl.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see be.pxl.repository.CustomerRepository#findAll()
	 */
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
