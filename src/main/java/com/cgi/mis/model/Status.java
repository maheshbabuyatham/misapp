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

/**
 * @author Mahesh
 *
 */
@Entity
@Table(name="status",schema = "misdb")
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="status_id")
	private Integer statusId;
	
	@Column(name="status_type")
	private String statusType;
	
	@OneToMany(mappedBy = "status")
	private Set<MemberInfo> memberInfo;

	/**
	 * @return the statusId
	 */
	public Integer getStatusId() {
		return statusId;
	}

	/**
	 * @param statusId the statusId to set
	 */
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	/**
	 * @return the statusType
	 */
	public String getStatusType() {
		return statusType;
	}

	/**
	 * @param statusType the statusType to set
	 */
	public void setStatusType(String statusType) {
		this.statusType = statusType;
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
