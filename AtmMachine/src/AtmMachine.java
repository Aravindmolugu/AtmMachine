import java.io.*;
import java.util.Scanner;

class AtmMachine
{
	 String[] acc={"aaa","bbb"};
	  int[] pswd={1234,5678};
	  double[] bal={1000,2000};
	  int temp=0;
  public static void main(String args[])
  {
	  int i,temp,pin;
	  int userid;
	  Scanner s=new Scanner(System.in);
	  int[] acc={1234,5678};
	  int[] pswd={1234,5678};
	  double[] bal={1000,2000};
	  System.out.println("Welcome!!\nEnter ur userid");
	  userid=s.nextInt();
	  temp=0;
	  for(i=0;i<2;i++)
	  {  if(acc[i]==userid)
		  { 
	       System.out.println("Welcome"+userid);
		   System.out.println("Enter Pin to continue");
		   pin=s.nextInt();
		   temp++;
		      if(pswd[i]==pin)
		         display(i);
		      else{
				System.out.println("Incorrect Pin");
			    System.exit(0);
			     }
		  }
	    
	  }
		if(temp>2) {
			   System.out.println("Invalid UserId");
			   System.exit(0);
		   }
	  
  }
 public static void display(int i)
  {  
	 String[] acc={"aaa","bbb"};
	 Scanner s=new Scanner(System.in);
	 int[] pswd={1234,5678};
	  double[] bal={1000,2000};
      int amount,AccType,option,oldpin;
	  System.out.println("Select Options");
	  System.out.println("1.Withdraw");
	  System.out.println("2.Deposit");
	  System.out.println("3.BalanceEnquiry");
	  System.out.println("4.Change Pin");
	  option=s.nextInt();
	  if(option==1)
	  {      System.out.println("Select Account Type");
	          System.out.println("1.Current"); 
	          System.out.println("2.Savings");
	          AccType=s.nextInt();
		     System.out.println("Enter amount to withdraw");
		     amount=s.nextInt();
		     if(amount>=bal[i])
				 System.out.println("Insufficient Funds!!!");
			  else
			  { bal[i]-=amount;
		        System.out.println("Collect your cash");
			     System.out.println(amount +"Rs withdrawn.\n Remaining amount: RS"+bal[i]);
				 System.exit(0);
			  } 
	  }
	  else if(option==2)
	  {
		  System.out.println("Enter amount to be deposited");
		  amount=s.nextInt();
		  bal[i]+=amount;
		  System.out.println("Amount deposited.\n Updated Balance:"+bal[i]);
		  System.exit(0);
	  }
	  else if(option==3)
	  { System.out.println("Current Balance:"+bal[i]);
          System.exit(0);
	  }
	  else if(option==4)
	  {
		  System.out.println("Enter old pin");
		  oldpin=s.nextInt();
		  if(pswd[i]==oldpin)
		  {  System.out.println("Enter New pin");
		     pswd[i]=s.nextInt();
             System.out.println("Pin changed successfully");
		  }
          else
		  {			  
              System.out.println("You have entered wrong Oldpin");
		      System.exit(0);
		  }
	  }
  }
}
