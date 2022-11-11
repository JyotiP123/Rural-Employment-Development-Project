package com.mgnrega.Dao;
import java.util.List;

import com.mgnrega.Bean.Emp;
import com.mgnrega.Bean.Gpm;
import com.mgnrega.Exceptions.EmpException;
import com.mgnrega.Exceptions.GpmException;
import com.mgnrega.Exceptions.ProjectException;

public interface GpmDao {
	
    public Gpm loginGPM(String username, String password)throws GpmException;
    
	public String registerEmployee(int eid, String ename, String emobile, String eaddress, int etotaldaywork, String ewages);

	public List<Emp> getAllEmp()throws EmpException;
	
	public String registerEmployeeToProject(int pid, int eid)throws ProjectException, EmpException ;

	public List<Emp>  getEmployeeByMobile(String emobile)throws ProjectException, EmpException;
     

}
