package com.igr.arr;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int marks[] = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter Marks : ");
			marks[i] = scan.nextInt();
		}
		Array obj1 = new Array();
		obj1.updateArr(marks, 2, 90);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
	}

	public void updateArr(int array[], int index, int value) {
		array[index] = value;
		}
	
	/*boolean updateArr(int arr[], int index, int value) {
		if (index >= arr.length) {
			return false;
		}
		else {
			arr[index] = value;
			return true;
			}*/
	}
	
