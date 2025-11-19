package Character_Pattern_Programming;

import java.util.Scanner;

public class All_Character_Related_Programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hello ji kya hal
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter total number of rows ");
	        int n = sc.nextInt();
	        
	        
	        
	        /*
	         
A
AB
ABC
ABCD
ABCDE
	         
	         */
	        
	        
	        
	        
	        
	        for(int i=1;i<=n;i++) {
	        	
	        	for(char ch='A' ; ch<'A'+i; ch++) {
	        		
	        		System.out.print(ch);
	        		
	        	}
	        	System.out.println();
	        }
	        
	        
	        
	        /*
	         
A B C D E 
A B C D 
A B C 
A B 
A 
	         
	         */
	        
	        System.out.println("----------------reverse  Character Printing ");
	        for(int i=0;i<=n;i++){
	            for(char ch='A';ch<='A'+(n-i-1);ch++){
	                System.out.print(ch+" ");
	            }
	            System.out.println();
	            
	        }
	        
	        
	        
	        
	        System.out.println("---------Another way little bit difference -------reverse  Character Printing ");
	        for(int i=1;i<=n;i++){
	            for(char ch='A';ch<'A'+(n+1-i);ch++){
	                System.out.print(ch+" ");
	            }
	            System.out.println();
	            
	        }
	        
	      
	        
	        /*
	         
	          
	         */
	        
	        
	        
	        System.out.println("----repeated charater ");
	        for(int i=1;i<=n;i++){

	            char ch=(char)('A'+i-1);


	            for(int j=1;j<=i;j++){

	  
	           System.out.print(ch+" ");


	            }
	            System.out.println();
	        }
	        
	        
	        
	        
	        
	        /*
	         
E 
D E 
C D E 
B C D E 
A B C D E 
	         */
	        
	        
	        
	        
	        for (int i = 1; i <= n; i++) {
	            for (char ch = (char)('A' + n - i); ch <= 'A' + n - 1; ch++) {
	                System.out.print(ch+" ");
	            }
	            System.out.println();
	        }
	        

	        
	        
	        /*
	         
	    A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A 
	        
	         */
	        
	        
	        
	        System.out.println("limited character based pattern progrm .");
	        for (int i = 0; i < n; i++) {

	            // 1️⃣ Print leading spaces
	            for (int s = 0; s < n - i - 1; s++) {
	                System.out.print("  "); // 2 spaces for proper alignment
	            }

	            // 2️⃣ Print increasing letters
	            char ch = 'A';
	            for (int j = 0; j <= i; j++) {
	                System.out.print(ch + " ");
	                ch++;
	            }

	            // 3️⃣ Print decreasing letters
	            ch -= 2; // move one step back
	            for (int j = 0; j < i; j++) {
	                System.out.print(ch + " ");
	                ch--;
	            }

	            System.out.println();
	        }
	        
	        
	}

}
