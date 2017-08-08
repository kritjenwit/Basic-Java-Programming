class Rect{
    float length;
    float width;
    
    void setdata(float a,float b){
        length = a;
        width = b;
    }
    
    float area(){
        float area ;
        area = length * width ;
        return area;
    }
}

public class RectArea {
    public static void main(String args[]){
        float area1,area2;
        
        Rect r1 = new Rect();
        r1.length = 50;
        r1.width = 30;
        
        Rect r2 = new Rect();
        //Rect r3 = r1;
        r2.setdata(100,200);
        
        area1 = r1.area();
        area2 = r2.area();
        
        System.out.println("---------------------------");
        System.out.println("Area of Rectangle 1 : " +area1);
        System.out.println("---------------------------");
        System.out.println("Area of Rectangle 2 : " +area2);
        System.out.println("---------------------------");
    }
}
