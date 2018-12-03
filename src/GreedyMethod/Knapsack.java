package GreedyMethod;

public class Knapsack {

	public static void main(String[] args) {
		char[] items = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		int[] profit = { 10, 5, 15, 7, 6, 18, 3 };
		double[] weigth = { 2, 3, 5, 7, 1, 4, 1 };
		double[] profitPerItem = new double[7];

		for (int i = 0; i < profit.length; i++) {
			profitPerItem[i] = profit[i] / weigth[i];
		}

		for (int i = 0; i < profitPerItem.length; i++) {
			System.out.print(profitPerItem[i] + " ");
		}
//
//		for (int i = 0; i < profitPerItem.length - 1; i++) {
//			double currentHighest=profitPerItem[i];
//			if (currentHighest> profitPerItem[i + 1]) {
//				double temp = profitPerItem[i + 1];
//				profitPerItem[i + 1] = currentHighest;
//				profitPerItem[i] = temp;
//
//			}
//
//		}
		
		System.out.println();
		for (int i = 0; i < profitPerItem.length; i++) {
			System.out.print(profitPerItem[i] + " ");
		}

	}

}
