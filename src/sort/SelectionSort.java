package sort;

import java.util.Arrays;

import baseInterface.IAlgorithm;

public class SelectionSort implements IAlgorithm {

	@Override
	public int[] sort(int[] array) {
		int indexMin, temp;
		
		for(int i=0; i < array.length; i++){
			indexMin = i;
			for(int j=i+1; j < array.length; j++){
				if(array[j] < array[indexMin]){
					indexMin = j;
				}
			}
			
			temp = array[indexMin];
			array[indexMin] = array[i];
			array[i] = temp;	
			
			System.out.printf("Level %d : ",i+1);
			System.out.println(Arrays.toString(array));
		}
		
		return array;
	}

}
