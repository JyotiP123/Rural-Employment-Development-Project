package com.mgnrega.usecases;

import java.util.List;
import com.mgnrega.Bean.Gpm;
import com.mgnrega.Dao.BdoDao;
import com.mgnrega.Dao.BdoDaoImple;
import com.mgnrega.Exceptions.GpmException;

public class GetAllGpm {
	
	public static void GAllGpm()  {
		
		BdoDao dao=new BdoDaoImple();
		
		try {
			List<Gpm> gpm=dao.getAllGPM();
			 
			gpm.forEach(s->{
				
				System.out.println("======================================");
				System.out.println("Grampchyat member name: "+s.getGname());
				System.out.println("Grampchyat member email: "+s.getGemail());
				System.out.println("Grampchyat member Password: "+s.getGpassword());
				System.out.println("Grampchyat member Mobile: "+s.getGmobile());
				System.out.println("Grampchyat member Address: "+s.getGaddress());
				System.out.println("======================================");

			});
			
		} catch (GpmException e) {
		     System.out.println(e.getMessage());
		}
		
	}

}
