
package Inheritance;

class member{
    String name,address;
    int salary,phone,age;
    void printSalary(){
        System.out.println(""+salary);
    }
}
class employee extends member{
    String special;
}
class manager extends member{
    String department;
}
public class Ex3 {
    public static void main(String[] args) {
        employee x=new employee();
        manager y=new manager();
        x.name="udita";
        x.address="xyz";
        x.special="nothing";
        x.age=30;
        x.phone=1712394021;
        x.salary=200000;
        y.address="abc";
        y.age=20;
        y.department="bolod";
        y.name="twaran";
        y.phone=1868967027;
        y.salary=207665;
        System.out.println(""+x.age);
        System.out.println(""+y.name );
    }
    
}
