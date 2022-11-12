package com.mgnrega.usecases;

import java.util.List;

import com.mgnrega.Bean.Project;
import com.mgnrega.Dao.BdoDao;
import com.mgnrega.Dao.BdoDaoImple;
import com.mgnrega.Exceptions.ProjectException;

public class GetAllProjects {
	
	public static void GAllProjects() {
		
		BdoDao dao = new BdoDaoImple();
		
		try {
			List<Project> projects=dao.getAllProjectDetails();
			projects.forEach(s->{
				System.out.println("Project Name :"+s.getPname());
				System.out.println("Project cost: "+s.getPcost());
				
				System.out.println("==========================================");
			});
		} catch (ProjectException e) {
			System.out.println(e.getMessage());
		}
	}
}
