package com.app.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sell")
@Entity
public class Sell {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sNo;
	private Date date;
	@Column(length = 20)
	private String customerName;
	@Column(length = 20)
	private String itemName;
	private int quantity;
	private int amount;
	private int totalAmount;

	public Sell(Date date, String customerName, String itemName, int quantity, int amount, int totalAmount) {
		this.date = date;
		this.customerName = customerName;
		this.itemName = itemName;
		this.quantity = quantity;
		this.amount = amount;
		this.totalAmount = totalAmount;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Sell [sNo=" + sNo + ", date=" + date + ", customerName=" + customerName + ", itemName=" + itemName
				+ ", quantity=" + quantity + ", amount=" + amount + ", totalAmount=" + totalAmount + "]";
	}

}
