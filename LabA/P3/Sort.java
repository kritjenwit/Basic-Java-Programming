import java.util.Scanner;

class Initialize {
	
	int i,j,temp;
	
	void ascending(int[] a,int size){
		for (i=0;i<size;i++){
			for (j=i+1;j<size;j++){
				if(a[j] < a[i]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	void decending(int[] a,int size){
		for (i=0;i<size;i++){
			for (j=i+1;j<size;j++){
				if(a[j] > a[i]){ 
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	void display(int[] a,int size){
		for (int i=0;i<size;i++){
				System.out.println(a[i]);
		}
	}
}

class Sort{
	public static void main(String[] args){
		Initialize init = new Initialize();
		
		Scanner scan = new Scanner(System.in);
	
		int array[] = new int[10];
		int i,n = 0;
		
		try{
			System.out.print("Enter maximum array < 10 : ");
			n = scan.nextInt();
			for (i=0;i<n;i++){
				array[i] = scan.nextInt();
			}
		}catch (NumberFormatException e){
			System.out.print("Enter number only");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print("Enter maximum array < 10 : ");
		} 
		
		System.out.println("----Ascending order----");
		init.ascending(array,n);
		init.display(array,n);
		System.out.println("----Decending order----");
		init.decending(array,n);
		init.display(array,n);
	}
}