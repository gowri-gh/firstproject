package com.treandingstyle;

import java.util.Scanner;

import com.treandingstyle.DBConfig.DBConfig;
import com.treandingstyle.spartenbackend.CategoryMain;
import com.treandingstyle.spartenbackend.ProductMain;
import com.treandingstyle.spartenbackend.SupplierMain;
import com.treandingstyle.spartenbackend.UserMain;

public class App{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 DBConfig dbConfig=new DBConfig();
	        
	        dbConfig.sessionFactory();
	        System.out.println("Enter your choice : 1.User 2.Product 3.Supplier 4.Category");
		    
		     int choice=sc.nextInt();
		     
		     switch(choice)
		     {
		     case 1:
		     {
		    	 UserMain userMain=new UserMain();
    		     userMain.userOut();
    		     break;
		     }
		     case 2:
		     {
		    	 ProductMain productMain=new ProductMain();
		    	 productMain.productOut();
		    	 break;
		    	 
		     }
		     case 3:
		        {
		        	SupplierMain supplierMain=new SupplierMain();
		        	supplierMain.supplierOut();
		        	break;
		        }
		     case 4:
		     {
		    	 CategoryMain categoryMain=new CategoryMain();
    		     categoryMain.categoryOut();
    		     break;
		     }
		     default:
		    	 System.out.println("Please enter valid option");
		     }
		

}
}



