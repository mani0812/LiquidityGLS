package com.citi.gce.gls.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rules 
{
	@Id
	private long rule_id;
	
	private String rule_name;
	private String rule_desc;
	
	public long getRule_id() {
		return rule_id;
	}
	public void setRule_id(long rule_id) {
		this.rule_id = rule_id;
	}
	public String getRule_name() {
		return rule_name;
	}
	public void setRule_name(String rule_name) {
		this.rule_name = rule_name;
	}
	public String getRule_desc() {
		return rule_desc;
	}
	public void setRule_desc(String rule_desc) {
		this.rule_desc = rule_desc;
	}
	
}
