package exp1;
import java.util.Scanner;
public class atm {
	
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int user_pin=5555;
				System.out.println("\nEnter your atm pin:");
				int input_pin=sc.nextInt();
				if(user_pin==input_pin) {
					System.out.println("\nValid Pin entered");
					System.out.println("\nChoose you account type"
										+ "\n1-Savings Account"
										+ "\n2-Current Account");
					int user_acc=sc.nextInt();
					if(user_acc==1) {
						System.out.println("\nOpened Savings Account");
						validated();
						}
					else if(user_acc==2) {
						System.out.println("\nOpened Current Account");
						validated();
						}
					else
						System.out.println("\nInvalid Account type.Process terminated");
					
				}
				else 
					System.out.println("\nInvalid Pin.Process terminated\n");
	}
	public static void validated() {
			Scanner sc=new Scanner(System.in);
			int trans_limit=4;
			int trans_count=0;
			int balance=5000;
			while(trans_count<trans_limit) {
				System.out.println("\nSELECT TRANSACTION:"
						+ "\n1-Check Balance"
						+ "\n2-Deposit"
						+ "\n3-Withdraw"
						+ "\n4-Exit");
			
			int trans_inp=sc.nextInt();
			switch(trans_inp) {
				case 1:
						System.out.println("\nBalance"+balance);
						break;
				case 2:
						System.out.println("\nEnter amount to deposit:");
						int dep=sc.nextInt();
						balance=balance+dep;
						System.out.println("\nAmount deposited:"+dep);
						System.out.println("\nCurrent Balance:"+balance);
						break;
				case 3:
						System.out.println("\nEnter amount to be withdrawn:");
						int drawn=sc.nextInt();
						if(drawn%500==0) {
						if(drawn<=balance) {
							balance=balance-drawn;
							System.out.println("\nAmount withdrawn:"+drawn);
							System.out.println("\nCurrent Balance:"+balance);
						}
						else
							System.out.println("\nInsufficient Balance");
						}
						else 
							System.out.println("\nIncorrect denominations");
							
						break;
				case 4:
						System.out.println("\nProcess terminated");
						return;
				default:
						System.out.println("\nWrong input");
		}
			
			trans_count=trans_count+1;
			}
		if(trans_count==trans_limit)
			System.out.println("\nTransaction limit reached.Process terminated");
		
	}
}
