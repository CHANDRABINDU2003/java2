
//package Inheritance;

class rectangle{
    private int length;
    private int width;
    rectangle(int length,int width){
        this.length=length;
        this.width=width;
        
    }
    public int getarea(){
        return length*width;
    }
    public int getPar(){
        return 2*(length+width);
    }
    
    
}
class square extends rectangle{
public square(int side){
super(side,side);
}
}
public class ex5 {
    public static void main(String[] args) {
        int[] len={10,20,30,40,5,6,7,8,9};
        for(int i=1;i<=len.length;i++){
        square x= new square(len[i-1]);
            System.out.println(""+x.getarea());
            System.out.println(""+x.getPar());
        
    }
    
}}
