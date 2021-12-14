package com.ibm.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Orders {

@Id
@GeneratedValue
	private int oid;
	private Long orderId;
	private double totalAmount;
	private Long custId;
	private int prodId;
	
	public Orders() {
	}

	public Orders(int oid, Long orderId, double totalAmount, Long custId, int prodId) {
		super();
		this.oid = oid;
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.custId = custId;
		this.prodId = prodId;
	}

	public int getId() {
		return oid;
	}

	public void setId(int oid) {
		this.oid = oid;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", orderId=" + orderId + ", totalAmount=" + totalAmount + ", custId=" + custId
				+ ", prodId=" + prodId + "]";
	}
	

}
