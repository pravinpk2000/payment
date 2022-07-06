package com.training.customer;

public class Customer {
	long accountNumber;
	String customerName;
	String paymentDate;
	int amount;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long accountNumber, String customerName, String paymentDate, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [accountNumber=" + accountNumber + ", customerName=" + customerName + ", paymentDate="
				+ paymentDate + ", amount=" + amount + "]";
	}
}
