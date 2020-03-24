package br.com.navita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumeroIrmao {

	private List<Integer> possibleNumbers;

	public int solucao(int n1) {

		possibleNumbers = new ArrayList<>();

		String str = String.valueOf(n1);
		int n = str.length();

		troca(str, 0, n - 1);

		Integer max = Collections.max(possibleNumbers);

		if (max > 100000000) {
			return -1;
		} else {
			return max;
		}
	}

	
	public void troca(String str, int l, int r) {
		if (l == r) {

			possibleNumbers.add(Integer.valueOf(str));
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				troca(str, l + 1, r);
				str = swap(str, l, i);
			}

		}

	}

	
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
