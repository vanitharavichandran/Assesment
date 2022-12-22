package test;

import java.util.*;
class Employee
{
    String name;
    int id;
    float salary;
     Employee() 
    {
        name= "Vanitha";
        id =0001;
        salary= 45000.00f;       
    }

        public float salary(float n)
        {
            salary+=salary*(n/100);
            return  salary ;
        }
        public String toString()
        {
            return ("Name :"+name +"ID : "+id +"Salary : "+salary);
        }
}
class MainEmployee
{
    public static void main(String []args)
    {
        Employee em=new Employee();
        Scanner sc=new Scanner(System.in);
        
        int emp=sc.nextInt();
        em.salary(emp);
        System.out.println(em.salary);

        
    }
}