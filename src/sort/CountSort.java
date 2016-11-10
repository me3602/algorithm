package sort;

import java.util.Arrays;

import baseInterface.IAlgorithm;

public class CountSort implements IAlgorithm {

	@Override
	public int[] sort(int[] array) {
		int[] result;
		
		//�ִ밪�� ã�´�
		int maxValue = 0;
		for(int element : array){
			maxValue = (maxValue < element)? element : maxValue;
		}
		System.out.printf("�ִ밪 : %d \n", maxValue);
		
		//�ִ밪 ��ŭ�� ������ �����Ѵ�
		int[] counts = new int[maxValue+1];
		for(int element : array){
			counts[element] += 1;
		}
		System.out.println("ī��Ʈ�迭 : " + Arrays.toString(counts));
		
		//�������� ���Ѵ�
		for(int i=1; i<counts.length; i++){
			counts[i] += counts[i-1];
		}
		System.out.println("������ : " + Arrays.toString(counts));
		
		result = new int[array.length];
		//�������� �̿��Ͽ� ��� �迭�� ����
		for(int i = array.length-1; i >= 0; i--){
			//��ǲ �迭�� ���� �ε����� ������ �迭�� ��ȸ�Ͽ� ����迭�� �ش� ���� �� �ε����� ����
			// ����迭 �ش� �ε����� ��ǲ�迭 ���� ����
			result[counts[array[i]]-1] = array[i];
			
			//ī��Ʈ �ϳ��� ����
			counts[array[i]] -= 1;			
		}
		
		
		return result;
	}

}
