package sort;

import baseInterface.IAlgorithm;

public class QuickSort implements IAlgorithm {

	private int level = 0;
	
	@Override
	public int[] sort(int[] array) {
		return quickSort(array,0,array.length-1);
	}
	
	
	private int partition(int[] array, int left, int right, int pivotIndex){
		int temp;
		int pivot= array[pivotIndex];		
		
		while(left <= right){ // 왼쪽, 오른쪽 수를 규칙과 비교해 다음 수로 넘어감
			while(array[left] < pivot){
				left++;
			}
			
			while(array[right] > pivot && right > 0){
				right--;
			}
			
			if(left <= right){ //왼쪽이 기준보다 크고, 오른쪽이 기준보다 작으면
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;				
				right--;
			}			
		}
		
		//좌측과 우측 인덱스가 만난 지점에 피봇을 넣어준 후 해당 값을 최 우측으로 옮김
		temp = array[left];
		array[left] = pivot;
		array[pivotIndex] = temp;
		return left;		
	}
	
	private int[] quickSort(int[] array, int left, int right){
		
		int pivotIndex = right; // 배열의 최우측 수를 기준으로 뽑음
		
		//기준(pivot) 을 제외하고 정렬하기 위해 -1
		pivotIndex  = partition(array,left,right-1,pivotIndex);
		if(left < pivotIndex -1){
			quickSort(array,left,pivotIndex-1); //기준 왼쪽 부분 재귀
		}
		if(pivotIndex + 1 < right){
			quickSort(array,pivotIndex + 1, right); // 기준 오른쪽 부분 재귀
		}
		
		
		return array;
	}

}
