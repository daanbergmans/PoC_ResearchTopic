import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import be.pxl.repository.CustomerRepository;
import be.pxl.repository.HibernateCustomerRepositoryImpl;
import be.pxl.service.CustomerService;
import be.pxl.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"be.pxl"})
@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderconfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	//@Bean(name="customerService")
	//public CustomerService getCustomerService() {
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
	//	CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
	//	return service;
	//}
	
	//@Bean(name="customerRepository")
	//public CustomerRepository getCustomerRepository() {
	//	return new HibernateCustomerRepositoryImpl();
	//}
	
}
