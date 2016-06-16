package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Customer extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Enterprice enterprice;
	private Person person;
	private StatusCustomer statusCustomer;
	private StatusProduct statusProduct;
	
	
	
	public StatusProduct getStatusProduct() {
		return statusProduct;
	}
	public void setStatusProduct(StatusProduct statusProduct) {
		this.statusProduct = statusProduct;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Enterprice getEnterprice() {
		return enterprice;
	}
	public void setEnterprice(Enterprice enterprice) {
		this.enterprice = enterprice;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public StatusCustomer getStatusCustomer() {
		return statusCustomer;
	}
	public void setStatusCustomer(StatusCustomer statusCustomer) {
		this.statusCustomer = statusCustomer;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
	
}
