import java.util.Scanner;
public class GradeCalculator
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("ENTER MARKS OF SUBJECT_1(OUT OF 100):");
int m1 = sc.nextInt();
System.out.println("ENTER MARKS OF SUBJECT_2(OUT OF 100):");
int m2 = sc.nextInt();
System.out.println("ENTER MARKS OF SUBJECT_3(OUT OF 100):");
int m3 = sc.nextInt();
System.out.println("ENTER MARKS OF SUBJECT_4(OUT OF 100):");
int m4 = sc.nextInt();
System.out.println("ENTER MARKS OF SUBJECT_5(OUT OF 100):");
int m5 = sc.nextInt();
int total=m1+m2+m3+m4+m5;
System.out.println("Total marks is:"+total);
float avg=(m1+m2+m3+m4+m5)/5;
System.out.println("average of student:"+avg);
}
}



