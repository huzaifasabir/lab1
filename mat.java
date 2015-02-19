/**
 * 
 */
package matrix;

/**
 * @author DELL
 *
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class mat
{
	int[][] subtract(int mat1[][], int mat2[][],int r1,int r2,int c1,int c2){
		
		int  sum = 0, c, d, k;
		 
	      Scanner in = new Scanner(System.in);
	      
	     
	    //checking rows and columns are equal of two matrices
	      if ( c1 != c2  &&  r1 != r2 ){
	    	  System.out.println("Matrices with entered orders can't be subtracted with each other.");
	    	  return null;
	      }else{
	      
	 	 
	      int result[][] = new int[r1][c1];
	    //subtracting corresponding elements of matrices
	      for ( c = 0 ; c < r2 ; c++ )
	            for ( d = 0 ; d < c2 ; d++ )
	               result[c][d] = mat1[c][d] - mat2[c][d];
	      
	      
	      
	      return result;
	      
	      }
	      
		
		
	}
	
	int[][] add(int mat1[][], int mat2[][],int r1,int r2,int c1,int c2){
		
		int  sum = 0, c, d, k;
		 
	     
	      
	     
		//checking rows and columns are equal of two matrices
	      if ( c1 != c2  &&  r1 != r2 ){
	    	  System.out.println("Matrices with entered orders can't be added with each other.");
	    	  return null;
	      }else{
	      
	 	 
	      int result[][] = new int[r1][c1];
	      //adding corresponding elements of matrices
	      for ( c = 0 ; c < r2 ; c++ )
	            for ( d = 0 ; d < c2 ; d++ )
	               result[c][d] = mat1[c][d] + mat2[c][d];
	      
	      
	      
	      return result;
	      
	      }
	      
		
		
	}
	int[][] multiply(int mat1[][], int mat2[][],int r1,int r2,int c1,int c2){
		 int  sum = 0, c, d, k;
		 
	      
	     
	      //checking if columns of first matrix are equal to rows of second matrix
	      if ( c1 != r2 )
	          System.out.println("Matrices with entered orders can't be multiplied with each other.");
	      else{ 
	      
	 
	    	 int result[][] = new int[r1][c2];
	 
	     
	    	 //Multiplying two matrices in format first row of first matrix first column of second matrix and so on 
	         for ( c = 0 ; c < r1 ; c++ )
	         {
	            for ( d = 0 ; d < c2 ; d++ )
	            {   
	               for ( k = 0 ; k < r2 ; k++ )
	               {
	                  sum = sum + mat1[c][k]*mat2[k][d];
	               }
	 
	               result[c][d] = sum;
	               sum = 0;
	            }
	         }
	 
 
	         
	         //returning result
	         return result;
	   	}
		return null;
		
	}
	
	
	
	List<int[][]> readfile(){
	List<String> a1 = new ArrayList();
	int r1 = 0, c1 = 0;
	//2d array
	int m1[][]; 
	//list of 2d array
    List<int[][]> list2d = new ArrayList<int[][]>();
	try {
		//file
		File file = new File("F:\\sample.txt");
		FileReader fileReader = new FileReader(file);
		
		//reader
		BufferedReader bufferedReader1 = new BufferedReader(fileReader);
		
		String line;
		
		
		//reading file line by line till EOF
		while ((line = bufferedReader1.readLine()) != null) {
			
			//copy of line
			String s = line;
			//to parse string 
			StringTokenizer t = new StringTokenizer(line, ";");
			StringTokenizer cp = new StringTokenizer(line, ";");
                        
			StringTokenizer k = new StringTokenizer(s, ";");
			int e = 0, e1 = 0;
			String te1;
			
			//loop to calculate no. of rows and columns in each matrix
			while (cp.hasMoreTokens())
			{ 
                            e1=0;
                            te1 = cp.nextToken();
				StringTokenizer t1 = new StringTokenizer(te1," ");
				while (t1.hasMoreTokens())
				{ 
                                    
				    t1.nextToken();
                                    e1++;
				}
			    
                            e++;
			}
                        m1 = new int[e][e1];
			
			String te;
			int r = 0,u = 0;
			
			//loop to tokenize line and store it in a 2d array
			while (t.hasMoreTokens())
			{ 
                            u = 0;
                            te = t.nextToken();
				StringTokenizer t1 = new StringTokenizer(te," ");
				while (t1.hasMoreTokens())
				{ 
                                    
                                    m1[u][r]=Integer.parseInt(t1.nextToken());
				   
                                    u++;
				}
			    
                            r++;
			}
			
			//adding the 2d array in list
			list2d.add(m1);
		}
        
               fileReader.close();
		
		
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	//returning list of 2d arrays
	return list2d;
	
	
}
	
   
}
