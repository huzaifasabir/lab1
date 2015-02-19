package matrix;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class matMultiply {

	@Test
	//test for multiplication of two matrices
	public void testMultiply() {
		int  l, d, k;
		mat m = new mat();
		   List<int[][]> list2d = new ArrayList<int[][]>();
		   //reading file for populating inputs
		 list2d =  m.readfile();
		 if(list2d.size()<2){
			System.out.println("Error occured there are not enough matrices to be multiplied"); 
		 }else{
			 //declaring 2d arrays and knowing there dimensions 
			 int op[][]=list2d.get(0);
             int r = op.length;
             int c = op[0].length;
             int op1[][]=list2d.get(1);
             int rt1 = op1.length;
             int ct1 = op1[0].length;
             list2d.size();
             int result[][];
             //calling multiply functions
             result = m.multiply(list2d.get(0),list2d.get(1),r,rt1,c,ct1);
             
             //printing matrices
             System.out.println("Selected matrices");
             
             System.out.println("Matrix 1");
             
             for ( l = 0 ; l < r ; l++ )
	         {
	            for ( d = 0 ; d < c ; d++ )
	               System.out.print(op[l][d]+"\t");
	 
	            System.out.print("\n");
	         }
             System.out.println("Matrix 2");
             for ( l = 0 ; l < rt1 ; l++ )
	         {
	            for ( d = 0 ; d < ct1 ; d++ )
	               System.out.print(op1[l][d]+"\t");
	 
	            System.out.print("\n");
	         }
             //printing result
             if(result != null){
             System.out.println("Product of selected matrices:");
        	 
	         for ( l = 0 ; l < r ; l++ )
	         {
	            for ( d = 0 ; d < ct1 ; d++ )
	               System.out.print(result[l][d]+"\t");
	 
	            System.out.print("\n");
	         }
             }
	         System.out.println("Test completed");
		 }
	}

}
