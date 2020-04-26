/**
 * 
 */
package com.cgi.mis.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Mahesh
 *
 */
@Entity
@Table(name="member_info",schema = "misdb")
public class MemberInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="member_id")
	private Long memberId;
	
	@Column(name="psa_id", length = 10, nullable = false, unique = true)
	private String pasId;
	
	@Column(name="password", length = 30, nullable = false, unique = false)
	private String password;
	
	@Column(name="email", length = 30, nullable = false, unique = false)
	private String email;
	
	@Column(name="extension_number", length = 10, nullable = true, unique = false)
	private String extensionNumber;
	
	@Column(name="designation", length = 30, nullable = false, unique = false)
	private String designation;
	
	@ManyToOne
	@JoinColumn(name="location", referencedColumnName = "location_id")
	private Location location;
	
	@Column(name="date_of_join", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateOfJoin;
	
	@Column(name="experience")
	private Double experience;
	
	@ManyToOne
	@JoinColumn(name = "role", referencedColumnName = "role_id")
	private Role role;
	
	@ManyToOne
	@JoinColumn(name = "status", referencedColumnName = "status_id")
	private Status status;
	
	@Column(name = "last_login")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastlogIn;
	
	@Column(name="last_modified")
	@Temporal(TemporalType.TIMESTAMP)
	private Date LastModified;
	
	@OneToOne(mappedBy = "memberInfo", cascade = CascadeType.ALL)
	private PersonalInfo personalInfo;

	/**
	 * @return the memberId
	 */
	public Long getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the pasId
	 */
	public String getPasId() {
		return pasId;
	}

	/**
	 * @param pasId the pasId to set
	 */
	public void setPasId(String pasId) {
		this.pasId = pasId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the extensionNumber
	 */
	public String getExtensionNumber() {
		return extensionNumber;
	}

	/**
	 * @param extensionNumber the extensionNumber to set
	 */
	public void setExtensionNumber(String extensionNumber) {
		this.extensionNumber = extensionNumber;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * @return the dateOfJoin
	 */
	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	/**
	 * @param dateOfJoin the dateOfJoin to set
	 */
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	/**
	 * @return the experience
	 */
	public Double getExperience() {
		return experience;
	}

	/**
	 * @param experience the experience to set
	 */
	public void setExperience(Double experience) {
		this.experience = experience;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return the lastlogIn
	 */
	public Date getLastlogIn() {
		return lastlogIn;
	}

	/**
	 * @param lastlogIn the lastlogIn to set
	 */
	public void setLastlogIn(Date lastlogIn) {
		this.lastlogIn = lastlogIn;
	}

	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return LastModified;
	}

	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(Date lastModified) {
		LastModified = lastModified;
	}

	/**
	 * @return the personalInfo
	 */
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	/**
	 * @param personalInfo the personalInfo to set
	 */
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	
	
}

