import java.util.*;
class random{
 public static void main(String args[]){
 int guess;
 int count=0, i;
 boolean val=false;
 Scanner sc=new Scanner( System.in);
 Random r=new Random();
 int num=r.nextInt(100);
 num=num+1;
 System.out.println("guess the random number ");
 
 while(true){
 guess=sc.nextInt();
 if(guess==num){
  System.out.println("Guess is correct ");
  break;
 }
 else if (guess <num)
     System.out.println("Guess is low Try again");
 else 
    System.out.println("Guess is high Try again");
  
 }
 
}
}