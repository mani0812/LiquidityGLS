package com.citi.gce.gls.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Frequency 
{
	@Id
	private long frequency_id;
	
	private String interval;
	private Date cycle_start_date;
	private Date cycle_start_time;
	private String timezone;
	
	public long getFrequency_id() {
		return frequency_id;
	}
	public void setFrequency_id(long frequency_id) {
		this.frequency_id = frequency_id;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public Date getCycle_start_date() {
		return cycle_start_date;
	}
	public void setCycle_start_date(Date cycle_start_date) {
		this.cycle_start_date = cycle_start_date;
	}
	public Date getCycle_start_time() {
		return cycle_start_time;
	}
	public void setCycle_start_time(Date cycle_start_time) {
		this.cycle_start_time = cycle_start_time;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
}
