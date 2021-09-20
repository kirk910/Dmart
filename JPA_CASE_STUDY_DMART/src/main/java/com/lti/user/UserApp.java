package com.lti.user;

import java.util.Scanner;

import com.lti.beans.Product;
import com.lti.services.ProductService;
import com.lti.services.ProductServiceImpl;

public class UserApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ans;
		int no;
		do {
			System.out.println("** DMART  Services ***");
			System.out.println("1. Add product -> Enter Product Info "); 
			System.out.println("2. View Products List "); 
			System.out.println("Pls enter your choice: ");
			no = sc.nextInt();
			switch (no) {
			case 1:			System.out.println("Enter PRD_ID");
							int _prdId = sc.nextInt();
							
							System.out.println("Enter PRD_NAME");
							String _prdName = sc.next();
							
							System.out.println("Enter PRD_COST");
							float _prdCost = sc.nextFloat();
			
							
							Product p = new Product(_prdId,_prdName,_prdCost);
							ProductService service= new ProductServiceImpl();
							service.addProduct(p);
						
				break;
			case 2:			System.out.println("case 2");	
				
				break;
			}
			System.out.println("wish to continue? type y/n  ");
			ans = sc.next();
		} while (ans.equals("Y") || ans.equals("y"));
		System.out.println("Thanks and visit again.");
		
	}

}