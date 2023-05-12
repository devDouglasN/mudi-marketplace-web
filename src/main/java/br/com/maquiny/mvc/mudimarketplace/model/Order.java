package br.com.maquiny.mvc.mudimarketplace.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {
	
	private String nameProduct;
	private BigDecimal negotiatedValue;
	private LocalDate deliveryDate;
	private String urlProduct;
	private String urlImage;
	private String description;
	
	public String getNomeProduct() {
		return nameProduct;
	}
	
	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public BigDecimal getNegotiatedValue() {
		return negotiatedValue;
	}
	public void setNegotiatedValue(BigDecimal negotiatedValue) {
		this.negotiatedValue = negotiatedValue;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getUrlProduct() {
		return urlProduct;
	}
	public void setUrlProduct(String urlProduct) {
		this.urlProduct = urlProduct;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		
}
