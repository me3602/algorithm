package sort;

import java.util.Arrays;

import baseInterface.IAlgorithm;

public class CountSort implements IAlgorithm {

	@Override
	public int[] sort(int[] array) {
		int[] result;
		
		//최대값을 찾는다
		int maxValue = 0;
		for(int element : array){
			maxValue = (maxValue < element)? element : maxValue;
		}
		System.out.printf("최대값 : %d \n", maxValue);
		
		//최대값 만큼의 공간을 생성한다
		int[] counts = new int[maxValue+1];
		for(int element : array){
			counts[element] += 1;
		}
		System.out.println("카운트배열 : " + Arrays.toString(counts));
		
		//누적합을 구한다
		for(int i=1; i<counts.length; i++){
			counts[i] += counts[i-1];
		}
		System.out.println("누적합 : " + Arrays.toString(counts));
		
		result = new int[array.length];
		//누적합을 이용하여 결과 배열에 삽입
		for(int i = array.length-1; i >= 0; i--){
			//인풋 배열의 값을 인덱스로 누적합 배열을 조회하여 결과배열에 해당 값이 들어갈 인덱스를 얻음
			// 결과배열 해당 인덱스에 인풋배열 값을 삽입
			result[counts[array[i]]-1] = array[i];
			
			//카운트 하나를 제거
			counts[array[i]] -= 1;			
		}
		
		
		return result;
	}

}
