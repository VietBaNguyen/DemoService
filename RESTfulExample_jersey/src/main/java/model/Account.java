package model;
// Generated Apr 2, 2016 11:19:35 AM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account", catalog = "spotifire")
@XmlRootElement(name = "account")
public class Account implements java.io.Serializable {

	private int id;
	private String username;
	private String password;

	public Account() {
	}

	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Account(int id ,String username, String password) {
		this.id = this.id;
		this.username = username;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	@XmlElement
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "username")
	@XmlElement
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	@XmlElement
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}