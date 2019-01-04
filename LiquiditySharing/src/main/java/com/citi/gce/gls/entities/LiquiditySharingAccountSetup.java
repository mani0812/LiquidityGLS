package com.citi.gce.gls.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class LiquiditySharingAccountSetup 
{
	@Id
	private long serial_number;
	
	//@OneToOne(mappedBy = "LiquiditySharingSetup")
	@Column(name = "setup_id")
	private long fk_setup_id;
	
	/*@OneToMany(mappedBy = "LiquiditySharingAccount")
	private List<LiquiditySharingAccountId> fk_lsaIds = new ArrayList<LiquiditySharingAccountId>();*/
	
	//@OneToOne(mappedBy = "LiquiditySharingAccount")
	private LiquiditySharingAccountId fk_lsaId;
	
	public long getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(long serial_number) {
		this.serial_number = serial_number;
	}

	public long getFk_setup_id() {
		return fk_setup_id;
	}

	public void setFk_setup_id(long fk_setup_id) {
		this.fk_setup_id = fk_setup_id;
	}

	public LiquiditySharingAccountId getFk_lsaId() {
		return fk_lsaId;
	}

	public void setFk_lsaId(LiquiditySharingAccountId fk_lsaId) {
		this.fk_lsaId = fk_lsaId;
	}
	
	

	/*public List<LiquiditySharingAccountId> getFk_lsaIds() {
		return fk_lsaIds;
	}

	public void setFk_lsaIds(List<LiquiditySharingAccountId> fk_lsaIds) {
		this.fk_lsaIds = fk_lsaIds;
	}*/
	
	

	/*public long getSetup_id() {
		return setup_id;
	}

	public void setSetup_id(long setup_id) {
		this.setup_id = setup_id;
	}

	public List<LiquiditySharingAccountId> getLsaIds() {
		return lsaIds;
	}

	public void setLsaIds(List<LiquiditySharingAccountId> lsaIds) {
		this.lsaIds = lsaIds;
	}
	*/

	
	/*public LiquiditySharingAccountId getLsa_id() {
		return lsa_id;
	}

	public void setLsa_id(LiquiditySharingAccountId lsa_id) {
		this.lsa_id = lsa_id;
	}*/
	
	
	

}
