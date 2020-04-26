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
@Table(name="role",schema = "misdb")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "role_id")
	private Integer roleId;
	
	@Column(name="role_name",length = 20)
	private String roleName;
	
	@Column(name="role_description", length = 30)
	private String roleDescription;

	@OneToMany(mappedBy = "role")
	private Set<MemberInfo> memberInfo;
	
	/**
	 * @return the roleId
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the roleDescription
	 */
	public String getRoleDescription() {
		return roleDescription;
	}

	/**
	 * @param roleDescription the roleDescription to set
	 */
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
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
