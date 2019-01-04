package com.citi.gce.gls.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RelatedAccounts 
{
	@Id
	private long relation_id;
	
	private long account_id;
	private long to_account_id;
	private String relation_type;
	private long account_version;

}
