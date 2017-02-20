package com.icauda.article.commoncli.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class MemoizationFibonnacciCalculator implements FibonacciCalculator {

	private Map<Integer, Long> memo = new HashMap<>();

	public MemoizationFibonnacciCalculator() {
		memo.put(0, 1L);
		memo.put(1, 1L);
	}

	@Override
	public long calculate(final int n) {

		if (n < 0) {
			throw new IllegalArgumentException("Le rang doit être positif.");
		}

		Long value = memo.get(n);
		if(value != null) {
			return value;
		}

		value = calculate(n - 2) + calculate(n - 1);
		
		memo.put(n, value);
		
		return value;
	}

}
