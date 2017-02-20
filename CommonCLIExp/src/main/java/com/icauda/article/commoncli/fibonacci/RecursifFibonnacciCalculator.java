package com.icauda.article.commoncli.fibonacci;

public class RecursifFibonnacciCalculator implements FibonacciCalculator {

	@Override
	public long calculate(final int n) {

		if (n < 0) {
			throw new IllegalArgumentException("Le rang doit être positif.");
		}

		if (n == 0 || n == 1) {
			return 1;
		}

		return calculate(n - 2) + calculate(n - 1);
	}

}
