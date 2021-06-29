package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N_Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			List<List<String>> ll = new ArrayList();
			ll = queenKiller(n);
			System.out.println(ll);
		}

	}

	private static List<List<String>> queenKiller(int n) {
		// TODO Auto-generated method stub
		List<List<String>> ll = new ArrayList();
		List<String> temp = new ArrayList();
		int row = 0;
		int col = 0;
		boolean vist[][] = new boolean[n][n];
		queenKiller(n, vist, row, col, ll, temp, 0);
		return ll;
	}

	private static void queenKiller(int n, boolean vist[][], int row, int col, List<List<String>> ll, List<String> temp,
			int cQ) {
		// TODO Auto-generated method stub
		if (cQ == n) {

			for (int i = 0; i < vist.length; i++) {
				String ans = "";
				for (int j = 0; j < vist[0].length; j++) {
					if (vist[i][j] == false) {
						ans += ".";
					} else {
						ans += "Q";
					}
				}
				temp.add(ans);
			}
			ll.add(new ArrayList(temp));
			temp.clear();
			return;
		}

		if (col == n) {
			row = row + 1;
			col = 0;
		}

		if (row >= n) {
			return;
		}

		if (checkPlace(row, col, vist) == true) {
			vist[row][col] = true;
			queenKiller(n, vist, row, col + 1, ll, temp, cQ + 1);
			vist[row][col] = false;
		}
		queenKiller(n, vist, row, col + 1, ll, temp, cQ);

	}

	private static boolean checkPlace(int row, int col, boolean[][] vist) {
		// TODO Auto-generated method stub
		int c = col;

		// col
		while (c >= 0) {
			if (vist[row][c] == true) {
				return false;
			}
			c--;
		}

		// row
		int r = row;
		while (r >= 0) {
			if (vist[r][col] == true) {
				return false;
			}
			r--;
		}

		// left diagnol
		r = row;
		c = col;
		while (r >= 0 && c >= 0) {
			if (vist[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}

		// right diagnol
		r = row;
		c = col;
		while (r >= 0 && c < vist[0].length) {
			if (vist[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

}
