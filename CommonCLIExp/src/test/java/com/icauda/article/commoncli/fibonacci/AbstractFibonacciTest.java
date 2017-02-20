package com.icauda.article.commoncli.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFibonacciTest {

	protected FibonacciCalculator calc;

	@Test
	public void testCalculateZero() {
		final int n = 0;
		final long expected = 1;

		doTestFibonacci(n, expected);
	}

	@Test
	public void testCalculateUn() {
		final int n = 1;
		final long expected = 1;

		doTestFibonacci(n, expected);
	}

	@Test
	public void testCalculateDeux() {
		final int n = 2;
		final long expected = 2;

		doTestFibonacci(n, expected);
	}

	@Test
	public void testCalculateTrois() {
		final int n = 3;
		final long expected = 3;

		doTestFibonacci(n, expected);
	}

	@Test
	public void testCalculateQuatre() {
		final int n = 4;
		final long expected = 5;

		doTestFibonacci(n, expected);
	}

	@Test
	public void testCalculateCinq() {
		final int n = 5;
		final long expected = 8;

		doTestFibonacci(n, expected);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCalculateNegatif() {
		final int n = -1;
		final long expected = 8;

		doTestFibonacci(n, expected);
	}

	private void doTestFibonacci(final int n, final long expected) {
		final long result = calc.calculate(n);

		Assert.assertEquals(expected, result);
	}

}
