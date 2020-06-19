package com.ananya.ravionics.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGINTEST")
public class User {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USERID")	
private int USERID;
private String USERNAME;
private String PASSWORD;



public User() {
	
}



public User(int uSERID, String uSERNAME, String pASSWORD) {
	super();
	USERID = uSERID;
	USERNAME = uSERNAME;
	PASSWORD = pASSWORD;
}
public int getUSERID() {
	return USERID;
}
public void setUSERID(int uSERID) {
	USERID = uSERID;
}
public String getUSERNAME() {
	return USERNAME;
}
public void setUSERNAME(String uSERNAME) {
	USERNAME = uSERNAME;
}
public String getPASSWORD() {
	return PASSWORD;
}
public void setPASSWORD(String pASSWORD) {
	PASSWORD = pASSWORD;
}



@Override
public String toString() {
	return "User [USERID=" + USERID + ", USERNAME=" + USERNAME + ", PASSWORD=" + PASSWORD + "]";
}







	
}
