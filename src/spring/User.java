package spring;

import java.sql.Timestamp;

public class User {
  private int id;
  private String userName;
  private String email;
  private String userPassword;
  private String role;
  private Timestamp created;
  
  public User(String userName) {
	super();
	this.userName = userName;
}
public User() {
	// TODO Auto-generated constructor stub
}
public User(int id, String userName, String email, String userPassword, String role, Timestamp created) {
	super();
	this.id = id;
	this.userName = userName;
	this.email = email;
	this.userPassword = userPassword;
	this.role = role;
	this.created = created;
}
public User(String userName, String email, String userPassword, String role, Timestamp created) {
	super();
	this.userName = userName;
	this.email = email;
	this.userPassword = userPassword;
	this.role = role;
	this.created = created;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Timestamp getCreated() {
	return created;
}
public void setCreated(Timestamp created) {
	this.created = created;
}
@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", userPassword=" + userPassword
			+ ", role=" + role + ", created=" + created + "]";
}
  
  
}
