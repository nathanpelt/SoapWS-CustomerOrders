package com.projects.nathan;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.example.buymart.BuyMartPortType;
import org.example.buymart.BuyMartService;
import org.example.buymart.GetOrdersRequest;
import org.example.buymart.GetOrdersResponse;
import org.example.buymart.Order;
import org.example.buymart.Product;

public class SoapWS_Consumer {

	public static void main(String[] args) {
		try {
			BuyMartService service = new BuyMartService(
					new URL("http://localhost:8080/SoapWS_Provider_BuyMart/services/BuyMart?wsdl"));
			BuyMartPortType port = service.getBuyMartPort();
			GetOrdersRequest request = new GetOrdersRequest();
			request.getCustomerId().add(BigInteger.valueOf(1));
		
			
			GetOrdersResponse response = port.getOrders(request);
			List<Order> orders = response.getOrder();
			
			for(Order order: orders) {
				List<Product> products = order.getProduct();
			
				for(Product product: products) {
					System.out.println(product.getQuantity());
					System.out.println(product.getDescription());
					System.out.println(product.getName());
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}