package com.doublell;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;


/**
 * Performs many tests on DoubleLinkedList.java
 * @author Kevin Haines
 *
 */
public class DoubleLinkedListTester 
{
	private int passes = 0;
	private int failures = 0;
	private int total = 0;
	
	/** @param args not used */
	public static void main(String[] args) 
	{
		DoubleLinkedListTester tester = new DoubleLinkedListTester();
		tester.runTests();
	}
	
	/** Print test results in a consistent format
	 * @param testDesc description of the test
	 * @param result indicates if the test passed or failed
	 */
	private void printTest(String testDesc, boolean result) {
		total++;
		if (result) {
			passes++;
		} else {
			failures++;
		}
		System.out.printf("%-46s\t%s\n", testDesc, (result ? "   PASS" : "***FAIL***"));
	}

	/** Print a final summary */
	private void printFinalSummary() {
		System.out.printf("\nTotal Tests: %d,  Passed: %d,  Failed: %d\n", total, passes, failures);
	}
	
	/**
	 * Run tests to confirm required functionality from list constructors and methods
	 */
	private void runTests() {
		// 1-TESTS ON A NEW, EMPTY LIST []
		// Only UnorderedList Tests
		printTest("newList_testAddToFront", newList_testAddToFront());
		printTest("newList_testAddToRear", newList_testAddToRear());
		printTest("newList_testAddAfter", newList_testAddAfter());
		printTest("newList_testRemoveFirst", newList_testRemoveFirst());
		printTest("newList_testRemoveLast", newList_testRemoveLast());
		printTest("newList_testRemoveElement", newList_testRemoveElement());
		printTest("newList_testFirst", newList_testFirst());
		printTest("newList_testLast", newList_testLast());
		printTest("newList_testContains", newList_testContains());
		printTest("newList_testIsEmpty", newList_testIsEmpty());
		printTest("newList_testSize", newList_testSize());
		printTest("newList_testIterator", newList_testIterator());
		printTest("newList_testIteratorHasNext", newList_testIteratorHasNext());
		printTest("newList_testIteratorNext", newList_testIteratorNext());
		printTest("newList_testToString", newList_testToString());
		
		// 2-TESTS ON [] -> addToFront(A) ->[A]
		// Only UnorderedList Tests
		printTest("addToFrontFromNewList_testAddToFront", addToFrontFromNewList_testAddToFront());
		printTest("addToFrontFromNewList_testAddToRear", addToFrontFromNewList_testAddToRear());
		printTest("addToFrontFromNewList_testRemoveFirst", addToFrontFromNewList_testRemoveFirst());
		printTest("addToFrontFromNewList_testRemoveLast", addToFrontFromNewList_testRemoveLast());
		printTest("addToFrontFromNewList_testFirst", addToFrontFromNewList_testFirst());
		printTest("addToFrontFromNewList_testLast", addToFrontFromNewList_testLast());
		printTest("addToFrontFromNewList_testIsEmpty", addToFrontFromNewList_testIsEmpty());
		printTest("addToFrontFromNewList_testSize", addToFrontFromNewList_testSize());
		printTest("addToFrontFromNewList_testIterator", addToFrontFromNewList_testIterator());
		printTest("addToFrontFromNewList_testIteratorHasNext", addToFrontFromNewList_testIteratorHasNext());
		printTest("addToFrontFromNewList_testIteratorNext", addToFrontFromNewList_testIteratorNext());
		printTest("addToFrontFromNewList_testContainsOne", addToFrontFromNewList_testContainsOne());
		printTest("addToFrontFromNewList_testContainsTwo", addToFrontFromNewList_testContainsTwo());
		printTest("addToFrontFromNewList_testRemoveElementOne", addToFrontFromNewList_testRemoveElementOne());
		printTest("addToFrontFromNewList_testRemoveElementTwo", addToFrontFromNewList_testRemoveElementTwo());
		printTest("addToFrontFromNewList_testAddAfterOne", addToFrontFromNewList_testAddAfterOne());
		printTest("addToFrontFromNewList_testAddAfterTwo", addToFrontFromNewList_testAddAfterTwo());
		printTest("addToFrontFromNewList_testToString", addToFrontFromNewList_testToString());
		
		// 3-TESTS ON [] -> addToRear(A) ->[A]
		// Only UnorderedList Tests
		printTest("addToRearFromNewList_testAddToFront", addToRearFromNewList_testAddToFront());
		printTest("addToRearFromNewList_testAddToRear", addToRearFromNewList_testAddToRear());
		printTest("addToRearFromNewList_testRemoveFirst", addToRearFromNewList_testRemoveFirst());
		printTest("addToRearFromNewList_testRemoveLast", addToRearFromNewList_testRemoveLast());
		printTest("addToRearFromNewList_testFirst", addToRearFromNewList_testFirst());
		printTest("addToRearFromNewList_testLast", addToRearFromNewList_testLast());
		printTest("addToRearFromNewList_testIsEmpty", addToRearFromNewList_testIsEmpty());
		printTest("addToRearFromNewList_testSize", addToRearFromNewList_testSize());
		printTest("addToRearFromNewList_testIterator", addToRearFromNewList_testIterator());
		printTest("addToRearFromNewList_testIteratorHasNext", addToRearFromNewList_testIteratorHasNext());
		printTest("addToRearFromNewList_testIteratorNext", addToRearFromNewList_testIteratorNext());
		printTest("addToRearFromNewList_testContainsOne", addToRearFromNewList_testContainsOne());
		printTest("addToRearFromNewList_testContainsTwo", addToRearFromNewList_testContainsTwo());
		printTest("addToRearFromNewList_testRemoveElementOne", addToRearFromNewList_testRemoveElementOne());
		printTest("addToRearFromNewList_testRemoveElementTwo", addToRearFromNewList_testRemoveElementTwo());
		printTest("addToRearFromNewList_testAddAfterOne", addToRearFromNewList_testAddAfterOne());
		printTest("addToRearFromNewList_testAddAfterTwo", addToRearFromNewList_testAddAfterTwo());
		printTest("addToRearFromNewList_testToString", addToRearFromNewList_testToString());
		
		// 4-TESTS ON [A] >> removeFirst() >>[]
		// Only UnorderedList Tests
		printTest("removeFirstFromOneElementList_testAddToFront", removeFirstFromOneElementList_testAddToFront());
		printTest("removeFirstFromOneElementList_testAddToRear", removeFirstFromOneElementList_testAddToRear());
		printTest("removeFirstFromOneElementList_testAddAfter", removeFirstFromOneElementList_testAddAfter());
		printTest("removeFirstFromOneElementList_testRemoveFirst", removeFirstFromOneElementList_testRemoveFirst());
		printTest("removeFirstFromOneElementList_testRemoveLast", removeFirstFromOneElementList_testRemoveLast());
		printTest("removeFirstFromOneElementList_testRemoveElement", removeFirstFromOneElementList_testRemoveElement());
		printTest("removeFirstFromOneElementList_testFirst", removeFirstFromOneElementList_testFirst());
		printTest("removeFirstFromOneElementList_testLast", removeFirstFromOneElementList_testLast());
		printTest("removeFirstFromOneElementList_testContains", removeFirstFromOneElementList_testContains());
		printTest("removeFirstFromOneElementList_testIsEmpty", removeFirstFromOneElementList_testIsEmpty());
		printTest("removeFirstFromOneElementList_testSize", removeFirstFromOneElementList_testSize());
		printTest("removeFirstFromOneElementList_testIterator", removeFirstFromOneElementList_testIterator());
		printTest("removeFirstFromOneElementList_testIteratorHasNext", removeFirstFromOneElementList_testIteratorHasNext());
		printTest("removeFirstFromOneElementList_testIteratorNext", removeFirstFromOneElementList_testIteratorNext());
		printTest("removeFirstFromOneElementList_testToString", removeFirstFromOneElementList_testToString());
		
		//5-TESTS ON [A] >> removeLast() >>[]
		// Only UnorderedList Tests
		printTest("removeLastFromOneElementList_testAddToFront", removeLastFromOneElementList_testAddToFront());
		printTest("removeLastFromOneElementList_testAddToRear", removeLastFromOneElementList_testAddToRear());
		printTest("removeLastFromOneElementList_testAddAfter", removeLastFromOneElementList_testAddAfter());
		printTest("removeLastFromOneElementList_testRemoveFirst", removeLastFromOneElementList_testRemoveFirst());
		printTest("removeLastFromOneElementList_testRemoveLast", removeLastFromOneElementList_testRemoveLast());
		printTest("removeLastFromOneElementList_testRemoveElement", removeLastFromOneElementList_testRemoveElement());
		printTest("removeLastFromOneElementList_testFirst", removeLastFromOneElementList_testFirst());
		printTest("removeLastFromOneElementList_testLast", removeLastFromOneElementList_testLast());
		printTest("removeLastFromOneElementList_testContains", removeLastFromOneElementList_testContains());
		printTest("removeLastFromOneElementList_testIsEmpty", removeLastFromOneElementList_testIsEmpty());
		printTest("removeLastFromOneElementList_testSize", removeLastFromOneElementList_testSize());
		printTest("removeLastFromOneElementList_testIterator", removeLastFromOneElementList_testIterator());
		printTest("removeLastFromOneElementList_testIteratorHasNext", removeLastFromOneElementList_testIteratorHasNext());
		printTest("removeLastFromOneElementList_testIteratorNext", removeLastFromOneElementList_testIteratorNext());
		printTest("removeLastFromOneElementList_testToString", removeLastFromOneElementList_testToString());
		
		//6-TESTS ON [A] >> remove(A) >>[]
		// Only UnorderedList Tests
		printTest("removeFromFromOneElementList_testAddToFront", removeFromFromOneElementList_testAddToFront());
		printTest("removeFromFromOneElementList_testAddToRear", removeFromFromOneElementList_testAddToRear());
		printTest("removeFromFromOneElementList_testAddAfter", removeFromFromOneElementList_testAddAfter());
		printTest("removeFromFromOneElementList_testRemoveFirst", removeFromFromOneElementList_testRemoveFirst());
		printTest("removeFromFromOneElementList_testRemoveLast", removeFromFromOneElementList_testRemoveLast());
		printTest("removeFromFromOneElementList_testRemoveElement", removeFromFromOneElementList_testRemoveElement());
		printTest("removeFromFromOneElementList_testFirst", removeFromFromOneElementList_testFirst());
		printTest("removeFromFromOneElementList_testLast", removeFromFromOneElementList_testLast());
		printTest("removeFromFromOneElementList_testContains", removeFromFromOneElementList_testContains());
		printTest("removeFromFromOneElementList_testIsEmpty", removeFromFromOneElementList_testIsEmpty());
		printTest("removeFromFromOneElementList_testSize", removeFromFromOneElementList_testSize());
		printTest("removeFromFromOneElementList_testIterator", removeFromFromOneElementList_testIterator());
		printTest("removeFromFromOneElementList_testIteratorHasNext", removeFromFromOneElementList_testIteratorHasNext());
		printTest("removeFromFromOneElementList_testIteratorNext", removeFromFromOneElementList_testIteratorNext());
		printTest("removeFromFromOneElementList_testToString", removeFromFromOneElementList_testToString());
		
		//7-TESTS ON [A] -> addToFront(B) -> [B,A]
		// Only UnorderedList Tests
		printTest("addToFrontFromOneElementList_testAddToFront", addToFrontFromOneElementList_testAddToFront());
		printTest("addToFrontFromOneElementList_testAddToRear", addToFrontFromOneElementList_testAddToRear());
		printTest("addToFrontFromOneElementList_testRemoveFirst", addToFrontFromOneElementList_testRemoveFirst());
		printTest("addToFrontFromOneElementList_testRemoveLast", addToFrontFromOneElementList_testRemoveLast());
		printTest("addToFrontFromOneElementList_testFirst", addToFrontFromOneElementList_testFirst());
		printTest("addToFrontFromOneElementList_testLast", addToFrontFromOneElementList_testLast());
		printTest("addToFrontFromOneElementList_testIsEmpty", addToFrontFromOneElementList_testIsEmpty());
		printTest("addToFrontFromOneElementList_testSize", addToFrontFromOneElementList_testSize());
		printTest("addToFrontFromOneElementList_testIterator", addToFrontFromOneElementList_testIterator());
		printTest("addToFrontFromOneElementList_testIteratorHasNext", addToFrontFromOneElementList_testIteratorHasNext());
		printTest("addToFrontFromOneElementList_testIteratorNext", addToFrontFromOneElementList_testIteratorNext());
		printTest("addToFrontFromOneElementList_testContainsOne", addToFrontFromOneElementList_testContainsOne());
		printTest("addToFrontFromOneElementList_testContainsTwo", addToFrontFromOneElementList_testContainsTwo());
		printTest("addToFrontFromOneElementList_testContainsThree", addToFrontFromOneElementList_testContainsThree());
		printTest("addToFrontFromOneElementList_testRemoveElementOne", addToFrontFromOneElementList_testRemoveElementOne());
		printTest("addToFrontFromOneElementList_testRemoveElementTwo", addToFrontFromOneElementList_testRemoveElementTwo());
		printTest("addToFrontFromOneElementList_testRemoveElementThree", addToFrontFromOneElementList_testRemoveElementThree());
		printTest("addToFrontFromOneElementList_testAddAfterOne", addToFrontFromOneElementList_testAddAfterOne());
		printTest("addToFrontFromOneElementList_testAddAfterTwo", addToFrontFromOneElementList_testAddAfterTwo());
		printTest("addToFrontFromOneElementList_testAddAfterThree", addToFrontFromOneElementList_testAddAfterThree());
		printTest("addToFrontFromOneElementList_testToString", addToFrontFromOneElementList_testToString());
		
		//8-TESTS ON [A] -> addToRear(B) -> [A,B]
		// Only UnorderedList Tests
		printTest("addToRearFromOneElementList_testAddToFront", addToRearFromOneElementList_testAddToFront());
		printTest("addToRearFromOneElementList_testAddToRear", addToRearFromOneElementList_testAddToRear());
		printTest("addToRearFromOneElementList_testRemoveFirst", addToRearFromOneElementList_testRemoveFirst());
		printTest("addToRearFromOneElementList_testRemoveLast", addToRearFromOneElementList_testRemoveLast());
		printTest("addToRearFromOneElementList_testFirst", addToRearFromOneElementList_testFirst());
		printTest("addToRearFromOneElementList_testLast", addToRearFromOneElementList_testLast());
		printTest("addToRearFromOneElementList_testIsEmpty", addToRearFromOneElementList_testIsEmpty());
		printTest("addToRearFromOneElementList_testSize", addToRearFromOneElementList_testSize());
		printTest("addToRearFromOneElementList_testIterator", addToRearFromOneElementList_testIterator());
		printTest("addToRearFromOneElementList_testIteratorHasNext", addToRearFromOneElementList_testIteratorHasNext());
		printTest("addToRearFromOneElementList_testIteratorNext", addToRearFromOneElementList_testIteratorNext());
		printTest("addToRearFromOneElementList_testContainsOne", addToRearFromOneElementList_testContainsOne());
		printTest("addToRearFromOneElementList_testContainsTwo", addToRearFromOneElementList_testContainsTwo());
		printTest("addToRearFromOneElementList_testContainsThree", addToRearFromOneElementList_testContainsThree());
		printTest("addToRearFromOneElementList_testRemoveElementOne", addToRearFromOneElementList_testRemoveElementOne());
		printTest("addToRearFromOneElementList_testRemoveElementTwo", addToRearFromOneElementList_testRemoveElementTwo());
		printTest("addToRearFromOneElementList_testRemoveElementThree", addToRearFromOneElementList_testRemoveElementThree());
		printTest("addToRearFromOneElementList_testAddAfterOne", addToRearFromOneElementList_testAddAfterOne());
		printTest("addToRearFromOneElementList_testAddAfterTwo", addToRearFromOneElementList_testAddAfterTwo());
		printTest("addToRearFromOneElementList_testAddAfterThree", addToRearFromOneElementList_testAddAfterThree());
		printTest("addToRearFromOneElementList_testToString", addToRearFromOneElementList_testToString());
		
		//9-TESTS ON [A] -> addAfter(B,A) -> [A,B]
		// Only UnorderedList Tests
		printTest("addAfterFromOneElementList_testAddToFront", addAfterFromOneElementList_testAddToFront());
		printTest("addAfterFromOneElementList_testAddToRear", addAfterFromOneElementList_testAddToRear());
		printTest("addAfterFromOneElementList_testRemoveFirst", addAfterFromOneElementList_testRemoveFirst());
		printTest("addAfterFromOneElementList_testRemoveLast", addAfterFromOneElementList_testRemoveLast());
		printTest("addAfterFromOneElementList_testFirst", addAfterFromOneElementList_testFirst());
		printTest("addAfterFromOneElementList_testLast", addAfterFromOneElementList_testLast());
		printTest("addAfterFromOneElementList_testIsEmpty", addAfterFromOneElementList_testIsEmpty());
		printTest("addAfterFromOneElementList_testSize", addAfterFromOneElementList_testSize());
		printTest("addAfterFromOneElementList_testIterator", addAfterFromOneElementList_testIterator());
		printTest("addAfterFromOneElementList_testIteratorHasNext", addAfterFromOneElementList_testIteratorHasNext());
		printTest("addAfterFromOneElementList_testIteratorNext", addAfterFromOneElementList_testIteratorNext());
		printTest("addAfterFromOneElementList_testContainsOne", addAfterFromOneElementList_testContainsOne());
		printTest("addAfterFromOneElementList_testContainsTwo", addAfterFromOneElementList_testContainsTwo());
		printTest("addAfterFromOneElementList_testContainsThree", addAfterFromOneElementList_testContainsThree());
		printTest("addAfterFromOneElementList_testRemoveElementOne", addAfterFromOneElementList_testRemoveElementOne());
		printTest("addAfterFromOneElementList_testRemoveElementTwo", addAfterFromOneElementList_testRemoveElementTwo());
		printTest("addAfterFromOneElementList_testRemoveElementThree", addAfterFromOneElementList_testRemoveElementThree());
		printTest("addAfterFromOneElementList_testAddAfterOne", addAfterFromOneElementList_testAddAfterOne());
		printTest("addAfterFromOneElementList_testAddAfterTwo", addAfterFromOneElementList_testAddAfterTwo());
		printTest("addAfterFromOneElementList_testAddAfterThree", addAfterFromOneElementList_testAddAfterThree());
		printTest("addAfterFromOneElementList_testToString", addAfterFromOneElementList_testToString());
		
		//10-TESTS ON [A,B] -> removeFirst() -> [B]
		// Only UnorderedList Tests
		printTest("removeFirstFromTwoElementList_testAddToFront", removeFirstFromTwoElementList_testAddToFront());
		printTest("removeFirstFromTwoElementList_testAddToRear", removeFirstFromTwoElementList_testAddToRear());
		printTest("removeFirstFromTwoElementList_testRemoveFirst", removeFirstFromTwoElementList_testRemoveFirst());
		printTest("removeFirstFromTwoElementList_testRemoveLast", removeFirstFromTwoElementList_testRemoveLast());
		printTest("removeFirstFromTwoElementList_testFirst", removeFirstFromTwoElementList_testFirst());
		printTest("removeFirstFromTwoElementList_testLast", removeFirstFromTwoElementList_testLast());
		printTest("removeFirstFromTwoElementList_testIsEmpty", removeFirstFromTwoElementList_testIsEmpty());
		printTest("removeFirstFromTwoElementList_testSize", removeFirstFromTwoElementList_testSize());
		printTest("removeFirstFromTwoElementList_testIterator", removeFirstFromTwoElementList_testIterator());
		printTest("removeFirstFromTwoElementList_testIteratorHasNext", removeFirstFromTwoElementList_testIteratorHasNext());
		printTest("removeFirstFromTwoElementList_testIteratorNext", removeFirstFromTwoElementList_testIteratorNext());
		printTest("removeFirstFromTwoElementList_testContainsOne", removeFirstFromTwoElementList_testContainsOne());
		printTest("removeFirstFromTwoElementList_testContainsTwo", removeFirstFromTwoElementList_testContainsTwo());
		printTest("removeFirstFromTwoElementList_testRemoveElementOne", removeFirstFromTwoElementList_testRemoveElementOne());
		printTest("removeFirstFromTwoElementList_testRemoveElementTwo", removeFirstFromTwoElementList_testRemoveElementTwo());
		printTest("removeFirstFromTwoElementList_testAddAfterOne", removeFirstFromTwoElementList_testAddAfterOne());
		printTest("removeFirstFromTwoElementList_testAddAfterTwo", removeFirstFromTwoElementList_testAddAfterTwo());
		printTest("removeFirstFromTwoElementList_testToString", removeFirstFromTwoElementList_testToString());
		
		//11-TESTS ON [A,B] -> removeLast() -> [A]
		// Only UnorderedList Tests
		printTest("removeLastFromTwoElementList_testAddToFront", removeLastFromTwoElementList_testAddToFront());
		printTest("removeLastFromTwoElementList_testAddToRear", removeLastFromTwoElementList_testAddToRear());
		printTest("removeLastFromTwoElementList_testRemoveFirst", removeLastFromTwoElementList_testRemoveFirst());
		printTest("removeLastFromTwoElementList_testRemoveLast", removeLastFromTwoElementList_testRemoveLast());
		printTest("removeLastFromTwoElementList_testFirst", removeLastFromTwoElementList_testFirst());
		printTest("removeLastFromTwoElementList_testLast", removeLastFromTwoElementList_testLast());
		printTest("removeLastFromTwoElementList_testIsEmpty", removeLastFromTwoElementList_testIsEmpty());
		printTest("removeLastFromTwoElementList_testSize", removeLastFromTwoElementList_testSize());
		printTest("removeLastFromTwoElementList_testIterator", removeLastFromTwoElementList_testIterator());
		printTest("removeLastFromTwoElementList_testIteratorHasNext", removeLastFromTwoElementList_testIteratorHasNext());
		printTest("removeLastFromTwoElementList_testIteratorNext", removeLastFromTwoElementList_testIteratorNext());
		printTest("removeLastFromTwoElementList_testContainsOne", removeLastFromTwoElementList_testContainsOne());
		printTest("removeLastFromTwoElementList_testContainsTwo", removeLastFromTwoElementList_testContainsTwo());
		printTest("removeLastFromTwoElementList_testRemoveElementOne", removeLastFromTwoElementList_testRemoveElementOne());
		printTest("removeLastFromTwoElementList_testRemoveElementTwo", removeLastFromTwoElementList_testRemoveElementTwo());
		printTest("removeLastFromTwoElementList_testAddAfterOne", removeLastFromTwoElementList_testAddAfterOne());
		printTest("removeLastFromTwoElementList_testAddAfterTwo", removeLastFromTwoElementList_testAddAfterTwo());
		printTest("removeLastFromTwoElementList_testToString", removeLastFromTwoElementList_testToString());
		
		//12-TESTS ON [A,B] -> remove(A) -> [B]
		// Only UnorderedList Tests
		printTest("removeFromTwoElementListOne_testAddToFront", removeFromTwoElementListOne_testAddToFront());
		printTest("removeFromTwoElementListOne_testAddToRear", removeFromTwoElementListOne_testAddToRear());
		printTest("removeFromTwoElementListOne_testRemoveFirst", removeFromTwoElementListOne_testRemoveFirst());
		printTest("removeFromTwoElementListOne_testRemoveLast", removeFromTwoElementListOne_testRemoveLast());
		printTest("removeFromTwoElementListOne_testFirst", removeFromTwoElementListOne_testFirst());
		printTest("removeFromTwoElementListOne_testLast", removeFromTwoElementListOne_testLast());
		printTest("removeFromTwoElementListOne_testIsEmpty", removeFromTwoElementListOne_testIsEmpty());
		printTest("removeFromTwoElementListOne_testSize", removeFromTwoElementListOne_testSize());
		printTest("removeFromTwoElementListOne_testIterator", removeFromTwoElementListOne_testIterator());
		printTest("removeFromTwoElementListOne_testIteratorHasNext", removeFromTwoElementListOne_testIteratorHasNext());
		printTest("removeFromTwoElementListOne_testIteratorNext", removeFromTwoElementListOne_testIteratorNext());
		printTest("removeFromTwoElementListOne_testContainsOne", removeFromTwoElementListOne_testContainsOne());
		printTest("removeFromTwoElementListOne_testContainsTwo", removeFromTwoElementListOne_testContainsTwo());
		printTest("removeFromTwoElementListOne_testRemoveElementOne", removeFromTwoElementListOne_testRemoveElementOne());
		printTest("removeFromTwoElementListOne_testRemoveElementTwo", removeFromTwoElementListOne_testRemoveElementTwo());
		printTest("removeFromTwoElementListOne_testAddAfterOne", removeFromTwoElementListOne_testAddAfterOne());
		printTest("removeFromTwoElementListOne_testAddAfterTwo", removeFromTwoElementListOne_testAddAfterTwo());
		printTest("removeFromTwoElementListOne_testToString", removeFromTwoElementListOne_testToString());
		
		//13-TESTS ON [A,B] -> remove(B) -> [A]
		// Only UnorderedList Tests
		printTest("removeFromTwoElementListTwo_testAddToFront", removeFromTwoElementListTwo_testAddToFront());
		printTest("removeFromTwoElementListTwo_testAddToRear", removeFromTwoElementListTwo_testAddToRear());
		printTest("removeFromTwoElementListTwo_testRemoveFirst", removeFromTwoElementListTwo_testRemoveFirst());
		printTest("removeFromTwoElementListTwo_testRemoveLast", removeFromTwoElementListTwo_testRemoveLast());
		printTest("removeFromTwoElementListTwo_testFirst", removeFromTwoElementListTwo_testFirst());
		printTest("removeFromTwoElementListTwo_testLast", removeFromTwoElementListTwo_testLast());
		printTest("removeFromTwoElementListTwo_testIsEmpty", removeFromTwoElementListTwo_testIsEmpty());
		printTest("removeFromTwoElementListTwo_testSize", removeFromTwoElementListTwo_testSize());
		printTest("removeFromTwoElementListTwo_testIterator", removeFromTwoElementListTwo_testIterator());
		printTest("removeFromTwoElementListTwo_testIteratorHasNext", removeFromTwoElementListTwo_testIteratorHasNext());
		printTest("removeFromTwoElementListTwo_testIteratorNext", removeFromTwoElementListTwo_testIteratorNext());
		printTest("removeFromTwoElementListTwo_testContainsOne", removeFromTwoElementListTwo_testContainsOne());
		printTest("removeFromTwoElementListTwo_testContainsTwo", removeFromTwoElementListTwo_testContainsTwo());
		printTest("removeFromTwoElementListTwo_testRemoveElementOne", removeFromTwoElementListTwo_testRemoveElementOne());
		printTest("removeFromTwoElementListTwo_testRemoveElementTwo", removeFromTwoElementListTwo_testRemoveElementTwo());
		printTest("removeFromTwoElementListTwo_testAddAfterOne", removeFromTwoElementListTwo_testAddAfterOne());
		printTest("removeFromTwoElementListTwo_testAddAfterTwo", removeFromTwoElementListTwo_testAddAfterTwo());
		printTest("removeFromTwoElementListTwo_testToString", removeFromTwoElementListTwo_testToString());
		
		//14-TESTS ON [A,B] -> addToFront(C) -> [C,A,B]
		// Only UnorderedList Tests
		printTest("addToFrontFromTwoElementList_testAddToFront", addToFrontFromTwoElementList_testAddToFront());
		printTest("addToFrontFromTwoElementList_testAddToRear", addToFrontFromTwoElementList_testAddToRear());
		printTest("addToFrontFromTwoElementList_testRemoveFirst", addToFrontFromTwoElementList_testRemoveFirst());
		printTest("addToFrontFromTwoElementList_testRemoveLast", addToFrontFromTwoElementList_testRemoveLast());
		printTest("addToFrontFromTwoElementList_testFirst", addToFrontFromTwoElementList_testFirst());
		printTest("addToFrontFromTwoElementList_testLast", addToFrontFromTwoElementList_testLast());
		printTest("addToFrontFromTwoElementList_testIsEmpty", addToFrontFromTwoElementList_testIsEmpty());
		printTest("addToFrontFromTwoElementList_testSize", addToFrontFromTwoElementList_testSize());
		printTest("addToFrontFromTwoElementList_testIterator", addToFrontFromTwoElementList_testIterator());
		printTest("addToFrontFromTwoElementList_testIteratorHasNext", addToFrontFromTwoElementList_testIteratorHasNext());
		printTest("addToFrontFromTwoElementList_testIteratorNext", addToFrontFromTwoElementList_testIteratorNext());
		printTest("addToFrontFromTwoElementList_testContainsOne", addToFrontFromTwoElementList_testContainsOne());
		printTest("addToFrontFromTwoElementList_testContainsTwo", addToFrontFromTwoElementList_testContainsTwo());
		printTest("addToFrontFromTwoElementList_testContainsThree", addToFrontFromTwoElementList_testContainsThree());
		printTest("addToFrontFromTwoElementList_testContainsFour", addToFrontFromTwoElementList_testContainsFour());
		printTest("addToFrontFromTwoElementList_testRemoveElementOne", addToFrontFromTwoElementList_testRemoveElementOne());
		printTest("addToFrontFromTwoElementList_testRemoveElementTwo", addToFrontFromTwoElementList_testRemoveElementTwo());
		printTest("addToFrontFromTwoElementList_testRemoveElementThree", addToFrontFromTwoElementList_testRemoveElementThree());
		printTest("addToFrontFromTwoElementList_testRemoveElementFour", addToFrontFromTwoElementList_testRemoveElementFour());
		printTest("addToFrontFromTwoElementList_testAddAfterOne", addToFrontFromTwoElementList_testAddAfterOne());
		printTest("addToFrontFromTwoElementList_testAddAfterTwo", addToFrontFromTwoElementList_testAddAfterTwo());
		printTest("addToFrontFromTwoElementList_testAddAfterThree", addToFrontFromTwoElementList_testAddAfterThree());
		printTest("addToFrontFromTwoElementList_testAddAfterFour", addToFrontFromTwoElementList_testAddAfterFour());
		printTest("addToFrontFromTwoElementList_testToString", addToFrontFromTwoElementList_testToString());
		
		//15-TESTS ON [A,B] -> addToRear(C) -> [A,B,C]
		// Only UnorderedList Tests
		printTest("addToRearFromTwoElementList_testAddToFront", addToRearFromTwoElementList_testAddToFront());
		printTest("addToRearFromTwoElementList_testAddToRear", addToRearFromTwoElementList_testAddToRear());
		printTest("addToRearFromTwoElementList_testRemoveFirst", addToRearFromTwoElementList_testRemoveFirst());
		printTest("addToRearFromTwoElementList_testRemoveLast", addToRearFromTwoElementList_testRemoveLast());
		printTest("addToRearFromTwoElementList_testFirst", addToRearFromTwoElementList_testFirst());
		printTest("addToRearFromTwoElementList_testLast", addToRearFromTwoElementList_testLast());
		printTest("addToRearFromTwoElementList_testIsEmpty", addToRearFromTwoElementList_testIsEmpty());
		printTest("addToRearFromTwoElementList_testSize", addToRearFromTwoElementList_testSize());
		printTest("addToRearFromTwoElementList_testIterator", addToRearFromTwoElementList_testIterator());
		printTest("addToRearFromTwoElementList_testIteratorHasNext", addToRearFromTwoElementList_testIteratorHasNext());
		printTest("addToRearFromTwoElementList_testIteratorNext", addToRearFromTwoElementList_testIteratorNext());
		printTest("addToRearFromTwoElementList_testContainsOne", addToRearFromTwoElementList_testContainsOne());
		printTest("addToRearFromTwoElementList_testContainsTwo", addToRearFromTwoElementList_testContainsTwo());
		printTest("addToRearFromTwoElementList_testContainsThree", addToRearFromTwoElementList_testContainsThree());
		printTest("addToRearFromTwoElementList_testContainsFour", addToRearFromTwoElementList_testContainsFour());
		printTest("addToRearFromTwoElementList_testRemoveElementOne", addToRearFromTwoElementList_testRemoveElementOne());
		printTest("addToRearFromTwoElementList_testRemoveElementTwo", addToRearFromTwoElementList_testRemoveElementTwo());
		printTest("addToRearFromTwoElementList_testRemoveElementThree", addToRearFromTwoElementList_testRemoveElementThree());
		printTest("addToRearFromTwoElementList_testRemoveElementFour", addToRearFromTwoElementList_testRemoveElementFour());
		printTest("addToRearFromTwoElementList_testAddAfterOne", addToRearFromTwoElementList_testAddAfterOne());
		printTest("addToRearFromTwoElementList_testAddAfterTwo", addToRearFromTwoElementList_testAddAfterTwo());
		printTest("addToRearFromTwoElementList_testAddAfterThree", addToRearFromTwoElementList_testAddAfterThree());
		printTest("addToRearFromTwoElementList_testAddAfterFour", addToRearFromTwoElementList_testAddAfterFour());
		printTest("addToRearFromTwoElementList_testToString", addToRearFromTwoElementList_testToString());
		
		//16-TESTS ON [A,B] -> addAfter(C,A) -> [A,C,B]
		// Only UnorderedList Tests
		printTest("addAfterFromTwoElementListOne_testAddToFront", addAfterFromTwoElementListOne_testAddToFront());
		printTest("addAfterFromTwoElementListOne_testAddToRear", addAfterFromTwoElementListOne_testAddToRear());
		printTest("addAfterFromTwoElementListOne_testRemoveFirst", addAfterFromTwoElementListOne_testRemoveFirst());
		printTest("addAfterFromTwoElementListOne_testRemoveLast", addAfterFromTwoElementListOne_testRemoveLast());
		printTest("addAfterFromTwoElementListOne_testFirst", addAfterFromTwoElementListOne_testFirst());
		printTest("addAfterFromTwoElementListOne_testLast", addAfterFromTwoElementListOne_testLast());
		printTest("addAfterFromTwoElementListOne_testIsEmpty", addAfterFromTwoElementListOne_testIsEmpty());
		printTest("addAfterFromTwoElementListOne_testSize", addAfterFromTwoElementListOne_testSize());
		printTest("addAfterFromTwoElementListOne_testIterator", addAfterFromTwoElementListOne_testIterator());
		printTest("addAfterFromTwoElementListOne_testIteratorHasNext", addAfterFromTwoElementListOne_testIteratorHasNext());
		printTest("addAfterFromTwoElementListOne_testIteratorNext", addAfterFromTwoElementListOne_testIteratorNext());
		printTest("addAfterFromTwoElementListOne_testContainsOne", addAfterFromTwoElementListOne_testContainsOne());
		printTest("addAfterFromTwoElementListOne_testContainsTwo", addAfterFromTwoElementListOne_testContainsTwo());
		printTest("addAfterFromTwoElementListOne_testContainsThree", addAfterFromTwoElementListOne_testContainsThree());
		printTest("addAfterFromTwoElementListOne_testContainsFour", addAfterFromTwoElementListOne_testContainsFour());
		printTest("addAfterFromTwoElementListOne_testRemoveElementOne", addAfterFromTwoElementListOne_testRemoveElementOne());
		printTest("addAfterFromTwoElementListOne_testRemoveElementTwo", addAfterFromTwoElementListOne_testRemoveElementTwo());
		printTest("addAfterFromTwoElementListOne_testRemoveElementThree", addAfterFromTwoElementListOne_testRemoveElementThree());
		printTest("addAfterFromTwoElementListOne_testRemoveElementFour", addAfterFromTwoElementListOne_testRemoveElementFour());
		printTest("addAfterFromTwoElementListOne_testAddAfterOne", addAfterFromTwoElementListOne_testAddAfterOne());
		printTest("addAfterFromTwoElementListOne_testAddAfterTwo", addAfterFromTwoElementListOne_testAddAfterTwo());
		printTest("addAfterFromTwoElementListOne_testAddAfterThree", addAfterFromTwoElementListOne_testAddAfterThree());
		printTest("addAfterFromTwoElementListOne_testAddAfterFour", addAfterFromTwoElementListOne_testAddAfterFour());
		printTest("addAfterFromTwoElementListOne_testToString", addAfterFromTwoElementListOne_testToString());
		
		//17-TESTS ON [A,B] -> addAfter(C,B) -> [A,B,C]
		// Only UnorderedList Tests
		printTest("addAfterFromTwoElementListTwo_testAddToFront", addAfterFromTwoElementListTwo_testAddToFront());
		printTest("addAfterFromTwoElementListTwo_testAddToRear", addAfterFromTwoElementListTwo_testAddToRear());
		printTest("addAfterFromTwoElementListTwo_testRemoveFirst", addAfterFromTwoElementListTwo_testRemoveFirst());
		printTest("addAfterFromTwoElementListTwo_testRemoveLast", addAfterFromTwoElementListTwo_testRemoveLast());
		printTest("addAfterFromTwoElementListTwo_testFirst", addAfterFromTwoElementListTwo_testFirst());
		printTest("addAfterFromTwoElementListTwo_testLast", addAfterFromTwoElementListTwo_testLast());
		printTest("addAfterFromTwoElementListTwo_testIsEmpty", addAfterFromTwoElementListTwo_testIsEmpty());
		printTest("addAfterFromTwoElementListTwo_testSize", addAfterFromTwoElementListTwo_testSize());
		printTest("addAfterFromTwoElementListTwo_testIterator", addAfterFromTwoElementListTwo_testIterator());
		printTest("addAfterFromTwoElementListTwo_testIteratorHasNext", addAfterFromTwoElementListTwo_testIteratorHasNext());
		printTest("addAfterFromTwoElementListTwo_testIteratorNext", addAfterFromTwoElementListTwo_testIteratorNext());
		printTest("addAfterFromTwoElementListTwo_testContainsOne", addAfterFromTwoElementListTwo_testContainsOne());
		printTest("addAfterFromTwoElementListTwo_testContainsTwo", addAfterFromTwoElementListTwo_testContainsTwo());
		printTest("addAfterFromTwoElementListTwo_testContainsThree", addAfterFromTwoElementListTwo_testContainsThree());
		printTest("addAfterFromTwoElementListTwo_testContainsFour", addAfterFromTwoElementListTwo_testContainsFour());
		printTest("addAfterFromTwoElementListTwo_testRemoveElementOne", addAfterFromTwoElementListTwo_testRemoveElementOne());
		printTest("addAfterFromTwoElementListTwo_testRemoveElementTwo", addAfterFromTwoElementListTwo_testRemoveElementTwo());
		printTest("addAfterFromTwoElementListTwo_testRemoveElementThree", addAfterFromTwoElementListTwo_testRemoveElementThree());
		printTest("addAfterFromTwoElementListTwo_testRemoveElementFour", addAfterFromTwoElementListTwo_testRemoveElementFour());
		printTest("addAfterFromTwoElementListTwo_testAddAfterOne", addAfterFromTwoElementListTwo_testAddAfterOne());
		printTest("addAfterFromTwoElementListTwo_testAddAfterTwo", addAfterFromTwoElementListTwo_testAddAfterTwo());
		printTest("addAfterFromTwoElementListTwo_testAddAfterThree", addAfterFromTwoElementListTwo_testAddAfterThree());
		printTest("addAfterFromTwoElementListTwo_testAddAfterFour", addAfterFromTwoElementListTwo_testAddAfterFour());
		printTest("addAfterFromTwoElementListTwo_testToString", addAfterFromTwoElementListTwo_testToString());
		
		//18-TESTS ON [A,B,C] -> removeFirst() -> [B,C]
		// Only UnorderedList Tests
		printTest("removeFirstFromThreeElementList_testAddToFront", removeFirstFromThreeElementList_testAddToFront());
		printTest("removeFirstFromThreeElementList_testAddToRear", removeFirstFromThreeElementList_testAddToRear());
		printTest("removeFirstFromThreeElementList_testRemoveFirst", removeFirstFromThreeElementList_testRemoveFirst());
		printTest("removeFirstFromThreeElementList_testRemoveLast", removeFirstFromThreeElementList_testRemoveLast());
		printTest("removeFirstFromThreeElementList_testFirst", removeFirstFromThreeElementList_testFirst());
		printTest("removeFirstFromThreeElementList_testLast", removeFirstFromThreeElementList_testLast());
		printTest("removeFirstFromThreeElementList_testIsEmpty", removeFirstFromThreeElementList_testIsEmpty());
		printTest("removeFirstFromThreeElementList_testSize", removeFirstFromThreeElementList_testSize());
		printTest("removeFirstFromThreeElementList_testIterator", removeFirstFromThreeElementList_testIterator());
		printTest("removeFirstFromThreeElementList_testIteratorHasNext", removeFirstFromThreeElementList_testIteratorHasNext());
		printTest("removeFirstFromThreeElementList_testIteratorNext", removeFirstFromThreeElementList_testIteratorNext());
		printTest("removeFirstFromThreeElementList_testContainsOne", removeFirstFromThreeElementList_testContainsOne());
		printTest("removeFirstFromThreeElementList_testContainsTwo", removeFirstFromThreeElementList_testContainsTwo());
		printTest("removeFirstFromThreeElementList_testContainsThree", removeFirstFromThreeElementList_testContainsThree());
		printTest("removeFirstFromThreeElementList_testRemoveElementOne", removeFirstFromThreeElementList_testRemoveElementOne());
		printTest("removeFirstFromThreeElementList_testRemoveElementTwo", removeFirstFromThreeElementList_testRemoveElementTwo());
		printTest("removeFirstFromThreeElementList_testRemoveElementThree", removeFirstFromThreeElementList_testRemoveElementThree());
		printTest("removeFirstFromThreeElementList_testAddAfterOne", removeFirstFromThreeElementList_testAddAfterOne());
		printTest("removeFirstFromThreeElementList_testAddAfterTwo", removeFirstFromThreeElementList_testAddAfterTwo());
		printTest("removeFirstFromThreeElementList_testAddAfterThree", removeFirstFromThreeElementList_testAddAfterThree());
		printTest("removeFirstFromThreeElementList_testToString", removeFirstFromThreeElementList_testToString());
		
		//19-TESTS ON [A,B,C] -> removeLast() -> [A,B]
		// Only UnorderedList Tests
		printTest("removeLastFromThreeElementList_testAddToFront", removeLastFromThreeElementList_testAddToFront());
		printTest("removeLastFromThreeElementList_testAddToRear", removeLastFromThreeElementList_testAddToRear());
		printTest("removeLastFromThreeElementList_testRemoveFirst", removeLastFromThreeElementList_testRemoveFirst());
		printTest("removeLastFromThreeElementList_testRemoveLast", removeLastFromThreeElementList_testRemoveLast());
		printTest("removeLastFromThreeElementList_testFirst", removeLastFromThreeElementList_testFirst());
		printTest("removeLastFromThreeElementList_testLast", removeLastFromThreeElementList_testLast());
		printTest("removeLastFromThreeElementList_testIsEmpty", removeLastFromThreeElementList_testIsEmpty());
		printTest("removeLastFromThreeElementList_testSize", removeLastFromThreeElementList_testSize());
		printTest("removeLastFromThreeElementList_testIterator", removeLastFromThreeElementList_testIterator());
		printTest("removeLastFromThreeElementList_testIteratorHasNext", removeLastFromThreeElementList_testIteratorHasNext());
		printTest("removeLastFromThreeElementList_testIteratorNext", removeLastFromThreeElementList_testIteratorNext());
		printTest("removeLastFromThreeElementList_testContainsOne", removeLastFromThreeElementList_testContainsOne());
		printTest("removeLastFromThreeElementList_testContainsTwo", removeLastFromThreeElementList_testContainsTwo());
		printTest("removeLastFromThreeElementList_testContainsThree", removeLastFromThreeElementList_testContainsThree());
		printTest("removeLastFromThreeElementList_testRemoveElementOne", removeLastFromThreeElementList_testRemoveElementOne());
		printTest("removeLastFromThreeElementList_testRemoveElementTwo", removeLastFromThreeElementList_testRemoveElementTwo());
		printTest("removeLastFromThreeElementList_testRemoveElementThree", removeLastFromThreeElementList_testRemoveElementThree());
		printTest("removeLastFromThreeElementList_testAddAfterOne", removeLastFromThreeElementList_testAddAfterOne());
		printTest("removeLastFromThreeElementList_testAddAfterTwo", removeLastFromThreeElementList_testAddAfterTwo());
		printTest("removeLastFromThreeElementList_testAddAfterThree", removeLastFromThreeElementList_testAddAfterThree());
		printTest("removeLastFromThreeElementList_testToString", removeLastFromThreeElementList_testToString());
		
		//20-TESTS ON [A,B,C] -> remove(A) -> [B,C]
		// Only UnorderedList Tests
		printTest("removeFromThreeElementListOne_testAddToFront", removeFromThreeElementListOne_testAddToFront());
		printTest("removeFromThreeElementListOne_testAddToRear", removeFromThreeElementListOne_testAddToRear());
		printTest("removeFromThreeElementListOne_testRemoveFirst", removeFromThreeElementListOne_testRemoveFirst());
		printTest("removeFromThreeElementListOne_testRemoveLast", removeFromThreeElementListOne_testRemoveLast());
		printTest("removeFromThreeElementListOne_testFirst", removeFromThreeElementListOne_testFirst());
		printTest("removeFromThreeElementListOne_testLast", removeFromThreeElementListOne_testLast());
		printTest("removeFromThreeElementListOne_testIsEmpty", removeFromThreeElementListOne_testIsEmpty());
		printTest("removeFromThreeElementListOne_testSize", removeFromThreeElementListOne_testSize());
		printTest("removeFromThreeElementListOne_testIterator", removeFromThreeElementListOne_testIterator());
		printTest("removeFromThreeElementListOne_testIteratorHasNext", removeFromThreeElementListOne_testIteratorHasNext());
		printTest("removeFromThreeElementListOne_testIteratorNext", removeFromThreeElementListOne_testIteratorNext());
		printTest("removeFromThreeElementListOne_testContainsOne", removeFromThreeElementListOne_testContainsOne());
		printTest("removeFromThreeElementListOne_testContainsTwo", removeFromThreeElementListOne_testContainsTwo());
		printTest("removeFromThreeElementListOne_testContainsThree", removeFromThreeElementListOne_testContainsThree());
		printTest("removeFromThreeElementListOne_testRemoveElementOne", removeFromThreeElementListOne_testRemoveElementOne());
		printTest("removeFromThreeElementListOne_testRemoveElementTwo", removeFromThreeElementListOne_testRemoveElementTwo());
		printTest("removeFromThreeElementListOne_testRemoveElementThree", removeFromThreeElementListOne_testRemoveElementThree());
		printTest("removeFromThreeElementListOne_testAddAfterOne", removeFromThreeElementListOne_testAddAfterOne());
		printTest("removeFromThreeElementListOne_testAddAfterTwo", removeFromThreeElementListOne_testAddAfterTwo());
		printTest("removeFromThreeElementListOne_testAddAfterThree", removeFromThreeElementListOne_testAddAfterThree());
		printTest("removeFromThreeElementListOne_testToString", removeFromThreeElementListOne_testToString());
		
		//21-TESTS ON [A,B,C] -> remove(B) -> [A,C]
		// Only UnorderedList Tests
		printTest("removeFromThreeElementListTwo_testAddToFront", removeFromThreeElementListTwo_testAddToFront());
		printTest("removeFromThreeElementListTwo_testAddToRear", removeFromThreeElementListTwo_testAddToRear());
		printTest("removeFromThreeElementListTwo_testRemoveFirst", removeFromThreeElementListTwo_testRemoveFirst());
		printTest("removeFromThreeElementListTwo_testRemoveLast", removeFromThreeElementListTwo_testRemoveLast());
		printTest("removeFromThreeElementListTwo_testFirst", removeFromThreeElementListTwo_testFirst());
		printTest("removeFromThreeElementListTwo_testLast", removeFromThreeElementListTwo_testLast());
		printTest("removeFromThreeElementListTwo_testIsEmpty", removeFromThreeElementListTwo_testIsEmpty());
		printTest("removeFromThreeElementListTwo_testSize", removeFromThreeElementListTwo_testSize());
		printTest("removeFromThreeElementListTwo_testIterator", removeFromThreeElementListTwo_testIterator());
		printTest("removeFromThreeElementListTwo_testIteratorHasNext", removeFromThreeElementListTwo_testIteratorHasNext());
		printTest("removeFromThreeElementListTwo_testIteratorNext", removeFromThreeElementListTwo_testIteratorNext());
		printTest("removeFromThreeElementListTwo_testContainsOne", removeFromThreeElementListTwo_testContainsOne());
		printTest("removeFromThreeElementListTwo_testContainsTwo", removeFromThreeElementListTwo_testContainsTwo());
		printTest("removeFromThreeElementListTwo_testContainsThree", removeFromThreeElementListTwo_testContainsThree());
		printTest("removeFromThreeElementListTwo_testRemoveElementOne", removeFromThreeElementListTwo_testRemoveElementOne());
		printTest("removeFromThreeElementListTwo_testRemoveElementTwo", removeFromThreeElementListTwo_testRemoveElementTwo());
		printTest("removeFromThreeElementListTwo_testRemoveElementThree", removeFromThreeElementListTwo_testRemoveElementThree());
		printTest("removeFromThreeElementListTwo_testAddAfterOne", removeFromThreeElementListTwo_testAddAfterOne());
		printTest("removeFromThreeElementListTwo_testAddAfterTwo", removeFromThreeElementListTwo_testAddAfterTwo());
		printTest("removeFromThreeElementListTwo_testAddAfterThree", removeFromThreeElementListTwo_testAddAfterThree());
		printTest("removeFromThreeElementListTwo_testToString", removeFromThreeElementListTwo_testToString());
		
		//22-TESTS ON [A,B,C] -> remove(C) -> [A,B]
		// Only UnorderedList Tests
		printTest("removeFromThreeElementListThree_testAddToFront", removeFromThreeElementListThree_testAddToFront());
		printTest("removeFromThreeElementListThree_testAddToRear", removeFromThreeElementListThree_testAddToRear());
		printTest("removeFromThreeElementListThree_testRemoveFirst", removeFromThreeElementListThree_testRemoveFirst());
		printTest("removeFromThreeElementListThree_testRemoveLast", removeFromThreeElementListThree_testRemoveLast());
		printTest("removeFromThreeElementListThree_testFirst", removeFromThreeElementListThree_testFirst());
		printTest("removeFromThreeElementListThree_testLast", removeFromThreeElementListThree_testLast());
		printTest("removeFromThreeElementListThree_testIsEmpty", removeFromThreeElementListThree_testIsEmpty());
		printTest("removeFromThreeElementListThree_testSize", removeFromThreeElementListThree_testSize());
		printTest("removeFromThreeElementListThree_testIterator", removeFromThreeElementListThree_testIterator());
		printTest("removeFromThreeElementListThree_testIteratorHasNext", removeFromThreeElementListThree_testIteratorHasNext());
		printTest("removeFromThreeElementListThree_testIteratorNext", removeFromThreeElementListThree_testIteratorNext());
		printTest("removeFromThreeElementListThree_testContainsOne", removeFromThreeElementListThree_testContainsOne());
		printTest("removeFromThreeElementListThree_testContainsTwo", removeFromThreeElementListThree_testContainsTwo());
		printTest("removeFromThreeElementListThree_testContainsThree", removeFromThreeElementListThree_testContainsThree());
		printTest("removeFromThreeElementListThree_testRemoveElementOne", removeFromThreeElementListThree_testRemoveElementOne());
		printTest("removeFromThreeElementListThree_testRemoveElementTwo", removeFromThreeElementListThree_testRemoveElementTwo());
		printTest("removeFromThreeElementListThree_testRemoveElementThree", removeFromThreeElementListThree_testRemoveElementThree());
		printTest("removeFromThreeElementListThree_testAddAfterOne", removeFromThreeElementListThree_testAddAfterOne());
		printTest("removeFromThreeElementListThree_testAddAfterTwo", removeFromThreeElementListThree_testAddAfterTwo());
		printTest("removeFromThreeElementListThree_testAddAfterThree", removeFromThreeElementListThree_testAddAfterThree());
		printTest("removeFromThreeElementListThree_testToString", removeFromThreeElementListThree_testToString());
		
		// 23- Tests ON [] -> add(A) -> [A]
		printTest("addElementFromNewList_testAddToFront", addElementFromNewList_testAddToFront());
		printTest("addElementFromNewList_testAddToRear", addElementFromNewList_testAddToRear());
		printTest("addElementFromNewList_testRemoveFirst", addElementFromNewList_testRemoveFirst());
		printTest("addElementFromNewList_testRemoveLast", addElementFromNewList_testRemoveLast());
		printTest("addElementFromNewList_testFirst", addElementFromNewList_testFirst());
		printTest("addElementFromNewList_testLast", addElementFromNewList_testLast());
		printTest("addElementFromNewList_testIsEmpty", addElementFromNewList_testIsEmpty());
		printTest("addElementFromNewList_testSize", addElementFromNewList_testSize());
		printTest("addElementFromNewList_testIterator", addElementFromNewList_testIterator());
		printTest("addElementFromNewList_testIteratorHasNext", addElementFromNewList_testIteratorHasNext());
		printTest("addElementFromNewList_testIteratorNext", addElementFromNewList_testIteratorNext());
		printTest("addElementFromNewList_testContainsOne", addElementFromNewList_testContainsOne());
		printTest("addElementFromNewList_testContainsTwo", addElementFromNewList_testContainsTwo());
		printTest("addElementFromNewList_testRemoveElementOne", addElementFromNewList_testRemoveElementOne());
		printTest("addElementFromNewList_testRemoveElementTwo", addElementFromNewList_testRemoveElementTwo());
		printTest("addElementFromNewList_testAddAfterOne", addElementFromNewList_testAddAfterOne());
		printTest("addElementFromNewList_testAddAfterTwo", addElementFromNewList_testAddAfterTwo());
		printTest("addElementFromNewList_testToString", addElementFromNewList_testToString());
		printTest("addElementFromNewList_testAddIndexZero", addElementFromNewList_testAddIndexZero());
		printTest("addElementFromNewList_testAddIndexOne", addElementFromNewList_testAddIndexOne());
		printTest("addElementFromNewList_testAddIndexTwo", addElementFromNewList_testAddIndexTwo());
		printTest("addElementFromNewList_testSetIndexZero", addElementFromNewList_testSetIndexZero());
		printTest("addElementFromNewList_testSetIndexOne", addElementFromNewList_testSetIndexOne());
		printTest("addElementFromNewList_testAdd", addElementFromNewList_testAdd());
		printTest("addElementFromNewList_testGetZero", addElementFromNewList_testGetZero());
		printTest("addElementFromNewList_testGetOne", addElementFromNewList_testGetOne());
		printTest("addElementFromNewList_testIndexOfA", addElementFromNewList_testIndexOfA());
		printTest("addElementFromNewList_testIndexOfB", addElementFromNewList_testIndexOfB());
		printTest("addElementFromNewList_testRemoveIndexZero", addElementFromNewList_testRemoveIndexZero());
		printTest("addElementFromNewList_testRemoveIndexOne", addElementFromNewList_testRemoveIndexOne());
		
		// 24- Tests ON [] -> add(0,A) -> [A]
		printTest("addIndexZeroFromNewList_testAddToFront", addIndexZeroFromNewList_testAddToFront());
		printTest("addIndexZeroFromNewList_testAddToRear", addIndexZeroFromNewList_testAddToRear());
		printTest("addIndexZeroFromNewList_testRemoveFirst", addIndexZeroFromNewList_testRemoveFirst());
		printTest("addIndexZeroFromNewList_testRemoveLast", addIndexZeroFromNewList_testRemoveLast());
		printTest("addIndexZeroFromNewList_testFirst", addIndexZeroFromNewList_testFirst());
		printTest("addIndexZeroFromNewList_testLast", addIndexZeroFromNewList_testLast());
		printTest("addIndexZeroFromNewList_testIsEmpty", addIndexZeroFromNewList_testIsEmpty());
		printTest("addIndexZeroFromNewList_testSize", addIndexZeroFromNewList_testSize());
		printTest("addIndexZeroFromNewList_testIterator", addIndexZeroFromNewList_testIterator());
		printTest("addIndexZeroFromNewList_testIteratorHasNext", addIndexZeroFromNewList_testIteratorHasNext());
		printTest("addIndexZeroFromNewList_testIteratorNext", addIndexZeroFromNewList_testIteratorNext());
		printTest("addIndexZeroFromNewList_testContainsOne", addIndexZeroFromNewList_testContainsOne());
		printTest("addIndexZeroFromNewList_testContainsTwo", addIndexZeroFromNewList_testContainsTwo());
		printTest("addIndexZeroFromNewList_testRemoveElementOne", addIndexZeroFromNewList_testRemoveElementOne());
		printTest("addIndexZeroFromNewList_testRemoveElementTwo", addIndexZeroFromNewList_testRemoveElementTwo());
		printTest("addIndexZeroFromNewList_testAddAfterOne", addIndexZeroFromNewList_testAddAfterOne());
		printTest("addIndexZeroFromNewList_testAddAfterTwo", addIndexZeroFromNewList_testAddAfterTwo());
		printTest("addIndexZeroFromNewList_testToString", addIndexZeroFromNewList_testToString());
		printTest("addIndexZeroFromNewList_testAddIndexZero", addIndexZeroFromNewList_testAddIndexZero());
		printTest("addIndexZeroFromNewList_testAddIndexOne", addIndexZeroFromNewList_testAddIndexOne());
		printTest("addIndexZeroFromNewList_testAddIndexTwo", addIndexZeroFromNewList_testAddIndexTwo());
		printTest("addIndexZeroFromNewList_testSetIndexZero", addIndexZeroFromNewList_testSetIndexZero());
		printTest("addIndexZeroFromNewList_testSetIndexOne", addIndexZeroFromNewList_testSetIndexOne());
		printTest("addIndexZeroFromNewList_testAdd", addIndexZeroFromNewList_testAdd());
		printTest("addIndexZeroFromNewList_testGetZero", addIndexZeroFromNewList_testGetZero());
		printTest("addIndexZeroFromNewList_testGetOne", addIndexZeroFromNewList_testGetOne());
		printTest("addIndexZeroFromNewList_testIndexOfA", addIndexZeroFromNewList_testIndexOfA());
		printTest("addIndexZeroFromNewList_testIndexOfB", addIndexZeroFromNewList_testIndexOfB());
		printTest("addIndexZeroFromNewList_testRemoveIndexZero", addIndexZeroFromNewList_testRemoveIndexZero());
		printTest("addIndexZeroFromNewList_testRemoveIndexOne", addIndexZeroFromNewList_testRemoveIndexOne());
		
		// 25- Tests ON [A] -> remove(0) -> []
		printTest("removeIndexZeroFromOneElementList_testAddToFront", removeIndexZeroFromOneElementList_testAddToFront());
		printTest("removeIndexZeroFromOneElementList_testAddToRear", removeIndexZeroFromOneElementList_testAddToRear());
		printTest("removeIndexZeroFromOneElementList_testRemoveFirst", removeIndexZeroFromOneElementList_testRemoveFirst());
		printTest("removeIndexZeroFromOneElementList_testRemoveLast", removeIndexZeroFromOneElementList_testRemoveLast());
		printTest("removeIndexZeroFromOneElementList_testFirst", removeIndexZeroFromOneElementList_testFirst());
		printTest("removeIndexZeroFromOneElementList_testLast", removeIndexZeroFromOneElementList_testLast());
		printTest("removeIndexZeroFromOneElementList_testIsEmpty", removeIndexZeroFromOneElementList_testIsEmpty());
		printTest("removeIndexZeroFromOneElementList_testSize", removeIndexZeroFromOneElementList_testSize());
		printTest("removeIndexZeroFromOneElementList_testIterator", removeIndexZeroFromOneElementList_testIterator());
		printTest("removeIndexZeroFromOneElementList_testIteratorHasNext", removeIndexZeroFromOneElementList_testIteratorHasNext());
		printTest("removeIndexZeroFromOneElementList_testIteratorNext", removeIndexZeroFromOneElementList_testIteratorNext());
		printTest("removeIndexZeroFromOneElementList_testContainsOne", removeIndexZeroFromOneElementList_testContainsOne());
		printTest("removeIndexZeroFromOneElementList_testRemoveElementOne", removeIndexZeroFromOneElementList_testRemoveElementOne());
		printTest("removeIndexZeroFromOneElementList_testAddAfterOne", removeIndexZeroFromOneElementList_testAddAfterOne());
		printTest("removeIndexZeroFromOneElementList_testToString", removeIndexZeroFromOneElementList_testToString());
		printTest("removeIndexZeroFromOneElementList_testAddIndexZero", removeIndexZeroFromOneElementList_testAddIndexZero());
		printTest("removeIndexZeroFromOneElementList_testAddIndexOne", removeIndexZeroFromOneElementList_testAddIndexOne());
		printTest("removeIndexZeroFromOneElementList_testSetIndexZero", removeIndexZeroFromOneElementList_testSetIndexZero());
		printTest("removeIndexZeroFromOneElementList_testAdd", removeIndexZeroFromOneElementList_testAdd());
		printTest("removeIndexZeroFromOneElementList_testGetZero", removeIndexZeroFromOneElementList_testGetZero());
		printTest("removeIndexZeroFromOneElementList_testIndexOfA", removeIndexZeroFromOneElementList_testIndexOfA());
		printTest("removeIndexZeroFromOneElementList_testRemoveIndexZero", removeIndexZeroFromOneElementList_testRemoveIndexZero());
		
		// 26- Tests ON [A] -> set(0,B) -> [B]
		printTest("setIndexZeroFromOneElementList_testAddToFront", setIndexZeroFromOneElementList_testAddToFront());
		printTest("setIndexZeroFromOneElementList_testAddToRear", setIndexZeroFromOneElementList_testAddToRear());
		printTest("setIndexZeroFromOneElementList_testRemoveFirst", setIndexZeroFromOneElementList_testRemoveFirst());
		printTest("setIndexZeroFromOneElementList_testRemoveLast", setIndexZeroFromOneElementList_testRemoveLast());
		printTest("setIndexZeroFromOneElementList_testFirst", setIndexZeroFromOneElementList_testFirst());
		printTest("setIndexZeroFromOneElementList_testLast", setIndexZeroFromOneElementList_testLast());
		printTest("setIndexZeroFromOneElementList_testIsEmpty", setIndexZeroFromOneElementList_testIsEmpty());
		printTest("setIndexZeroFromOneElementList_testSize", setIndexZeroFromOneElementList_testSize());
		printTest("setIndexZeroFromOneElementList_testIterator", setIndexZeroFromOneElementList_testIterator());
		printTest("setIndexZeroFromOneElementList_testIteratorHasNext", setIndexZeroFromOneElementList_testIteratorHasNext());
		printTest("setIndexZeroFromOneElementList_testIteratorNext", setIndexZeroFromOneElementList_testIteratorNext());
		printTest("setIndexZeroFromOneElementList_testContainsOne", setIndexZeroFromOneElementList_testContainsOne());
		printTest("setIndexZeroFromOneElementList_testContainsTwo", setIndexZeroFromOneElementList_testContainsTwo());
		printTest("setIndexZeroFromOneElementList_testRemoveElementOne", setIndexZeroFromOneElementList_testRemoveElementOne());
		printTest("setIndexZeroFromOneElementList_testRemoveElementTwo", setIndexZeroFromOneElementList_testRemoveElementTwo());
		printTest("setIndexZeroFromOneElementList_testAddAfterOne", setIndexZeroFromOneElementList_testAddAfterOne());
		printTest("setIndexZeroFromOneElementList_testAddAfterTwo", setIndexZeroFromOneElementList_testAddAfterTwo());
		printTest("setIndexZeroFromOneElementList_testToString", setIndexZeroFromOneElementList_testToString());
		printTest("setIndexZeroFromOneElementList_testAddIndexZero", setIndexZeroFromOneElementList_testAddIndexZero());
		printTest("setIndexZeroFromOneElementList_testAddIndexOne", setIndexZeroFromOneElementList_testAddIndexOne());
		printTest("setIndexZeroFromOneElementList_testAddIndexTwo", setIndexZeroFromOneElementList_testAddIndexTwo());
		printTest("setIndexZeroFromOneElementList_testSetIndexZero", setIndexZeroFromOneElementList_testSetIndexZero());
		printTest("setIndexZeroFromOneElementList_testSetIndexOne", setIndexZeroFromOneElementList_testSetIndexOne());
		printTest("setIndexZeroFromOneElementList_testAdd", setIndexZeroFromOneElementList_testAdd());
		printTest("setIndexZeroFromOneElementList_testGetZero", setIndexZeroFromOneElementList_testGetZero());
		printTest("setIndexZeroFromOneElementList_testGetOne", setIndexZeroFromOneElementList_testGetOne());
		printTest("setIndexZeroFromOneElementList_testIndexOfA", setIndexZeroFromOneElementList_testIndexOfA());
		printTest("setIndexZeroFromOneElementList_testIndexOfB", setIndexZeroFromOneElementList_testIndexOfB());
		printTest("setIndexZeroFromOneElementList_testRemoveIndexZero", setIndexZeroFromOneElementList_testRemoveIndexZero());
		printTest("setIndexZeroFromOneElementList_testRemoveIndexOne", setIndexZeroFromOneElementList_testRemoveIndexOne());
		
		// 27- Tests ON [A] -> add(0,B) -> [B,A]
		printTest("addIndexZeroFromOneElementList_testAddToFront", addIndexZeroFromOneElementList_testAddToFront());
		printTest("addIndexZeroFromOneElementList_testAddToRear", addIndexZeroFromOneElementList_testAddToRear());
		printTest("addIndexZeroFromOneElementList_testRemoveFirst", addIndexZeroFromOneElementList_testRemoveFirst());
		printTest("addIndexZeroFromOneElementList_testRemoveLast", addIndexZeroFromOneElementList_testRemoveLast());
		printTest("addIndexZeroFromOneElementList_testFirst", addIndexZeroFromOneElementList_testFirst());
		printTest("addIndexZeroFromOneElementList_testLast", addIndexZeroFromOneElementList_testLast());
		printTest("addIndexZeroFromOneElementList_testIsEmpty", addIndexZeroFromOneElementList_testIsEmpty());
		printTest("addIndexZeroFromOneElementList_testSize", addIndexZeroFromOneElementList_testSize());
		printTest("addIndexZeroFromOneElementList_testIterator", addIndexZeroFromOneElementList_testIterator());
		printTest("addIndexZeroFromOneElementList_testIteratorHasNext", addIndexZeroFromOneElementList_testIteratorHasNext());
		printTest("addIndexZeroFromOneElementList_testIteratorNext", addIndexZeroFromOneElementList_testIteratorNext());
		printTest("addIndexZeroFromOneElementList_testContainsOne", addIndexZeroFromOneElementList_testContainsOne());
		printTest("addIndexZeroFromOneElementList_testContainsTwo", addIndexZeroFromOneElementList_testContainsTwo());
		printTest("addIndexZeroFromOneElementList_testContainsThree", addIndexZeroFromOneElementList_testContainsThree());
		printTest("addIndexZeroFromOneElementList_testRemoveElementOne", addIndexZeroFromOneElementList_testRemoveElementOne());
		printTest("addIndexZeroFromOneElementList_testRemoveElementTwo", addIndexZeroFromOneElementList_testRemoveElementTwo());
		printTest("addIndexZeroFromOneElementList_testRemoveElementThree", addIndexZeroFromOneElementList_testRemoveElementThree());
		printTest("addIndexZeroFromOneElementList_testAddAfterOne", addIndexZeroFromOneElementList_testAddAfterOne());
		printTest("addIndexZeroFromOneElementList_testAddAfterTwo", addIndexZeroFromOneElementList_testAddAfterTwo());
		printTest("addIndexZeroFromOneElementList_testAddAfterThree", addIndexZeroFromOneElementList_testAddAfterThree());
		printTest("addIndexZeroFromOneElementList_testToString", addIndexZeroFromOneElementList_testToString());
		printTest("addIndexZeroFromOneElementList_testAddIndexZero", addIndexZeroFromOneElementList_testAddIndexZero());
		printTest("addIndexZeroFromOneElementList_testAddIndexOne", addIndexZeroFromOneElementList_testAddIndexOne());
		printTest("addIndexZeroFromOneElementList_testAddIndexTwo", addIndexZeroFromOneElementList_testAddIndexTwo());
		printTest("addIndexZeroFromOneElementList_testAddIndexThree", addIndexZeroFromOneElementList_testAddIndexThree());
		printTest("addIndexZeroFromOneElementList_testSetIndexZero", addIndexZeroFromOneElementList_testSetIndexZero());
		printTest("addIndexZeroFromOneElementList_testSetIndexOne", addIndexZeroFromOneElementList_testSetIndexOne());
		printTest("addIndexZeroFromOneElementList_testSetIndexTwo", addIndexZeroFromOneElementList_testSetIndexTwo());	
		printTest("addIndexZeroFromOneElementList_testAdd", addIndexZeroFromOneElementList_testAdd());
		printTest("addIndexZeroFromOneElementList_testGetZero", addIndexZeroFromOneElementList_testGetZero());
		printTest("addIndexZeroFromOneElementList_testGetOne", addIndexZeroFromOneElementList_testGetOne());
		printTest("addIndexZeroFromOneElementList_testGetTwo", addIndexZeroFromOneElementList_testGetTwo());
		printTest("addIndexZeroFromOneElementList_testIndexOfA", addIndexZeroFromOneElementList_testIndexOfA());
		printTest("addIndexZeroFromOneElementList_testIndexOfB", addIndexZeroFromOneElementList_testIndexOfB());
		printTest("addIndexZeroFromOneElementList_testIndexOfC", addIndexZeroFromOneElementList_testIndexOfC());
		printTest("addIndexZeroFromOneElementList_testRemoveIndexZero", addIndexZeroFromOneElementList_testRemoveIndexZero());
		printTest("addIndexZeroFromOneElementList_testRemoveIndexOne", addIndexZeroFromOneElementList_testRemoveIndexOne());
		printTest("addIndexZeroFromOneElementList_testRemoveIndexTwo", addIndexZeroFromOneElementList_testRemoveIndexTwo());
		
		// 28- Tests ON [A] -> add(1,B) -> [A,B]
		printTest("addIndexOneFromOneElementList_testAddToFront", addIndexOneFromOneElementList_testAddToFront());
		printTest("addIndexOneFromOneElementList_testAddToRear", addIndexOneFromOneElementList_testAddToRear());
		printTest("addIndexOneFromOneElementList_testRemoveFirst", addIndexOneFromOneElementList_testRemoveFirst());
		printTest("addIndexOneFromOneElementList_testRemoveLast", addIndexOneFromOneElementList_testRemoveLast());
		printTest("addIndexOneFromOneElementList_testFirst", addIndexOneFromOneElementList_testFirst());
		printTest("addIndexOneFromOneElementList_testLast", addIndexOneFromOneElementList_testLast());
		printTest("addIndexOneFromOneElementList_testIsEmpty", addIndexOneFromOneElementList_testIsEmpty());
		printTest("addIndexOneFromOneElementList_testSize", addIndexOneFromOneElementList_testSize());
		printTest("addIndexOneFromOneElementList_testIterator", addIndexOneFromOneElementList_testIterator());
		printTest("addIndexOneFromOneElementList_testIteratorHasNext", addIndexOneFromOneElementList_testIteratorHasNext());
		printTest("addIndexOneFromOneElementList_testIteratorNext", addIndexOneFromOneElementList_testIteratorNext());
		printTest("addIndexOneFromOneElementList_testContainsOne", addIndexOneFromOneElementList_testContainsOne());
		printTest("addIndexOneFromOneElementList_testContainsTwo", addIndexOneFromOneElementList_testContainsTwo());
		printTest("addIndexOneFromOneElementList_testContainsThree", addIndexOneFromOneElementList_testContainsThree());
		printTest("addIndexOneFromOneElementList_testRemoveElementOne", addIndexOneFromOneElementList_testRemoveElementOne());
		printTest("addIndexOneFromOneElementList_testRemoveElementTwo", addIndexOneFromOneElementList_testRemoveElementTwo());
		printTest("addIndexOneFromOneElementList_testRemoveElementThree", addIndexOneFromOneElementList_testRemoveElementThree());
		printTest("addIndexOneFromOneElementList_testAddAfterOne", addIndexOneFromOneElementList_testAddAfterOne());
		printTest("addIndexOneFromOneElementList_testAddAfterTwo", addIndexOneFromOneElementList_testAddAfterTwo());
		printTest("addIndexOneFromOneElementList_testAddAfterThree", addIndexOneFromOneElementList_testAddAfterThree());
		printTest("addIndexOneFromOneElementList_testToString", addIndexOneFromOneElementList_testToString());
		printTest("addIndexOneFromOneElementList_testAddIndexZero", addIndexOneFromOneElementList_testAddIndexZero());
		printTest("addIndexOneFromOneElementList_testAddIndexOne", addIndexOneFromOneElementList_testAddIndexOne());
		printTest("addIndexOneFromOneElementList_testAddIndexTwo", addIndexOneFromOneElementList_testAddIndexTwo());
		printTest("addIndexOneFromOneElementList_testAddIndexThree", addIndexOneFromOneElementList_testAddIndexThree());
		printTest("addIndexOneFromOneElementList_testSetIndexZero", addIndexOneFromOneElementList_testSetIndexZero());
		printTest("addIndexOneFromOneElementList_testSetIndexOne", addIndexOneFromOneElementList_testSetIndexOne());
		printTest("addIndexOneFromOneElementList_testSetIndexTwo", addIndexOneFromOneElementList_testSetIndexTwo());	
		printTest("addIndexOneFromOneElementList_testAdd", addIndexOneFromOneElementList_testAdd());
		printTest("addIndexOneFromOneElementList_testGetZero", addIndexOneFromOneElementList_testGetZero());
		printTest("addIndexOneFromOneElementList_testGetOne", addIndexOneFromOneElementList_testGetOne());
		printTest("addIndexOneFromOneElementList_testGetTwo", addIndexOneFromOneElementList_testGetTwo());
		printTest("addIndexOneFromOneElementList_testIndexOfA", addIndexOneFromOneElementList_testIndexOfA());
		printTest("addIndexOneFromOneElementList_testIndexOfB", addIndexOneFromOneElementList_testIndexOfB());
		printTest("addIndexOneFromOneElementList_testIndexOfC", addIndexOneFromOneElementList_testIndexOfC());
		printTest("addIndexOneFromOneElementList_testRemoveIndexZero", addIndexOneFromOneElementList_testRemoveIndexZero());
		printTest("addIndexOneFromOneElementList_testRemoveIndexOne", addIndexOneFromOneElementList_testRemoveIndexOne());
		printTest("addIndexOneFromOneElementList_testRemoveIndexTwo", addIndexOneFromOneElementList_testRemoveIndexTwo());	
		
		// 29- Tests ON [A,B] -> remove(0) -> [B]
		printTest("removeIndexZeroFromTwoElementList_testAddToFront", removeIndexZeroFromTwoElementList_testAddToFront());
		printTest("removeIndexZeroFromTwoElementList_testAddToRear", removeIndexZeroFromTwoElementList_testAddToRear());
		printTest("removeIndexZeroFromTwoElementList_testRemoveFirst", removeIndexZeroFromTwoElementList_testRemoveFirst());
		printTest("removeIndexZeroFromTwoElementList_testRemoveLast", removeIndexZeroFromTwoElementList_testRemoveLast());
		printTest("removeIndexZeroFromTwoElementList_testFirst", removeIndexZeroFromTwoElementList_testFirst());
		printTest("removeIndexZeroFromTwoElementList_testLast", removeIndexZeroFromTwoElementList_testLast());
		printTest("removeIndexZeroFromTwoElementList_testIsEmpty", removeIndexZeroFromTwoElementList_testIsEmpty());
		printTest("removeIndexZeroFromTwoElementList_testSize", removeIndexZeroFromTwoElementList_testSize());
		printTest("removeIndexZeroFromTwoElementList_testIterator", removeIndexZeroFromTwoElementList_testIterator());
		printTest("removeIndexZeroFromTwoElementList_testIteratorHasNext", removeIndexZeroFromTwoElementList_testIteratorHasNext());
		printTest("removeIndexZeroFromTwoElementList_testIteratorNext", removeIndexZeroFromTwoElementList_testIteratorNext());
		printTest("removeIndexZeroFromTwoElementList_testContainsOne", removeIndexZeroFromTwoElementList_testContainsOne());
		printTest("removeIndexZeroFromTwoElementList_testContainsTwo", removeIndexZeroFromTwoElementList_testContainsTwo());
		printTest("removeIndexZeroFromTwoElementList_testRemoveElementOne", removeIndexZeroFromTwoElementList_testRemoveElementOne());
		printTest("removeIndexZeroFromTwoElementList_testRemoveElementTwo", removeIndexZeroFromTwoElementList_testRemoveElementTwo());
		printTest("removeIndexZeroFromTwoElementList_testAddAfterOne", removeIndexZeroFromTwoElementList_testAddAfterOne());
		printTest("removeIndexZeroFromTwoElementList_testAddAfterTwo", removeIndexZeroFromTwoElementList_testAddAfterTwo());
		printTest("removeIndexZeroFromTwoElementList_testToString", removeIndexZeroFromTwoElementList_testToString());
		printTest("removeIndexZeroFromTwoElementList_testAddIndexZero", removeIndexZeroFromTwoElementList_testAddIndexZero());
		printTest("removeIndexZeroFromTwoElementList_testAddIndexOne", removeIndexZeroFromTwoElementList_testAddIndexOne());
		printTest("removeIndexZeroFromTwoElementList_testAddIndexTwo", removeIndexZeroFromTwoElementList_testAddIndexTwo());
		printTest("removeIndexZeroFromTwoElementList_testSetIndexZero", removeIndexZeroFromTwoElementList_testSetIndexZero());
		printTest("removeIndexZeroFromTwoElementList_testSetIndexOne", removeIndexZeroFromTwoElementList_testSetIndexOne());
		printTest("removeIndexZeroFromTwoElementList_testAdd", removeIndexZeroFromTwoElementList_testAdd());
		printTest("removeIndexZeroFromTwoElementList_testGetZero", removeIndexZeroFromTwoElementList_testGetZero());
		printTest("removeIndexZeroFromTwoElementList_testGetOne", removeIndexZeroFromTwoElementList_testGetOne());
		printTest("removeIndexZeroFromTwoElementList_testIndexOfA", removeIndexZeroFromTwoElementList_testIndexOfA());
		printTest("removeIndexZeroFromTwoElementList_testIndexOfB", removeIndexZeroFromTwoElementList_testIndexOfB());
		printTest("removeIndexZeroFromTwoElementList_testRemoveIndexZero", removeIndexZeroFromTwoElementList_testRemoveIndexZero());
		printTest("removeIndexZeroFromTwoElementList_testRemoveIndexOne", removeIndexZeroFromTwoElementList_testRemoveIndexOne());
		
		// 30- Tests ON [A,B] -> remove(1) -> [A]
		printTest("removeIndexOneFromTwoElementList_testAddToFront", removeIndexOneFromTwoElementList_testAddToFront());
		printTest("removeIndexOneFromTwoElementList_testAddToRear", removeIndexOneFromTwoElementList_testAddToRear());
		printTest("removeIndexOneFromTwoElementList_testRemoveFirst", removeIndexOneFromTwoElementList_testRemoveFirst());
		printTest("removeIndexOneFromTwoElementList_testRemoveLast", removeIndexOneFromTwoElementList_testRemoveLast());
		printTest("removeIndexOneFromTwoElementList_testFirst", removeIndexOneFromTwoElementList_testFirst());
		printTest("removeIndexOneFromTwoElementList_testLast", removeIndexOneFromTwoElementList_testLast());
		printTest("removeIndexOneFromTwoElementList_testIsEmpty", removeIndexOneFromTwoElementList_testIsEmpty());
		printTest("removeIndexOneFromTwoElementList_testSize", removeIndexOneFromTwoElementList_testSize());
		printTest("removeIndexOneFromTwoElementList_testIterator", removeIndexOneFromTwoElementList_testIterator());
		printTest("removeIndexOneFromTwoElementList_testIteratorHasNext", removeIndexOneFromTwoElementList_testIteratorHasNext());
		printTest("removeIndexOneFromTwoElementList_testIteratorNext", removeIndexOneFromTwoElementList_testIteratorNext());
		printTest("removeIndexOneFromTwoElementList_testContainsOne", removeIndexOneFromTwoElementList_testContainsOne());
		printTest("removeIndexOneFromTwoElementList_testContainsTwo", removeIndexOneFromTwoElementList_testContainsTwo());
		printTest("removeIndexOneFromTwoElementList_testRemoveElementOne", removeIndexOneFromTwoElementList_testRemoveElementOne());
		printTest("removeIndexOneFromTwoElementList_testRemoveElementTwo", removeIndexOneFromTwoElementList_testRemoveElementTwo());
		printTest("removeIndexOneFromTwoElementList_testAddAfterOne", removeIndexOneFromTwoElementList_testAddAfterOne());
		printTest("removeIndexOneFromTwoElementList_testAddAfterTwo", removeIndexOneFromTwoElementList_testAddAfterTwo());
		printTest("removeIndexOneFromTwoElementList_testToString", removeIndexOneFromTwoElementList_testToString());
		printTest("removeIndexOneFromTwoElementList_testAddIndexZero", removeIndexOneFromTwoElementList_testAddIndexZero());
		printTest("removeIndexOneFromTwoElementList_testAddIndexOne", removeIndexOneFromTwoElementList_testAddIndexOne());
		printTest("removeIndexOneFromTwoElementList_testAddIndexTwo", removeIndexOneFromTwoElementList_testAddIndexTwo());
		printTest("removeIndexOneFromTwoElementList_testSetIndexZero", removeIndexOneFromTwoElementList_testSetIndexZero());
		printTest("removeIndexOneFromTwoElementList_testSetIndexOne", removeIndexOneFromTwoElementList_testSetIndexOne());
		printTest("removeIndexOneFromTwoElementList_testAdd", removeIndexOneFromTwoElementList_testAdd());
		printTest("removeIndexOneFromTwoElementList_testGetZero", removeIndexOneFromTwoElementList_testGetZero());
		printTest("removeIndexOneFromTwoElementList_testGetOne", removeIndexOneFromTwoElementList_testGetOne());
		printTest("removeIndexOneFromTwoElementList_testIndexOfA", removeIndexOneFromTwoElementList_testIndexOfA());
		printTest("removeIndexOneFromTwoElementList_testIndexOfB", removeIndexOneFromTwoElementList_testIndexOfB());
		printTest("removeIndexOneFromTwoElementList_testRemoveIndexZero", removeIndexOneFromTwoElementList_testRemoveIndexZero());
		printTest("removeIndexOneFromTwoElementList_testRemoveIndexOne", removeIndexOneFromTwoElementList_testRemoveIndexOne());
		
		// 31- Tests ON [A,B] -> set(0,C) -> [C,B]
		printTest("setIndexZeroFromTwoElementList_testAddToFront", setIndexZeroFromTwoElementList_testAddToFront());
		printTest("setIndexZeroFromTwoElementList_testAddToRear", setIndexZeroFromTwoElementList_testAddToRear());
		printTest("setIndexZeroFromTwoElementList_testRemoveFirst", setIndexZeroFromTwoElementList_testRemoveFirst());
		printTest("setIndexZeroFromTwoElementList_testRemoveLast", setIndexZeroFromTwoElementList_testRemoveLast());
		printTest("setIndexZeroFromTwoElementList_testFirst", setIndexZeroFromTwoElementList_testFirst());
		printTest("setIndexZeroFromTwoElementList_testLast", setIndexZeroFromTwoElementList_testLast());
		printTest("setIndexZeroFromTwoElementList_testIsEmpty", setIndexZeroFromTwoElementList_testIsEmpty());
		printTest("setIndexZeroFromTwoElementList_testSize", setIndexZeroFromTwoElementList_testSize());
		printTest("setIndexZeroFromTwoElementList_testIterator", setIndexZeroFromTwoElementList_testIterator());
		printTest("setIndexZeroFromTwoElementList_testIteratorHasNext", setIndexZeroFromTwoElementList_testIteratorHasNext());
		printTest("setIndexZeroFromTwoElementList_testIteratorNext", setIndexZeroFromTwoElementList_testIteratorNext());
		printTest("setIndexZeroFromTwoElementList_testContainsOne", setIndexZeroFromTwoElementList_testContainsOne());
		printTest("setIndexZeroFromTwoElementList_testContainsTwo", setIndexZeroFromTwoElementList_testContainsTwo());
		printTest("setIndexZeroFromTwoElementList_testContainsThree", setIndexZeroFromTwoElementList_testContainsThree());
		printTest("setIndexZeroFromTwoElementList_testRemoveElementOne", setIndexZeroFromTwoElementList_testRemoveElementOne());
		printTest("setIndexZeroFromTwoElementList_testRemoveElementTwo", setIndexZeroFromTwoElementList_testRemoveElementTwo());
		printTest("setIndexZeroFromTwoElementList_testRemoveElementThree", setIndexZeroFromTwoElementList_testRemoveElementThree());
		printTest("setIndexZeroFromTwoElementList_testAddAfterOne", setIndexZeroFromTwoElementList_testAddAfterOne());
		printTest("setIndexZeroFromTwoElementList_testAddAfterTwo", setIndexZeroFromTwoElementList_testAddAfterTwo());
		printTest("setIndexZeroFromTwoElementList_testAddAfterThree", setIndexZeroFromTwoElementList_testAddAfterThree());
		printTest("setIndexZeroFromTwoElementList_testToString", setIndexZeroFromTwoElementList_testToString());
		printTest("setIndexZeroFromTwoElementList_testAddIndexZero", setIndexZeroFromTwoElementList_testAddIndexZero());
		printTest("setIndexZeroFromTwoElementList_testAddIndexOne", setIndexZeroFromTwoElementList_testAddIndexOne());
		printTest("setIndexZeroFromTwoElementList_testAddIndexTwo", setIndexZeroFromTwoElementList_testAddIndexTwo());
		printTest("setIndexZeroFromTwoElementList_testAddIndexThree", setIndexZeroFromTwoElementList_testAddIndexThree());
		printTest("setIndexZeroFromTwoElementList_testSetIndexZero", setIndexZeroFromTwoElementList_testSetIndexZero());
		printTest("setIndexZeroFromTwoElementList_testSetIndexOne", setIndexZeroFromTwoElementList_testSetIndexOne());
		printTest("setIndexZeroFromTwoElementList_testSetIndexTwo", setIndexZeroFromTwoElementList_testSetIndexTwo());	
		printTest("setIndexZeroFromTwoElementList_testAdd", setIndexZeroFromTwoElementList_testAdd());
		printTest("setIndexZeroFromTwoElementList_testGetZero", setIndexZeroFromTwoElementList_testGetZero());
		printTest("setIndexZeroFromTwoElementList_testGetOne", setIndexZeroFromTwoElementList_testGetOne());
		printTest("setIndexZeroFromTwoElementList_testGetTwo", setIndexZeroFromTwoElementList_testGetTwo());
		printTest("setIndexZeroFromTwoElementList_testIndexOfA", setIndexZeroFromTwoElementList_testIndexOfA());
		printTest("setIndexZeroFromTwoElementList_testIndexOfB", setIndexZeroFromTwoElementList_testIndexOfB());
		printTest("setIndexZeroFromTwoElementList_testIndexOfC", setIndexZeroFromTwoElementList_testIndexOfC());
		printTest("setIndexZeroFromTwoElementList_testRemoveIndexZero", setIndexZeroFromTwoElementList_testRemoveIndexZero());
		printTest("setIndexZeroFromTwoElementList_testRemoveIndexOne", setIndexZeroFromTwoElementList_testRemoveIndexOne());
		printTest("setIndexZeroFromTwoElementList_testRemoveIndexTwo", setIndexZeroFromTwoElementList_testRemoveIndexTwo());
		
		// 32- Tests ON [A,B] -> set(1,C) -> [A,C]
		printTest("setIndexOneFromTwoElementList_testAddToFront", setIndexOneFromTwoElementList_testAddToFront());
		printTest("setIndexOneFromTwoElementList_testAddToRear", setIndexOneFromTwoElementList_testAddToRear());
		printTest("setIndexOneFromTwoElementList_testRemoveFirst", setIndexOneFromTwoElementList_testRemoveFirst());
		printTest("setIndexOneFromTwoElementList_testRemoveLast", setIndexOneFromTwoElementList_testRemoveLast());
		printTest("setIndexOneFromTwoElementList_testFirst", setIndexOneFromTwoElementList_testFirst());
		printTest("setIndexOneFromTwoElementList_testLast", setIndexOneFromTwoElementList_testLast());
		printTest("setIndexOneFromTwoElementList_testIsEmpty", setIndexOneFromTwoElementList_testIsEmpty());
		printTest("setIndexOneFromTwoElementList_testSize", setIndexOneFromTwoElementList_testSize());
		printTest("setIndexOneFromTwoElementList_testIterator", setIndexOneFromTwoElementList_testIterator());
		printTest("setIndexOneFromTwoElementList_testIteratorHasNext", setIndexOneFromTwoElementList_testIteratorHasNext());
		printTest("setIndexOneFromTwoElementList_testIteratorNext", setIndexOneFromTwoElementList_testIteratorNext());
		printTest("setIndexOneFromTwoElementList_testContainsOne", setIndexOneFromTwoElementList_testContainsOne());
		printTest("setIndexOneFromTwoElementList_testContainsTwo", setIndexOneFromTwoElementList_testContainsTwo());
		printTest("setIndexOneFromTwoElementList_testContainsThree", setIndexOneFromTwoElementList_testContainsThree());
		printTest("setIndexOneFromTwoElementList_testRemoveElementOne", setIndexOneFromTwoElementList_testRemoveElementOne());
		printTest("setIndexOneFromTwoElementList_testRemoveElementTwo", setIndexOneFromTwoElementList_testRemoveElementTwo());
		printTest("setIndexOneFromTwoElementList_testRemoveElementThree", setIndexOneFromTwoElementList_testRemoveElementThree());
		printTest("setIndexOneFromTwoElementList_testAddAfterOne", setIndexOneFromTwoElementList_testAddAfterOne());
		printTest("setIndexOneFromTwoElementList_testAddAfterTwo", setIndexOneFromTwoElementList_testAddAfterTwo());
		printTest("setIndexOneFromTwoElementList_testAddAfterThree", setIndexOneFromTwoElementList_testAddAfterThree());
		printTest("setIndexOneFromTwoElementList_testToString", setIndexOneFromTwoElementList_testToString());
		printTest("setIndexOneFromTwoElementList_testAddIndexZero", setIndexOneFromTwoElementList_testAddIndexZero());
		printTest("setIndexOneFromTwoElementList_testAddIndexOne", setIndexOneFromTwoElementList_testAddIndexOne());
		printTest("setIndexOneFromTwoElementList_testAddIndexTwo", setIndexOneFromTwoElementList_testAddIndexTwo());
		printTest("setIndexOneFromTwoElementList_testAddIndexThree", setIndexOneFromTwoElementList_testAddIndexThree());
		printTest("setIndexOneFromTwoElementList_testSetIndexZero", setIndexOneFromTwoElementList_testSetIndexZero());
		printTest("setIndexOneFromTwoElementList_testSetIndexOne", setIndexOneFromTwoElementList_testSetIndexOne());
		printTest("setIndexOneFromTwoElementList_testSetIndexTwo", setIndexOneFromTwoElementList_testSetIndexTwo());	
		printTest("setIndexOneFromTwoElementList_testAdd", setIndexOneFromTwoElementList_testAdd());
		printTest("setIndexOneFromTwoElementList_testGetZero", setIndexOneFromTwoElementList_testGetZero());
		printTest("setIndexOneFromTwoElementList_testGetOne", setIndexOneFromTwoElementList_testGetOne());
		printTest("setIndexOneFromTwoElementList_testGetTwo", setIndexOneFromTwoElementList_testGetTwo());
		printTest("setIndexOneFromTwoElementList_testIndexOfA", setIndexOneFromTwoElementList_testIndexOfA());
		printTest("setIndexOneFromTwoElementList_testIndexOfB", setIndexOneFromTwoElementList_testIndexOfB());
		printTest("setIndexOneFromTwoElementList_testIndexOfC", setIndexOneFromTwoElementList_testIndexOfC());
		printTest("setIndexOneFromTwoElementList_testRemoveIndexZero", setIndexOneFromTwoElementList_testRemoveIndexZero());
		printTest("setIndexOneFromTwoElementList_testRemoveIndexOne", setIndexOneFromTwoElementList_testRemoveIndexOne());
		printTest("setIndexOneFromTwoElementList_testRemoveIndexTwo", setIndexOneFromTwoElementList_testRemoveIndexTwo());	
		
		// 33- Tests ON [A,B] -> add(C) -> [A,B,C]
		printTest("addElementFromTwoElementList_testAddToFront", addElementFromTwoElementList_testAddToFront());
		printTest("addElementFromTwoElementList_testAddToRear", addElementFromTwoElementList_testAddToRear());
		printTest("addElementFromTwoElementList_testRemoveFirst", addElementFromTwoElementList_testRemoveFirst());
		printTest("addElementFromTwoElementList_testRemoveLast", addElementFromTwoElementList_testRemoveLast());
		printTest("addElementFromTwoElementList_testFirst", addElementFromTwoElementList_testFirst());
		printTest("addElementFromTwoElementList_testLast", addElementFromTwoElementList_testLast());
		printTest("addElementFromTwoElementList_testIsEmpty", addElementFromTwoElementList_testIsEmpty());
		printTest("addElementFromTwoElementList_testSize", addElementFromTwoElementList_testSize());
		printTest("addElementFromTwoElementList_testIterator", addElementFromTwoElementList_testIterator());
		printTest("addElementFromTwoElementList_testIteratorHasNext", addElementFromTwoElementList_testIteratorHasNext());
		printTest("addElementFromTwoElementList_testIteratorNext", addElementFromTwoElementList_testIteratorNext());
		printTest("addElementFromTwoElementList_testContainsOne", addElementFromTwoElementList_testContainsOne());
		printTest("addElementFromTwoElementList_testContainsTwo", addElementFromTwoElementList_testContainsTwo());
		printTest("addElementFromTwoElementList_testContainsThree", addElementFromTwoElementList_testContainsThree());
		printTest("addElementFromTwoElementList_testContainsFour", addElementFromTwoElementList_testContainsFour());
		printTest("addElementFromTwoElementList_testRemoveElementOne", addElementFromTwoElementList_testRemoveElementOne());
		printTest("addElementFromTwoElementList_testRemoveElementTwo", addElementFromTwoElementList_testRemoveElementTwo());
		printTest("addElementFromTwoElementList_testRemoveElementThree", addElementFromTwoElementList_testRemoveElementThree());
		printTest("addElementFromTwoElementList_testRemoveElementFour", addElementFromTwoElementList_testRemoveElementFour());
		printTest("addElementFromTwoElementList_testAddAfterOne", addElementFromTwoElementList_testAddAfterOne());
		printTest("addElementFromTwoElementList_testAddAfterTwo", addElementFromTwoElementList_testAddAfterTwo());
		printTest("addElementFromTwoElementList_testAddAfterThree", addElementFromTwoElementList_testAddAfterThree());
		printTest("addElementFromTwoElementList_testAddAfterFour", addElementFromTwoElementList_testAddAfterFour());
		printTest("addElementFromTwoElementList_testToString", addElementFromTwoElementList_testToString());
		printTest("addElementFromTwoElementList_testAddIndexZero", addElementFromTwoElementList_testAddIndexZero());
		printTest("addElementFromTwoElementList_testAddIndexOne", addElementFromTwoElementList_testAddIndexOne());
		printTest("addElementFromTwoElementList_testAddIndexTwo", addElementFromTwoElementList_testAddIndexTwo());
		printTest("addElementFromTwoElementList_testAddIndexThree", addElementFromTwoElementList_testAddIndexThree());
		printTest("addElementFromTwoElementList_testAddIndexFour", addElementFromTwoElementList_testAddIndexFour());
		printTest("addElementFromTwoElementList_testSetIndexZero", addElementFromTwoElementList_testSetIndexZero());
		printTest("addElementFromTwoElementList_testSetIndexOne", addElementFromTwoElementList_testSetIndexOne());
		printTest("addElementFromTwoElementList_testSetIndexTwo", addElementFromTwoElementList_testSetIndexTwo());	
		printTest("addElementFromTwoElementList_testSetIndexThree", addElementFromTwoElementList_testSetIndexThree());	
		printTest("addElementFromTwoElementList_testAdd", addElementFromTwoElementList_testAdd());
		printTest("addElementFromTwoElementList_testGetZero", addElementFromTwoElementList_testGetZero());
		printTest("addElementFromTwoElementList_testGetOne", addElementFromTwoElementList_testGetOne());
		printTest("addElementFromTwoElementList_testGetTwo", addElementFromTwoElementList_testGetTwo());
		printTest("addElementFromTwoElementList_testGetThree", addElementFromTwoElementList_testGetThree());
		printTest("addElementFromTwoElementList_testIndexOfA", addElementFromTwoElementList_testIndexOfA());
		printTest("addElementFromTwoElementList_testIndexOfB", addElementFromTwoElementList_testIndexOfB());
		printTest("addElementFromTwoElementList_testIndexOfC", addElementFromTwoElementList_testIndexOfC());
		printTest("addElementFromTwoElementList_testIndexOfD", addElementFromTwoElementList_testIndexOfD());
		printTest("addElementFromTwoElementList_testRemoveIndexZero", addElementFromTwoElementList_testRemoveIndexZero());
		printTest("addElementFromTwoElementList_testRemoveIndexOne", addElementFromTwoElementList_testRemoveIndexOne());
		printTest("addElementFromTwoElementList_testRemoveIndexTwo", addElementFromTwoElementList_testRemoveIndexTwo());
		printTest("addElementFromTwoElementList_testRemoveIndexThree", addElementFromTwoElementList_testRemoveIndexThree());
		
		// 34- Tests ON [A,B] -> add(0,C) -> [C,A,B]	
		printTest("addIndexZeroFromTwoElementList_testAddToFront", addIndexZeroFromTwoElementList_testAddToFront());
		printTest("addIndexZeroFromTwoElementList_testAddToRear", addIndexZeroFromTwoElementList_testAddToRear());
		printTest("addIndexZeroFromTwoElementList_testRemoveFirst", addIndexZeroFromTwoElementList_testRemoveFirst());
		printTest("addIndexZeroFromTwoElementList_testRemoveLast", addIndexZeroFromTwoElementList_testRemoveLast());
		printTest("addIndexZeroFromTwoElementList_testFirst", addIndexZeroFromTwoElementList_testFirst());
		printTest("addIndexZeroFromTwoElementList_testLast", addIndexZeroFromTwoElementList_testLast());
		printTest("addIndexZeroFromTwoElementList_testIsEmpty", addIndexZeroFromTwoElementList_testIsEmpty());
		printTest("addIndexZeroFromTwoElementList_testSize", addIndexZeroFromTwoElementList_testSize());
		printTest("addIndexZeroFromTwoElementList_testIterator", addIndexZeroFromTwoElementList_testIterator());
		printTest("addIndexZeroFromTwoElementList_testIteratorHasNext", addIndexZeroFromTwoElementList_testIteratorHasNext());
		printTest("addIndexZeroFromTwoElementList_testIteratorNext", addIndexZeroFromTwoElementList_testIteratorNext());
		printTest("addIndexZeroFromTwoElementList_testContainsOne", addIndexZeroFromTwoElementList_testContainsOne());
		printTest("addIndexZeroFromTwoElementList_testContainsTwo", addIndexZeroFromTwoElementList_testContainsTwo());
		printTest("addIndexZeroFromTwoElementList_testContainsThree", addIndexZeroFromTwoElementList_testContainsThree());
		printTest("addIndexZeroFromTwoElementList_testContainsFour", addIndexZeroFromTwoElementList_testContainsFour());
		printTest("addIndexZeroFromTwoElementList_testRemoveElementOne", addIndexZeroFromTwoElementList_testRemoveElementOne());
		printTest("addIndexZeroFromTwoElementList_testRemoveElementTwo", addIndexZeroFromTwoElementList_testRemoveElementTwo());
		printTest("addIndexZeroFromTwoElementList_testRemoveElementThree", addIndexZeroFromTwoElementList_testRemoveElementThree());
		printTest("addIndexZeroFromTwoElementList_testRemoveElementFour", addIndexZeroFromTwoElementList_testRemoveElementFour());
		printTest("addIndexZeroFromTwoElementList_testAddAfterOne", addIndexZeroFromTwoElementList_testAddAfterOne());
		printTest("addIndexZeroFromTwoElementList_testAddAfterTwo", addIndexZeroFromTwoElementList_testAddAfterTwo());
		printTest("addIndexZeroFromTwoElementList_testAddAfterThree", addIndexZeroFromTwoElementList_testAddAfterThree());
		printTest("addIndexZeroFromTwoElementList_testAddAfterFour", addIndexZeroFromTwoElementList_testAddAfterFour());
		printTest("addIndexZeroFromTwoElementList_testToString", addIndexZeroFromTwoElementList_testToString());
		printTest("addIndexZeroFromTwoElementList_testAddIndexZero", addIndexZeroFromTwoElementList_testAddIndexZero());
		printTest("addIndexZeroFromTwoElementList_testAddIndexOne", addIndexZeroFromTwoElementList_testAddIndexOne());
		printTest("addIndexZeroFromTwoElementList_testAddIndexTwo", addIndexZeroFromTwoElementList_testAddIndexTwo());
		printTest("addIndexZeroFromTwoElementList_testAddIndexThree", addIndexZeroFromTwoElementList_testAddIndexThree());
		printTest("addIndexZeroFromTwoElementList_testAddIndexFour", addIndexZeroFromTwoElementList_testAddIndexFour());
		printTest("addIndexZeroFromTwoElementList_testSetIndexZero", addIndexZeroFromTwoElementList_testSetIndexZero());
		printTest("addIndexZeroFromTwoElementList_testSetIndexOne", addIndexZeroFromTwoElementList_testSetIndexOne());
		printTest("addIndexZeroFromTwoElementList_testSetIndexTwo", addIndexZeroFromTwoElementList_testSetIndexTwo());	
		printTest("addIndexZeroFromTwoElementList_testSetIndexThree", addIndexZeroFromTwoElementList_testSetIndexThree());	
		printTest("addIndexZeroFromTwoElementList_testAdd", addIndexZeroFromTwoElementList_testAdd());
		printTest("addIndexZeroFromTwoElementList_testGetZero", addIndexZeroFromTwoElementList_testGetZero());
		printTest("addIndexZeroFromTwoElementList_testGetOne", addIndexZeroFromTwoElementList_testGetOne());
		printTest("addIndexZeroFromTwoElementList_testGetTwo", addIndexZeroFromTwoElementList_testGetTwo());
		printTest("addIndexZeroFromTwoElementList_testGetThree", addIndexZeroFromTwoElementList_testGetThree());
		printTest("addIndexZeroFromTwoElementList_testIndexOfA", addIndexZeroFromTwoElementList_testIndexOfA());
		printTest("addIndexZeroFromTwoElementList_testIndexOfB", addIndexZeroFromTwoElementList_testIndexOfB());
		printTest("addIndexZeroFromTwoElementList_testIndexOfC", addIndexZeroFromTwoElementList_testIndexOfC());
		printTest("addIndexZeroFromTwoElementList_testIndexOfD", addIndexZeroFromTwoElementList_testIndexOfD());
		printTest("addIndexZeroFromTwoElementList_testRemoveIndexZero", addIndexZeroFromTwoElementList_testRemoveIndexZero());
		printTest("addIndexZeroFromTwoElementList_testRemoveIndexOne", addIndexZeroFromTwoElementList_testRemoveIndexOne());
		printTest("addIndexZeroFromTwoElementList_testRemoveIndexTwo", addIndexZeroFromTwoElementList_testRemoveIndexTwo());
		printTest("addIndexZeroFromTwoElementList_testRemoveIndexThree", addIndexZeroFromTwoElementList_testRemoveIndexThree());			
		
		// 35- Tests ON [A,B] -> add(1,C) -> [A,C,B]
		printTest("addIndexOneFromTwoElementList_testAddToFront", addIndexOneFromTwoElementList_testAddToFront());
		printTest("addIndexOneFromTwoElementList_testAddToRear", addIndexOneFromTwoElementList_testAddToRear());
		printTest("addIndexOneFromTwoElementList_testRemoveFirst", addIndexOneFromTwoElementList_testRemoveFirst());
		printTest("addIndexOneFromTwoElementList_testRemoveLast", addIndexOneFromTwoElementList_testRemoveLast());
		printTest("addIndexOneFromTwoElementList_testFirst", addIndexOneFromTwoElementList_testFirst());
		printTest("addIndexOneFromTwoElementList_testLast", addIndexOneFromTwoElementList_testLast());
		printTest("addIndexOneFromTwoElementList_testIsEmpty", addIndexOneFromTwoElementList_testIsEmpty());
		printTest("addIndexOneFromTwoElementList_testSize", addIndexOneFromTwoElementList_testSize());
		printTest("addIndexOneFromTwoElementList_testIterator", addIndexOneFromTwoElementList_testIterator());
		printTest("addIndexOneFromTwoElementList_testIteratorHasNext", addIndexOneFromTwoElementList_testIteratorHasNext());
		printTest("addIndexOneFromTwoElementList_testIteratorNext", addIndexOneFromTwoElementList_testIteratorNext());
		printTest("addIndexOneFromTwoElementList_testContainsOne", addIndexOneFromTwoElementList_testContainsOne());
		printTest("addIndexOneFromTwoElementList_testContainsTwo", addIndexOneFromTwoElementList_testContainsTwo());
		printTest("addIndexOneFromTwoElementList_testContainsThree", addIndexOneFromTwoElementList_testContainsThree());
		printTest("addIndexOneFromTwoElementList_testContainsFour", addIndexOneFromTwoElementList_testContainsFour());
		printTest("addIndexOneFromTwoElementList_testRemoveElementOne", addIndexOneFromTwoElementList_testRemoveElementOne());
		printTest("addIndexOneFromTwoElementList_testRemoveElementTwo", addIndexOneFromTwoElementList_testRemoveElementTwo());
		printTest("addIndexOneFromTwoElementList_testRemoveElementThree", addIndexOneFromTwoElementList_testRemoveElementThree());
		printTest("addIndexOneFromTwoElementList_testRemoveElementFour", addIndexOneFromTwoElementList_testRemoveElementFour());
		printTest("addIndexOneFromTwoElementList_testAddAfterOne", addIndexOneFromTwoElementList_testAddAfterOne());
		printTest("addIndexOneFromTwoElementList_testAddAfterTwo", addIndexOneFromTwoElementList_testAddAfterTwo());
		printTest("addIndexOneFromTwoElementList_testAddAfterThree", addIndexOneFromTwoElementList_testAddAfterThree());
		printTest("addIndexOneFromTwoElementList_testAddAfterFour", addIndexOneFromTwoElementList_testAddAfterFour());
		printTest("addIndexOneFromTwoElementList_testToString", addIndexOneFromTwoElementList_testToString());
		printTest("addIndexOneFromTwoElementList_testAddIndexZero", addIndexOneFromTwoElementList_testAddIndexZero());
		printTest("addIndexOneFromTwoElementList_testAddIndexOne", addIndexOneFromTwoElementList_testAddIndexOne());
		printTest("addIndexOneFromTwoElementList_testAddIndexTwo", addIndexOneFromTwoElementList_testAddIndexTwo());
		printTest("addIndexOneFromTwoElementList_testAddIndexThree", addIndexOneFromTwoElementList_testAddIndexThree());
		printTest("addIndexOneFromTwoElementList_testAddIndexFour", addIndexOneFromTwoElementList_testAddIndexFour());
		printTest("addIndexOneFromTwoElementList_testSetIndexZero", addIndexOneFromTwoElementList_testSetIndexZero());
		printTest("addIndexOneFromTwoElementList_testSetIndexOne", addIndexOneFromTwoElementList_testSetIndexOne());
		printTest("addIndexOneFromTwoElementList_testSetIndexTwo", addIndexOneFromTwoElementList_testSetIndexTwo());	
		printTest("addIndexOneFromTwoElementList_testSetIndexThree", addIndexOneFromTwoElementList_testSetIndexThree());	
		printTest("addIndexOneFromTwoElementList_testAdd", addIndexOneFromTwoElementList_testAdd());
		printTest("addIndexOneFromTwoElementList_testGetZero", addIndexOneFromTwoElementList_testGetZero());
		printTest("addIndexOneFromTwoElementList_testGetOne", addIndexOneFromTwoElementList_testGetOne());
		printTest("addIndexOneFromTwoElementList_testGetTwo", addIndexOneFromTwoElementList_testGetTwo());
		printTest("addIndexOneFromTwoElementList_testGetThree", addIndexOneFromTwoElementList_testGetThree());
		printTest("addIndexOneFromTwoElementList_testIndexOfA", addIndexOneFromTwoElementList_testIndexOfA());
		printTest("addIndexOneFromTwoElementList_testIndexOfB", addIndexOneFromTwoElementList_testIndexOfB());
		printTest("addIndexOneFromTwoElementList_testIndexOfC", addIndexOneFromTwoElementList_testIndexOfC());
		printTest("addIndexOneFromTwoElementList_testIndexOfD", addIndexOneFromTwoElementList_testIndexOfD());
		printTest("addIndexOneFromTwoElementList_testRemoveIndexZero", addIndexOneFromTwoElementList_testRemoveIndexZero());
		printTest("addIndexOneFromTwoElementList_testRemoveIndexOne", addIndexOneFromTwoElementList_testRemoveIndexOne());
		printTest("addIndexOneFromTwoElementList_testRemoveIndexTwo", addIndexOneFromTwoElementList_testRemoveIndexTwo());
		printTest("addIndexOneFromTwoElementList_testRemoveIndexThree", addIndexOneFromTwoElementList_testRemoveIndexThree());	
		
		// 36- Tests ON [A,B] -> add (2,C) -> [A,B,C]
		printTest("addIndexTwoFromTwoElementList_testAddToFront", addIndexTwoFromTwoElementList_testAddToFront());
		printTest("addIndexTwoFromTwoElementList_testAddToRear", addIndexTwoFromTwoElementList_testAddToRear());
		printTest("addIndexTwoFromTwoElementList_testRemoveFirst", addIndexTwoFromTwoElementList_testRemoveFirst());
		printTest("addIndexTwoFromTwoElementList_testRemoveLast", addIndexTwoFromTwoElementList_testRemoveLast());
		printTest("addIndexTwoFromTwoElementList_testFirst", addIndexTwoFromTwoElementList_testFirst());
		printTest("addIndexTwoFromTwoElementList_testLast", addIndexTwoFromTwoElementList_testLast());
		printTest("addIndexTwoFromTwoElementList_testIsEmpty", addIndexTwoFromTwoElementList_testIsEmpty());
		printTest("addIndexTwoFromTwoElementList_testSize", addIndexTwoFromTwoElementList_testSize());
		printTest("addIndexTwoFromTwoElementList_testIterator", addIndexTwoFromTwoElementList_testIterator());
		printTest("addIndexTwoFromTwoElementList_testIteratorHasNext", addIndexTwoFromTwoElementList_testIteratorHasNext());
		printTest("addIndexTwoFromTwoElementList_testIteratorNext", addIndexTwoFromTwoElementList_testIteratorNext());
		printTest("addIndexTwoFromTwoElementList_testContainsOne", addIndexTwoFromTwoElementList_testContainsOne());
		printTest("addIndexTwoFromTwoElementList_testContainsTwo", addIndexTwoFromTwoElementList_testContainsTwo());
		printTest("addIndexTwoFromTwoElementList_testContainsThree", addIndexTwoFromTwoElementList_testContainsThree());
		printTest("addIndexTwoFromTwoElementList_testContainsFour", addIndexTwoFromTwoElementList_testContainsFour());
		printTest("addIndexTwoFromTwoElementList_testRemoveElementOne", addIndexTwoFromTwoElementList_testRemoveElementOne());
		printTest("addIndexTwoFromTwoElementList_testRemoveElementTwo", addIndexTwoFromTwoElementList_testRemoveElementTwo());
		printTest("addIndexTwoFromTwoElementList_testRemoveElementThree", addIndexTwoFromTwoElementList_testRemoveElementThree());
		printTest("addIndexTwoFromTwoElementList_testRemoveElementFour", addIndexTwoFromTwoElementList_testRemoveElementFour());
		printTest("addIndexTwoFromTwoElementList_testAddAfterOne", addIndexTwoFromTwoElementList_testAddAfterOne());
		printTest("addIndexTwoFromTwoElementList_testAddAfterTwo", addIndexTwoFromTwoElementList_testAddAfterTwo());
		printTest("addIndexTwoFromTwoElementList_testAddAfterThree", addIndexTwoFromTwoElementList_testAddAfterThree());
		printTest("addIndexTwoFromTwoElementList_testAddAfterFour", addIndexTwoFromTwoElementList_testAddAfterFour());
		printTest("addIndexTwoFromTwoElementList_testToString", addIndexTwoFromTwoElementList_testToString());
		printTest("addIndexTwoFromTwoElementList_testAddIndexZero", addIndexTwoFromTwoElementList_testAddIndexZero());
		printTest("addIndexTwoFromTwoElementList_testAddIndexOne", addIndexTwoFromTwoElementList_testAddIndexOne());
		printTest("addIndexTwoFromTwoElementList_testAddIndexTwo", addIndexTwoFromTwoElementList_testAddIndexTwo());
		printTest("addIndexTwoFromTwoElementList_testAddIndexThree", addIndexTwoFromTwoElementList_testAddIndexThree());
		printTest("addIndexTwoFromTwoElementList_testAddIndexFour", addIndexTwoFromTwoElementList_testAddIndexFour());
		printTest("addIndexTwoFromTwoElementList_testSetIndexZero", addIndexTwoFromTwoElementList_testSetIndexZero());
		printTest("addIndexTwoFromTwoElementList_testSetIndexOne", addIndexTwoFromTwoElementList_testSetIndexOne());
		printTest("addIndexTwoFromTwoElementList_testSetIndexTwo", addIndexTwoFromTwoElementList_testSetIndexTwo());	
		printTest("addIndexTwoFromTwoElementList_testSetIndexThree", addIndexTwoFromTwoElementList_testSetIndexThree());	
		printTest("addIndexTwoFromTwoElementList_testAdd", addIndexTwoFromTwoElementList_testAdd());
		printTest("addIndexTwoFromTwoElementList_testGetZero", addIndexTwoFromTwoElementList_testGetZero());
		printTest("addIndexTwoFromTwoElementList_testGetOne", addIndexTwoFromTwoElementList_testGetOne());
		printTest("addIndexTwoFromTwoElementList_testGetTwo", addIndexTwoFromTwoElementList_testGetTwo());
		printTest("addIndexTwoFromTwoElementList_testGetThree", addIndexTwoFromTwoElementList_testGetThree());
		printTest("addIndexTwoFromTwoElementList_testIndexOfA", addIndexTwoFromTwoElementList_testIndexOfA());
		printTest("addIndexTwoFromTwoElementList_testIndexOfB", addIndexTwoFromTwoElementList_testIndexOfB());
		printTest("addIndexTwoFromTwoElementList_testIndexOfC", addIndexTwoFromTwoElementList_testIndexOfC());
		printTest("addIndexTwoFromTwoElementList_testIndexOfD", addIndexTwoFromTwoElementList_testIndexOfD());
		printTest("addIndexTwoFromTwoElementList_testRemoveIndexZero", addIndexTwoFromTwoElementList_testRemoveIndexZero());
		printTest("addIndexTwoFromTwoElementList_testRemoveIndexOne", addIndexTwoFromTwoElementList_testRemoveIndexOne());
		printTest("addIndexTwoFromTwoElementList_testRemoveIndexTwo", addIndexTwoFromTwoElementList_testRemoveIndexTwo());
		printTest("addIndexTwoFromTwoElementList_testRemoveIndexThree", addIndexTwoFromTwoElementList_testRemoveIndexThree());	
		
		// 37- Tests ON [A,B,C] -> remove(0) -> [B,C]
		printTest("removeIndexZeroFromThreeElementList_testAddToFront", removeIndexZeroFromThreeElementList_testAddToFront());
		printTest("removeIndexZeroFromThreeElementList_testAddToRear", removeIndexZeroFromThreeElementList_testAddToRear());
		printTest("removeIndexZeroFromThreeElementList_testRemoveFirst", removeIndexZeroFromThreeElementList_testRemoveFirst());
		printTest("removeIndexZeroFromThreeElementList_testRemoveLast", removeIndexZeroFromThreeElementList_testRemoveLast());
		printTest("removeIndexZeroFromThreeElementList_testFirst", removeIndexZeroFromThreeElementList_testFirst());
		printTest("removeIndexZeroFromThreeElementList_testLast", removeIndexZeroFromThreeElementList_testLast());
		printTest("removeIndexZeroFromThreeElementList_testIsEmpty", removeIndexZeroFromThreeElementList_testIsEmpty());
		printTest("removeIndexZeroFromThreeElementList_testSize", removeIndexZeroFromThreeElementList_testSize());
		printTest("removeIndexZeroFromThreeElementList_testIterator", removeIndexZeroFromThreeElementList_testIterator());
		printTest("removeIndexZeroFromThreeElementList_testIteratorHasNext", removeIndexZeroFromThreeElementList_testIteratorHasNext());
		printTest("removeIndexZeroFromThreeElementList_testIteratorNext", removeIndexZeroFromThreeElementList_testIteratorNext());
		printTest("removeIndexZeroFromThreeElementList_testContainsOne", removeIndexZeroFromThreeElementList_testContainsOne());
		printTest("removeIndexZeroFromThreeElementList_testContainsTwo", removeIndexZeroFromThreeElementList_testContainsTwo());
		printTest("removeIndexZeroFromThreeElementList_testContainsThree", removeIndexZeroFromThreeElementList_testContainsThree());
		printTest("removeIndexZeroFromThreeElementList_testRemoveElementOne", removeIndexZeroFromThreeElementList_testRemoveElementOne());
		printTest("removeIndexZeroFromThreeElementList_testRemoveElementTwo", removeIndexZeroFromThreeElementList_testRemoveElementTwo());
		printTest("removeIndexZeroFromThreeElementList_testRemoveElementThree", removeIndexZeroFromThreeElementList_testRemoveElementThree());
		printTest("removeIndexZeroFromThreeElementList_testAddAfterOne", removeIndexZeroFromThreeElementList_testAddAfterOne());
		printTest("removeIndexZeroFromThreeElementList_testAddAfterTwo", removeIndexZeroFromThreeElementList_testAddAfterTwo());
		printTest("removeIndexZeroFromThreeElementList_testAddAfterThree", removeIndexZeroFromThreeElementList_testAddAfterThree());
		printTest("removeIndexZeroFromThreeElementList_testToString", removeIndexZeroFromThreeElementList_testToString());
		printTest("removeIndexZeroFromThreeElementList_testAddIndexZero", removeIndexZeroFromThreeElementList_testAddIndexZero());
		printTest("removeIndexZeroFromThreeElementList_testAddIndexOne", removeIndexZeroFromThreeElementList_testAddIndexOne());
		printTest("removeIndexZeroFromThreeElementList_testAddIndexTwo", removeIndexZeroFromThreeElementList_testAddIndexTwo());
		printTest("removeIndexZeroFromThreeElementList_testAddIndexThree", removeIndexZeroFromThreeElementList_testAddIndexThree());
		printTest("removeIndexZeroFromThreeElementList_testSetIndexZero", removeIndexZeroFromThreeElementList_testSetIndexZero());
		printTest("removeIndexZeroFromThreeElementList_testSetIndexOne", removeIndexZeroFromThreeElementList_testSetIndexOne());
		printTest("removeIndexZeroFromThreeElementList_testSetIndexTwo", removeIndexZeroFromThreeElementList_testSetIndexTwo());	
		printTest("removeIndexZeroFromThreeElementList_testAdd", removeIndexZeroFromThreeElementList_testAdd());
		printTest("removeIndexZeroFromThreeElementList_testGetZero", removeIndexZeroFromThreeElementList_testGetZero());
		printTest("removeIndexZeroFromThreeElementList_testGetOne", removeIndexZeroFromThreeElementList_testGetOne());
		printTest("removeIndexZeroFromThreeElementList_testGetTwo", removeIndexZeroFromThreeElementList_testGetTwo());
		printTest("removeIndexZeroFromThreeElementList_testIndexOfA", removeIndexZeroFromThreeElementList_testIndexOfA());
		printTest("removeIndexZeroFromThreeElementList_testIndexOfB", removeIndexZeroFromThreeElementList_testIndexOfB());
		printTest("removeIndexZeroFromThreeElementList_testIndexOfC", removeIndexZeroFromThreeElementList_testIndexOfC());
		printTest("removeIndexZeroFromThreeElementList_testRemoveIndexZero", removeIndexZeroFromThreeElementList_testRemoveIndexZero());
		printTest("removeIndexZeroFromThreeElementList_testRemoveIndexOne", removeIndexZeroFromThreeElementList_testRemoveIndexOne());
		printTest("removeIndexZeroFromThreeElementList_testRemoveIndexTwo", removeIndexZeroFromThreeElementList_testRemoveIndexTwo());

		
		// 38- Tests ON [A,B,C] -> remove(1) -> [A,C]
		printTest("removeIndexOneFromThreeElementList_testAddToFront", removeIndexOneFromThreeElementList_testAddToFront());
		printTest("removeIndexOneFromThreeElementList_testAddToRear", removeIndexOneFromThreeElementList_testAddToRear());
		printTest("removeIndexOneFromThreeElementList_testRemoveFirst", removeIndexOneFromThreeElementList_testRemoveFirst());
		printTest("removeIndexOneFromThreeElementList_testRemoveLast", removeIndexOneFromThreeElementList_testRemoveLast());
		printTest("removeIndexOneFromThreeElementList_testFirst", removeIndexOneFromThreeElementList_testFirst());
		printTest("removeIndexOneFromThreeElementList_testLast", removeIndexOneFromThreeElementList_testLast());
		printTest("removeIndexOneFromThreeElementList_testIsEmpty", removeIndexOneFromThreeElementList_testIsEmpty());
		printTest("removeIndexOneFromThreeElementList_testSize", removeIndexOneFromThreeElementList_testSize());
		printTest("removeIndexOneFromThreeElementList_testIterator", removeIndexOneFromThreeElementList_testIterator());
		printTest("removeIndexOneFromThreeElementList_testIteratorHasNext", removeIndexOneFromThreeElementList_testIteratorHasNext());
		printTest("removeIndexOneFromThreeElementList_testIteratorNext", removeIndexOneFromThreeElementList_testIteratorNext());
		printTest("removeIndexOneFromThreeElementList_testContainsOne", removeIndexOneFromThreeElementList_testContainsOne());
		printTest("removeIndexOneFromThreeElementList_testContainsTwo", removeIndexOneFromThreeElementList_testContainsTwo());
		printTest("removeIndexOneFromThreeElementList_testContainsThree", removeIndexOneFromThreeElementList_testContainsThree());
		printTest("removeIndexOneFromThreeElementList_testRemoveElementOne", removeIndexOneFromThreeElementList_testRemoveElementOne());
		printTest("removeIndexOneFromThreeElementList_testRemoveElementTwo", removeIndexOneFromThreeElementList_testRemoveElementTwo());
		printTest("removeIndexOneFromThreeElementList_testRemoveElementThree", removeIndexOneFromThreeElementList_testRemoveElementThree());
		printTest("removeIndexOneFromThreeElementList_testAddAfterOne", removeIndexOneFromThreeElementList_testAddAfterOne());
		printTest("removeIndexOneFromThreeElementList_testAddAfterTwo", removeIndexOneFromThreeElementList_testAddAfterTwo());
		printTest("removeIndexOneFromThreeElementList_testAddAfterThree", removeIndexOneFromThreeElementList_testAddAfterThree());
		printTest("removeIndexOneFromThreeElementList_testAddIndexZero", removeIndexOneFromThreeElementList_testAddIndexZero());
		printTest("removeIndexOneFromThreeElementList_testAddIndexOne", removeIndexOneFromThreeElementList_testAddIndexOne());
		printTest("removeIndexOneFromThreeElementList_testAddIndexTwo", removeIndexOneFromThreeElementList_testAddIndexTwo());
		printTest("removeIndexOneFromThreeElementList_testAddIndexThree", removeIndexOneFromThreeElementList_testAddIndexThree());
		printTest("removeIndexOneFromThreeElementList_testSetIndexZero", removeIndexOneFromThreeElementList_testSetIndexZero());
		printTest("removeIndexOneFromThreeElementList_testSetIndexOne", removeIndexOneFromThreeElementList_testSetIndexOne());
		printTest("removeIndexOneFromThreeElementList_testSetIndexTwo", removeIndexOneFromThreeElementList_testSetIndexTwo());	
		printTest("removeIndexOneFromThreeElementList_testAdd", removeIndexOneFromThreeElementList_testAdd());
		printTest("removeIndexOneFromThreeElementList_testGetZero", removeIndexOneFromThreeElementList_testGetZero());
		printTest("removeIndexOneFromThreeElementList_testGetOne", removeIndexOneFromThreeElementList_testGetOne());
		printTest("removeIndexOneFromThreeElementList_testGetTwo", removeIndexOneFromThreeElementList_testGetTwo());
		printTest("removeIndexOneFromThreeElementList_testIndexOfA", removeIndexOneFromThreeElementList_testIndexOfA());
		printTest("removeIndexOneFromThreeElementList_testIndexOfB", removeIndexOneFromThreeElementList_testIndexOfB());
		printTest("removeIndexOneFromThreeElementList_testIndexOfC", removeIndexOneFromThreeElementList_testIndexOfC());
		printTest("removeIndexOneFromThreeElementList_testRemoveIndexZero", removeIndexOneFromThreeElementList_testRemoveIndexZero());
		printTest("removeIndexOneFromThreeElementList_testRemoveIndexOne", removeIndexOneFromThreeElementList_testRemoveIndexOne());
		printTest("removeIndexOneFromThreeElementList_testRemoveIndexTwo", removeIndexOneFromThreeElementList_testRemoveIndexTwo());
		printTest("removeIndexOneFromThreeElementList_testToString", removeIndexOneFromThreeElementList_testToString());

		// 39- Tests ON [A,B,C] -> remove(2) -> [A,B]
		printTest("removeIndexTwoFromThreeElementList_testAddToFront", removeIndexTwoFromThreeElementList_testAddToFront());
		printTest("removeIndexTwoFromThreeElementList_testAddToRear", removeIndexTwoFromThreeElementList_testAddToRear());
		printTest("removeIndexTwoFromThreeElementList_testRemoveFirst", removeIndexTwoFromThreeElementList_testRemoveFirst());
		printTest("removeIndexTwoFromThreeElementList_testRemoveLast", removeIndexTwoFromThreeElementList_testRemoveLast());
		printTest("removeIndexTwoFromThreeElementList_testFirst", removeIndexTwoFromThreeElementList_testFirst());
		printTest("removeIndexTwoFromThreeElementList_testLast", removeIndexTwoFromThreeElementList_testLast());
		printTest("removeIndexTwoFromThreeElementList_testIsEmpty", removeIndexTwoFromThreeElementList_testIsEmpty());
		printTest("removeIndexTwoFromThreeElementList_testSize", removeIndexTwoFromThreeElementList_testSize());
		printTest("removeIndexTwoFromThreeElementList_testIterator", removeIndexTwoFromThreeElementList_testIterator());
		printTest("removeIndexTwoFromThreeElementList_testIteratorHasNext", removeIndexTwoFromThreeElementList_testIteratorHasNext());
		printTest("removeIndexTwoFromThreeElementList_testIteratorNext", removeIndexTwoFromThreeElementList_testIteratorNext());
		printTest("removeIndexTwoFromThreeElementList_testContainsOne", removeIndexTwoFromThreeElementList_testContainsOne());
		printTest("removeIndexTwoFromThreeElementList_testContainsTwo", removeIndexTwoFromThreeElementList_testContainsTwo());
		printTest("removeIndexTwoFromThreeElementList_testContainsThree", removeIndexTwoFromThreeElementList_testContainsThree());
		printTest("removeIndexTwoFromThreeElementList_testRemoveElementOne", removeIndexTwoFromThreeElementList_testRemoveElementOne());
		printTest("removeIndexTwoFromThreeElementList_testRemoveElementTwo", removeIndexTwoFromThreeElementList_testRemoveElementTwo());
		printTest("removeIndexTwoFromThreeElementList_testRemoveElementThree", removeIndexTwoFromThreeElementList_testRemoveElementThree());
		printTest("removeIndexTwoFromThreeElementList_testAddAfterOne", removeIndexTwoFromThreeElementList_testAddAfterOne());
		printTest("removeIndexTwoFromThreeElementList_testAddAfterTwo", removeIndexTwoFromThreeElementList_testAddAfterTwo());
		printTest("removeIndexTwoFromThreeElementList_testAddAfterThree", removeIndexTwoFromThreeElementList_testAddAfterThree());
		printTest("removeIndexTwoFromThreeElementList_testToString", removeIndexTwoFromThreeElementList_testToString());
		printTest("removeIndexTwoFromThreeElementList_testAddIndexZero", removeIndexTwoFromThreeElementList_testAddIndexZero());
		printTest("removeIndexTwoFromThreeElementList_testAddIndexOne", removeIndexTwoFromThreeElementList_testAddIndexOne());
		printTest("removeIndexTwoFromThreeElementList_testAddIndexTwo", removeIndexTwoFromThreeElementList_testAddIndexTwo());
		printTest("removeIndexTwoFromThreeElementList_testAddIndexThree", removeIndexTwoFromThreeElementList_testAddIndexThree());
		printTest("removeIndexTwoFromThreeElementList_testSetIndexZero", removeIndexTwoFromThreeElementList_testSetIndexZero());
		printTest("removeIndexTwoFromThreeElementList_testSetIndexOne", removeIndexTwoFromThreeElementList_testSetIndexOne());
		printTest("removeIndexTwoFromThreeElementList_testSetIndexTwo", removeIndexTwoFromThreeElementList_testSetIndexTwo());	
		printTest("removeIndexTwoFromThreeElementList_testAdd", removeIndexTwoFromThreeElementList_testAdd());
		printTest("removeIndexTwoFromThreeElementList_testGetZero", removeIndexTwoFromThreeElementList_testGetZero());
		printTest("removeIndexTwoFromThreeElementList_testGetOne", removeIndexTwoFromThreeElementList_testGetOne());
		printTest("removeIndexTwoFromThreeElementList_testGetTwo", removeIndexTwoFromThreeElementList_testGetTwo());
		printTest("removeIndexTwoFromThreeElementList_testIndexOfA", removeIndexTwoFromThreeElementList_testIndexOfA());
		printTest("removeIndexTwoFromThreeElementList_testIndexOfB", removeIndexTwoFromThreeElementList_testIndexOfB());
		printTest("removeIndexTwoFromThreeElementList_testIndexOfC", removeIndexTwoFromThreeElementList_testIndexOfC());
		printTest("removeIndexTwoFromThreeElementList_testRemoveIndexZero", removeIndexTwoFromThreeElementList_testRemoveIndexZero());
		printTest("removeIndexTwoFromThreeElementList_testRemoveIndexOne", removeIndexTwoFromThreeElementList_testRemoveIndexOne());
		printTest("removeIndexTwoFromThreeElementList_testRemoveIndexTwo", removeIndexTwoFromThreeElementList_testRemoveIndexTwo());

		
		// 40- Tests ON [A,B,C] -> set(0,D) -> [D,B,C]
		printTest("setIndexZeroFromThreeElementList_testAddToFront", setIndexZeroFromThreeElementList_testAddToFront());
		printTest("setIndexZeroFromThreeElementList_testAddToRear", setIndexZeroFromThreeElementList_testAddToRear());
		printTest("setIndexZeroFromThreeElementList_testRemoveFirst", setIndexZeroFromThreeElementList_testRemoveFirst());
		printTest("setIndexZeroFromThreeElementList_testRemoveLast", setIndexZeroFromThreeElementList_testRemoveLast());
		printTest("setIndexZeroFromThreeElementList_testFirst", setIndexZeroFromThreeElementList_testFirst());
		printTest("setIndexZeroFromThreeElementList_testLast", setIndexZeroFromThreeElementList_testLast());
		printTest("setIndexZeroFromThreeElementList_testIsEmpty", setIndexZeroFromThreeElementList_testIsEmpty());
		printTest("setIndexZeroFromThreeElementList_testSize", setIndexZeroFromThreeElementList_testSize());
		printTest("setIndexZeroFromThreeElementList_testIterator", setIndexZeroFromThreeElementList_testIterator());
		printTest("setIndexZeroFromThreeElementList_testIteratorHasNext", setIndexZeroFromThreeElementList_testIteratorHasNext());
		printTest("setIndexZeroFromThreeElementList_testIteratorNext", setIndexZeroFromThreeElementList_testIteratorNext());
		printTest("setIndexZeroFromThreeElementList_testContainsOne", setIndexZeroFromThreeElementList_testContainsOne());
		printTest("setIndexZeroFromThreeElementList_testContainsTwo", setIndexZeroFromThreeElementList_testContainsTwo());
		printTest("setIndexZeroFromThreeElementList_testContainsThree", setIndexZeroFromThreeElementList_testContainsThree());
		printTest("setIndexZeroFromThreeElementList_testContainsFour", setIndexZeroFromThreeElementList_testContainsFour());
		printTest("setIndexZeroFromThreeElementList_testRemoveElementOne", setIndexZeroFromThreeElementList_testRemoveElementOne());
		printTest("setIndexZeroFromThreeElementList_testRemoveElementTwo", setIndexZeroFromThreeElementList_testRemoveElementTwo());
		printTest("setIndexZeroFromThreeElementList_testRemoveElementThree", setIndexZeroFromThreeElementList_testRemoveElementThree());
		printTest("setIndexZeroFromThreeElementList_testRemoveElementFour", setIndexZeroFromThreeElementList_testRemoveElementFour());
		printTest("setIndexZeroFromThreeElementList_testAddAfterOne", setIndexZeroFromThreeElementList_testAddAfterOne());
		printTest("setIndexZeroFromThreeElementList_testAddAfterTwo", setIndexZeroFromThreeElementList_testAddAfterTwo());
		printTest("setIndexZeroFromThreeElementList_testAddAfterThree", setIndexZeroFromThreeElementList_testAddAfterThree());
		printTest("setIndexZeroFromThreeElementList_testAddAfterFour", setIndexZeroFromThreeElementList_testAddAfterFour());
		printTest("setIndexZeroFromThreeElementList_testToString", setIndexZeroFromThreeElementList_testToString());
		printTest("setIndexZeroFromThreeElementList_testAddIndexZero", setIndexZeroFromThreeElementList_testAddIndexZero());
		printTest("setIndexZeroFromThreeElementList_testAddIndexOne", setIndexZeroFromThreeElementList_testAddIndexOne());
		printTest("setIndexZeroFromThreeElementList_testAddIndexTwo", setIndexZeroFromThreeElementList_testAddIndexTwo());
		printTest("setIndexZeroFromThreeElementList_testAddIndexThree", setIndexZeroFromThreeElementList_testAddIndexThree());
		printTest("setIndexZeroFromThreeElementList_testAddIndexFour", setIndexZeroFromThreeElementList_testAddIndexFour());
		printTest("setIndexZeroFromThreeElementList_testSetIndexZero", setIndexZeroFromThreeElementList_testSetIndexZero());
		printTest("setIndexZeroFromThreeElementList_testSetIndexOne", setIndexZeroFromThreeElementList_testSetIndexOne());
		printTest("setIndexZeroFromThreeElementList_testSetIndexTwo", setIndexZeroFromThreeElementList_testSetIndexTwo());	
		printTest("setIndexZeroFromThreeElementList_testSetIndexThree", setIndexZeroFromThreeElementList_testSetIndexThree());	
		printTest("setIndexZeroFromThreeElementList_testAdd", setIndexZeroFromThreeElementList_testAdd());
		printTest("setIndexZeroFromThreeElementList_testGetZero", setIndexZeroFromThreeElementList_testGetZero());
		printTest("setIndexZeroFromThreeElementList_testGetOne", setIndexZeroFromThreeElementList_testGetOne());
		printTest("setIndexZeroFromThreeElementList_testGetTwo", setIndexZeroFromThreeElementList_testGetTwo());
		printTest("setIndexZeroFromThreeElementList_testGetThree", setIndexZeroFromThreeElementList_testGetThree());
		printTest("setIndexZeroFromThreeElementList_testIndexOfA", setIndexZeroFromThreeElementList_testIndexOfA());
		printTest("setIndexZeroFromThreeElementList_testIndexOfB", setIndexZeroFromThreeElementList_testIndexOfB());
		printTest("setIndexZeroFromThreeElementList_testIndexOfC", setIndexZeroFromThreeElementList_testIndexOfC());
		printTest("setIndexZeroFromThreeElementList_testIndexOfD", setIndexZeroFromThreeElementList_testIndexOfD());
		printTest("setIndexZeroFromThreeElementList_testRemoveIndexZero", setIndexZeroFromThreeElementList_testRemoveIndexZero());
		printTest("setIndexZeroFromThreeElementList_testRemoveIndexOne", setIndexZeroFromThreeElementList_testRemoveIndexOne());
		printTest("setIndexZeroFromThreeElementList_testRemoveIndexTwo", setIndexZeroFromThreeElementList_testRemoveIndexTwo());
		printTest("setIndexZeroFromThreeElementList_testRemoveIndexThree", setIndexZeroFromThreeElementList_testRemoveIndexThree());		
		
		// 41- Tests ON [A,B,C] -> set(1,D) -> [A,D,C]
		printTest("setIndexOneFromThreeElementList_testAddToFront", setIndexOneFromThreeElementList_testAddToFront());
		printTest("setIndexOneFromThreeElementList_testAddToRear", setIndexOneFromThreeElementList_testAddToRear());
		printTest("setIndexOneFromThreeElementList_testRemoveFirst", setIndexOneFromThreeElementList_testRemoveFirst());
		printTest("setIndexOneFromThreeElementList_testRemoveLast", setIndexOneFromThreeElementList_testRemoveLast());
		printTest("setIndexOneFromThreeElementList_testFirst", setIndexOneFromThreeElementList_testFirst());
		printTest("setIndexOneFromThreeElementList_testLast", setIndexOneFromThreeElementList_testLast());
		printTest("setIndexOneFromThreeElementList_testIsEmpty", setIndexOneFromThreeElementList_testIsEmpty());
		printTest("setIndexOneFromThreeElementList_testSize", setIndexOneFromThreeElementList_testSize());
		printTest("setIndexOneFromThreeElementList_testIterator", setIndexOneFromThreeElementList_testIterator());
		printTest("setIndexOneFromThreeElementList_testIteratorHasNext", setIndexOneFromThreeElementList_testIteratorHasNext());
		printTest("setIndexOneFromThreeElementList_testIteratorNext", setIndexOneFromThreeElementList_testIteratorNext());
		printTest("setIndexOneFromThreeElementList_testContainsOne", setIndexOneFromThreeElementList_testContainsOne());
		printTest("setIndexOneFromThreeElementList_testContainsTwo", setIndexOneFromThreeElementList_testContainsTwo());
		printTest("setIndexOneFromThreeElementList_testContainsThree", setIndexOneFromThreeElementList_testContainsThree());
		printTest("setIndexOneFromThreeElementList_testContainsFour", setIndexOneFromThreeElementList_testContainsFour());
		printTest("setIndexOneFromThreeElementList_testRemoveElementOne", setIndexOneFromThreeElementList_testRemoveElementOne());
		printTest("setIndexOneFromThreeElementList_testRemoveElementTwo", setIndexOneFromThreeElementList_testRemoveElementTwo());
		printTest("setIndexOneFromThreeElementList_testRemoveElementThree", setIndexOneFromThreeElementList_testRemoveElementThree());
		printTest("setIndexOneFromThreeElementList_testRemoveElementFour", setIndexOneFromThreeElementList_testRemoveElementFour());
		printTest("setIndexOneFromThreeElementList_testAddAfterOne", setIndexOneFromThreeElementList_testAddAfterOne());
		printTest("setIndexOneFromThreeElementList_testAddAfterTwo", setIndexOneFromThreeElementList_testAddAfterTwo());
		printTest("setIndexOneFromThreeElementList_testAddAfterThree", setIndexOneFromThreeElementList_testAddAfterThree());
		printTest("setIndexOneFromThreeElementList_testAddAfterFour", setIndexOneFromThreeElementList_testAddAfterFour());
		printTest("setIndexOneFromThreeElementList_testToString", setIndexOneFromThreeElementList_testToString());
		printTest("setIndexOneFromThreeElementList_testAddIndexZero", setIndexOneFromThreeElementList_testAddIndexZero());
		printTest("setIndexOneFromThreeElementList_testAddIndexOne", setIndexOneFromThreeElementList_testAddIndexOne());
		printTest("setIndexOneFromThreeElementList_testAddIndexTwo", setIndexOneFromThreeElementList_testAddIndexTwo());
		printTest("setIndexOneFromThreeElementList_testAddIndexThree", setIndexOneFromThreeElementList_testAddIndexThree());
		printTest("setIndexOneFromThreeElementList_testAddIndexFour", setIndexOneFromThreeElementList_testAddIndexFour());
		printTest("setIndexOneFromThreeElementList_testSetIndexZero", setIndexOneFromThreeElementList_testSetIndexZero());
		printTest("setIndexOneFromThreeElementList_testSetIndexOne", setIndexOneFromThreeElementList_testSetIndexOne());
		printTest("setIndexOneFromThreeElementList_testSetIndexTwo", setIndexOneFromThreeElementList_testSetIndexTwo());	
		printTest("setIndexOneFromThreeElementList_testSetIndexThree", setIndexOneFromThreeElementList_testSetIndexThree());	
		printTest("setIndexOneFromThreeElementList_testAdd", setIndexOneFromThreeElementList_testAdd());
		printTest("setIndexOneFromThreeElementList_testGetZero", setIndexOneFromThreeElementList_testGetZero());
		printTest("setIndexOneFromThreeElementList_testGetOne", setIndexOneFromThreeElementList_testGetOne());
		printTest("setIndexOneFromThreeElementList_testGetTwo", setIndexOneFromThreeElementList_testGetTwo());
		printTest("setIndexOneFromThreeElementList_testGetThree", setIndexOneFromThreeElementList_testGetThree());
		printTest("setIndexOneFromThreeElementList_testIndexOfA", setIndexOneFromThreeElementList_testIndexOfA());
		printTest("setIndexOneFromThreeElementList_testIndexOfB", setIndexOneFromThreeElementList_testIndexOfB());
		printTest("setIndexOneFromThreeElementList_testIndexOfC", setIndexOneFromThreeElementList_testIndexOfC());
		printTest("setIndexOneFromThreeElementList_testIndexOfD", setIndexOneFromThreeElementList_testIndexOfD());
		printTest("setIndexOneFromThreeElementList_testRemoveIndexZero", setIndexOneFromThreeElementList_testRemoveIndexZero());
		printTest("setIndexOneFromThreeElementList_testRemoveIndexOne", setIndexOneFromThreeElementList_testRemoveIndexOne());
		printTest("setIndexOneFromThreeElementList_testRemoveIndexTwo", setIndexOneFromThreeElementList_testRemoveIndexTwo());
		printTest("setIndexOneFromThreeElementList_testRemoveIndexThree", setIndexOneFromThreeElementList_testRemoveIndexThree());
		
		// 42- Tests ON [A,B,C] -> set(2,D) -> [A,B,D]
		printTest("setIndexTwoFromThreeElementList_testAddToFront", setIndexTwoFromThreeElementList_testAddToFront());
		printTest("setIndexTwoFromThreeElementList_testAddToRear", setIndexTwoFromThreeElementList_testAddToRear());
		printTest("setIndexTwoFromThreeElementList_testRemoveFirst", setIndexTwoFromThreeElementList_testRemoveFirst());
		printTest("setIndexTwoFromThreeElementList_testRemoveLast", setIndexTwoFromThreeElementList_testRemoveLast());
		printTest("setIndexTwoFromThreeElementList_testFirst", setIndexTwoFromThreeElementList_testFirst());
		printTest("setIndexTwoFromThreeElementList_testLast", setIndexTwoFromThreeElementList_testLast());
		printTest("setIndexTwoFromThreeElementList_testIsEmpty", setIndexTwoFromThreeElementList_testIsEmpty());
		printTest("setIndexTwoFromThreeElementList_testSize", setIndexTwoFromThreeElementList_testSize());
		printTest("setIndexTwoFromThreeElementList_testIterator", setIndexTwoFromThreeElementList_testIterator());
		printTest("setIndexTwoFromThreeElementList_testIteratorHasNext", setIndexTwoFromThreeElementList_testIteratorHasNext());
		printTest("setIndexTwoFromThreeElementList_testIteratorNext", setIndexTwoFromThreeElementList_testIteratorNext());
		printTest("setIndexTwoFromThreeElementList_testContainsOne", setIndexTwoFromThreeElementList_testContainsOne());
		printTest("setIndexTwoFromThreeElementList_testContainsTwo", setIndexTwoFromThreeElementList_testContainsTwo());
		printTest("setIndexTwoFromThreeElementList_testContainsThree", setIndexTwoFromThreeElementList_testContainsThree());
		printTest("setIndexTwoFromThreeElementList_testContainsFour", setIndexTwoFromThreeElementList_testContainsFour());
		printTest("setIndexTwoFromThreeElementList_testRemoveElementOne", setIndexTwoFromThreeElementList_testRemoveElementOne());
		printTest("setIndexTwoFromThreeElementList_testRemoveElementTwo", setIndexTwoFromThreeElementList_testRemoveElementTwo());
		printTest("setIndexTwoFromThreeElementList_testRemoveElementThree", setIndexTwoFromThreeElementList_testRemoveElementThree());
		printTest("setIndexTwoFromThreeElementList_testRemoveElementFour", setIndexTwoFromThreeElementList_testRemoveElementFour());
		printTest("setIndexTwoFromThreeElementList_testAddAfterOne", setIndexTwoFromThreeElementList_testAddAfterOne());
		printTest("setIndexTwoFromThreeElementList_testAddAfterTwo", setIndexTwoFromThreeElementList_testAddAfterTwo());
		printTest("setIndexTwoFromThreeElementList_testAddAfterThree", setIndexTwoFromThreeElementList_testAddAfterThree());
		printTest("setIndexTwoFromThreeElementList_testAddAfterFour", setIndexTwoFromThreeElementList_testAddAfterFour());
		printTest("setIndexTwoFromThreeElementList_testToString", setIndexTwoFromThreeElementList_testToString());
		printTest("setIndexTwoFromThreeElementList_testAddIndexZero", setIndexTwoFromThreeElementList_testAddIndexZero());
		printTest("setIndexTwoFromThreeElementList_testAddIndexOne", setIndexTwoFromThreeElementList_testAddIndexOne());
		printTest("setIndexTwoFromThreeElementList_testAddIndexTwo", setIndexTwoFromThreeElementList_testAddIndexTwo());
		printTest("setIndexTwoFromThreeElementList_testAddIndexThree", setIndexTwoFromThreeElementList_testAddIndexThree());
		printTest("setIndexTwoFromThreeElementList_testAddIndexFour", setIndexTwoFromThreeElementList_testAddIndexFour());
		printTest("setIndexTwoFromThreeElementList_testSetIndexZero", setIndexTwoFromThreeElementList_testSetIndexZero());
		printTest("setIndexTwoFromThreeElementList_testSetIndexOne", setIndexTwoFromThreeElementList_testSetIndexOne());
		printTest("setIndexTwoFromThreeElementList_testSetIndexTwo", setIndexTwoFromThreeElementList_testSetIndexTwo());	
		printTest("setIndexTwoFromThreeElementList_testSetIndexThree", setIndexTwoFromThreeElementList_testSetIndexThree());	
		printTest("setIndexTwoFromThreeElementList_testAdd", setIndexTwoFromThreeElementList_testAdd());
		printTest("setIndexTwoFromThreeElementList_testGetZero", setIndexTwoFromThreeElementList_testGetZero());
		printTest("setIndexTwoFromThreeElementList_testGetOne", setIndexTwoFromThreeElementList_testGetOne());
		printTest("setIndexTwoFromThreeElementList_testGetTwo", setIndexTwoFromThreeElementList_testGetTwo());
		printTest("setIndexTwoFromThreeElementList_testGetThree", setIndexTwoFromThreeElementList_testGetThree());
		printTest("setIndexTwoFromThreeElementList_testIndexOfA", setIndexTwoFromThreeElementList_testIndexOfA());
		printTest("setIndexTwoFromThreeElementList_testIndexOfB", setIndexTwoFromThreeElementList_testIndexOfB());
		printTest("setIndexTwoFromThreeElementList_testIndexOfC", setIndexTwoFromThreeElementList_testIndexOfC());
		printTest("setIndexTwoFromThreeElementList_testIndexOfD", setIndexTwoFromThreeElementList_testIndexOfD());
		printTest("setIndexTwoFromThreeElementList_testRemoveIndexZero", setIndexTwoFromThreeElementList_testRemoveIndexZero());
		printTest("setIndexTwoFromThreeElementList_testRemoveIndexOne", setIndexTwoFromThreeElementList_testRemoveIndexOne());
		printTest("setIndexTwoFromThreeElementList_testRemoveIndexTwo", setIndexTwoFromThreeElementList_testRemoveIndexTwo());
		printTest("setIndexTwoFromThreeElementList_testRemoveIndexThree", setIndexTwoFromThreeElementList_testRemoveIndexThree());

		// 43- Tests ON [A] -> iterator remove() after previous() returns A -> []
		printTest("iterRemoveAfterPreviousFromNewList_testSize", iterRemoveAfterPreviousFromNewList_testSize());
		printTest("iterRemoveAfterPreviousFromNewList_testHasNext", iterRemoveAfterPreviousFromNewList_testHasNext());
		printTest("iterRemoveAfterPreviousFromNewList_testRemove", iterRemoveAfterPreviousFromNewList_testRemove());

		// 44- Tests ON [A,B,C] -> iterator set(D) after previous() returns B -> [A,B,D]
		printTest("iterSetAfterPreviousFromThreeElementList_testGetIndexTwo", iterSetAfterPreviousFromThreeElementList_testGetIndexTwo());
		printTest("iterSetAfterPreviousFromThreeElementList_testSet", iterSetAfterPreviousFromThreeElementList_testSet());

		//45- Tests on  [] -> iterator add(A) -> [A]
		printTest("iterAddFromNewList_testNextIndex", iterAddFromNewList_testNextIndex());
		printTest("iterAddFromNewList_testPreviousIndex", iterAddFromNewList_testPreviousIndex());
		printTest("iterAddFromNewList_testGetIndexOne", iterAddFromNewList_testGetIndexOne());
		printTest("iterAddFromNewList_testGetIndexZero", iterAddFromNewList_testGetIndexZero());
		
		//46- Tests on [A] -> iterator add(B) after (previous() then next())returns A -> [A,B]
		printTest("iterAddAfterPreviousAndNextFromSingleElementList_testHasNext", iterAddAfterPreviousAndNextFromSingleElementList_testHasNext());
		printTest("iterAddAfterPreviousAndNextFromSingleElementList_testRemove", iterAddAfterPreviousAndNextFromSingleElementList_testRemove());
		printTest("iterAddAfterPreviousAndNextFromSingleElementList_testPrevious", iterAddAfterPreviousAndNextFromSingleElementList_testPrevious());

		
		
		
		/////////////////
		//final verdict
		/////////////////
		printFinalSummary();
	}
	
	/**
	 * Test 1
	 * Returns a DoubleLinkedList for the "new empty list" scenario
	 *
	 * @return a new DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> newList() {
			return new DoubleLinkedList<Integer>();

	}

	/** @return test success */
	private boolean newList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = newList();
			Integer i = new Integer(new Integer(1));
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "newList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean newList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = newList();
			Integer i = new Integer(new Integer(1));
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "newList_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean newList_testAddAfter() {
		try {
			DoubleLinkedList<Integer> list = newList();
			list.addAfter(new Integer(1), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "newList_testAddAfter", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean newList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = newList();
			list.removeFirst();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "newList_testRemoveFirst", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean newList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = newList();
			list.removeLast();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "newList_testRemoveLast", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean newList_testRemoveElement() {
		try {
			DoubleLinkedList<Integer> list = newList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "newList_testRemoveElement", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean newList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = newList();
			list.first();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "newList_testFirst", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean newList_testLast() {
		try {
			DoubleLinkedList<Integer> list = newList();
			list.last();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "newList_testLast", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean newList_testContains() {
		try {
			DoubleLinkedList<Integer> list = newList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "newList_testContains", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean newList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = newList();
			return (list.isEmpty() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "newList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean newList_testSize() {
		try {
			DoubleLinkedList<Integer> list = newList();
			return (list.size() == 0);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "newList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean newList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = newList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "newList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean newList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = newList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "newList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean newList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = newList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return false;
		} catch (NoSuchElementException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "newList_testIteratorNext", e.toString());
			return false;
		}
	}
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	
	private boolean newList_testToString() {
		try {
			DoubleLinkedList<Integer> list = newList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "newList_testToString", e.toString());
			return false;
		}
	}
	
	
	
	/**
	 * Test 2
	 * Returns a DoubleLinkedList for the "[] >> addToFront(A) >>[A]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addToFrontFromNewList() {

		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToFront(new Integer(1));
		return list;

	}
	
	/** @return test success */
	private boolean addToFrontFromNewList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromNewList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromNewList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromNewList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			return list.removeLast()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromNewList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromNewList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			return list.last()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromNewList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromNewList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromNewList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromNewList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromNewList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromNewList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromNewList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testContainsTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromNewList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testRemoveElementOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromNewList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToFrontFromNewList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromNewList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testAddAfterOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromNewList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			list.addAfter(new Integer(3), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToFrontFromNewList_testAddAfterTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addToFrontFromNewList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromNewList_testToString", e.toString());
			return false;
		}
	}
	
	
	/**
	 * Test 3
	 * Returns a DoubleLinkedList for the "[] >> addToRear(A) >>[A]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addToRearFromNewList() {

		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		return list;

	}
	
	/** @return test success */
	private boolean addToRearFromNewList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromNewList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromNewList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromNewList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			return list.removeLast()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromNewList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromNewList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromNewList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			
			return list.last()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromNewList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromNewList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromNewList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromNewList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromNewList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromNewList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromNewList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testContainsTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromNewList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testRemoveElementOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromNewList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToRearFromNewList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromNewList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testAddAfterOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromNewList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			list.addAfter(new Integer(3), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToRearFromNewList_testAddAfterTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addToRearFromNewList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromNewList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromNewList_testToString", e.toString());
			return false;
		}
	}
	
	
	/**
	 * Test 4
	 * Returns a DoubleLinkedList for the "[A] >> removeFirst() >>[]" scenario
	 *
	 * @return a new DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeFirstFromOneElementList() {

		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToFront(new Integer(1));
		list.removeFirst();
		return list;


	}

	/** @return test success */
	private boolean removeFirstFromOneElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromOneElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromOneElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromOneElementList_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromOneElementList_testAddAfter() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFirstFromOneElementList_testAddAfter", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromOneElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			list.removeFirst();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFirstFromOneElementList_testRemoveFirst", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromOneElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			list.removeLast();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFirstFromOneElementList_testRemoveLast", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromOneElementList_testRemoveElement() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFirstFromOneElementList_testRemoveElement", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromOneElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			list.first();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFirstFromOneElementList_testFirst", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromOneElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			list.last();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFirstFromOneElementList_testLast", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromOneElementList_testContains() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromOneElementList_testContains", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromOneElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			return (list.isEmpty() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromOneElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFirstFromOneElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			return (list.size() == 0);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromOneElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFirstFromOneElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromOneElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFirstFromOneElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromOneElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFirstFromOneElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return false;
		} catch (NoSuchElementException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromOneElementList_testIteratorNext", e.toString());
			return false;
		}
	}
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	
	private boolean removeFirstFromOneElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromOneElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromOneElementList_testToString", e.toString());
			return false;
		}
	}
	
	
	/**
	 * Test 5
	 * Returns a DoubleLinkedList for the "[A] >> removeLast() >>[]" scenario
	 *
	 * @return a new DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeLastFromOneElementList() {

		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToFront(new Integer(1));
		list.removeLast();
		return list;

	}

	/** @return test success */
	private boolean removeLastFromOneElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromOneElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromOneElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromOneElementList_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromOneElementList_testAddAfter() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeLastFromOneElementList_testAddAfter", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromOneElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			list.removeFirst();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeLastFromOneElementList_testRemoveFirst", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromOneElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			list.removeLast();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeLastFromOneElementList_testRemoveLast", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromOneElementList_testRemoveElement() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeLastFromOneElementList_testRemoveElement", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromOneElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			list.first();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeLastFromOneElementList_testFirst", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromOneElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			list.last();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeLastFromOneElementList_testLast", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromOneElementList_testContains() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromOneElementList_testContains", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromOneElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			return (list.isEmpty() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromOneElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeLastFromOneElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			return (list.size() == 0);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromOneElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeLastFromOneElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromOneElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeLastFromOneElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromOneElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeLastFromOneElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return false;
		} catch (NoSuchElementException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromOneElementList_testIteratorNext", e.toString());
			return false;
		}
	}
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	
	private boolean removeLastFromOneElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromOneElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromOneElementList_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 6
	 * Returns a DoubleLinkedList for the "[A] >> remove(A) >>[]" scenario
	 *
	 * @return a new DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeFromFromOneElementList() {

		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToFront(new Integer(1));
		list.remove(new Integer(1));
		return list;

	}

	/** @return test success */
	private boolean removeFromFromOneElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromFromOneElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromFromOneElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromFromOneElementList_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromFromOneElementList_testAddAfter() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromFromOneElementList_testAddAfter", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromFromOneElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			list.removeFirst();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromFromOneElementList_testRemoveFirst", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromFromOneElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			list.removeLast();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromFromOneElementList_testRemoveLast", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromFromOneElementList_testRemoveElement() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromFromOneElementList_testRemoveElement", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromFromOneElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			list.first();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromFromOneElementList_testFirst", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromFromOneElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			list.last();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromFromOneElementList_testLast", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromFromOneElementList_testContains() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromFromOneElementList_testContains", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromFromOneElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			return (list.isEmpty() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromFromOneElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromFromOneElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			return (list.size() == 0);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromFromOneElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromFromOneElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromFromOneElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromFromOneElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromFromOneElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromFromOneElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return false;
		} catch (NoSuchElementException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromFromOneElementList_testIteratorNext", e.toString());
			return false;
		}
	}
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	
	private boolean removeFromFromOneElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeFromFromOneElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromFromOneElementList_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 7
	 * Returns a DoubleLinkedList for the "[A] -> addToFront(B) -> [B,A]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addToFrontFromOneElementList() {

		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToFront(new Integer(2));
		return list;

	}
	
	/** @return test success */
	private boolean addToFrontFromOneElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromOneElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addToFrontFromOneElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			return list.removeFirst()==2;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromOneElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			return list.removeLast()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromOneElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			return list.first()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromOneElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			
			return list.last()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromOneElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromOneElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromOneElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromOneElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromOneElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromOneElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromOneElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromOneElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromOneElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromOneElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testRemoveElementTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromOneElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToFrontFromOneElementList_testRemoveElementThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromOneElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromOneElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			list.addAfter(new Integer(3), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromOneElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToFrontFromOneElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addToFrontFromOneElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromOneElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromOneElementList_testToString", e.toString());
			return false;
		}
	}
		

	/**
	 * Test 8
	 * Returns a DoubleLinkedList for the "[A] -> addToRear(B) -> [A,B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addToRearFromOneElementList() {

		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToFront(new Integer(1));
		list.addToRear(new Integer(2));
		return list;

	}
	
	/** @return test success */
	private boolean addToRearFromOneElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromOneElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addToRearFromOneElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromOneElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromOneElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromOneElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromOneElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromOneElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromOneElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromOneElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromOneElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromOneElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromOneElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromOneElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromOneElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromOneElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testRemoveElementTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromOneElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToRearFromOneElementList_testRemoveElementThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromOneElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromOneElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			list.addAfter(new Integer(3), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromOneElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToRearFromOneElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addToRearFromOneElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromOneElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromOneElementList_testToString", e.toString());
			return false;
		}
	}
	

	/**
	 * Test 9
	 * Returns a DoubleLinkedList for the "[A] -> addAfter(B,A) -> [A,B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addAfterFromOneElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addAfter(new Integer(2), new Integer(1));
		return list;

	}
	
	/** @return test success */
	private boolean addAfterFromOneElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromOneElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addAfterFromOneElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromOneElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromOneElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromOneElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromOneElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromOneElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromOneElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromOneElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromOneElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromOneElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromOneElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromOneElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromOneElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromOneElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testRemoveElementTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromOneElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addAfterFromOneElementList_testRemoveElementThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromOneElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromOneElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			list.addAfter(new Integer(3), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromOneElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addAfterFromOneElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addAfterFromOneElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromOneElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromOneElementList_testToString", e.toString());
			return false;
		}
	}
	
	
	/**
	 * Test 10 Returns a DoubleLinkedList for the "[A,B] -> removeFirst() -> [B]"
	 * scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeFirstFromTwoElementList() {

		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.removeFirst();

		return list;

	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out
					.printf("%s caught unexpected %s\n",
							"removeFirstFromTwoElementList_testAddToFront",
							e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			return list.removeFirst() == 2;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testRemoveFirst",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			return list.removeLast() == 2;
		} catch (Exception e) {
			System.out
					.printf("%s caught unexpected %s\n",
							"removeFirstFromTwoElementList_testRemoveLast",
							e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			return list.first() == 2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			return list.last() == 2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testSize", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testIteratorHasNext",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testIteratorNext",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			return (list.contains(new Integer(1)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testContainsOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testContainsTwo",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			return list.remove(new Integer(2)) == 2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testRemoveElementOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			list.remove(new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n",
					"removeFirstFromTwoElementList_testRemoveElementTwo",
					"ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testAddAfterOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n",
					"removeFirstFromTwoElementList_testAddAfterTwo",
					"ElementNotFoundException", e.toString());
			return false;
		}
	}

	/**
	 * toString() is difficult to test - would like to confirm that the default
	 * address output has been overridden
	 * 
	 * @return test success
	 */
	private boolean removeFirstFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length() - 1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0))
					&& (Character.isDigit(lastChar) || (lastChar >= 'a' && lastChar <= 'f'))) {
				return false; // looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFirstFromTwoElementList_testToString", e.toString());
			return false;
		}
	}
	
	
	/**
	 * Test 11 Returns a DoubleLinkedList for the "[A,B] -> removeLast() -> [A]"
	 * scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeLastFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.removeLast();
		return list;

	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out
					.printf("%s caught unexpected %s\n",
							"removeLastFromTwoElementList_testAddToFront",
							e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			return list.removeFirst() == 1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testRemoveFirst",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			return list.removeLast() == 1;
		} catch (Exception e) {
			System.out
					.printf("%s caught unexpected %s\n",
							"removeLastFromTwoElementList_testRemoveLast",
							e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			return list.first() == 1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			return list.last() == 1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testSize", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testIteratorHasNext",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testIteratorNext",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testContainsOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testContainsTwo",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			return list.remove(new Integer(1)) == 1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testRemoveElementOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n",
					"removeLastFromTwoElementList_testRemoveElementTwo",
					"ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testAddAfterOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			list.addAfter(new Integer(3), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n",
					"removeLastFromTwoElementList_testAddAfterTwo",
					"ElementNotFoundException", e.toString());
			return false;
		}
	}

	/**
	 * toString() is difficult to test - would like to confirm that the default
	 * address output has been overridden
	 * 
	 * @return test success
	 */
	private boolean removeLastFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length() - 1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0))
					&& (Character.isDigit(lastChar) || (lastChar >= 'a' && lastChar <= 'f'))) {
				return false; // looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeLastFromTwoElementList_testToString", e.toString());
			return false;
		}
	}
	
	
	/**
	 * Test 12 Returns a DoubleLinkedList for the "[A,B] -> remove(A) -> [B]"
	 * scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeFromTwoElementListOne() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.remove(new Integer(1));
		return list;

	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out
					.printf("%s caught unexpected %s\n",
							"removeFromTwoElementListOne_testAddToFront",
							e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			return list.removeFirst() == 2;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testRemoveFirst",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			return list.removeLast() == 2;
		} catch (Exception e) {
			System.out
					.printf("%s caught unexpected %s\n",
							"removeFromTwoElementListOne_testRemoveLast",
							e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			return list.first() == 2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			return list.last() == 2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testIsEmpty", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testSize", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testIterator", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testIteratorHasNext",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testIteratorNext",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			return (list.contains(new Integer(1)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testContainsOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testContainsTwo",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			return list.remove(new Integer(2)) == 2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testRemoveElementOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			list.remove(new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n",
					"removeFromTwoElementListOne_testRemoveElementTwo",
					"ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			list.addAfter(new Integer(1), new Integer(2));
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testAddAfterOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListOne_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			list.addAfter(new Integer(3), new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n",
					"removeFromTwoElementListOne_testAddAfterTwo",
					"ElementNotFoundException", e.toString());
			return false;
		}
	}

	/**
	 * toString() is difficult to test - would like to confirm that the default
	 * address output has been overridden
	 * 
	 * @return test success
	 */
	private boolean removeFromTwoElementListOne_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListOne();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length() - 1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0))
					&& (Character.isDigit(lastChar) || (lastChar >= 'a' && lastChar <= 'f'))) {
				return false; // looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListOne_testToString", e.toString());
			return false;
		}
	}
	
	
	/**
	 * Test 13 Returns a DoubleLinkedList for the "[A,B] -> remove(B) -> [A]"
	 * scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeFromTwoElementListTwo() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.remove(new Integer(2));
		return list;

	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out
					.printf("%s caught unexpected %s\n",
							"removeFromTwoElementListTwo_testAddToFront",
							e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			return list.removeFirst() == 1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testRemoveFirst",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			return list.removeLast() == 1;
		} catch (Exception e) {
			System.out
					.printf("%s caught unexpected %s\n",
							"removeFromTwoElementListTwo_testRemoveLast",
							e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			return list.first() == 1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			return list.last() == 1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testIsEmpty", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testSize", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testIterator", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testIteratorHasNext",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testIteratorNext",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testContainsOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testContainsTwo",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			return list.remove(new Integer(1)) == 1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testRemoveElementOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n",
					"removeFromTwoElementListTwo_testRemoveElementTwo",
					"ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testAddAfterOne",
					e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromTwoElementListTwo_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			list.addAfter(new Integer(3), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n",
					"removeFromTwoElementListTwo_testAddAfterTwo",
					"ElementNotFoundException", e.toString());
			return false;
		}
	}

	/**
	 * toString() is difficult to test - would like to confirm that the default
	 * address output has been overridden
	 * 
	 * @return test success
	 */
	private boolean removeFromTwoElementListTwo_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeFromTwoElementListTwo();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length() - 1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0))
					&& (Character.isDigit(lastChar) || (lastChar >= 'a' && lastChar <= 'f'))) {
				return false; // looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n",
					"removeFromTwoElementListTwo_testToString", e.toString());
			return false;
		}
	}
	
	
	/**
	 * Test 14
	 * Returns a DoubleLinkedList for the "[A,B] -> addToFront(C) -> [C,A,B]" scenario
	 * 
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addToFrontFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToFront(new Integer(3));

		return list;

	}
	
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			Integer i = new Integer(4);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			Integer i = new Integer(4);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addToFrontFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return list.removeFirst()==3;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return list.first()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return (list.contains(new Integer(4)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToFrontFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testRemoveElementTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			list.remove(new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToFrontFromTwoElementList_testRemoveElementFour", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToFrontFromTwoElementList_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			list.addAfter(new Integer(5), new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToFrontFromTwoElementList_testAddAfterFour", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addToFrontFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addToFrontFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToFrontFromTwoElementList_testToString", e.toString());
			return false;
		}
	}
	
	
	/**
	 * Test 15
	 * Returns a DoubleLinkedList for the "[A,B] -> addToRear(C) -> [A,B,C]" scenario
	 * 
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addToRearFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		return list;

	}
	
	/** @return test success */
	private boolean addToRearFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			Integer i = new Integer(4);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			Integer i = new Integer(4);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addToRearFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromTwoElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromTwoElementList_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return (list.contains(new Integer(4)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addToRearFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testRemoveElementTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromTwoElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromTwoElementList_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			list.remove(new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToRearFromTwoElementList_testRemoveElementFour", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addToRearFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromTwoElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addToRearFromTwoElementList_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			list.addAfter(new Integer(5), new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addToRearFromTwoElementList_testAddAfterFour", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addToRearFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addToRearFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addToRearFromTwoElementList_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 16
	 * Returns a DoubleLinkedList for the "[A,B] -> addAfter(C,A) -> [A,C,B]" scenario
	 * 
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addAfterFromTwoElementListOne() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addAfter(new Integer(3),new Integer(1));
		return list;

	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			Integer i = new Integer(4);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			Integer i = new Integer(4);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testLast() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testSize() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return (list.contains(new Integer(4)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testRemoveElementOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testRemoveElementTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testRemoveElementThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			list.remove(new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addAfterFromTwoElementListOne_testRemoveElementFour", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			list.addAfter(new Integer(4), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			list.addAfter(new Integer(4), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			list.addAfter(new Integer(4), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListOne_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			list.addAfter(new Integer(5), new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addAfterFromTwoElementListOne_testAddAfterFour", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addAfterFromTwoElementListOne_testToString() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListOne();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListOne_testToString", e.toString());
			return false;
		}
	}
	/**
	 * Test 17
	 * Returns a DoubleLinkedList for the "[A,B] -> addAfter(C,B) -> [A,B,C]" scenario
	 * 
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addAfterFromTwoElementListTwo() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addAfter(new Integer(3),new Integer(2));
		return list;

	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			Integer i = new Integer(4);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			Integer i = new Integer(4);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testLast() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testSize() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return (list.contains(new Integer(4)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testRemoveElementOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testRemoveElementTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testRemoveElementThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			list.remove(new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addAfterFromTwoElementListTwo_testRemoveElementFour", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			list.addAfter(new Integer(4), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			list.addAfter(new Integer(4), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			list.addAfter(new Integer(4), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addAfterFromTwoElementListTwo_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			list.addAfter(new Integer(5), new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addAfterFromTwoElementListTwo_testAddAfterFour", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addAfterFromTwoElementListTwo_testToString() {
		try {
			DoubleLinkedList<Integer> list = addAfterFromTwoElementListTwo();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addAfterFromTwoElementListTwo_testToString", e.toString());
			return false;
		}
	}
	/**
	 * Test 18
	 * Returns a DoubleLinkedList for the "[A,B,C] -> removeFirst() -> [B,C]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeFirstFromThreeElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.removeFirst();
		return list;

	}
	
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromThreeElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeFirstFromThreeElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			return list.removeFirst()==2;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromThreeElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromThreeElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			return list.first()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromThreeElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromThreeElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			return (list.contains(new Integer(1)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromThreeElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testRemoveElementTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFirstFromThreeElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			list.remove(new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFirstFromThreeElementList_testRemoveElementThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			list.addAfter(new Integer(1), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFirstFromThreeElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			list.addAfter(new Integer(4), new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFirstFromThreeElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeFirstFromThreeElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeFirstFromThreeElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFirstFromThreeElementList_testToString", e.toString());
			return false;
		}
	}
	
	
	/**
	 * Test 19
	 * Returns a DoubleLinkedList for the "[A,B,C] -> removeLast() -> [A,B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeLastFromThreeElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.removeLast();
		return list;

	}
	
	/** @return test success */
	private boolean removeLastFromThreeElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromThreeElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeLastFromThreeElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromThreeElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromThreeElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromThreeElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeLastFromThreeElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeLastFromThreeElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeLastFromThreeElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeLastFromThreeElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeLastFromThreeElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromThreeElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeLastFromThreeElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeLastFromThreeElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromThreeElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeLastFromThreeElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testRemoveElementTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeLastFromThreeElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeLastFromThreeElementList_testRemoveElementThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeLastFromThreeElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeLastFromThreeElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			list.addAfter(new Integer(3), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeLastFromThreeElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeLastFromThreeElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeLastFromThreeElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeLastFromThreeElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeLastFromThreeElementList_testToString", e.toString());
			return false;
		}
	}
	/**
	 * Test 20
	 * Returns a DoubleLinkedList for the "[A,B,C] -> remove(A) -> [B,C]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeFromThreeElementListOne() {

		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.remove(new Integer(1));
		return list;

	}
	
	/** @return test success */
	private boolean removeFromThreeElementListOne_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListOne_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeFromThreeElementListOne_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			return list.removeFirst()==2;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListOne_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListOne_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			return list.first()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListOne_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListOne_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListOne_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListOne_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListOne_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListOne_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListOne_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListOne_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListOne_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			return (list.contains(new Integer(1)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListOne_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListOne_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testRemoveElementTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListOne_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			list.remove(new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromThreeElementListOne_testRemoveElementThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListOne_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			list.addAfter(new Integer(1), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListOne_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			list.addAfter(new Integer(1), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListOne_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			list.addAfter(new Integer(4), new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromThreeElementListOne_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeFromThreeElementListOne_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListOne();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListOne_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 21
	 * Returns a DoubleLinkedList for the "[A,B,C] -> remove(B) -> [A,C]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeFromThreeElementListTwo() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.remove(new Integer(2));
		return list;

	}
	
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListTwo_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeFromThreeElementListTwo_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListTwo_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListTwo_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListTwo_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListTwo_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListTwo_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testRemoveElementTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListTwo_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromThreeElementListTwo_testRemoveElementThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			list.addAfter(new Integer(2), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListTwo_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			list.addAfter(new Integer(4), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromThreeElementListTwo_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeFromThreeElementListTwo_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListTwo();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListTwo_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 22
	 * Returns a DoubleLinkedList for the "[A,B,C] -> remove(C) -> [A,B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeFromThreeElementListThree() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.remove(new Integer(3));
		return list;

	}
	
	/** @return test success */
	private boolean removeFromThreeElementListThree_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListThree_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeFromThreeElementListThree_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListThree_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListThree_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListThree_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListThree_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListThree_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListThree_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListThree_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListThree_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListThree_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListThree_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListThree_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListThree_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListThree_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testRemoveElementTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeFromThreeElementListThree_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromThreeElementListThree_testRemoveElementThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListThree_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			list.addAfter(new Integer(3), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeFromThreeElementListThree_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			list.addAfter(new Integer(3), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeFromThreeElementListThree_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			list.addAfter(new Integer(4), new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeFromThreeElementListThree_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeFromThreeElementListThree_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeFromThreeElementListThree();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeFromThreeElementListThree_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 23
	 * Returns a DoubleLinkedList for the "[] -> add(A) -> [A]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addElementFromNewList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.add(new Integer(1));
		return list;

	}

	/** @return test success */
	private boolean addElementFromNewList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			Integer i = new Integer(2);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromNewList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			Integer i = new Integer(2);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addElementFromNewList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromNewList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return list.removeLast()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromNewList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromNewList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			
			return list.last()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromNewList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromNewList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromNewList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromNewList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromNewList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromNewList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromNewList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testContainsTwo", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addElementFromNewList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromNewList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromNewList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addElementFromNewList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testAddAfterOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromNewList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.addAfter(new Integer(3), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromNewList_testAddAfterTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromNewList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.add(0, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromNewList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.add(1, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testAddIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromNewList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.add(2, new Integer(2));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromNewList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addElementFromNewList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.set(0, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testSetIndexZero", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromNewList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.set(1, new Integer(2));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromNewList_testAddIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addElementFromNewList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.add(new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromNewList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testGetZero", e.toString());
			return false;
		}
	}
	

	/** @return test success */
	private boolean addElementFromNewList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.get(1);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromNewList_testGetOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromNewList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromNewList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return list.indexOf(new Integer(2))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testIndexOfB", e.toString());
			return false;
		}
	}

	
	
	/** @return test success */
	private boolean addElementFromNewList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean addElementFromNewList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			list.remove(1);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromNewList_testRemoveIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addElementFromNewList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addElementFromNewList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromNewList_testToString", e.toString());
			return false;
		}
	}

	
	/**
	 * Test 24
	 * Returns a DoubleLinkedList for the "[] -> add(0,A) -> [A]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addIndexZeroFromNewList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.add(0, new Integer(1));
		return list;

	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			Integer i = new Integer(2);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			Integer i = new Integer(2);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addIndexZeroFromNewList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return list.removeLast()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			
			return list.last()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromNewList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testContainsTwo", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addIndexZeroFromNewList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromNewList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromNewList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addIndexZeroFromNewList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testAddAfterOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.addAfter(new Integer(3), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromNewList_testAddAfterTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.add(0, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.add(1, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testAddIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.add(2, new Integer(2));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromNewList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.set(0, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testSetIndexZero", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.set(1, new Integer(2));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromNewList_testAddIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.add(new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testGetZero", e.toString());
			return false;
		}
	}
	

	/** @return test success */
	private boolean addIndexZeroFromNewList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.get(1);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromNewList_testGetOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromNewList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return list.indexOf(new Integer(2))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testIndexOfB", e.toString());
			return false;
		}
	}

	
	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean addIndexZeroFromNewList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			list.remove(1);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromNewList_testRemoveIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addIndexZeroFromNewList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromNewList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromNewList_testToString", e.toString());
			return false;
		}
	}

	/**
	 * Test 25
	 * Returns a DoubleLinkedList for the "[A] -> remove(0) -> []" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeIndexZeroFromOneElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.add(new Integer(1));
		list.remove(0);
		return list;

	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			Integer i = new Integer(new Integer(1));
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			Integer i = new Integer(new Integer(1));
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testAddToRear", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testAddAfter() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testAddAfter", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.removeFirst();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testRemoveFirst", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.removeLast();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testRemoveLast", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testRemoveElement() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testRemoveElement", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.first();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testFirst", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.last();
			return false;
		} catch (EmptyCollectionException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testLast", "EmptyCollectionException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testContains() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testContains", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			return (list.isEmpty() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			return (list.size() == 0);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return false;
		} catch (NoSuchElementException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			return (list.contains(new Integer(1)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testContainsOne", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.remove(new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testRemoveElementOne", "ElementNotFoundException", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.addAfter(new Integer(2), new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testAddAfterOne", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.add(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testAddIndexZero", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.add(1, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testAddIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.set(0, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testAddIndexZero", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.add(new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.get(0);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testGetZero", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			return list.indexOf(new Integer(1))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean removeIndexZeroFromOneElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			list.remove(0);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromOneElementList_testRemoveIndexZero", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeIndexZeroFromOneElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromOneElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromOneElementList_testToString", e.toString());
			return false;
		}
	}

	
	/**
	 * Test 26
	 * Returns a DoubleLinkedList for the "[A] -> set(0,B) -> [B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> setIndexZeroFromOneElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.set(0, new Integer(2));
		return list;

	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return list.removeFirst()==2;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return list.first()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return (list.contains(new Integer(1)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testContainsTwo", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.remove(new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromOneElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testAddAfterOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromOneElementList_testAddAfterTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.add(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.add(1, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testAddIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.add(2, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromOneElementList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.set(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testSetIndexZero", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.set(1, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromOneElementList_testAddIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.add(new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return list.get(0) == 2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testGetZero", e.toString());
			return false;
		}
	}
	

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.get(1);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromOneElementList_testGetOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return list.indexOf(new Integer(1))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return list.indexOf(new Integer(2))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testIndexOfB", e.toString());
			return false;
		}
	}

	
	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			return list.remove(0)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean setIndexZeroFromOneElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			list.remove(1);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromOneElementList_testRemoveIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean setIndexZeroFromOneElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromOneElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromOneElementList_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 27
	 * Returns a DoubleLinkedList for the "[A] -> add(0,B) -> [B,A]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addIndexZeroFromOneElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.add(0, new Integer(2));
		return list;

	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return list.removeFirst()==2;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return list.removeLast()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return list.first()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			
			return list.last()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromOneElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.addAfter(new Integer(3), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromOneElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.add(0, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.add(1, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.add(2, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.add(3, new Integer(3));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromOneElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.set(0, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.set(1, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testSetIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.set(2, new Integer(3));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromOneElementList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.add(new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			
			return list.get(0) == 2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			
			return list.get(1)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testGetOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.get(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromOneElementList_testGetTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return list.indexOf(new Integer(1))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return list.indexOf(new Integer(2))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return list.indexOf(new Integer(3))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			return list.remove(0)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			
			return list.remove(1)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean addIndexZeroFromOneElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			list.remove(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromOneElementList_testRemoveIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addIndexZeroFromOneElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromOneElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromOneElementList_testToString", e.toString());
			return false;
		}
	}

	
	/**
	 * Test 28
	 * Returns a DoubleLinkedList for the "[A] -> add(1,B) -> [A,B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addIndexOneFromOneElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.add(1, new Integer(2));
		return list;

	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addIndexOneFromOneElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromOneElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.addAfter(new Integer(3), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromOneElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.add(0, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.add(1, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.add(2, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.add(3, new Integer(3));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromOneElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.set(0, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.set(1, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testSetIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.set(2, new Integer(3));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromOneElementList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.add(new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			
			return list.get(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testGetOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.get(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromOneElementList_testGetTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromOneElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return list.indexOf(new Integer(2))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			return list.indexOf(new Integer(3))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			
			return list.remove(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean addIndexOneFromOneElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			list.remove(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromOneElementList_testRemoveIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addIndexOneFromOneElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromOneElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromOneElementList_testToString", e.toString());
			return false;
		}
	}

	
	/**
	 * Test 29
	 * Returns a DoubleLinkedList for the "[A,B] -> remove(0) -> [B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeIndexZeroFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.remove(0);
		return list;

	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return list.removeFirst()==2;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return list.first()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return (list.contains(new Integer(1)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testContainsTwo", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.remove(new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromTwoElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testAddAfterOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromTwoElementList_testAddAfterTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.add(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.add(1, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testAddIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.add(2, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromTwoElementList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.set(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testSetIndexZero", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.set(1, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromTwoElementList_testAddIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.add(new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return list.get(0) == 2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testGetZero", e.toString());
			return false;
		}
	}
	

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.get(1);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromTwoElementList_testGetOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return list.indexOf(new Integer(1))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return list.indexOf(new Integer(2))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testIndexOfB", e.toString());
			return false;
		}
	}

	
	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			return list.remove(0)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean removeIndexZeroFromTwoElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			list.remove(1);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromTwoElementList_testRemoveIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeIndexZeroFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromTwoElementList_testToString", e.toString());
			return false;
		}
	}

	
	
	/**
	 * Test 30
	 * Returns a DoubleLinkedList for the "[A,B] -> remove(1) -> [A]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeIndexOneFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.remove(1);
		return list;

	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			Integer i = new Integer(2);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			Integer i = new Integer(2);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return list.removeLast()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			
			return list.last()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return (list.size() == 1);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testContainsTwo", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromTwoElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testAddAfterOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.addAfter(new Integer(3), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromTwoElementList_testAddAfterTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.add(0, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.add(1, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testAddIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.add(2, new Integer(2));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromTwoElementList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.set(0, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testSetIndexZero", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.set(1, new Integer(2));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromTwoElementList_testAddIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.add(new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testGetZero", e.toString());
			return false;
		}
	}
	

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.get(1);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromTwoElementList_testGetOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return list.indexOf(new Integer(2))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testIndexOfB", e.toString());
			return false;
		}
	}

	
	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean removeIndexOneFromTwoElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			list.remove(1);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromTwoElementList_testRemoveIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeIndexOneFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromTwoElementList_testToString", e.toString());
			return false;
		}
	}

	
	/**
	 * Test 31
	 * Returns a DoubleLinkedList for the "[A,B] -> set(0,C) -> [C,B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> setIndexZeroFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.set(0, new Integer(3));
		return list;

	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return list.removeFirst()==3;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return list.first()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return (list.contains(new Integer(1)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.remove(new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromTwoElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.addAfter(new Integer(1), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromTwoElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.add(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.add(1, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.add(2, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.add(3, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromTwoElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.set(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.set(1, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testSetIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.set(2, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromTwoElementList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.add(new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			
			return list.get(0) == 3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			
			return list.get(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testGetOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.get(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromTwoElementList_testGetTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return list.indexOf(new Integer(1))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return list.indexOf(new Integer(2))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			return list.indexOf(new Integer(3))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			
			return list.remove(0)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			
			return list.remove(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean setIndexZeroFromTwoElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			list.remove(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromTwoElementList_testRemoveIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean setIndexZeroFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromTwoElementList_testToString", e.toString());
			return false;
		}
	}

	
	/**
	 * Test 32
	 * Returns a DoubleLinkedList for the "[A,B] -> set(1,C) -> [A,C]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> setIndexOneFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.set(1, new Integer(3));
		return list;

	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			Integer i = new Integer(2);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			Integer i = new Integer(2);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromTwoElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.addAfter(new Integer(2), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromTwoElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.add(0, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.add(1, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.add(2, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.add(3, new Integer(2));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromTwoElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.set(0, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.set(1, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testSetIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.set(2, new Integer(2));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromTwoElementList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.add(new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			
			return list.get(1)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testGetOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.get(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromTwoElementList_testGetTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return list.indexOf(new Integer(2))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			return list.indexOf(new Integer(3))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			
			return list.remove(1)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean setIndexOneFromTwoElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			list.remove(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromTwoElementList_testRemoveIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean setIndexOneFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromTwoElementList_testToString", e.toString());
			return false;
		}
	}

	
	/**
	 * Test 33
	 * Returns a DoubleLinkedList for the "[A,B] -> add(C) -> [A,B,C]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addElementFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.add(new Integer(3));
		return list;

	}

	/** @return test success */
	private boolean addElementFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			Integer i = new Integer(4);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			Integer i = new Integer(4);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addElementFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromTwoElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromTwoElementList_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return (list.contains(new Integer(4)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.remove(new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromTwoElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromTwoElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addElementFromTwoElementList_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testRemoveElementFour", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.addAfter(new Integer(5), new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromTwoElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromTwoElementList_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testAddAfterFour", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addElementFromTwoElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.add(0, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.add(1, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromTwoElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.add(2, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.add(3, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testAddIndexFour() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.add(4, new Integer(4));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromTwoElementList_testAddIndexFour", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addElementFromTwoElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.set(0, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addElementFromTwoElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.set(1, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testSetIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.set(2, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testSetIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testSetIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.set(3, new Integer(4));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromTwoElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addElementFromTwoElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.add(new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromTwoElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			
			return list.get(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testGetOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			
			return list.get(2)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testGetTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testGetThree() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.get(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromTwoElementList_testGetThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addElementFromTwoElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return list.indexOf(new Integer(2))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return list.indexOf(new Integer(3))==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testIndexOfD() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			return list.indexOf(new Integer(4))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testIndexOfD", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			
			return list.remove(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			
			return list.remove(2)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testRemoveIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addElementFromTwoElementList_testRemoveIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			list.remove(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addElementFromTwoElementList_testRemoveIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addElementFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addElementFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addElementFromTwoElementList_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 34
	 * Returns a DoubleLinkedList for the "[A,B] -> add(0,C) -> [C,A,B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addIndexZeroFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.add(0, new Integer(3));
		return list;

	}

	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			Integer i = new Integer(4);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			Integer i = new Integer(4);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return list.removeFirst()==3;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return list.first()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return (list.contains(new Integer(4)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.remove(new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromTwoElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testRemoveElementFour", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.addAfter(new Integer(5), new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromTwoElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testAddAfterFour", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.add(0, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.add(1, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.add(2, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.add(3, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAddIndexFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.add(4, new Integer(4));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromTwoElementList_testAddIndexFour", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.set(0, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.set(1, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testSetIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.set(2, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testSetIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testSetIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.set(3, new Integer(4));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromTwoElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.add(new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			
			return list.get(0) == 3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			
			return list.get(1)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testGetOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			
			return list.get(2)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testGetTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testGetThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.get(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromTwoElementList_testGetThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return list.indexOf(new Integer(1))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return list.indexOf(new Integer(2))==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return list.indexOf(new Integer(3))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testIndexOfD() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			return list.indexOf(new Integer(4))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testIndexOfD", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			
			return list.remove(0)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			
			return list.remove(1)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			
			return list.remove(2)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testRemoveIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexZeroFromTwoElementList_testRemoveIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			list.remove(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexZeroFromTwoElementList_testRemoveIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addIndexZeroFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addIndexZeroFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexZeroFromTwoElementList_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 35
	 * Returns a DoubleLinkedList for the "[A,B] -> add(1,C) -> [A,C,B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addIndexOneFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.add(1, new Integer(3));
		return list;

	}

	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			Integer i = new Integer(4);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			Integer i = new Integer(4);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return (list.contains(new Integer(4)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.remove(new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromTwoElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testRemoveElementFour", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.addAfter(new Integer(5), new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromTwoElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testAddAfterFour", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.add(0, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.add(1, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.add(2, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.add(3, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAddIndexFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.add(4, new Integer(4));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromTwoElementList_testAddIndexFour", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.set(0, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.set(1, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testSetIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.set(2, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testSetIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testSetIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.set(3, new Integer(4));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromTwoElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.add(new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			
			return list.get(1)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testGetOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			
			return list.get(2)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testGetTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testGetThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.get(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromTwoElementList_testGetThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return list.indexOf(new Integer(2))==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return list.indexOf(new Integer(3))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testIndexOfD() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			return list.indexOf(new Integer(4))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testIndexOfD", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			
			return list.remove(1)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			
			return list.remove(2)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testRemoveIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexOneFromTwoElementList_testRemoveIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			list.remove(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexOneFromTwoElementList_testRemoveIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addIndexOneFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addIndexOneFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexOneFromTwoElementList_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 36
	 * Returns a DoubleLinkedList for the "[A,B] -> add (2,C) -> [A,B,C]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> addIndexTwoFromTwoElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.add(2, new Integer(3));
		return list;

	}

	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			Integer i = new Integer(4);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			Integer i = new Integer(4);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return (list.contains(new Integer(4)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.remove(new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexTwoFromTwoElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testRemoveElementFour", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.addAfter(new Integer(5), new Integer(4));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexTwoFromTwoElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testAddAfterFour", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.add(0, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.add(1, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.add(2, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.add(3, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAddIndexFour() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.add(4, new Integer(4));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexTwoFromTwoElementList_testAddIndexFour", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.set(0, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.set(1, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testSetIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.set(2, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testSetIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testSetIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.set(3, new Integer(4));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexTwoFromTwoElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.add(new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			
			return list.get(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testGetOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			
			return list.get(2)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testGetTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testGetThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.get(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexTwoFromTwoElementList_testGetThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return list.indexOf(new Integer(2))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return list.indexOf(new Integer(3))==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testIndexOfD() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			return list.indexOf(new Integer(4))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testIndexOfD", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			
			return list.remove(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			
			return list.remove(2)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testRemoveIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean addIndexTwoFromTwoElementList_testRemoveIndexThree() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			list.remove(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "addIndexTwoFromTwoElementList_testRemoveIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean addIndexTwoFromTwoElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = addIndexTwoFromTwoElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "addIndexTwoFromTwoElementList_testToString", e.toString());
			return false;
		}
	}

	/**
	 * Test 37
	 * Returns a DoubleLinkedList for the "[A,B,C] -> remove(0) -> [B,C]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeIndexZeroFromThreeElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.remove(0);
		return list;

	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return list.removeFirst()==2;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return list.first()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return (list.contains(new Integer(1)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.remove(new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromThreeElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.addAfter(new Integer(1), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.addAfter(new Integer(4), new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromThreeElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.add(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.add(1, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.add(2, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.add(3, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromThreeElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.set(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.set(1, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testSetIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.set(2, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromThreeElementList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.add(new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			
			return list.get(0) == 2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			
			return list.get(1)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testGetOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.get(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromThreeElementList_testGetTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return list.indexOf(new Integer(1))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return list.indexOf(new Integer(2))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			return list.indexOf(new Integer(3))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			
			return list.remove(0)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			
			return list.remove(1)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean removeIndexZeroFromThreeElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			list.remove(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexZeroFromThreeElementList_testRemoveIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeIndexZeroFromThreeElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeIndexZeroFromThreeElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexZeroFromThreeElementList_testToString", e.toString());
			return false;
		}
	}
	

	/**
	 * Test 38
	 * Returns a DoubleLinkedList for the "[A,B,C] -> remove(1) -> [A,C]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeIndexOneFromThreeElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.remove(1);
		return list;

	}

	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testRemoveElementTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromThreeElementList_testRemoveElementThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.addAfter(new Integer(2), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.addAfter(new Integer(4), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromThreeElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.add(0, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.add(1, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.add(2, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testAddIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.add(3, new Integer(4));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromThreeElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.set(0, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.set(1, new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testSetIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.set(2, new Integer(4));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromThreeElementList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.add(new Integer(4));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			
			return list.get(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			
			return list.get(1)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testGetOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.get(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromThreeElementList_testGetTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return list.indexOf(new Integer(2))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			return list.indexOf(new Integer(3))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			
			return list.remove(1)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexOneFromThreeElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			list.remove(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexOneFromThreeElementList_testRemoveIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeIndexOneFromThreeElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeIndexOneFromThreeElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexOneFromThreeElementList_testToString", e.toString());
			return false;
		}
	}
	

	/**
	 * Test 39
	 * Returns a DoubleLinkedList for the "[A,B,C] -> remove(2) -> [A,B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> removeIndexTwoFromThreeElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.remove(2);
		return list;

	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return list.removeLast()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			
			return list.last()==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return (list.size() == 2);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testContainsThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexTwoFromThreeElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.addAfter(new Integer(3), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexTwoFromThreeElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.add(0, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.add(1, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.add(2, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.add(3, new Integer(3));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexTwoFromThreeElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.set(0, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.set(1, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testSetIndexOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.set(2, new Integer(3));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexTwoFromThreeElementList_testAddIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.add(new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			
			return list.get(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testGetOne", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.get(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexTwoFromThreeElementList_testGetTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return list.indexOf(new Integer(2))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			return list.indexOf(new Integer(3))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			
			return list.remove(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean removeIndexTwoFromThreeElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			list.remove(2);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "removeIndexTwoFromThreeElementList_testRemoveIndexTwo", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean removeIndexTwoFromThreeElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = removeIndexTwoFromThreeElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "removeIndexTwoFromThreeElementList_testToString", e.toString());
			return false;
		}
	}

	
	
	/**
	 * Test 40
	 * Returns a DoubleLinkedList for the "[A,B,C] -> set(0,D) -> [D,B,C]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> setIndexZeroFromThreeElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.set(0, new Integer(4));
		return list;

	}

	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			Integer i = new Integer(1);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			Integer i = new Integer(1);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return list.removeFirst()==4;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return list.first()==4;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return (list.contains(new Integer(1)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return (list.contains(new Integer(4)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.remove(new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromThreeElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return list.remove(new Integer(4))==4;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testRemoveElementFour", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.addAfter(new Integer(1), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.addAfter(new Integer(1), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.addAfter(new Integer(5), new Integer(1));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromThreeElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.addAfter(new Integer(1), new Integer(4));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testAddAfterFour", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.add(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.add(1, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.add(2, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.add(3, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAddIndexFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.add(4, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromThreeElementList_testAddIndexFour", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.set(0, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.set(1, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testSetIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.set(2, new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testSetIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testSetIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.set(3, new Integer(1));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromThreeElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.add(new Integer(1));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			
			return list.get(0) == 4;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			
			return list.get(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testGetOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			
			return list.get(2)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testGetTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testGetThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.get(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromThreeElementList_testGetThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return list.indexOf(new Integer(1))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return list.indexOf(new Integer(2))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return list.indexOf(new Integer(3))==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testIndexOfD() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			return list.indexOf(new Integer(4))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testIndexOfD", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			
			return list.remove(0)==4;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			
			return list.remove(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			
			return list.remove(2)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testRemoveIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexZeroFromThreeElementList_testRemoveIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			list.remove(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexZeroFromThreeElementList_testRemoveIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean setIndexZeroFromThreeElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = setIndexZeroFromThreeElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexZeroFromThreeElementList_testToString", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 41
	 * Returns a DoubleLinkedList for the "[A,B,C] -> set(1,D) -> [A,D,C]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> setIndexOneFromThreeElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.set(1, new Integer(4));
		return list;

	}

	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			Integer i = new Integer(2);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			Integer i = new Integer(2);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return list.removeLast()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			
			return list.last()==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return (list.contains(new Integer(2)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return (list.contains(new Integer(4)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return (list.contains(new Integer(3)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.remove(new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromThreeElementList_testRemoveElementTwo", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return list.remove(new Integer(3))==3;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testRemoveElementThree", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return list.remove(new Integer(4))==4;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testRemoveElementFour", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.addAfter(new Integer(2), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.addAfter(new Integer(2), new Integer(3));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.addAfter(new Integer(5), new Integer(2));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromThreeElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.addAfter(new Integer(2), new Integer(4));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testAddAfterFour", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.add(0, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.add(1, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.add(2, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.add(3, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAddIndexFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.add(4, new Integer(2));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromThreeElementList_testAddIndexFour", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.set(0, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.set(1, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testSetIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.set(2, new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testSetIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testSetIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.set(3, new Integer(2));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromThreeElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.add(new Integer(2));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			
			return list.get(1)==4;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testGetOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			
			return list.get(2)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testGetTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testGetThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.get(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromThreeElementList_testGetThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return list.indexOf(new Integer(2))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return list.indexOf(new Integer(3))==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testIndexOfD() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			return list.indexOf(new Integer(4))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testIndexOfD", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			
			return list.remove(1)==4;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			
			return list.remove(2)==3;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testRemoveIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexOneFromThreeElementList_testRemoveIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			list.remove(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexOneFromThreeElementList_testRemoveIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean setIndexOneFromThreeElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = setIndexOneFromThreeElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexOneFromThreeElementList_testToString", e.toString());
			return false;
		}
	}

	

	/**
	 * Test 42
	 * Returns a DoubleLinkedList for the "[A,B,C] -> set(2,D) -> [A,B,D]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> setIndexTwoFromThreeElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.set(2, new Integer(4));
		return list;

	}

	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddToFront() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			Integer i = new Integer(3);
			list.addToFront(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testAddToFront", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddToRear() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			Integer i = new Integer(3);
			list.addToRear(i);
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testAddToRear", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testRemoveFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return list.removeFirst()==1;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testRemoveFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testRemoveLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return list.removeLast()==4;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testRemoveLast", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testFirst() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return list.first()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testFirst", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testLast() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			
			return list.last()==4;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testLast", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testIsEmpty() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return (list.isEmpty() == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testIsEmpty", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testSize() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return (list.size() == 3);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testSize", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testIterator() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testIterator", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testIteratorHasNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			return (it.hasNext() == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testIteratorHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testIteratorNext() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			Iterator<Integer> it = list.iterator();
			it.next();
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testIteratorNext", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testContainsOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return (list.contains(new Integer(1)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testContainsOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testContainsTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return (list.contains(new Integer(2)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testContainsTwo", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testContainsThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return (list.contains(new Integer(4)) == true);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testContainsThree", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testContainsFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return (list.contains(new Integer(3)) == false);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testContainsFour", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testRemoveElementOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return list.remove(new Integer(1))==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testRemoveElementOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testRemoveElementTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return list.remove(new Integer(2))==2;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testRemoveElementTwo", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testRemoveElementThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.remove(new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexTwoFromThreeElementList_testRemoveElementThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testRemoveElementFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return list.remove(new Integer(4))==4;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testRemoveElementFour", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddAfterOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.addAfter(new Integer(3), new Integer(1));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testAddAfterOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddAfterTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.addAfter(new Integer(3), new Integer(2));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddAfterThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.addAfter(new Integer(4), new Integer(3));
			return false;
		} catch (ElementNotFoundException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexTwoFromThreeElementList_testAddAfterThree", "ElementNotFoundException", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddAfterFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.addAfter(new Integer(3), new Integer(4));
			return true;
		}catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testAddAfterFour", e.toString());
			return false;
		}
	}
	
	/** toString() is difficult to test - would like to confirm that
	 * the default address output has been overridden
	 * @return test success */
	private boolean setIndexTwoFromThreeElementList_testToString() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			String str = list.toString();
			System.out.println("toString() output:\n" + str);
			if (str.length() == 0) {
				return false;
			}
			char lastChar = str.charAt(str.length()-1);
			if (str.contains("@")
					&& !str.contains(" ")
					&& Character.isLetter(str.charAt(0)) 
					&& (Character.isDigit(lastChar)
							||
							(lastChar >= 'a' && lastChar <= 'f'))) {
				return false; //looks like default toString()
			}
			return true;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testToString", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.add(0, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testAddIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.add(1, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testAddIndexOne", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.add(2, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testAddAfterTwo", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.add(3, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testAddAfterThree", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAddIndexFour() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.add(4, new Integer(3));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexTwoFromThreeElementList_testAddIndexFour", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testSetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.set(0, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testSetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testSetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.set(1, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testSetIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testSetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.set(2, new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testSetIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testSetIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.set(3, new Integer(3));
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexTwoFromThreeElementList_testAddIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testAdd() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.add(new Integer(3));
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testAdd", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testGetZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			
			return list.get(0) == 1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testGetZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testGetOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			
			return list.get(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testGetOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testGetTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			
			return list.get(2)==4;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testGetTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testGetThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.get(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexTwoFromThreeElementList_testGetThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testIndexOfA() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return list.indexOf(new Integer(1))==0;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testIndexOfA", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testIndexOfB() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return list.indexOf(new Integer(2))==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testIndexOfB", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testIndexOfC() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return list.indexOf(new Integer(3))==-1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testIndexOfC", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testIndexOfD() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			return list.indexOf(new Integer(4))==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testIndexOfD", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testRemoveIndexZero() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			
			return list.remove(0)==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testRemoveIndexZero", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testRemoveIndexOne() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			
			return list.remove(1)==2;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testRemoveIndexOne", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testRemoveIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			
			return list.remove(2)==4;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "setIndexTwoFromThreeElementList_testRemoveIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean setIndexTwoFromThreeElementList_testRemoveIndexThree() {
		try {
			DoubleLinkedList<Integer> list = setIndexTwoFromThreeElementList();
			list.remove(3);
			return false;
		} catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "setIndexTwoFromThreeElementList_testRemoveIndexThree", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 43
	 * Returns a DoubleLinkedList for the "[A] -> iterator remove() after previous() returns A -> []" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> iterRemoveAfterPreviousFromNewList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		ListIterator<Integer> iter = list.listIterator();
		iter.add(new Integer(1));
		iter.previous();
		iter.remove();
		
		return list;

	}

	/** @return test success */
	private boolean iterRemoveAfterPreviousFromNewList_testSize() {
		try {
			DoubleLinkedList<Integer> list = iterRemoveAfterPreviousFromNewList();
			
			return list.size()==0;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "iterRemoveAfterPreviousFromNewList_testSize", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean iterRemoveAfterPreviousFromNewList_testHasNext() {
		try {
			DoubleLinkedList<Integer> list = iterRemoveAfterPreviousFromNewList();
			Iterator<Integer> iter = list.iterator();
			return iter.hasNext()==false;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "iterRemoveAfterPreviousFromNewList_testHasNext", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean iterRemoveAfterPreviousFromNewList_testRemove() {
		try {
			DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
			ListIterator<Integer> iter = list.listIterator();
			iter.add(new Integer(1));
			iter.previous();
			iter.remove();
			iter.remove();
			return false;
		} catch (IllegalStateException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "iterRemoveAfterPreviousFromNewList_testRemove", "IllegalStateException", e.toString());
			return false;
		}
	}

	/**
	 * Test 44
	 * Returns a DoubleLinkedList for the "[A,B,C] -> iterator set(D) after previous() returns B -> [A,B,D]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> iterSetAfterPreviousFromThreeElementList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		ListIterator<Integer> iter = list.listIterator();
		iter.add(new Integer(1));
		iter.add(new Integer(2));
		iter.add(new Integer(3));
		iter.previous();
		iter.set(new Integer (4));
		
		return list;
	}
	
	/** @return test success */
	private boolean iterSetAfterPreviousFromThreeElementList_testGetIndexTwo() {
		try {
			DoubleLinkedList<Integer> list = iterSetAfterPreviousFromThreeElementList();
			
			return list.get(2)==4;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "iterSetAfterPreviousFromThreeElementList_testGetIndexTwo", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean iterSetAfterPreviousFromThreeElementList_testSet() {
		try {
			DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
			ListIterator<Integer> iter = list.listIterator();
			iter.add(new Integer(1));
			iter.add(new Integer(2));
			iter.add(new Integer(3));
			iter.previous();
			iter.set(new Integer (4));
			iter.set(new Integer (7));
			return false;

		} catch (IllegalStateException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "iterSetAfterPreviousFromThreeElementList_testSet", "IllegalStateException", e.toString());
			return false;
		}
	}
	
	/**
	 * Test 45
	 * Returns a DoubleLinkedList for the "[] -> iterator add(A) -> [A]" scenario
	 *
	 * @return an DoubleLinkedList
	 */
	private DoubleLinkedList<Integer> iterAddFromNewList() {
		
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		ListIterator<Integer> iter = list.listIterator();
		iter.add(new Integer(1));
		
		return list;
	}
	/** @return test success */
	private boolean iterAddFromNewList_testGetIndexZero() {
		try {
			DoubleLinkedList<Integer> list = iterAddFromNewList();
			
			return list.get(0)==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "iterAddFromNewList_testGetIndexZero", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean iterAddFromNewList_testGetIndexOne() {
		try {
			DoubleLinkedList<Integer> list = iterAddFromNewList();
			list.get(1);
			
			return false;
		}  catch (IndexOutOfBoundsException e) {
			return true;
		} catch (Exception e) {
			System.out.printf("%s expected %s, caught %s\n", "iterAddFromNewList_testGetIndexOne", "IndexOutOfBoundsException", e.toString());
			return false;
		}
	}


	/** @return test success */
	private boolean iterAddFromNewList_testNextIndex() {
		try {
			DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
			ListIterator<Integer> iter = list.listIterator();
			iter.add(new Integer(1));
			
			return iter.nextIndex()==1;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "iterAddFromNewList_testNextIndex", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean iterAddFromNewList_testPreviousIndex() {
		try {
			DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
			ListIterator<Integer> iter = list.listIterator();
			iter.add(new Integer(1));
			
			return iter.previousIndex()==0;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "iterAddFromNewList_testPreviousIndex", e.toString());
			return false;
		}
	}

	/**
	 * Test 46
	 * Returns a DoubleLinkedList for the "[A] -> iterator add(B) after (previous() then next())returns A -> [A,B]" scenario
	 *
	 * @return an DoubleLinkedList
	 */

	
	/** @return test success */
	private boolean iterAddAfterPreviousAndNextFromSingleElementList_testHasNext() {
		try {
			DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
			ListIterator<Integer> iter = list.listIterator();
			iter.add(new Integer(1));
			iter.previous();
			iter.next();

			return !iter.hasNext();
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "iterAddAfterPreviousAndNextFromSingleElementList_testHasNext", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean iterAddAfterPreviousAndNextFromSingleElementList_testRemove() {
		try {
			DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
			ListIterator<Integer> iter = list.listIterator();
			iter.add(new Integer(1));
			iter.previous();
			iter.next();
			iter.remove();
			
			return true;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "iterAddAfterPreviousAndNextFromSingleElementList_testRemove", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean iterAddAfterPreviousAndNextFromSingleElementList_testPrevious() {
		try {
			DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
			ListIterator<Integer> iter = list.listIterator();
			iter.add(new Integer(1));
			iter.previous();
			iter.next();
			
			return iter.previous()==1;
		}  catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "iterAddAfterPreviousAndNextFromSingleElementList_testPrevious", e.toString());
			return false;
		}
	}
}

