package org.nucleus.bbl.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Naveen Reddy
 * @version 1.0
 * @since   24/01/2017
 */

public class JobDetails {
	
	@SequenceGenerator(initialValue=1,name="job_id_seq",sequenceName="job_id_seq")
	@Id
	@GeneratedValue(generator="job_id_seq",strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastExecTime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date nextExecTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getLastExecTime() {
		return lastExecTime;
	}

	public void setLastExecTime(Date lastExecTime) {
		this.lastExecTime = lastExecTime;
	}

	public Date getNextExecTime() {
		return nextExecTime;
	}

	public void setNextExecTime(Date nextExecTime) {
		this.nextExecTime = nextExecTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((lastExecTime == null) ? 0 : lastExecTime.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((nextExecTime == null) ? 0 : nextExecTime.hashCode());
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
		JobDetails other = (JobDetails) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (lastExecTime == null) {
			if (other.lastExecTime != null)
				return false;
		} else if (!lastExecTime.equals(other.lastExecTime))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nextExecTime == null) {
			if (other.nextExecTime != null)
				return false;
		} else if (!nextExecTime.equals(other.nextExecTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JobDetails [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", lastExecTime=");
		builder.append(lastExecTime);
		builder.append(", nextExecTime=");
		builder.append(nextExecTime);
		builder.append("]");
		return builder.toString();
	}

}
