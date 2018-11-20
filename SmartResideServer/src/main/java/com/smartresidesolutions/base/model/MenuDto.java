package com.smartresidesolutions.base.model;

public class MenuDto {
	 String menuName;
	    int sequence;
	    String icon="test";
	    int menuId;
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
		public int getMenuId() {
			return menuId;
		}
		public void setMenuId(int menuId) {
			this.menuId = menuId;
		}
}
