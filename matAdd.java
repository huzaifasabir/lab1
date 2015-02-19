package matrix;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class matAdd {

	@Test
	public void testAdd() {
		int  l, d;
		mat m = new mat();
		   List<int[][]> list2d = new ArrayList<int[][]>(); 
		 //reading file for populating inputs
		   list2d =  m.readfile();
		 if(list2d.size()<3){
			System.out.println("Error occured there are not enough matrices to be added"); 
		 }else{
			//declaring 2d arrays and knowing there dimensions 
			 int mat[][]=list2d.get(0);
          int r = mat.length;
          int c = mat[0].length;
          int mat1[][]=list2d.get(1);
          int rt1 = mat1.length;
          int ct1 = mat1[0].length;
          int mat2[][]=list2d.get(2);
          int rt2 = mat2.length;
          int ct2 = mat2[0].length;
          int temp[][];//=list2d.get(2);
          int result[][] = null;
          //int rt3 = temp.length;
          //int ct3 = temp[0].length;
          list2d.size();
          //intlist2d.get(0);
          
          
          temp = m.add(list2d.get(0),list2d.get(1),r,rt1,c,ct1);
          if(temp != null){
        	  
        	  result = m.add(temp,mat2,r,rt2,c,ct2);
        	  
          }
        //printing matrices
          System.out.println("Selected matrices");
          System.out.println("Matrix 1");
          
          for ( l = 0 ; l < r ; l++ )
	         {
	            for ( d = 0 ; d < c ; d++ )
	               System.out.print(mat[l][d]+"\t");
	 
	            System.out.print("\n");
	         }
          System.out.println("Matrix 2");
          for ( l = 0 ; l < rt1 ; l++ )
	         {
	            for ( d = 0 ; d < ct1 ; d++ )
	               System.out.print(mat1[l][d]+"\t");
	 
	            System.out.print("\n");
	         } 
          
          System.out.println("Matrix 3");
          for ( l = 0 ; l < rt2 ; l++ )
	         {
	            for ( d = 0 ; d < ct2 ; d++ )
	               System.out.print(mat2[l][d]+"\t");
	 
	            System.out.print("\n");
	         }
        //printing result
		 if(result != null){
          System.out.println("Result of addition of 3 matrices");
          for ( l = 0 ; l < r ; l++ )
	         {
	            for ( d = 0 ; d < c ; d++ )
	               System.out.print(result[l][d]+"\t");
	 
	            System.out.print("\n");
	         } 
          
		 }
		 }
		 System.out.println("Test completed");
		
	}
	

}
