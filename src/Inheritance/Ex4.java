
//package Inheritance;

class rectangle{
   private double length;
   private double width;
    public rectangle(double length,double width){
        this.length=length;
        this.width=width;
        
    }
    public double getArea(){
        return length*width;
    }
    public double getPara(){
        return 2*(length+width);
     
}
}
class square extends rectangle{
    public square(double side){
        super(side,side);
    }
}
public class Ex4 {
    public static void main(String[] args) {
        rectangle x= new rectangle(10,20);
        square y = new square(5);
        System.out.println(""+x.getArea());
        System.out.println(""+x.getPara());
        System.out.println(""+y.getArea()); 
        System.out.println(""+y.getPara());
    }
    
}
