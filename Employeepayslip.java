import java.util.Scanner;
class Employee{
String empName,empId,address,mailId,mobNo;
double basicPay;
Scanner sc=new Scanner(System.in);
void readDetails(){
System.out.println("Enter employee name:");
empName=sc.nextLine();
System.out.println("Enter employee ID:");
empId=sc.nextLine();
System.out.println("Enter employee address:");
address=sc.nextLine();
System.out.println("Enter employee mail ID:");
mailId=sc.nextLine();
System.out.println("Enter employee mobile no:");
mobNo=sc.nextLine();
System.out.println("Enter employee basic pay:");
basicPay=sc.nextDouble();
}
void displayDetails(){
System.out.println("-----employee details-----");
System.out.println("employee name:"+empName);
System.out.println("employee id:"+empId);
System.out.println("employee address:"+address);
System.out.println("employee mail id:"+mailId);
System.out.println("employee mobile no:"+mobNo);
System.out.println("employee basic pay:"+basicPay);
}
}
class Programmer extends Employee{
void generatepaySlip(){
double da=basicPay*97/100;
double hra=basicPay*10/100;
double pf=basicPay*12/100;
double staffclub=basicPay*1/100;
double gross=basicPay+da+hra;
double net=gross-(pf+staffclub);
displayDetails();
System.out.println("Designation:Programmer");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("Staff Club:"+staffclub);
System.out.println("Gross pay:"+gross);
System.out.println("Net pay:"+net);
}
}
class Assistantprofessor extends Employee{
void generatepaySlip(){
double da=basicPay*110/100;
double hra=basicPay*20/100;
double pf=basicPay*12/100;
double staffclub=basicPay*5/100;
double gross=basicPay+da+hra;
double net=gross-(pf+staffclub);
displayDetails();
System.out.println("Designation:Assistance Professor");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("Staff Club:"+staffclub);
System.out.println("Gross pay:"+gross);
System.out.println("Net pay:"+net);
}
}
class Associateprofessor extends Employee{
void generatepaySlip(){
double da=basicPay*130/100;
double hra=basicPay*30/100;
double pf=basicPay*12/100;
double staffclub=basicPay*10/100;
double gross=basicPay+da+hra;
double net=gross-(pf+staffclub);
displayDetails();
System.out.println("Designation:Associate Professor");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("Staff Club:"+staffclub);
System.out.println("Gross pay:"+gross);
System.out.println("Net pay:"+net);
}
}
class Professor extends Employee{
void generatepaySlip(){
double da=basicPay*140/100;
double hra=basicPay*40/100;
double pf=basicPay*12/100;
double staffclub=basicPay*15/100;
double gross=basicPay+da+hra;
double net=gross-(pf+staffclub);
displayDetails();
System.out.println("Designation:Professor");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("Staff Club:"+staffclub);
System.out.println("Gross pay:"+gross);
System.out.println("Net pay:"+net);
}
}
public class Employeepayslip{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter employee designation:\n1.Programmer\n2.Assistant professor\n3.Associate professor\n4.Professor");
int choice = sc.nextInt();
sc.nextLine();
switch(choice){
case 1:
Programmer p=new Programmer();
p.readDetails();
p.generatepaySlip();
break;
case 2:
Assistantprofessor ap=new Assistantprofessor();
ap.readDetails();
ap.generatepaySlip();
break;
case 3:
Associateprofessor asp=new Associateprofessor();
asp.readDetails();
asp.generatepaySlip();
break;
case 4:
Professor prof=new Professor();
prof.readDetails();
prof.generatepaySlip();
break;
default:
System.out.println("invalidchoice");
}
sc.close();
}
}

