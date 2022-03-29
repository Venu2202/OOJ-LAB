import java.util.*;
import java.lang.*;
class firstThread implements Runnable
{
 String name;
 long time;
 int t;
 Thread th;
 firstThread(String na,long tim,int n)
 {
     name = na;
     time = tim;
     t = n;
     th = new Thread(this,name);
     th.start();
 }
 public void run()
 {
     try {
         for(int i = t;i>0;i--)
         {
             System.out.println(name);
             Thread.sleep(time);
         }
     } catch (InterruptedException e) {
         //TODO: handle exception
         System.out.println(name + "Interrupted");
     }
 }
}
class prog8
{
    public static void main(String args[]) {
        new firstThread("BMS College of engineering",10000,2);
        new firstThread("CSE",2000,10);
    }
}
