package com.smartresidesolutions.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SR_ROLE")
public class RoleEntity {
	
	@Id
	@Column
	long roleId;
	
	@Column
	String roleName;
	
	@OneToMany(mappedBy="role")
	List<MenuEntity> menuList=new ArrayList();
	
	@ManyToMany(mappedBy="roleList")
	List<UserEntity> userList=new ArrayList();

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<MenuEntity> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<MenuEntity> menuList) {
		this.menuList = menuList;
	}

	public List<UserEntity> getUserList() {
		return userList;
	}

	public void setUserList(List<UserEntity> userList) {
		this.userList = userList;
	}
	
	

}
