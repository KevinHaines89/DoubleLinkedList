import java.awt.Point;
import java.util.Random;


/**
 * Performs a variety of tests on the eMergeSort class in order to determine
 * of it is sorting the elements in a DoubleLinkedList appropriately.
 * @author Kevin Haines
 */
public class MergeSortTester {

	private int passes = 0;
	private int failures = 0;
	private int total = 0;
	
	/** @param args not used */
	public static void main(String[] args) 
	{

		MergeSortTester tester = new MergeSortTester();
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
		printTest("emptyList_testFindLargest", emptyList_testFindLargest());
		printTest("emptyList_testFindSmallest", emptyList_testFindSmallest());
		printTest("emptyList_testSort", emptyList_testSort());
		printTest("emptyList_testFindLargestComp", emptyList_testFindLargestComp());
		printTest("emptyList_testFindSmallestComp", emptyList_testFindSmallestComp());
		printTest("emptyList_testSortComp", emptyList_testSortComp());
		emptyList_testToString(); //For further confirmation of the accuracy of the tests
		
		// 2-TESTS ON  [A]
		printTest("singleElementList_testFindLargest", singleElementList_testFindLargest());
		printTest("singleElementList_testFindSmallest", singleElementList_testFindSmallest());
		printTest("singleElementList_testSort", singleElementList_testSort());
		printTest("singleElementList_testFindLargestComp", singleElementList_testFindLargestComp());
		printTest("singleElementList_testFindSmallestComp", singleElementList_testFindSmallestComp());
		printTest("singleElementList_testSortComp", singleElementList_testSortComp());
		singleElementList_testToString();//For further confirmation of the accuracy of the tests
		
		// 3-TESTS ON  [A,B]
		printTest("orderedTwoElementList_testFindLargest", orderedTwoElementList_testFindLargest());
		printTest("orderedTwoElementList_testFindSmallest", orderedTwoElementList_testFindSmallest());
		printTest("orderedTwoElementList_testSort", orderedTwoElementList_testSort());
		printTest("orderedTwoElementList_testFindLargestComp", orderedTwoElementList_testFindLargestComp());
		printTest("orderedTwoElementList_testFindSmallestComp", orderedTwoElementList_testFindSmallestComp());
		printTest("orderedTwoElementList_testSortComp", orderedTwoElementList_testSortComp());
		orderedTwoElementList_testToString();//For further confirmation of the accuracy of the tests
		
		// 4-TESTS ON  [B,A]
		printTest("unorderedTwoElementList_testFindLargest", unorderedTwoElementList_testFindLargest());
		printTest("unorderedTwoElementList_testFindSmallest", unorderedTwoElementList_testFindSmallest());
		printTest("unorderedTwoElementList_testSort", unorderedTwoElementList_testSort());
		printTest("unorderedTwoElementList_testFindLargestComp", unorderedTwoElementList_testFindLargestComp());
		printTest("unorderedTwoElementList_testFindSmallestComp", unorderedTwoElementList_testFindSmallestComp());
		printTest("unorderedTwoElementList_testSortComp", unorderedTwoElementList_testSortComp());
		unorderedTwoElementList_testToString();//For further confirmation of the accuracy of the tests
		
		// 5-TESTS ON  [A,A]
		printTest("duplicatesTwoElementList_testFindLargest", duplicatesTwoElementList_testFindLargest());
		printTest("duplicatesTwoElementList_testFindSmallest", duplicatesTwoElementList_testFindSmallest());
		printTest("duplicatesTwoElementList_testSort", duplicatesTwoElementList_testSort());
		printTest("duplicatesTwoElementList_testFindLargestComp", duplicatesTwoElementList_testFindLargestComp());
		printTest("duplicatesTwoElementList_testFindSmallestComp", duplicatesTwoElementList_testFindSmallestComp());
		printTest("duplicatesTwoElementList_testSortComp", duplicatesTwoElementList_testSortComp());
		duplicatesTwoElementList_testToString();//For further confirmation of the accuracy of the tests
		
		// 6-TESTS ON  [A,B,C]
		printTest("orderedThreeElementList_testFindLargest", orderedThreeElementList_testFindLargest());
		printTest("orderedThreeElementList_testFindSmallest", orderedThreeElementList_testFindSmallest());
		printTest("orderedThreeElementList_testSort", orderedThreeElementList_testSort());
		printTest("orderedThreeElementList_testFindLargestComp", orderedThreeElementList_testFindLargestComp());
		printTest("orderedThreeElementList_testFindSmallestComp", orderedThreeElementList_testFindSmallestComp());
		printTest("orderedThreeElementList_testSortComp", orderedThreeElementList_testSortComp());
		orderedThreeElementList_testToString();//For further confirmation of the accuracy of the tests
		
		// 7-TESTS ON  [B,C,A]
		printTest("unorderedThreeElementList1_testFindLargest", unorderedThreeElementList1_testFindLargest());
		printTest("unorderedThreeElementList1_testFindSmallest", unorderedThreeElementList1_testFindSmallest());
		printTest("unorderedThreeElementList1_testSort", unorderedThreeElementList1_testSort());
		printTest("unorderedThreeElementList1_testFindLargestComp", unorderedThreeElementList1_testFindLargestComp());
		printTest("unorderedThreeElementList1_testFindSmallestComp", unorderedThreeElementList1_testFindSmallestComp());
		printTest("unorderedThreeElementList1_testSortComp", unorderedThreeElementList1_testSortComp());
		unorderedThreeElementList1_testToString();//For further confirmation of the accuracy of the tests
		
		// 8-TESTS ON  [C,A,B]
		printTest("unorderedThreeElementList2_testFindLargest", unorderedThreeElementList2_testFindLargest());
		printTest("unorderedThreeElementList2_testFindSmallest", unorderedThreeElementList2_testFindSmallest());
		printTest("unorderedThreeElementList2_testSort", unorderedThreeElementList2_testSort());
		printTest("unorderedThreeElementList2_testFindLargestComp", unorderedThreeElementList2_testFindLargestComp());
		printTest("unorderedThreeElementList2_testFindSmallestComp", unorderedThreeElementList2_testFindSmallestComp());
		printTest("unorderedThreeElementList2_testSortComp", unorderedThreeElementList2_testSortComp());
		unorderedThreeElementList2_testToString();//For further confirmation of the accuracy of the tests
		
		// 9-TESTS ON  [A,B,A]
		printTest("duplicatesThreeElementList_testFindLargest", duplicatesThreeElementList_testFindLargest());
		printTest("duplicatesThreeElementList_testFindSmallest", duplicatesThreeElementList_testFindSmallest());
		printTest("duplicatesThreeElementList_testSort", duplicatesThreeElementList_testSort());
		printTest("duplicatesThreeElementList_testFindLargestComp", duplicatesThreeElementList_testFindLargestComp());
		printTest("duplicatesThreeElementList_testFindSmallestComp", duplicatesThreeElementList_testFindSmallestComp());
		printTest("duplicatesThreeElementList_testSortComp", duplicatesThreeElementList_testSortComp());
		duplicatesThreeElementList_testToString();//For further confirmation of the accuracy of the tests
		
		
		/////////////////
		//final verdict
		/////////////////
		printFinalSummary();
	}
	

	
	/**
	 * Test 1
	 * Returns an empty DoubleLinkedList []
	 *
	 * @return a new DoubleLinkedList
	 */

	private DoubleLinkedListADT<Integer> emptyList() {
			return new DoubleLinkedList<Integer>();

	}
	/** @return test success */
	private boolean emptyList_testSort() {
		try {
			DoubleLinkedListADT<Integer> list = emptyList();
			MergeSort.sort(list);
			return isSameList(list, emptyList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "emptyList_testSort", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean emptyList_testSortComp() {
		try {
			DoubleLinkedListADT<Integer> list = emptyList();
			MergeSort.sort(list, new ReverseComparator());
			return isSameList(list, emptyList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "emptyList_testSortComp", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean emptyList_testFindSmallest() {
		try {
			DoubleLinkedListADT<Integer> list = emptyList();
			
			return MergeSort.findSmallest(list)==null;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "emptyList_testFindSmallest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean emptyList_testFindSmallestComp() {
		try {
			DoubleLinkedListADT<Integer> list = emptyList();
			
			return MergeSort.findSmallest(list, new ReverseComparator())==null;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "emptyList_testFindSmallestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean emptyList_testFindLargest() {
		try {
			DoubleLinkedListADT<Integer> list = emptyList();
			
			return MergeSort.findLargest(list)==null;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "emptyList_testFindLargest", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean emptyList_testFindLargestComp() {
		try {
			DoubleLinkedListADT<Integer> list = emptyList();
			
			return MergeSort.findLargest(list, new ReverseComparator())==null;
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "emptyList_testFindLargestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private void emptyList_testToString() {
		try {
			DoubleLinkedListADT<Integer> list = emptyList();
			System.out.print("emptyList: Starting List:");
			System.out.println(list);
			MergeSort.sort(list);
			System.out.print("emptyList: After Nautral Ordering Sort:");
			System.out.println(list);
			list = emptyList();
			MergeSort.sort(list, new ReverseComparator());
			System.out.print("emptyList: After Reverse Ordering Sort:");
			System.out.println(list);
			
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "emptyList_testToString", e.toString());
			
		}
	}
	
	
	/**
	 * Test 2
	 * Returns the DoubleLinkedList [A]
	 *
	 * @return a new DoubleLinkedList
	 */
	
	private DoubleLinkedListADT<Integer> singleElementList() {
		DoubleLinkedListADT<Integer> list = new DoubleLinkedList<Integer>();
		list.addToFront(new Integer(1));
		return list;

	}
	/** @return test success */
	private boolean singleElementList_testSort() {
		try {
			DoubleLinkedListADT<Integer> list = singleElementList();
			MergeSort.sort(list);
			return isSameList(list, singleElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "singleElementList_testSort", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean singleElementList_testSortComp() {
		try {
			DoubleLinkedListADT<Integer> list = singleElementList();
			MergeSort.sort(list, new ReverseComparator());
			return isSameList(list, singleElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "singleElementList_testSortComp", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean singleElementList_testFindSmallest() {
		try {
			DoubleLinkedListADT<Integer> list = singleElementList();
			
			return MergeSort.findSmallest(list).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "singleElementList_testFindSmallest", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean singleElementList_testFindSmallestComp() {
		try {
			DoubleLinkedListADT<Integer> list = singleElementList();
			
			return MergeSort.findSmallest(list, new ReverseComparator()).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "singleElementList_testFindSmallestComp", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean singleElementList_testFindLargest() {
		try {
			DoubleLinkedListADT<Integer> list = singleElementList();
			
			return MergeSort.findLargest(list).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "singleElementList_testFindLargest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean singleElementList_testFindLargestComp() {
		try {
			DoubleLinkedListADT<Integer> list = singleElementList();
			
			return MergeSort.findLargest(list, new ReverseComparator()).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "singleElementList_testFindLargestComp", e.toString());
			return false;
		}
	}
	/** @return test success */
	private void singleElementList_testToString() {
		try {
			DoubleLinkedListADT<Integer> list = singleElementList();
			System.out.print("singleElementList: Starting List:");
			System.out.println(list);
			MergeSort.sort(list);
			System.out.print("singleElementList: After Nautral Ordering Sort:");
			System.out.println(list);
			list = singleElementList();
			MergeSort.sort(list, new ReverseComparator());
			System.out.print("singleElementList: After Reverse Ordering Sort:");
			System.out.println(list);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "singleElementList_testToString", e.toString());
		}
	}
		
	/**
	 * Test 3
	 * Returns the DoubleLinkedList [A,B]
	 *
	 * @return a new DoubleLinkedList
	 */
	
	private DoubleLinkedListADT<Integer> orderedTwoElementList() {
		DoubleLinkedListADT<Integer> list = new DoubleLinkedList<Integer>();
		list.addToFront(new Integer(1));
		list.addToRear(new Integer(2));

		return list;

	}
	/** @return test success */
	private boolean orderedTwoElementList_testSort() {
		try {
			DoubleLinkedListADT<Integer> list = orderedTwoElementList();
			MergeSort.sort(list);
			
			return isSameList(list, orderedTwoElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedTwoElementList_testSort", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean orderedTwoElementList_testSortComp() {
		try {
			DoubleLinkedListADT<Integer> list = orderedTwoElementList();
			MergeSort.sort(list, new ReverseComparator());
			
			DoubleLinkedListADT<Integer> reversedList = new DoubleLinkedList<Integer>();
			reversedList.addToRear(new Integer(2));
			reversedList.addToRear(new Integer(1));

			
			return isSameList(list, reversedList);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedTwoElementList_testSortComp", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean orderedTwoElementList_testFindSmallest() {
		try {
			DoubleLinkedListADT<Integer> list = orderedTwoElementList();
			
			return MergeSort.findSmallest(list).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedTwoElementList_testFindSmallest", e.toString());
			return false;
		}
	}

	/** @return test success */
	private boolean orderedTwoElementList_testFindSmallestComp() {
		try {
			DoubleLinkedListADT<Integer> list = orderedTwoElementList();
			
			return MergeSort.findSmallest(list, new ReverseComparator()).equals(new Integer(2));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedTwoElementList_testFindSmallestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean orderedTwoElementList_testFindLargest() {
		try {
			DoubleLinkedListADT<Integer> list = orderedTwoElementList();
			
			return MergeSort.findLargest(list).equals(new Integer(2));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedTwoElementList_testFindLargest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean orderedTwoElementList_testFindLargestComp() {
		try {
			DoubleLinkedListADT<Integer> list = orderedTwoElementList();
			
			return MergeSort.findLargest(list, new ReverseComparator()).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedTwoElementList_testFindLargestComp", e.toString());
			return false;
		}
	}
	
	
	/** @return test success */
	private void orderedTwoElementList_testToString() {
		try {
			DoubleLinkedListADT<Integer> list = orderedTwoElementList();
			System.out.print("orderedTwoElementList: Starting List:");
			System.out.println(list);
			MergeSort.sort(list);
			System.out.print("orderedTwoElementList: After Nautral Ordering Sort:");
			System.out.println(list);
			list = orderedTwoElementList();
			MergeSort.sort(list, new ReverseComparator());
			System.out.print("orderedTwoElementList: After Reverse Ordering Sort:");
			System.out.println(list);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedTwoElementList_testToString", e.toString());
		}
	}
	
	/**
	 * Test 4
	 * Returns the DoubleLinkedList [B,A]
	 *
	 * @return a new DoubleLinkedList
	 */
	
	private DoubleLinkedListADT<Integer> unorderedTwoElementList() {
		DoubleLinkedListADT<Integer> list = new DoubleLinkedList<Integer>();
		list.addToFront(new Integer(2));
		list.addToRear(new Integer(1));
	
		return list;
	
	}
	/** @return test success */
	private boolean unorderedTwoElementList_testSort() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedTwoElementList();
			MergeSort.sort(list);
			
			return isSameList(list, orderedTwoElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedTwoElementList_testSort", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedTwoElementList_testSortComp() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedTwoElementList();
			MergeSort.sort(list, new ReverseComparator());
			
			return isSameList(list, unorderedTwoElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedTwoElementList_testSortComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedTwoElementList_testFindSmallest() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedTwoElementList();
			
			return MergeSort.findSmallest(list).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedTwoElementList_testFindSmallest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedTwoElementList_testFindSmallestComp() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedTwoElementList();
			
			return MergeSort.findSmallest(list, new ReverseComparator()).equals(new Integer(2));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedTwoElementList_testFindSmallestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedTwoElementList_testFindLargest() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedTwoElementList();
			
			return MergeSort.findLargest(list).equals(new Integer(2));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedTwoElementList_testFindLargest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedTwoElementList_testFindLargestComp() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedTwoElementList();
			
			return MergeSort.findLargest(list, new ReverseComparator()).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedTwoElementList_testFindLargestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private void unorderedTwoElementList_testToString() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedTwoElementList();
			System.out.print("unorderedTwoElementList: Starting List:");
			System.out.println(list);
			MergeSort.sort(list);
			System.out.print("unorderedTwoElementList: After Nautral Ordering Sort:");
			System.out.println(list);
			list = unorderedTwoElementList();
			MergeSort.sort(list, new ReverseComparator());
			System.out.print("unorderedTwoElementList: After Reverse Ordering Sort:");
			System.out.println(list);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedTwoElementList_testToString", e.toString());
		}
	}

	/**
	 * Test 5
	 * Returns the DoubleLinkedList [A,A]
	 *
	 * @return a new DoubleLinkedList
	 */
	
	private DoubleLinkedListADT<Integer> duplicatesTwoElementList() {
		DoubleLinkedListADT<Integer> list = new DoubleLinkedList<Integer>();
		list.addToFront(new Integer(1));
		list.addToRear(new Integer(1));
	
		return list;
	
	}
	/** @return test success */
	private boolean duplicatesTwoElementList_testSort() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesTwoElementList();
			MergeSort.sort(list);

			return isSameList(list, duplicatesTwoElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesTwoElementList_testSort", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean duplicatesTwoElementList_testSortComp() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesTwoElementList();
			MergeSort.sort(list, new ReverseComparator());

			return isSameList(list, duplicatesTwoElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesTwoElementList_testSortComp", e.toString());
			return false;
		}
	}
	/** @return test success */
	private boolean duplicatesTwoElementList_testFindSmallest() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesTwoElementList();
			
			return MergeSort.findSmallest(list).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesTwoElementList_testFindSmallest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean duplicatesTwoElementList_testFindSmallestComp() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesTwoElementList();
			
			return MergeSort.findSmallest(list, new ReverseComparator()).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesTwoElementList_testFindSmallestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean duplicatesTwoElementList_testFindLargest() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesTwoElementList();
			
			return MergeSort.findLargest(list).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesTwoElementList_testFindLargest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean duplicatesTwoElementList_testFindLargestComp() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesTwoElementList();
			
			return MergeSort.findLargest(list, new ReverseComparator()).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesTwoElementList_testFindLargestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private void duplicatesTwoElementList_testToString() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesTwoElementList();
			System.out.print("duplicatesTwoElementList: Starting List:");
			System.out.println(list);
			MergeSort.sort(list);
			System.out.print("duplicatesTwoElementList: After Nautral Ordering Sort:");
			System.out.println(list);
			list = duplicatesTwoElementList();
			MergeSort.sort(list, new ReverseComparator());
			System.out.print("duplicatesTwoElementList: After Reverse Ordering Sort:");
			System.out.println(list);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesTwoElementList_testToString", e.toString());
		}
	}

	/**
	 * Test 6
	 * Returns the DoubleLinkedList [A,B,C]
	 *
	 * @return a new DoubleLinkedList
	 */
	
	private DoubleLinkedListADT<Integer> orderedThreeElementList() {
		DoubleLinkedListADT<Integer> list = new DoubleLinkedList<Integer>();
		list.addToFront(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));

		return list;
	
	}
	/** @return test success */
	private boolean orderedThreeElementList_testSort() {
		try {
			DoubleLinkedListADT<Integer> list = orderedThreeElementList();
			MergeSort.sort(list);
			return isSameList(list, orderedThreeElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedThreeElementList_testSort", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean orderedThreeElementList_testSortComp() {
		try {
			DoubleLinkedListADT<Integer> list = orderedThreeElementList();
			MergeSort.sort(list, new ReverseComparator());

			
			return isSameList(list, reverseThreeElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedThreeElementList_testSortComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean orderedThreeElementList_testFindSmallest() {
		try {
			DoubleLinkedListADT<Integer> list = orderedThreeElementList();
			
			return MergeSort.findSmallest(list).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedThreeElementList_testFindSmallest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean orderedThreeElementList_testFindSmallestComp() {
		try {
			DoubleLinkedListADT<Integer> list = orderedThreeElementList();
			
			return MergeSort.findSmallest(list, new ReverseComparator()).equals(new Integer(3));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedThreeElementList_testFindSmallestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean orderedThreeElementList_testFindLargest() {
		try {
			DoubleLinkedListADT<Integer> list = orderedThreeElementList();
			
			return MergeSort.findLargest(list).equals(new Integer(3));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedThreeElementList_testFindLargest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean orderedThreeElementList_testFindLargestComp() {
		try {
			DoubleLinkedListADT<Integer> list = orderedThreeElementList();
			
			return MergeSort.findLargest(list, new ReverseComparator()).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedThreeElementList_testFindLargestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private void orderedThreeElementList_testToString() {
		try {
			DoubleLinkedListADT<Integer> list = orderedThreeElementList();
			System.out.print("orderedThreeElementList: Starting List:");
			System.out.println(list);
			MergeSort.sort(list);
			System.out.print("orderedThreeElementList: After Nautral Ordering Sort:");
			System.out.println(list);
			list = orderedThreeElementList();
			MergeSort.sort(list, new ReverseComparator());
			System.out.print("orderedThreeElementList: After Reverse Ordering Sort:");
			System.out.println(list);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "orderedThreeElementList_testToString", e.toString());
		}
	}
	
	/**
	 * Test 7
	 * Returns the DoubleLinkedList [B,C,A]
	 *
	 * @return a new DoubleLinkedList
	 */
	
	private DoubleLinkedListADT<Integer> unorderedThreeElementList1() {
		DoubleLinkedListADT<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(3));
		list.addToRear(new Integer(1));

		return list;
	
	}
	/** @return test success */
	private boolean unorderedThreeElementList1_testSort() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList1();
			MergeSort.sort(list);
			
			return isSameList(list, orderedThreeElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList1_testSort", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedThreeElementList1_testSortComp() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList1();
			MergeSort.sort(list, new ReverseComparator());
			
			return isSameList(list, reverseThreeElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList1_testSortComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedThreeElementList1_testFindSmallest() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList1();
			
			return MergeSort.findSmallest(list).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList1_testFindSmallest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedThreeElementList1_testFindSmallestComp() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList1();
			
			return MergeSort.findSmallest(list, new ReverseComparator()).equals(new Integer(3));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList1_testFindSmallestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedThreeElementList1_testFindLargest() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList1();
			
			return MergeSort.findLargest(list).equals(new Integer(3));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList1_testFindLargest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedThreeElementList1_testFindLargestComp() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList1();
			
			return MergeSort.findLargest(list, new ReverseComparator()).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList1_testFindLargestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private void unorderedThreeElementList1_testToString() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList1();
			System.out.print("unorderedThreeElementList1: Starting List:");
			System.out.println(list);
			MergeSort.sort(list);
			System.out.print("unorderedThreeElementList1: After Nautral Ordering Sort:");
			System.out.println(list);
			list = unorderedThreeElementList1();
			MergeSort.sort(list, new ReverseComparator());
			System.out.print("unorderedThreeElementList1: After Reverse Ordering Sort:");
			System.out.println(list);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList1_testToString", e.toString());
		}
	}
	
	/**
	 * Test 8
	 * Returns the DoubleLinkedList [C,A,B]
	 *
	 * @return a new DoubleLinkedList
	 */
	
	private DoubleLinkedListADT<Integer> unorderedThreeElementList2() {
		DoubleLinkedListADT<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(3));
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));

		return list;
	
	}
	/** @return test success */
	private boolean unorderedThreeElementList2_testSort() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList2();
			MergeSort.sort(list);
			
			return isSameList(list, orderedThreeElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList2_testSort", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedThreeElementList2_testSortComp() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList2();
			MergeSort.sort(list, new ReverseComparator());
			
			return isSameList(list, reverseThreeElementList());
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList2_testSortComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedThreeElementList2_testFindSmallest() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList2();
			
			return MergeSort.findSmallest(list).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList2_testFindSmallest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedThreeElementList2_testFindSmallestComp() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList2();
			
			return MergeSort.findSmallest(list, new ReverseComparator()).equals(new Integer(3));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList2_testFindSmallestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedThreeElementList2_testFindLargest() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList2();
			
			return MergeSort.findLargest(list).equals(new Integer(3));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList2_testFindLargest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean unorderedThreeElementList2_testFindLargestComp() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList2();
			
			return MergeSort.findLargest(list, new ReverseComparator()).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList2_testFindLargestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private void unorderedThreeElementList2_testToString() {
		try {
			DoubleLinkedListADT<Integer> list = unorderedThreeElementList2();
			System.out.print("unorderedThreeElementList2: Starting List:");
			System.out.println(list);
			MergeSort.sort(list);
			System.out.print("unorderedThreeElementList2: After Nautral Ordering Sort:");
			System.out.println(list);
			list = unorderedThreeElementList2();
			MergeSort.sort(list, new ReverseComparator());
			System.out.print("unorderedThreeElementList2: After Reverse Ordering Sort:");
			System.out.println(list);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "unorderedThreeElementList2_testToString", e.toString());
		}
	}
	
	/**
	 * Test 9
	 * Returns the DoubleLinkedList [A,B,A]
	 *
	 * @return a new DoubleLinkedList
	 */
	
	private DoubleLinkedListADT<Integer> duplicatesThreeElementList() {
		DoubleLinkedListADT<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(new Integer(1));
		list.addToRear(new Integer(2));
		list.addToRear(new Integer(1));

		return list;
	
	}
	/** @return test success */
	private boolean duplicatesThreeElementList_testSort() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesThreeElementList();
			MergeSort.sort(list);
			
			DoubleLinkedListADT<Integer> AABList = new DoubleLinkedList<Integer>();
			AABList.addToRear(new Integer(1));
			AABList.addToRear(new Integer(1));
			AABList.addToRear(new Integer(2));

			
			return isSameList(list, AABList);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesThreeElementList_testSort", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean duplicatesThreeElementList_testSortComp() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesThreeElementList();
			MergeSort.sort(list, new ReverseComparator());
			
			DoubleLinkedListADT<Integer> BAAList = new DoubleLinkedList<Integer>();
			BAAList.addToRear(new Integer(2));
			BAAList.addToRear(new Integer(1));
			BAAList.addToRear(new Integer(1));

			
			return isSameList(list, BAAList);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesThreeElementList_testSortComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean duplicatesThreeElementList_testFindSmallest() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesThreeElementList();
			
			return MergeSort.findSmallest(list).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesThreeElementList_testFindSmallest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean duplicatesThreeElementList_testFindSmallestComp() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesThreeElementList();
			
			return MergeSort.findSmallest(list, new ReverseComparator()).equals(new Integer(2));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesThreeElementList_testFindSmallestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean duplicatesThreeElementList_testFindLargest() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesThreeElementList();
			
			return MergeSort.findLargest(list).equals(new Integer(2));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesThreeElementList_testFindLargest", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private boolean duplicatesThreeElementList_testFindLargestComp() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesThreeElementList();
			
			return MergeSort.findLargest(list, new ReverseComparator()).equals(new Integer(1));
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesThreeElementList_testFindLargestComp", e.toString());
			return false;
		}
	}
	
	/** @return test success */
	private void duplicatesThreeElementList_testToString() {
		try {
			DoubleLinkedListADT<Integer> list = duplicatesThreeElementList();
			System.out.print("duplicatesThreeElementList: Starting List:");
			System.out.println(list);
			MergeSort.sort(list);
			System.out.print("duplicatesThreeElementList: After Nautral Ordering Sort:");
			System.out.println(list);
			list = duplicatesThreeElementList();
			MergeSort.sort(list, new ReverseComparator());
			System.out.print("duplicatesThreeElementList: After Reverse Ordering Sort:");
			System.out.println(list);
		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "duplicatesThreeElementList_testToString", e.toString());
		}
	}
	
	
	/**
	 * 
	 * Used in testing ReverseComparator
	 * @return The DoubleLinkedList [C, B, A]
	 */
	private DoubleLinkedListADT<Integer> reverseThreeElementList(){
		DoubleLinkedListADT<Integer> reverseList = emptyList();
		reverseList.addToRear(new Integer(3));
		reverseList.addToRear(new Integer(2));
		reverseList.addToRear(new Integer(1));
		return reverseList;
	}
	/**
	 * Used to compare two lists after sorting to verify that they contain the same elements.
	 * @param list1
	 * @param list2
	 * @return true if both lists contain the same elements in the same order, false otherwise.
	 */
	private boolean isSameList(DoubleLinkedListADT<Integer> list1, DoubleLinkedListADT<Integer> list2){
		try {
			if(list1.size()!=list2.size()){
				return false;
			}
			for (int i=0; i<list1.size(); i++){
				if(!list1.get(i).equals(list2.get(i))){
					return false;
				}
			}

			return true;

		} catch (Exception e) {
			System.out.printf("%s caught unexpected %s\n", "isSameList", e.toString());
			return false;
		}
		
	}
}
