package com.training.service;

import java.util.List;

import com.training.customer.Customer;
import com.training.iface.paymentrepo;
import com.training.repo.PaymentRepository;

public class PaymentService {
	
	private paymentrepo<Customer> customer;

	public PaymentService() {
		super();
		this.customer = new PaymentRepository();
	}
	
	public Customer add(Customer Insert) {
		
		return this.customer.add(Insert);
		
		
	}
	
	public List<Customer> viewAll(){
		
		return this.customer.listAll();
		
	}
	
	public Customer findByCustomerName(String customerName) {
		
		return this.customer.findByCustomerName(customerName);
		
	}
	
public Customer findByAmount(int amount) {
		
		return this.customer.findByAmount(amount);
		
	}
	

}
