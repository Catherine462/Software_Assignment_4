public class Main 
{
    public static void main( String[] args )
    {
        IndividualHolder holder_name = new IndividualHolder(AccountHolder.getNextID(), "3400 Poly Vista", "Student1", "AB123");
		Account user_account = new Account(900, holder_name);
		
		System.out.println("The current Balance is: " +user_account.getBalance());
		user_account.withdraw(100); 
		System.out.println("The updated Balance is: " +user_account.getBalance());
	
    }
}