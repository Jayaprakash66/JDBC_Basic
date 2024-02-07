package com;
import java.util.*;
public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] arr1= {1,"Hello"};
		Object[] arr2= {2,"world"};
		Object[] arr3= {3,"hi"};
		
		ArrayList<Object[]> a=new ArrayList<Object[]>();
		a.add(arr1);
		a.add(arr2);
		a.add(arr3);
		
		for(Object[] aa:a) {
			System.out.println(Arrays.toString(aa));
		}
	}

}
