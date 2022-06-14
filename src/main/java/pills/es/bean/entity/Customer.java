package pills.es.bean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private int name;
	@Column(name="surname")
	private int surname;
	@Column(name="email")
	private int email;
	
	// Constructors.
	public Customer() {
	}
	public Customer(int name, int surname, int email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	// Getters and Setters.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getSurname() {
		return surname;
	}
	public void setSurname(int surname) {
		this.surname = surname;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + "]";
	}
}
