package com.stg.ombs.entity;

import java.security.MessageDigest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;



@Entity
public class Maid {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "maid_sequence")
    @GenericGenerator(
            name = "maid_sequence",
            strategy = "com.stg.ombs.entity.MaidIdGenerator",
            parameters = {
                    @Parameter(name = MaidIdGenerator.INCREMENT_PARAM, value = "50"),
                    @Parameter(name = MaidIdGenerator.VALUE_PREFIX_PARAMETER, value = "MA-"),
                    @Parameter(name = MaidIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%04d") })

 
	public String maidid;
	public int maidage;
	public String maidname;
	public String maidtype;
	public String maidaddress;
	public String password;




	public Maid(String maidname, String maidtype, String maidaddress, int maidage, String encode) {
	}

	public String getMaidid() {
		return maidid;
	}
	public void setMaidid(String maidid) {
		this.maidid = maidid;
	}
	public int getMaidage() {
		return maidage;
	}
	public void setMaidage(int maidage) {
		this.maidage = maidage;
	}
	public String getMaidtype() {
		return maidtype;
	}
	public void setMaidtype(String maidtype) {
		this.maidtype = maidtype;
	}
	public String getMaidaddress() {
		return maidaddress;
	}
	public void setMaidaddress(String maidaddress) {
		this.maidaddress = maidaddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMaidname() {
		return maidname;
	}
	public void setMaidname(String maidname) {
		this.maidname = maidname;
	}
	
public  Maid(String maidname,int maidage,String maidtype,String Password,String maidaddress){

	this.maidname = maidname;
	this.maidage = maidage;
	this.maidtype = maidtype;
	this.password = Password;
	this.maidaddress = maidaddress;
}

}
