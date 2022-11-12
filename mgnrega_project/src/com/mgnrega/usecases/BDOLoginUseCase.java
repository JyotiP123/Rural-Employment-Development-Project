package com.mgnrega.usecases;
import java.util.Scanner;
import com.mgnrega.Bean.Bdo;
import com.mgnrega.Dao.BdoDao;
import com.mgnrega.Dao.BdoDaoImple;
import com.mgnrega.Exceptions.BDOException;

public class BDOLoginUseCase {
	
        public static void main(String[] args) {
			
        	Scanner sc= new Scanner(System.in);


        	System.out.println("Enter email:");
        	String uname = sc.next();
        	
        	System.out.println("Enter Password:");
        	String pass = sc.next();
        	
        	BdoDao dao = new BdoDaoImple();
        	
        	try {
        		Bdo bd= dao.loginBDO(uname, pass);
        	
         		System.out.println("Welcome to MGNREGA");
         	
         	
        	}catch (BDOException e) {
        		System.out.println(e.getMessage());
        	}
		}	
}




