class Cube{
    int length,breadth,heigth;
    
    public int getVolumn(){
        return (length * breadth * heigth);
    }

    Cube() {
        length=breadth=heigth=2;
        System.out.println("Initialized with Default constructor");
    }
    
    Cube(int l,int b){
        length=l;
        breadth=b;
        heigth=2;
        System.out.println("Initialized with Parameterized constructor having 2 params");
    }
    
    Cube(int l,int b,int h) {
        length=l;
        breadth=b;
        heigth=h;
        System.out.println("Initialized with Parameterized constructor having 3 params");
    }
}

class Prg6_{
    public static void main(String[] args){
        
        Cube cb1 = new Cube();
        System.out.println("Volumn of cube1 is : " +cb1.getVolumn());
        Cube cb2 = new Cube(10,20);
        System.out.println("Volumn of cube2 is : " +cb2.getVolumn());
        Cube cb3 = new Cube(10,20,30);
        System.out.println("Volumn of cube3 is : " +cb3.getVolumn());
    }
}


    