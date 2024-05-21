
package Inheritance;
class point{
    private int x;
    private int y;
    public point(int x,int y){
        this.x=x;
        this.y=y;
        
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;}
}
class quadri{
    private point point1;
    private point point2;
    private point point3;
    private point point4;
    public quadri(point point1,point point2,point point3,point point4){
        this.point1=point1;
        this.point2=point2;
        this.point3=point3;
        this.point4=point4;
        
    }
    public point getpoint1(){
        return point1;
    }
     public point getpoint2(){
        return point2;
    }
      public point getpoint3(){
        return point3;
    }
       public point getpoint4(){
        return point4;
    }
       public double A(){
       
       return (double) Math.sqrt(Math.pow(getpoint2().getx()-getpoint1().getx(), 2)+Math.pow(getpoint2().gety()-getpoint1().gety(), 2));
       }
       public double B(){
       
       return (double) Math.sqrt(Math.pow(getpoint2().getx()-getpoint1().getx(), 2)+Math.pow(getpoint2().gety()-getpoint1().gety(), 2));
       }
    
}
public class ex6 {
    
}
