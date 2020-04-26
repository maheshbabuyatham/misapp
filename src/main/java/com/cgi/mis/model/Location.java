/**
 * 
 */
package com.cgi.mis.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Mahesh
 *
 */
@Entity
@Table(name="location", schema = "misdb")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "location_id", updatable = false, nullable = false)
	private Integer locationId;
	
	@Column(name="location_name", length = 30)
	private String locationName;

	@JsonIgnore
	@OneToMany(mappedBy = "location")
	private Set<MemberInfo> memberInfo;
	
	/**
	 * @return the locationId
	 */
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * @param locationName the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 * @return the memberInfo
	 */
	public Set<MemberInfo> getMemberInfo() {
		return memberInfo;
	}

	/**
	 * @param memberInfo the memberInfo to set
	 */
	public void setMemberInfo(Set<MemberInfo> memberInfo) {
		this.memberInfo = memberInfo;
	}
	
	
}
