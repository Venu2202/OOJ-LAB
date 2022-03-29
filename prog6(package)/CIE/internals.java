package CIE;
import CIE.student;
import java.util.*;
public class internals extends student
{
Scanner sc = new Scanner(System.in);
public int ciem[] = new int[5];
public int sumc = 0;
public void get_marksc()
{
System.out.println("ENTER CIE MARKS OF STUDENTS:");
for(int i = 0;i<5;i++)
{
System.out.println("SUBJECT"+(i+1));
ciem[i] = sc.nextInt();
}
for(int i = 0;i<5;i++)
{
sumc = sumc +ciem[i];
}
}
}