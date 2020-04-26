/**
 * 
 */
package com.cgi.mis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Mahesh
 *
 */
@Entity
@Table(name="personal_info",schema = "misdb")
public class PersonalInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="personal_id")
	private Long personalId;
	
	@Column(name = "first_name", length = 20, nullable = false, unique = false)
	private String firstName;
	
	@Column(name = "last_name", length = 20, nullable = false, unique = false)
	private String lastName;
	
	@Column(name="gender", length = 6,nullable = false,unique = false)
	private String gender;
	
	@Column(name="date_of_birth",nullable = false,unique = false )
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(name="mobile_number", length = 12, nullable = false, unique = false)
	private Integer mobileNumber;
	
	@Column(name="email", length = 30, nullable = false,unique = false)
	private String email;
	
	@Column(name="blood_group", length = 5 , nullable = false, unique = false)
	private String bloodGroup;
	
	@Column(name="address", length = 100, nullable = false, unique = false)
	private String address;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="personal_id")
	@MapsId
	private MemberInfo memberInfo;
	
	/**
	 * @return the personalId
	 */
	public Long getPersonalId() {
		return personalId;
	}

	/**
	 * @param personalId the personalId to set
	 */
	public void setPersonalId(Long personalId) {
		this.personalId = personalId;
	}

	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the mobileNumber
	 */
	public Integer getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
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
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the memberInfo
	 */
	public MemberInfo getMemberInfo() {
		return memberInfo;
	}

	/**
	 * @param memberInfo the memberInfo to set
	 */
	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}
	
	
}
