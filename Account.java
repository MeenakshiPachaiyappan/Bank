
public class Account{
	
					private String accountName,password;
					private int accountNumber,phoneNumber,initialDeposit;	
	
					Account(){
						
					}
					Account(String accountName,int accountNumber, int phoneNumber, String password,int initialDeposit){
							this.accountName = accountName;
							this.accountNumber = accountNumber;
							this.phoneNumber = phoneNumber;
							this.password = password;
							this.initialDeposit = initialDeposit;
						
					}
					
					public String getAccountName(){
							return accountName;
					}
					
					public void setAccountName(String accountName){
						 	this.accountName = accountName;
					}
					
					public int getaccountNumber(){
							return accountNumber;
					}
	
					public void setaccountNumber(int phoneNumber){
							this.accountNumber = phoneNumber;
					}
					
					public String getPassword(){
							return password;	
					}

					public void setPassword(String password){
							this.password = password;
					}
					
					public int getInitialDeposit(){
						    return initialDeposit;	
				    }

					public void setInitialDeposit(int initialDeposit){
							this.initialDeposit= initialDeposit;
					}
								
					public void addAmount(int depAmount){
						
						this.initialDeposit = this.initialDeposit+depAmount;
					}
					public void reduceAmount(int withdrawAmount){
						
						this.initialDeposit = this.initialDeposit-withdrawAmount;
					}
					
					void display(){
						System.out.println("The details of the account are-->\t" + accountName+"\t "+accountNumber+"\t "+initialDeposit);
						System.out.println();
					}
					
					
}																									
