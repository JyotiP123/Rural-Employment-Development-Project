package com.mgnrega.usecases;

import java.util.List;
import java.util.Scanner;

import com.mgnrega.Bean.Bdo;
import com.mgnrega.Bean.EmpDto;
import com.mgnrega.Bean.Emp;
import com.mgnrega.Dao.BdoDao;
import com.mgnrega.Dao.BdoDaoImple;
import com.mgnrega.Dao.GpmDao;
import com.mgnrega.Dao.GpmDaoImpl;
import com.mgnrega.Exceptions.BDOException;
import com.mgnrega.Exceptions.EmpException;
import com.mgnrega.Exceptions.ProjectException;

public class GetEmployeebyPhone {
	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Employee Mobile NUmber");
		
		String cname= sc.next();

		
		GpmDao dao = new GpmDaoImpl();
		
		try {
		List<Emp> dtos= dao.getEmployeeByMobile(cname);
		
		dtos.forEach(dto -> System.out.println(dto));
		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		
	}
	}
}



