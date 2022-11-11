package com.mgnrega.Bean;

public class Project {

	private int pid;
	private String pname;
	private String pcost;
	private int gpmid;

	public Project() {
		
	}

	public Project(int pid, String pname, String pcost, int gpmid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
		this.gpmid = gpmid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcost() {
		return pcost;
	}

	public void setPcost(String pcost) {
		this.pcost = pcost;
	}

	public int getGpmid() {
		return gpmid;
	}

	public void setGpmid(int gpmid) {
		this.gpmid = gpmid;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + ", gpmid=" + gpmid + "]";
	}
	
	
	
	

}
