package com.smartresidesolutions.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findUserByEmail",  
	        query = "from UserEntity ue where ue.email = :email"  
	        )  
	    }  
	)  



@Entity
@Table(name="SR_USER")
public class UserEntity {
	
	@Id
	@GeneratedValue
	@Column
	long userId;
	@Column
	String firstName;
	@Column
    String lastName;
	@Column
    String email;
	@Column
    String mobile;
	@Column
    Date birthdate;
	@Column
    String kycNumber;
	@Column
    String kycType;
	@Column
    String gender;
	@Column
    String password;
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "SR_USER_ROLE_PTCP", 
        joinColumns = { @JoinColumn(name = "userId") }, 
        inverseJoinColumns = { @JoinColumn(name = "roleId") }
    )
	List<RoleEntity> roleList=new ArrayList();

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getKycNumber() {
		return kycNumber;
	}

	public void setKycNumber(String kycNumber) {
		this.kycNumber = kycNumber;
	}

	public String getKycType() {
		return kycType;
	}

	public void setKycType(String kycType) {
		this.kycType = kycType;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<RoleEntity> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<RoleEntity> roleList) {
		this.roleList = roleList;
	}
	
	

}
