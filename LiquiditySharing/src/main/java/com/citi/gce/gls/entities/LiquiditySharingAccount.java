package com.citi.gce.gls.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class LiquiditySharingAccount implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LiquiditySharingAccountId lsa_id;
	
	private Date effective_start_date;
	private Date effective_end_date;
	private Date suspend_start_date;
	private Date suspend_end_date;
	private String status;
	
	@ManyToOne
    @JoinColumn(name = "setup_id")
	private LiquiditySharingSetup liquiditySharingSetup;
		
	
	public LiquiditySharingAccountId getLsa_id() {
		return lsa_id;
	}
	public void setLsa_id(LiquiditySharingAccountId lsa_id) {
		this.lsa_id = lsa_id;
	}
	
	public Date getEffective_start_date() {
		return effective_start_date;
	}
	public void setEffective_start_date(Date effective_start_date) {
		this.effective_start_date = effective_start_date;
	}
	public Date getEffective_end_date() {
		return effective_end_date;
	}
	public void setEffective_end_date(Date effective_end_date) {
		this.effective_end_date = effective_end_date;
	}
	public Date getSuspend_start_date() {
		return suspend_start_date;
	}
	public void setSuspend_start_date(Date suspend_start_date) {
		this.suspend_start_date = suspend_start_date;
	}
	public Date getSuspend_end_date() {
		return suspend_end_date;
	}
	public void setSuspend_end_date(Date suspend_end_date) {
		this.suspend_end_date = suspend_end_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LiquiditySharingSetup getLiquiditySharingSetup() {
		return liquiditySharingSetup;
	}
	public void setLiquiditySharingSetup(LiquiditySharingSetup liquiditySharingSetup) {
		this.liquiditySharingSetup = liquiditySharingSetup;
	}
	
}
