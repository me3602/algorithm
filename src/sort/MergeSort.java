package sort;

import java.util.Arrays;

import baseInterface.IAlgorithm;

public class MergeSort implements IAlgorithm {

	
	@Override
	public int[] sort(int[] array) {		
		return mergeSort(array);
	}
	
	private int[] mergeSort(int[] array){
		if(array.length <= 1) return array;
		
		int pivot = (int)Math.floor(array.length/2);
		int[] left = Arrays.copyOfRange(array, 0, pivot);
		int[] right = Arrays.copyOfRange(array, pivot, array.length);
				
		return merge(mergeSort(left),mergeSort(right)); //재귀로  처리
	}
	
	private int[] merge(int[] left, int[] right){
		int[] result = new int[left.length+right.length];
		
		
		int i=0, j=0, k=0;
		while(i < left.length){
			if(j < right.length){ 
				// left의 i번째 요소와 right의 j번째 요소 비교
				// 더 작은 것을 결과 배열에 넣어 줌 
				if(left[i] < right[j]){ 
					result[k] = left[i];
					i++;
				}else{
					result[k] = right[j];
					j++;
				}
				k++;
			}else{
				//left에서 남은 요소가 있다면 다 밀어넣음
				while(i < left.length){
					result[k] = left[i];
					i++;
					k++;
				}
			}
			
		}
		
		//right에서 남은 요소가 있다면 다 밀어넣음
		while(j < right.length){
			result[k] = right[j];
			j++;
			k++;
		}
	
		System.out.println(Arrays.toString(result));
		
		return result;
	}

}
