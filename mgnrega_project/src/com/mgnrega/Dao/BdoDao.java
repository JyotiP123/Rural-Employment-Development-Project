package com.mgnrega.Dao;

import java.util.List;
import com.mgnrega.Bean.Bdo;
import com.mgnrega.Bean.EmpDto;
import com.mgnrega.Bean.Gpm;
import com.mgnrega.Bean.Project;
import com.mgnrega.Exceptions.BDOException;
import com.mgnrega.Exceptions.GpmException;
import com.mgnrega.Exceptions.ProjectException;

public interface BdoDao {
	
     public Bdo loginBDO(String username, String password)throws BDOException;
     
	public List<Project> getAllProjectDetails()throws ProjectException;

	public String registerGPM(int gid, String gname, String gemail, String gpassword, String phone, String gaddress, int bdoid);

	public List<Gpm> getAllGPM()throws GpmException;
	
	
	public String AssignProjectToGPM(int pid, int gid)throws GpmException,ProjectException ;
	
	public List<EmpDto> getAllEmployeeByPname(String pname)throws ProjectException;

	public String createProject(int pid, String pname, String pcost);
	


}