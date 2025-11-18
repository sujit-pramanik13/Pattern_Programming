package Star_Pattern_Programming;
import java.util.*;
public class All_Star_Related_Pattern_Program {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter total number of rows ");
	        int n = sc.nextInt();
		
		
		
		/*
		
		1.             * * * * * 
                       * * * * * 
                       * * * * * 
                       * * * * * 
		
		 */
		
		
//		
//	        System.out.println("Enter total number of rows "); 
//	        int rows = sc.nextInt();
//	        System.out.println("Enter total number of cols "); 
//	        int cols =  sc.nextInt();
//	        System.out.println("Enter the symbol u want to print  "); 
//	        char sym = sc.next().charAt(0) ;
//	        for(int i=1;i<=rows;i++){
//	            for(int j=1 ;j<=cols ; j++){
//	                System.out.print(sym+" ");
//
//	            }
//	            System.out.println();
//	            
//	            
//	        }


	
	
	/*
	 
	    2.     * 
               * * 
               * * * 
               * * * * 
               * * * * * 
	 
	 
	 */
	       
	        
	        for(int i=1;i<=n ; i++){
	            for(int j=1 ;j<=i ; j++){
	                System.out.print("* ");
	                
	            }
	            System.out.println();
	            
	        }
	
	
	
	        
	        
	        /*
	         3 . 
	         
	          ****
	          ***
	          **
	          *
	          
	          
	          
	         */
	        
	        
	        System.out.println();
	        
	        for(int i=1;i<=n;i++){
	            for(int j=n ; j>=i ; j--){
	                System.out.print("* ");
	                
	                
	            }
	            System.out.println();
	            
	        }
	        
	        
	        
	        /*
	                           *
	                          ***
	                         *****
	                        *******
	         */
	        
	
	        
	        System.out.println("-------Pyramid problems !-------");
	        for(int i=1;i<=n; i++) {
	        	for(int j=1 ;j<=n+1-i;j++) {
	        		System.out.print(" ");
	        		
	        	}
	        	for(int k=1;k<=2*i-1;k++) {
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	        
	        
	        
	        
	        /* 
         
         *******
          *****
           ***
            *

       */ 
	        
	        System.out.println("----------reverse Pyramid ----------");
	        for(int i=1;i<=n ;i++) {
	        	for(int j=1;j<=i;j++) {
	        		System.out.print(" ");
	        	}
	        	for(int k=1;k<= 2*n-(2*i-1) ; k++) {
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	        
	        
	      
	        
	        
	        
	        /*              *
	                       ***
	                      *****
	                     *******
	                     *******
	                      ***** 
	                       ***
	                        *
	         
	         */
	        
	        
	        // Upper Pyramid
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n + 1 - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Lower Inverted Pyramid
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= 2 * n - (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        
	        
	        
	        
	        /*
	         
	         
*	         
**
***
****
*****
****
***
**
*
	         
	         
	         
	         */
	        
	        System.out.println("-------------------");
	        
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for(int i=n-1;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        
	        
	        
	        
	        /*
	         
*****
*   *
*   *
*   *
*****
	         
	         */
	        
	        
	        
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(i==1||i==n||j==1||j==n){
	                    System.out.print("*");
	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        
	        
	        
	        
	        /*
	         
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * *  
	     
	         */
	        
	        
	        
	        
	        
	        
	        
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n+1-i;j++){
	                System.out.print("* ");
	            }
	            // for middle space 
	            for(int j=2;j<=2*i-1;j++){
	                System.out.print("  ");
	            }
	            
	            // for right half

	            for(int j=1;j<=n+1-i ;j++){
	                System.out.print("* ");
	            }
	            System.out.println();
	            
	        }

	        // for lower half 

	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print("* ");
	            }
	            // for middle space 
	            for(int j=2;j<=2*n-(2*i-1);j++){
	                System.out.print("  ");
	            }
	            
	            // for right half

	            for(int j=1;j<=i ;j++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        
	        
	        
	        
	        
	        
	        
	        

	
	}

}
