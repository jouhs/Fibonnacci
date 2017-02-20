package com.icauda.article.commoncli;

import com.icauda.article.commoncli.fibonacci.DirectFibonacciCalculator;
import com.icauda.article.commoncli.fibonacci.FibonacciCalculator;
import com.icauda.article.commoncli.fibonacci.IteratifFibonacciCalculator;
import com.icauda.article.commoncli.fibonacci.MemoizationFibonnacciCalculator;
import com.icauda.article.commoncli.fibonacci.RecursifFibonnacciCalculator;
import com.icauda.article.commoncli.fibonacci.TerminalFibonnacciCalculator;

public class Fibo {

	public static void main(String[] args) {

		// Algo : recursif (r) / memoization (m) / terminal (t) / iteratif (i) / direct (d)
		char algo = 'i';

		// Rang
		int n = 42;

		// Timer
		boolean timerMode = false;

		// Verbose
		boolean verboseMode = true;

		if (verboseMode) {
			timerMode = true;
		}

		// Calculator
		FibonacciCalculator calc = null;
		String algoName = null;
		switch (algo) {
			// recursif (r)
			case 'r':
				calc = new RecursifFibonnacciCalculator();
				algoName = "Recursif";
				break;

			// memoization (m)
			case 'm':
				calc = new MemoizationFibonnacciCalculator();
				algoName = "Memoization";
				break;

			// terminal (t)
			case 't':
				calc = new TerminalFibonnacciCalculator();
				algoName = "Terminal";
				break;

			// iteratif (i)
			case 'i':
				calc = new IteratifFibonacciCalculator();
				algoName = "Iteratif";
				break;

			// direct (d)
			case 'd':
				calc = new DirectFibonacciCalculator();
				algoName = "Direct";
				break;

			default:
				System.err.println("Algo inconnu: " + algo);
				System.exit(1);
		}

		if (verboseMode) {
			System.out.println("Calculating Fibonacci for n: " + n);
			System.out.println("Selected algorithm: " + algoName);
		}

		final long time1 = System.currentTimeMillis();

		final long result = calc.calculate(n);

		final long time2 = System.currentTimeMillis();

		if (timerMode) {
			System.out.println("Duration: " + (time2 - time1) + " ms");
		}

		if (verboseMode) {
			System.out.println("Fibonacci(" + n + ")=" + result);
		}

		System.out.println(result);
	}
}
