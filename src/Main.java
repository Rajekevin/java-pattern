
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern1(5);
		pattern2(5);
		pattern3(5);
		pattern4(5);
		pattern5(5);
		pattern6(5);
		pattern7(5);
		pattern8(5);


	}
	
	
	static void pattern1(int n) {
		System.out.println("Pattern 1");
		for(int row=1;row<=n; row++) {
			for(int column=1;column<=n;column++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	
	static void pattern2(int n) {
		
		System.out.println("Pattern 2");
		
		for(int rows=1;rows<=n;rows++) {
			for(int colum=1;colum<=rows; colum++) {
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
	}
	
	static void pattern3(int n) {
		
		System.out.println("Pattern 3");
		
		for(int rows=1;rows<=n;rows++) {
			for(int colum=1;colum<=n-rows+1; colum++) {
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
	}
	
	
	static void pattern4(int n) {
		
		System.out.println("Pattern 4");
		
		for(int rows=1;rows<=n;rows++) {
			for(int colum=1;colum<=rows; colum++) {
				System.out.print(colum + " ");
			}
			System.out.println();
		}
	}
	
	
	static void pattern5(int n) {
		
		System.out.println("Pattern 5");
		for(int rows=1;rows<=n*2;rows++) {	
			
			int totalColumns = (rows>n)? (2*n-rows):rows; 
	
				for(int colum=1;colum<=totalColumns; colum++) {
					System.out.print("* ");
				}
			
				System.out.println();
		}
	}
	
	
	static void pattern6(int n) {
		
		System.out.println("Pattern 6");
		
		for(int rows=1;rows<=n;rows++) {
			for(int colum=1;colum<=n-rows; colum++) {
				System.out.print(" ");
				
			}
			for(int colum=1;colum<=rows; colum++) {
				System.out.print("*");
				
			}
			System.out.println();
		} 
	}
	
	
	static void pattern7(int n) {
		
		System.out.println("Pattern 7");
		
		for(int rows=n;rows>=1;rows--) {
			for(int colum=1;colum<=n-rows; colum++) {
				System.out.print(" ");
				
			}
			for(int colum=rows;colum>=1;colum--) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}
	
	
	
	static void pattern8(int n) {
		System.out.println("Pattern 8");
		
		for(int rows=1,colum=0;rows<=n;++rows,colum=0){
			for(int space=1;space<=n-rows;++space){
				System.out.print(" ");
			}
			while(colum!=2*rows-1){
				System.out.print("*");
				++colum;
			}
			System.out.println();
		}
	}			
}
