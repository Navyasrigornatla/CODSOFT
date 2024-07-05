import java.util.*;

 class Grade
 {
   public static void main(String args[])
   { 
    int a[]=new int[20];
    int n,sum=0,i;
    float avg;
    String grade;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of subjects ");
    n=sc.nextInt();
    for(i=1;i<=n;i++){
      System.out.println("enter marks of "+i+" subject (out of 100)");
      a[i]=sc.nextInt();
    }
    for(i=1;i<=n;i++){
      sum=sum+a[i];
    }
    avg=sum/n;
    if(avg>=90){
      grade="A+";
    }
    else if(avg>=80 && avg<90){
        grade="A";
        }
    else if(avg>=70 && avg<80){
      grade="B";
      }
    else if(avg>=60 && avg<70){
      grade="C";
      }
    else if(avg>=50 && avg<60){
      grade="D";
      }
     else if (avg>=40 && avg<50){
       grade= "E";
     }
     else {
       grade="F";
     }
    
    System.out.println("your total marks is "+ sum);
    System.out.println("your average percentage "+avg);
    System.out.println("your grade is "+grade);
        
    
   }
 }