package Number_Pattern_Programming;

import java.util.Scanner;

public class All_Number_Related_Pattern_Program {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter total number of rows ");
	        int n = sc.nextInt();
	        
	        
	        
	        /*
	          1.
	             1 
                 1 2 
                 1 2 3 
                 1 2 3 4 
                 1 2 3 4 5 
	         */
	        
	        
		
		for(int i=1 ;i<=n ;i++){
            for(int j=1 ; j<= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();

	}
		
		
		
		
	/*
	  2 .                  Reverse Order  
	      5 4 3 2 1         1 2 3 4 5
          5 4 3 2           1 2 3 4
          5 4 3             1 2 3
          5 4               1 2
          5                 1     
	                       
	      
	       
	 */
		
		System.out.println();
		
		for(int i=1; i<=n ;i++) {
			for(int j=n ;j>=i ; j--) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		
System.out.println(" IN REVERSE ORDER ");
		
		for(int i=1; i<=n ;i++) {
			for(int j=n ;j>=i ; j--) {
				System.out.print(n-j+1+" ");
			}
			
			System.out.println();
		}
		
		
		
/* 3.
  
 1
 2 3
 4 5 6
 7 8 9 10
 
 */
	System.out.println(" ------------------------------");	
	int count = 1 ; 
	for(int i=1 ; i<=n ;  i++) {
		for(int j=1 ; j<=i ;j++) {
			System.out.print(count+" ");
			count++ ; 
			
		}
		System.out.println();
		
		
	}
	
	
	
	/*
	 
02 
04 06 
08 10 12 
14 16 18 20 

	 */
	
	
	int num = 2; 
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			if(num <= 8) {
				System.out.print("0"+num+" ");
				num+=2;
				
			}
			else {
				System.out.print(num+" ");
				num+=2;
				
			}
			
		}
		System.out.println();
	}

	
	
	
	
	/*
	 
1 
2 2 
3 3 3 
4 4 4 4 
	 
	 */
	
	for(int i=1;i<=n;i++){
        for(int j=1 ;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
	}
	
	
	
	
	
	
	
	/*
	 
1                   1 
1 2               2 1 
1 2 3           3 2 1 
1 2 3 4       4 3 2 1 
1 2 3 4 5   5 4 3 2 1 
	 
	 */
	
	
	
	// for first left half 
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			
		}
		// for middle spaces 
		
		for(int j=1;j<=2*n-(2*i-1) ; j++) {
			System.out.print("  ");
		}

		
		


         // for first right half  
        
		for(int j=i;j>=1;j--) {
			System.out.print(j+" ");
			
		}


		System.out.println();
      
	
		}
	
	
	
	/*
	 
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
	 
	 */
	
	
	for(int i=1;i<=n;i++){

        int start = (i%2==0)?0:1 ;

        for(int j=1;j<=i;j++){
           System.out.print(start+" ");
           start = 1-start ;
        }
        System.out.println(); 
        
    }
	
	
	
	
	
	/*
	 
4444444
4333334
4322234
4321234
4322234
4333334
4444444
	 
	 */
	
	System.out.println();
	int size = 2*n-1 ; 
    for(int i=0 ;i<size ; i++){
        for(int j=0;j<size;j++){

            int top = i;
            int left = j;
            int right = size - 1- j;
            int bottom =  size -1 - i; 

            int min = Math.min(Math.min(top,bottom),Math.min(left,right));
            System.out.print((n - min));


        }
        System.out.println();
        
    }
	
}
}
