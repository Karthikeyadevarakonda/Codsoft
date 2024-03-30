import java.util.Scanner;
import java.util.Random;
class Guess{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("computer guessed a number...!\n");
Random b = new Random();
int a = b.nextInt(20)+1;
int attempts=0;

do{
  
System.out.println("ENTER UR GUESS(BETWEEN 0-20):");
int n = sc.nextInt();
attempts++;
if(attempts > 3){
    System.out.println("fail..!");
      System.out.println("IF U WANT TO TRY AGAIN PRESS 1, If u want to EXIT PRESS 2:");
            int t =sc.nextInt();
                  if(t==1){
                   attempts=0;
                      continue;}
                  else if(t==2){
                    System.out.print("BYE......!");
                      break;
                  }

}
   if(n == a){
   System.out.println("U WON U HAVE GUESSED A RIGHT NUMBER....!");
  System.out.println("IF U WANT TO TRY AGAIN PRESS 1 ELSE PRESS 2:");
            int t =sc.nextInt();
                  if(t==1){
                      attempts=0;
                      continue;}
                  else if(t==2){
                    System.out.print("BYE......!");
                      break;
                  }
  }
else if(n > a){
System.out.println("to big guess small num...!");
}
else if(n < a){
System.out.println("to small guess big num...!");

}
}while(true);
sc.close();
}

}
