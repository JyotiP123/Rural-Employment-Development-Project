package com.mgnrega.usecases;
import java.util.Scanner;
import com.mgnrega.Bean.Gpm;
import com.mgnrega.Dao.GpmDao;
import com.mgnrega.Dao.GpmDaoImpl;
import com.mgnrega.Exceptions.GpmException;

public class LoginGpm {
	
	public static void LGpm() {
		
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		GpmDao dao = new GpmDaoImpl();
		
		try {
			Gpm gpm= dao.loginGPM(uname, pass);
		
	 		System.out.println("Welcome to Gramhpachyt :"+gpm.getGname());
	 			}catch (GpmException e) {
			System.out.println(e.getMessage());
		}
	}
}
