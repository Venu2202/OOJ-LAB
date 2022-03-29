class gen<T,N>
{
T ob1;
N ob2;
gen(T o1,N o2)
{
ob1=o1;
ob2=o2;
}
T getob1()
{
return ob1;
}
N getob2()
{
return ob2;
}
void showtype()
{
System.out.println("type of T is"+ob1.getClass().getName());
System.out.println("type of N is"+ob2.getClass().getName());
}
}

class prog7{
public static void main(String args[])
{
gen<Integer,String> isob;
isob=new gen<Integer,String>(99,"VENU");
int i=isob.getob1();
String s=isob.getob2();
isob.showtype();
System.out.println("value of i and s is"+i+" "+s);
}
}
