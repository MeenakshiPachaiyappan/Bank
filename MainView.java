import java.util.*;

public class MainView{
					
					public static void main(String args[]){
						        int accountNumber = 0;
								Scanner scanner = new Scanner(System.in);
								System.out.println("WELCOME TO THE BANKING APPLICATION:");
								System.out.println("Enter the name of your Bank");
								String bankName = scanner.nextLine();
								System.out.println("Enter the branch name:");
								String branchName = scanner.nextLine();
								Account account = new Account();
								
								Bank bank = new Bank(bankName, branchName);
								boolean exit = false;
								boolean terminate = false;
								boolean logout = false;
								int option = 0;
								
								do {
									boolean nextStep = false;
									if (nextStep == true) {
										break;
									}
								System.out.println("Choose one option:\n1.Create an Account \n2.Login to your existing account \n3.Exit the Application");
								option = scanner.nextInt();
								
								switch(option){
								
									case  1:
												Scanner scanner1= new Scanner(System.in);
												System.out.println("Enter the details below to open an account:");
												System.out.println("Enter your name:");
												String accountName = scanner1.nextLine();
												System.out.println("Enter your  phone number:");
												int phoneNumber = scanner1.nextInt();
												System.out.println("Enter a password:");
												String password = scanner1.next();
												System.out.println("Enter the initial deposit amount:");
												int initialDeposit = scanner1.nextInt();
												accountNumber = accountNumber+1;
												account = new Account(accountName, accountNumber, phoneNumber,password,initialDeposit);
												bank.addAccounts(account);
												nextStep = true;
												break;
												
									case 2:
												Scanner scanner2 = new Scanner(System.in);
												System.out.println("Enter the details of your existing account:");
												System.out.println("Enter your account number :");
												accountNumber = scanner2.nextInt();
												Account accObj = bank.verifyAccount(accountNumber);
												
												if(accObj ==  null){
														System.out.println("Invalid account details,Please check again!");
												}
												else{
													scanner2.nextLine();
													System.out.println("Enter your password:");
													String accPassword = scanner2.nextLine();
													
													if (accObj.getPassword().equals(accPassword)) {
														System.out.println("login success!");
														logout=false;
													}
													
													nextStep = true;
													break;
												}
											    
											
									case 3:
										
												System.out.println("Exiting the bank application..");
												exit = true;
												terminate = true;
												break;
												
									default:
										
												System.out.println("Enter a valid option:");
												exit = true;
												nextStep = true;
												break;
								}
								while (true) {

									if (logout == true) {
										break;
									}

									if (terminate == true) {
										break;
									}
								
										Scanner scanner3 = new Scanner(System.in);
										System.out.println("Choose your next Option:\n1. Deposit money \n2. Withdraw money \n3.Check Balance Enquiry \n 4. Logout" );
										int nextOption = scanner3.nextInt();
												
										switch(nextOption){
				
															
										        case 1:
										        		
										        		Scanner scanner4 = new Scanner(System.in);
										        		System.out.println("Enter the amount to be deposited:");
										        		int depAmount = scanner4.nextInt();
										        		account.addAmount(depAmount);
										        		break;
										        		
										        case 2:
										        	
										        		Scanner scanner5 = new Scanner(System.in);
										        		System.out.println("Enter the amount to be withdrawn:");
										        		int withdrawAmount= scanner5.nextInt();
										        		
										        		if(withdrawAmount>account.getInitialDeposit()){
										        			System.out.println("Balance insufficient");
										        		}
										        		else{
										        				System.out.println("Transaction successful!");
										        				account.reduceAmount(withdrawAmount);
										        		}
										        		break;
										        		
										       case 3:
										  
										        		account.display();
										        		break;
										       
										        case 4:
										        	
										        			System.out.println("logging out...");     			
										        			logout = true;
										        			break;
										        		
										        default:
										        	
										        			System.out.println("Enter a valid option");
										        			break;
									
											}
								}
					}while(option<3);
								
			}
						
}
	


