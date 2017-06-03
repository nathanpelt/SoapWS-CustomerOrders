package com.projects.nathan;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.buymart.BuyMartPortType;
import org.example.buymart.CreateOrdersRequest;
import org.example.buymart.CreateOrdersResponse;
import org.example.buymart.DeleteOrdersRequest;
import org.example.buymart.DeleteOrdersResponse; 
import org.example.buymart.GetOrdersRequest;
import org.example.buymart.GetOrdersResponse;
import org.example.buymart.Order;
import org.example.buymart.Product;
import org.example.buymart.UpdateOrdersRequest;
import org.example.buymart.UpdateOrdersResponse;

public class SoapWS_Provider implements BuyMartPortType {

	Map<BigInteger, List<Order>> CustomerOrders = new HashMap<>();
	int NumberofCustomerId;

	public SoapWS_Provider() {
		init();
	}

	public void init() {

		List<Order> Orders = new ArrayList<Order>();
		Order Order = new Order();
		Order.setId(BigInteger.valueOf(1));

		Product Product = new Product();
		Product.setName("SamsungTV");
		Product.setDescription("SamsungTV");
		Product.setId(BigInteger.valueOf(1));
		Product.getQuantity().add(BigInteger.valueOf(2));
		Product.setPrice(199.99);

		Order.getProduct().add(Product);

		Orders.add(Order);
		CustomerOrders.put(BigInteger.valueOf(++NumberofCustomerId), Orders);
	}

	@Override
	public GetOrdersResponse getOrders(GetOrdersRequest parameters) {
		List<BigInteger> CustomerIds = parameters.getCustomerId();

		GetOrdersResponse Response = new GetOrdersResponse();
		List<Order> ResponseOrders = Response.getOrder();
		for (BigInteger CustomerId : CustomerIds) {
			List<Order> Orders = CustomerOrders.get(CustomerId);

			for (Order Order : Orders) {
				ResponseOrders.add(Order);
			}
		}
		return Response;
	}

	@Override
	public UpdateOrdersResponse updateOrders(UpdateOrdersRequest parameters) {

		return null;
	}

	@Override
	public CreateOrdersResponse createOrders(CreateOrdersRequest parameters) {
		List<Order> Orders = parameters.getOrder();
		List<Order> currentOrders = CustomerOrders.get(parameters.getCustomerId());
		for(Order Order : Orders) {
			currentOrders.add(Order);
		}
		CreateOrdersResponse createOrdersResponse = new CreateOrdersResponse();
		createOrdersResponse.setOrderResult(true);

		return createOrdersResponse;
	}

	@Override
	public DeleteOrdersResponse deleteOrders(DeleteOrdersRequest parameters) {

		return null;
	}

}