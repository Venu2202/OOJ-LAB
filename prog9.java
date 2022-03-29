import java.util.*;
class fatherexception extends Exception{
    public String toString(){
        return "Exception:age of father is less than zero";
    }
}

class sunexception extends Exception{
    public String toString(){
        return "Exception:son age is more than father's age";
    }
}

class father {
    public int fa;
    father(int fa){
        this.fa=fa;
    }
    void fatherage() throws fatherexception{
        if(fa<0)
        throw new fatherexception();
        else
        System.out.println("age of father is"+fa);
    }
}

class son extends father{
  
    public int sa;
    son(int fa,int sa){
        super(fa);
        this.sa=sa;
    }
    void sonage() throws sunexception{
        if(fa<sa)
        throw new sunexception();
        else
        System.out.println("son's age is"+sa);
    }
}

class prog9{
    public static void main(String args[]){
        int fage;
        int sage;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age of father and son");
        fage=sc.nextInt();
        sage=sc.nextInt();
        try{
        son s=new son(fage,sage);
        if(fage>sage||fage<0)
         s.fatherage();
         if(fage>0)
         s.sonage();
        }
        catch(fatherexception fat){
            System.out.println(fat);
        }

        catch(sunexception sot){
            System.out.println(sot);
        }
    }
}
