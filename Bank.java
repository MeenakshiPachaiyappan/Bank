
public class Bank {
	
					private String bankName, branchName;
					int n = 100;
					static int index =0;
					private Account accounts[] = new Account[n]; 
					
					Bank(){
						
					}
					Bank(String bankName, String branchName){
						
							this.bankName = bankName;
							this.branchName = branchName;
							
					}
					
					void addAccounts(Account account){
								
								Account accounts[] = this.accounts;
								
							
										if(accounts[index] == null){
											this.accounts[index] = account;
											index++;
											
										}
					}
					
					public Account verifyAccount(int accountNumber){
						
							for(int i = 0; i<index; i++){
								
								Account obj = this.accounts[i];
								
								if(obj.getaccountNumber()==accountNumber){
									return obj;
								}
							}
					
							return null;
					}
				
}
		
		
		