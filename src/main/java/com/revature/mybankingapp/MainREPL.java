package com.revature.mybankingapp;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.revaure.mybankingapp.dao.UserDAO;
import com.revaure.mybankingapp.dao.UserDAOImpl;

//import com.examples.ezoo.dao.FeedingScheduleDAO;
//import com.examples.ezoo.dao.FeedingScheduleDAOImpl;

public class MainREPL {
	
	private boolean handleUserLogin(String username, String password) {
		User loggedinuser = new User();
		UserDAO userdao = new UserDAOImpl();
		
		loggedinuser = userdao.login(username, password);
		
		if(loggedinuser.getFirstname() == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean option1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Login");
		System.out.print("User Name: ");
		String username = input.nextLine();
		System.out.print("Password: ");
		String password = input.nextLine();
		
		return this.handleUserLogin(username, password);
	}
	
	public void run() {
		
		Scanner input = new Scanner(System.in);
		int option = 0;
		boolean exit = true;
		
		
		while(exit)
		{
		
		System.out.println("Welcome to my Banking App");
		System.out.println("Choose your option below:");
		System.out.println("Press 1 to Login:");
		//System.out.println("Press 2 to Apply for a bank account:");
		System.out.println("Press 2 to Exit:");
		
		try {
			option = input.nextInt();

	        }catch (InputMismatchException e) {
	           input.next();

	           System.out.println("Invalid choice");
	          
	        } finally {
	        	 //System.out.println(option);
	     		
	     		switch(option) {
	     			case 1: int count = 0; 
	     					boolean breakfromloop = false;
	     					while(this.option1()) {
	     						if(count >= 2)
	     						{
	     							breakfromloop = true;
	     							break;
	     						}
			     				count++;
			     			}
			     			if(!breakfromloop)
			     			{
			     				System.out.println("Welcome!!!");
			     				//run user login interface
			     			}
	     					break;
	     			case 2: exit = false;
	     					System.out.println("Goodbye!");
 							break;
	     			default: System.out.println("Try again");
	     		
	     		}
	        }
		}
		
	}

}
