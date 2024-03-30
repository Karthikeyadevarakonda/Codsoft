import java.util.*;
public class ATM
{
public static void main(String args[])
{
int Balance=1000;
Scanner sc = new Scanner(System.in);

while(true){
System.out.println("======..WELCOME..=======\n");
System.out.println("choose 1 for cash with draw");
System.out.println("choose 2 for cash deposit");
System.out.println("choose 3 for check balance");
System.out.println("choose 4 for EXIT...!\n");

System.out.println("ENTER your CHOICE:");
int ch = sc.nextInt();
switch(ch){
         case 1: 
         System.out.println("ENTER THE AMOUNT");
         int c =sc.nextInt();
         if(Balance < c){
         System.out.println("INSUFFICIENT CASH...\n");
         }
         else 
         {
         Balance=Balance-c;
         System.out.println("YOUR TRANSACTION IS SUCESSFULL...\n");
         }
         break;
         case 2:
         System.out.println("ENTER THE CASH TO DEPOSIT");
         int d =sc.nextInt();
         Balance=Balance+d;
         System.out.println("MONEY DEPOSITED SUCESSFULLY...\n");
         break;
         case 3:
         System.out.println("CURRENT BALANCE :"+Balance);
         System.out.println();
         break;
         case 4:
         System.out.println("THANK U....");
         sc.close();
         System.exit(0);
        }
       
  }
}
}
