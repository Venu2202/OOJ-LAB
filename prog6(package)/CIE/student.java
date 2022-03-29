package CIE;
import java.util.*;
public class student
{
Scanner sc = new Scanner(System.in);
public int USN;
public String name;
public int sem;
public void accept()
{
System.out.println("ENTER STUDENT NAME");
name = sc.nextLine();
System.out.println("ENTER STUDENT USN");
USN = sc.nextInt();
System.out.println("ENTER STUDENT SEM");
sem = sc.nextInt();
}
public void display()
{
System.out.println("NAME = "+name);
System.out.println("USN = "+USN);
System.out.println("SEM = "+sem);
}
}