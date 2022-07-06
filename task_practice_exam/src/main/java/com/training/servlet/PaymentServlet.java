package com.training.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.customer.Customer;
import com.training.service.PaymentService;

/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PaymentService serv = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PaymentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

		serv = new PaymentService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path = request.getServletPath();

		System.out.println(path);
		switch (path) {

		case "/":
			homePage(request, response);
			break;

		case "/byname":
			viewName(request, response);
			break;
		case "/byamount":
			viewamount(request, response);
			break;
		default:
			break;
		}

	}

	private void viewamount(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int amount = Integer.parseInt(request.getParameter("amount"));

		Customer showlist = serv.findByAmount(amount);

		request.setAttribute("added", showlist);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/showamount.jsp");
		dispatcher.forward(request, response);
	}

	private void homePage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("message", "HDFC Bank");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
		dispatcher.forward(request, response);

	}

	private void viewName(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String customerName = request.getParameter("customerName");

		Customer showlist = serv.findByCustomerName(customerName);

		request.setAttribute("added", showlist);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/showname.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String key = request.getServletPath();

		System.out.println(key);
		switch (key) {

		case "/add":
			addDetails(request, response);
			break;

		case "/view":
			viewAll(request, response);
			break;

		default:
			break;
		}

	}

	private void addDetails(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
		String customerName = request.getParameter("customerName");
		String paymentDate = request.getParameter("paymentDate");
		int amount = Integer.parseInt(request.getParameter("amount"));

		Customer entry = new Customer(accountNumber, customerName, paymentDate, amount);
		Customer added = serv.add(entry);

		request.setAttribute("added", added);
		request.setAttribute("message", "Added Successfully");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view");
		dispatcher.forward(request, response);

	}

	public void viewAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customer> paymentList = serv.viewAll();

		request.setAttribute("added", paymentList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/showdetails.jsp");
		dispatcher.forward(request, response);

	}

}
