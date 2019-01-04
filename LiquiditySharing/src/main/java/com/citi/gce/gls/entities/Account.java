package com.citi.gce.gls.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Account implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String account_id;
	
	private String account_number;
	private String branch_code;
	private String currency;
	private String bic;
	private String status;
	private Boolean single_earmark_flag;
		
	public Account() 
	{		
	
	}
/*	public Account(String account_number, String branch_code, String currency, String bic, String status,
			Boolean single_earmark_flag) 
	{
		//super();
		this.account_number = account_number;
		this.branch_code = branch_code;
		this.currency = currency;
		this.bic = bic;
		this.status = status;
		this.single_earmark_flag = single_earmark_flag;		
		
		*//******* Account Id Generation *******//*
		StringBuffer sb_accId = new StringBuffer();
		sb_accId.append(account_number);	
		sb_accId.append("_").append(branch_code);		
		sb_accId.append("_").append(currency);
		
		if(!(bic.equals(null) || bic.equals("")))
		{
			sb_accId.append("_").append(bic);
		}		
		this.account_id = sb_accId.toString();
		System.out.println("Account Id: "+account_id);
	}*/
	public String getAccount_id() {
		return account_id;
	}
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getSingle_earmark_flag() {
		return single_earmark_flag;
	}
	public void setSingle_earmark_flag(Boolean single_earmark_flag) {
		this.single_earmark_flag = single_earmark_flag;
	}
	
	public void setAccount_id(String account_number, String branch_code, String currency, String bic)
	{
		StringBuffer sb_accId = new StringBuffer();
		sb_accId.append(account_number);	
		sb_accId.append("_").append(branch_code);		
		sb_accId.append("_").append(currency);
		
		if(!(bic.equals(null) || bic.equals("")))
		{
			sb_accId.append("_").append(bic);
		}
		
		this.account_id = sb_accId.toString();
		
	}
	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", account_number=" + account_number + ", branch_code="
				+ branch_code + ", currency=" + currency + ", bic=" + bic + ", status=" + status
				+ ", single_earmark_flag=" + single_earmark_flag + "]";
	}
	
	
}
