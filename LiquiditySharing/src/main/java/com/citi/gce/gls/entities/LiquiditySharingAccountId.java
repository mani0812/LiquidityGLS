package com.citi.gce.gls.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class LiquiditySharingAccountId implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long account_version;
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String account_id;

	public LiquiditySharingAccountId() 
	{
		
	}

	public LiquiditySharingAccountId(long account_version, String account_id) 
	{
		this.account_version = account_version;
		this.account_id = account_id;
	}

	public long getAccount_version() {
		return account_version;
	}

	public void setAccount_version(long account_version) {
		this.account_version = account_version;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account_id == null) ? 0 : account_id.hashCode());
		result = prime * result + (int) (account_version ^ (account_version >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LiquiditySharingAccountId other = (LiquiditySharingAccountId) obj;
		if (account_id == null) {
			if (other.account_id != null)
				return false;
		} else if (!account_id.equals(other.account_id))
			return false;
		if (account_version != other.account_version)
			return false;
		return true;
	}
	
	
	
	

}
