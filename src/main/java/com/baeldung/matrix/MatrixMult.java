package com.baeldung.matrix;

public class MatrixMult {

	public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {				
		double[][] result = new double[firstMatrix.length][secondMatrix[0].length];
		
		for (int row = 0; row < result.length; row++) {
			for (int col = 0; col < result[row].length; col++) {
				result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
			}
		}

		return result;
	}

	private double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
		double cell = 0;
		for (int i = 0; i < secondMatrix.length; i++) {
			cell += firstMatrix[row][i] * secondMatrix[i][col];
		}
		return cell;
	}

}
