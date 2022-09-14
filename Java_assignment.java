class A{
public static void main(String[] args)
{
String s = "tafajjul";
String rev="";
for(int i=s.length()-1; i>=0;i--)
{
rev=rev + s.charAt(i);
}
System.out.println("Reverse the string of "+s+ " is " +rev);
int len= s.length();
System.out.println("The length of the string " +s+ " is " +len);
}}

class C
{
public static void main(String[] args)
{
int[] x;
//declaring
x= new int[2];
//instantiation
x[0]= 10;
x[1]=20;
//x[2]=30;
//initializing an array
System.out.println(x);
}}

//Printing largest and smallest elements
class E
{
public static void main(String[] args)
{

int[] x= {1,2,3,4,5};
int max= x[0];
for(int i=0;i<x.length;i++)
{
if(int[i]>max)
max= x[i];
}
int min= x[0];
for(int i=0;i<x.length;i++)
{
if(min>x[i])
min =x[i];

System.out.println("largest element " +max);
System.out.println("minimum value" +min);
}}


