package km;

public class Main {

	public static void main(String[] args) {
		
		int[] array = {10,19,64,55,28,37,22};
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "_");
		}

	}
	
	/**
	 * 冒泡排序：将最大的数字沉到最底
	 *
	 * @param array
	 */
	private static void bubbleSort(int[] array) {
		//终止条件end: 0<..arr.length - 1
		for (int end = array.length - 1 ; end > 0; end--) {
			//第一轮确定第一个最大值
			for (int begin = 1; begin < array.length; begin++) {
				if (array[begin - 1] > array[begin]) {
					int temp = array[begin];
					array[begin] = array[begin - 1];
					array[begin - 1] = temp;
				}
				
			}
		}
	}
	/**
	 * 选择排序：每一次选择最大的元素和最后一个元素交换位置
	 *
	 * @param array
	 */
	private static void selectSort(int[] array) {
		//终止条件end: 0<..arr.length - 1
		for (int end = array.length - 1 ; end > 0; end--) {
			//第一轮确定第一个最大值
			int maxIndex = 0;
			for (int begin = 1; begin < array.length; begin++) {
				if (array[maxIndex] < array[begin]) {
					maxIndex = begin;
				}
			}
			int temp = array[maxIndex];
			array[maxIndex] = array[end];
			array[end] = temp;
		}
	}
}
