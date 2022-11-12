package com.mgnrega.usecases;

import java.util.Scanner;
import com.mgnrega.Bean.Bdo;
import com.mgnrega.Bean.Project;
import com.mgnrega.Dao.BdoDao;
import com.mgnrega.Dao.BdoDaoImple;
import com.mgnrega.Exceptions.BDOException;

public class CreateProject {
	
    public static void CProject() {
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Project name:");
	String pname= sc.next();
		
		System.out.println("Enter Project id:");
		int pid= sc.nextInt();
		
		System.out.println("Enter Project cost:");
		String pcost= sc.next();
		
		
		BdoDao dao=new BdoDaoImple();
		
		Project project= new Project();
		
		project.setPid(pid);
		project.setPname(pname);
		project.setPcost(pcost);	

		String result= dao.createProject(pid, pname, pcost);
		
		System.out.println(result);
	}
	}	


