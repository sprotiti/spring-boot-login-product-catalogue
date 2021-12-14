package com.ibm.model;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Products {
	
@Id
@GeneratedValue
	private int productId;
	
	//@NotBlank(message= "Description for product cant be null or empty") 
	@Size(min = 3, max = 200, message = "Description for product must be b/w 10-100 characters")
	private String name;
	private String description;
	private String measurementUnit;
	private Double price;
	private boolean available;
	
	public Products() {
		}

	public Products(int productId,
			@Size(min = 3, max = 200, message = "Description for product must be b/w 10-100 characters") String name,
			String description, String measurementUnit, Double price, boolean available) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.measurementUnit = measurementUnit;
		this.price = price;
		this.available = available;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", name=" + name + ", description=" + description
				+ ", measurementUnit=" + measurementUnit + ", price=" + price + ", available=" + available + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMeasurementUnit() {
		return measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
	
}