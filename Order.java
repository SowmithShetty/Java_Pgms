package com.mooduCommerce.Order;
public class Order{
	private String orderId;
	private double amount;
	public Order(String orderId,double amount){
		this.orderId=orderId;
		this.amount=amount;
	}
	public void displayOrder(){
		System.out.println("Order ID:"+ orderId);
		System.out.println("Order  Amount:"+ amount);
	}
}