package com.training.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.training.customer.Customer;
import com.training.iface.paymentrepo;

public class PaymentRepository implements paymentrepo<Customer>{
	private List<Customer> customerList;

	public PaymentRepository() {
		super();
		this.customerList = new ArrayList<Customer>();
	}
	public Customer add(Customer payment) {

		boolean added = this.customerList.add(payment);

		if (added) {

			return payment;

		}

		else {

			return null;
		}

	}

	@Override
	public List<Customer> listAll() {

		return this.customerList;
	}

	@Override
	public Customer findByCustomerName(String customerName) {

		Optional<Customer> found = this.customerList.stream().filter(e -> e.getCustomerName().equals(customerName))
				.findFirst();
		return (Customer) found.get(); 
	}

	@Override
	public Customer findByAmount(int amount) {

		Optional<Customer> found = this.customerList.stream().filter(e -> e.getAmount() == (amount)).findFirst();
		return (Customer) found.get();
		// TODO Auto-generated method stub

	}

	@Override
	public Customer findByDueDate(String paymentDate) {
		// TODO Auto-generated method stub
		return null;
	}
}
