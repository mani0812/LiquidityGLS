package com.citi.gce.gls.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class LiquiditySharingSetup implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long setup_id;

	private long maker_id;
	private long checker_id;
	private Date maker_date;
	private Date checker_date;
	private String description;
	private String status;

	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumns({ @JoinColumn(name = "lsa_id.account_version"), @JoinColumn(name = "lsa_id.account_id") })
	private Set<LiquiditySharingAccount> liquiditySharingSetupList;

	public long getSetup_id() {
		return setup_id;
	}

	public void setSetup_id(long setup_id) {
		this.setup_id = setup_id;
	}

	public long getMaker_id() {
		return maker_id;
	}

	public void setMaker_id(long maker_id) {
		this.maker_id = maker_id;
	}

	public long getChecker_id() {
		return checker_id;
	}

	public void setChecker_id(long checker_id) {
		this.checker_id = checker_id;
	}

	public Date getMaker_date() {
		return maker_date;
	}

	public void setMaker_date(Date maker_date) {
		this.maker_date = maker_date;
	}

	public Date getChecker_date() {
		return checker_date;
	}

	public void setChecker_date(Date checker_date) {
		this.checker_date = checker_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Set<LiquiditySharingAccount> getLiquiditySharingSetupList() {
		return liquiditySharingSetupList;
	}

	public void setLiquiditySharingSetupList(Set<LiquiditySharingAccount> liquiditySharingSetupList) {
		this.liquiditySharingSetupList = liquiditySharingSetupList;
	}

	/*
	 * public Set<LiquiditySharingAccount> getLiquiditySharingSetupList() { return
	 * liquiditySharingSetupList; } public void
	 * setLiquiditySharingSetupList(Set<LiquiditySharingAccount>
	 * liquiditySharingSetupList) { this.liquiditySharingSetupList =
	 * liquiditySharingSetupList; }
	 */

	/*
	 * public List<LiquiditySharingAccount> getLsaList() { return lsaList; } public
	 * void setLsaList(List<LiquiditySharingAccount> lsaList) { this.lsaList =
	 * lsaList; }
	 */

}
