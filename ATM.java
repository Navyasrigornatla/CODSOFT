import java.util.*;
class ATMfunctions{
 public int balence;
  ATMfunctions(int bal){
   balence=bal;
   }
 public void checkbalence(){
   System.out.print("Current balence is :");
   System.out.println(balence);
}
public void deposit(int amount){
  System.out.println("Deposit Operation");
  balence=balence+amount;
  System.out.println("Your money is deposited successfully");
 }
public void withdraw(int amount){
   
  System.out.println("Withdraw Operation");
  balence=balence-amount;
  System.out.println("Amount withdraw successful");
  
}
}
class atm1{
  public static void main(String args[]){
  int n;
  int money;
  Scanner sc=new Scanner(System.in);
  ATMfunctions atf=new ATMfunctions(5000);
  while(true){
   System.out.println("Enter your choice:");
  System.out.println("1.check balence");
  System.out.println("2. Deposit");
  System.out.println("3.withdraw");
  System.out.println("4.exit");
  System.out.println("Enter your choice:");
  n=sc.nextInt();
  if(n==1){
   atf.checkbalence();
   }
  else  if (n==2){
    System.out.println("enter money to deposit");
    money=sc.nextInt();
    atf.deposit(money);
   }
 else if (n==3){
    System.out.println("Enter money for withdraw");
    money=sc.nextInt();
    atf.withdraw(money);
   }
 else {

    break;
   }
}
} 
}