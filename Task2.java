import java.util.*;
class Task2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of Database Management Systems");
        int dbms=sc.nextInt();
        System.out.println("Enter the marks of Data Structures & Algorithms");
        int dsa=sc.nextInt();
        System.out.println("Enter the marks of Software Engineering");
        int se=sc.nextInt();
        System.out.println("Enter the marks of OOP using JAVA");
        int oop=sc.nextInt();
        System.out.println("Enter the marks of Operating Systems");
        int os=sc.nextInt();
        int total=(dbms+dsa+se+oop+os);
        System.out.println("The total marks obtained by the student = "+total);
        double avg=total/5;
        System.out.println("The average percentage of marks obtained by the student = "+avg);
        avg=(int)avg;
        if (avg>=90&&avg<=100)
        System.out.println("Grade of the student = A");
        if (avg>=75&&avg<90)
        System.out.println("Grade of the student = B");
        if (avg>=60&&avg<75)
        System.out.println("Grade of the student = C");
        if (avg>=45&&avg<60)
        System.out.println("Grade of the student = D");
        if (avg>=30&&avg<45)
        System.out.println("Grade of the student = E");
        if (avg>=20&&avg<30)
        System.out.println("Grade of the student = F");
        if (avg>=0&&avg<20)
        System.out.println("Grade of the student = G");
        if(avg<0&&avg>100)
        System.out.println("Invalid Choice");
    }
}        