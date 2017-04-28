package be.pxl.service;

import java.util.List;

import be.pxl.model.Customer;
import be.pxl.repository.CustomerRepository;
import be.pxl.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository repository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see be.pxl.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return repository.findAll();
	}
	
}
