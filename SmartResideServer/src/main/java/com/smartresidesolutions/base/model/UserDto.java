package com.smartresidesolutions.base.model;

import java.util.ArrayList;
import java.util.List;

public class UserDto {

	 	String email;
	    String password;
	    String userRole;
	    List<MenuDto> menuList=new ArrayList<>();
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUserRole() {
			return userRole;
		}
		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}
		public List<MenuDto> getMenuList() {
			return menuList;
		}
		public void setMenuList(List<MenuDto> menuList) {
			this.menuList = menuList;
		}
	    
	
	
}
