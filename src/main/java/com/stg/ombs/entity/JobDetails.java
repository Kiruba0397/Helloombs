package com.stg.ombs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobDetails {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long jobid;
	
	
	private String jobdetails;
	private String jobtype;
	private String joblocation;
	private String salary;
	
	
	public Long getJobid() {
		return jobid;
	}
	public void setJobid(Long jobid) {
		this.jobid = jobid;
	}
	public String getJobdetails() {
		return jobdetails;
	}
	public void setJobdetails(String jobdetails) {
		this.jobdetails = jobdetails;
	}
	public String getJobtype() {
		return jobtype;
	}
	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	public String getJoblocation() {
		return joblocation;
	}
	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "JobDetails [jobid=" + jobid + ", jobdetails=" + jobdetails + ", jobtype=" + jobtype + ", joblocation="
				+ joblocation + ", salary=" + salary + "]";
	}
	
	
}
