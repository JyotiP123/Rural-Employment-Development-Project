package com.mgnrega.usecases;

import java.util.List;
import com.mgnrega.Bean.Emp;
import com.mgnrega.Dao.GpmDao;
import com.mgnrega.Dao.GpmDaoImpl;
import com.mgnrega.Exceptions.EmpException;

public class GetAllEmployee {
	
	
	public static void GEMP() {
	GpmDao dao = new GpmDaoImpl();
		
		try {
		List<Emp> emp= dao.getAllEmp();
		
		emp.forEach(s ->{
			
			
			System.out.println("Employee id :"+s.getEid());
			System.out.println("Employee Name :"+s.getEname());
			System.out.println("Employee mobile: "+s.getEmobile());
			System.out.println("Employee address: "+s.getEaddress());
			System.out.println("Employee wages: "+s.getEwages());
			System.out.println("Employee wages: "+s.getDayworked());
			
			System.out.println("=======================");
		}
		);

		}catch(EmpException se) {
			System.out.println(se.getMessage());
		}

	}

}


