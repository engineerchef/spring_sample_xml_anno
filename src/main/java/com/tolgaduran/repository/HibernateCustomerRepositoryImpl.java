package com.tolgaduran.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tolgaduran.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName("Tolga");
		customer.setLastName("DURAN");

		customers.add(customer);

		return customers;
	}
}
