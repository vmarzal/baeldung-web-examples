package com.baeldung.matrix.mult;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class MatrixMultiplicationBenchmarking {

	public static void main(String[] args) throws RunnerException {
		  Options opt = new OptionsBuilder()
			      .include(MatrixMultiplicationBenchmarking.class.getSimpleName())
			      .mode(Mode.AverageTime)
			      .forks(2)
			      .warmupIterations(5)
			      .measurementIterations(10)
			      .timeUnit(TimeUnit.MICROSECONDS)
			      .build();
			 
			    new Runner(opt).run();
		}
	
}
