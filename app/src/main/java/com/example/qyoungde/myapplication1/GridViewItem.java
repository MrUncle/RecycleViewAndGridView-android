package com.example.qyoungde.myapplication1;


public class GridViewItem {

	private int cp_pic;
	private String cp_name;
	public int getCp_pic() {
		return cp_pic;
	}
	public void setCp_pic(int cp_pic) {
		this.cp_pic = cp_pic;
	}
	public String getCp_name() {
		return cp_name;
	}
	public void setCp_name(String cp_name) {
		this.cp_name = cp_name;
	}
	@Override
	public String toString() {
		return "GridViewItem [cp_pic=" + cp_pic + ", cp_name=" + cp_name + "]";
	}
	
}
