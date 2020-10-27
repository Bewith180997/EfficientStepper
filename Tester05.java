
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Tester05 {

	@Test
	@DisplayName("Test 01")
	void test01() throws Throwable {
		System.out.println("--- TEST 01 ---");
		int start = 10;
		int finish = 850000000;
		int distance = 30;
		int expectedSteps = 28333333;
		long startTime = System.nanoTime();
		assertEquals(Test05.returnSteps(start, finish, distance), expectedSteps);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		System.out.println("\n");
	}
	
	@Test
	@DisplayName("Test 02")
	void test02() throws Throwable {
		System.out.println("--- TEST 02 ---");
		int start = 10;
		int finish = 850000000;
		int distance = 30;
		int expectedSteps = 28333333;
		long startTime = System.nanoTime();
		assertEquals(Test05.returnStepsEff(start, finish, distance), expectedSteps);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		System.out.println("\n");
	}
	
	@Test
	@DisplayName("Test 03")
	void test03() throws Throwable {
		System.out.println("--- TEST 03 ---");
		int start = 10;
		int finish = 85;
		int distance = 30;
		int expectedSteps = 3;
		long startTime = System.nanoTime();
		assertEquals(Test05.returnSteps(start, finish, distance), expectedSteps);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		System.out.println("\n");
	}

	@Test
	@DisplayName("Test 04")
	void test04() throws Throwable {
		System.out.println("--- TEST 04 ---");
		int start = 10;
		int finish = 85;
		int distance = 30;
		int expectedSteps = 3;
		long startTime = System.nanoTime();
		assertEquals(Test05.returnStepsAdd(start, finish, distance), expectedSteps);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		System.out.println("\n");
	}
	
	@Test
	@DisplayName("Test 05")
	void test05() throws Throwable {
		System.out.println("--- TEST 05 ---");
		int start = 10;
		int finish = 850000000;
		int distance = 30;
		int expectedSteps = 28333333;
		long startTime = System.nanoTime();
		assertEquals(Test05.returnStepsAdd(start, finish, distance), expectedSteps);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		System.out.println("\n");
	}
}
