//write a program to implement the concept of exception handling using predefined exception

class ExampleTry{
    public static void main(String[] args) {
        int a=7,b=3,c=3,x,y;
        int arr[] = {3,7,11};
        
        try {
            try {
                x=a/(b-c);
            }
            catch (ArithmeticException err) {
                System.out.println("Divide by zero encountered");
            }
            y = arr[5] / a;
        }
        catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Array out of index");
        }
        
        y = a/b+c;
        System.out.println("Y = " +y);

    }
}