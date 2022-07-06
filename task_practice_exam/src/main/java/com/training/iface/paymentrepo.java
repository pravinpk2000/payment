package com.training.iface;

import java.util.List;

public interface paymentrepo<P> {

	public P add(P payment);

	public List<P> listAll();

	public P findByCustomerName(String customerName);

	public P findByAmount(int amount);

	public P findByDueDate(String paymentDate);

}
