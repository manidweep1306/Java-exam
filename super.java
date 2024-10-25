import java.util.*;
class Employee{
    float sal = 200000;
}
class HR extends Employee{
   
    void method(){
        System.out.println(super.sal);
    }
    public static void main(String args[]){
        HR obj = new HR();
        obj.method();
    }
}