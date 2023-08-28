package matrixInSpiralPrint;
import java.util.Scanner;
public class SpiralPrintOfMatrix {
	public static void main(String[] args) {
		int row, col;
		Scanner sC = new Scanner(System.in);
		System.out.println("Please enter the value of Matrix row x col number");
		int number = sC.nextInt();
		row = col = number;
		int num = 1;
		int i = 1;
		int j = 1;
		int k = number;
		int l = 1;
		int[][] matrixArr = new int[100][100];
		for (i = 1; i <= number; i++) {
			j = l;
			while (j <= k) {
				matrixArr[l][j] = num;
				num++;
				j++;
			}
			j = l + 1;
			while (j <= k) {
				matrixArr[j][k] = num;
				num++;
				j++;
			}
			j = k - 1;
			while (j >= l) {
				matrixArr[k][j] = num;
				num++;
				j--;
			}
			j = k - 1;
			while (j >= l + 1) {
				matrixArr[j][l] = num;
				num++;
				j--;
			}
			k--;
			l++;
		}
		for (i = 1; i < number + 1; i++) {
			for (j = 1; j < number + 1; j++) {
				System.out.print(matrixArr[i][j] + "         ");
			}
			System.out.println("   ");
		}
	}
}
