package com.smartresidesolutions.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SR_MENU")
public class MenuEntity {
	
	@Id
	@Column
	long menuId;
	
	@Column
	String menuName;
	
	@Column
	int sequence;
	
	@Column
	String icon;

	@ManyToOne
	@JoinColumn(name="roleId", nullable=false)
	RoleEntity role;

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	
	

}
