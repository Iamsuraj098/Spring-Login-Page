package springMVC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="User_1")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this code automatically generate different id's for different entities.
	private int id;
	private String email;
	private String password;
	private String user;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	} 
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", username=" + user + ", password=" + password + "]";
	}
	
}
