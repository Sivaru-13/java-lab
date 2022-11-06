import java.util.*;				
class employee
{
String name;
int id;
String addr;
String email;
String mobile;
Scanner s = new Scanner(System.in);
void details()
{
System.out.println(" Enter the dtails :");
System.out.println("Name :");
name = s.nextLine();
System.out.println("Id : ");
id = s.nextInt();
System.out.println("Address :");
addr = s.next();
System.out.println("Email :");
email = s.next();
System.out.println("Mobile Number :");
mobile = s.next();
}
void display()
{
System.out.println("*   NAME :"+name);
System.out.println("*   ID :"+id);
System.out.println("*   ADDRESS :"+addr);
System.out.println("*   EMAIL :"+email);
System.out.println("*   CONTACT NO. :"+mobile);
}}
class programmer extends employee
{
double b;
void gnpay(double a)
{
a =a+((a*0.97)+(a*0.1));
System.out.println("GROSS PAY  :"+a);
b = a-((a*0.12)+(a*0.01));
System.out.println("NET PAY :"+b);
}}
class asstistantprofessor extends employee
{
double b;
void gnpay(double a)
{
a =a+((a*1.10)+(a*0.2));
System.out.println("GROSS PAY AMOUNT :"+a);
b = a-((a*0.12)+(a*0.05));
System.out.println("NET PAY AMOUNT :"+b);
}}
class associateprofessor extends employee
{
double b;
void gnpay(double a)
{
a =a+((a*1.30)+(a*0.3));
System.out.println("GROSS PAY  :"+a);
b = a-((a*0.12)+(a*0.1));
System.out.println("NET PAY :"+b);
}}
class professor extends employee
{
double b;
void gnpay(double a)
{
a =a+((a*1.40)+(a*0.4));
System.out.println("GROSS PAY :"+a);
b = a-((a*0.12)+(a*0.15));
System.out.println("NET PAY :"+b);
}}
class emp
{
public static void main(String []arg)
{
Scanner s = new Scanner(System.in);
programmer p = new programmer();
programmer ap = new programmer();
programmer apf = new programmer();
programmer pf = new programmer();
p.details();
int pay;
p.display();
System.out.println("Enter your salary :");
pay = s.nextInt();
if(pay >14999 && pay < 20001)
{
p.gnpay(pay);
}
else if(pay >20000 && pay < 30001)
{
ap.gnpay(pay);
}
else if(pay >30000 && pay < 40001)
{
apf.gnpay(pay);
}
else if(pay > 40000)
{
pf.gnpay(pay);
}}}
