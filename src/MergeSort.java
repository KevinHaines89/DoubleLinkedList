package com.doublell;
import java.util.*;

/**
 * Class for sorting DoubleLinkedLists using either natural order
 * or a Comparator.
 *
 * @author spanter, mvail, Kevin Haines
 */
public class MergeSort
{
	/**
	 * Sorts a list that implements the DoubleLinkedListADT using the
	 * natural ordering of list elements.
	 * DO NOT MODIFY THIS METHOD SIGNATURE
	 * 
	 * @param <T>
	 *            The data type in the list must extend Comparable
	 * @param list
	 *            The list that will be sorted
	 * @see DoubleLinkedListADT 
	 */
	public static <T extends Comparable<T>> void sort(DoubleLinkedListADT<T> list) {
		
		DoubleLinkedListADT<T> leftList = new DoubleLinkedList<T>();
		DoubleLinkedListADT<T> rightList = new DoubleLinkedList<T>();

		if(list.size()>1){

			int size = list.size();
			for(int i=0; i<size; i++){
				if(i<size/2){
					leftList.add(list.removeFirst());
				}
				else{
					rightList.add(list.removeFirst());
				}
			}

			sort(leftList);
			sort(rightList);	
		}
		
		while(leftList.size()!=0 && rightList.size()!=0){
			if(leftList.first().compareTo(rightList.first())==-1){
				list.addToRear(leftList.removeFirst());
			}
			else{
				list.addToRear(rightList.removeFirst());
			}
		}
		if(leftList.size()!=0){
			int size = leftList.size();
			for(int i=0; i<size; i++){
					list.addToRear(leftList.removeFirst());
			}
		}
		if(rightList.size()!=0){
			int size = rightList.size();
			for (int i=0; i<size; i++){
					list.addToRear(rightList.removeFirst());
			}
		}
		
				
	}

	/**
	 * Sorts a DoubleLinkedListADT with the provided Comparator.
	 * DO NOT MODIFY THIS METHOD SIGNATURE
	 * 
	 * @param <T>
	 *            The type of list to sort
	 * @param list
	 *            The list to sort
	 * @param c
	 *            The Comparator to use
	 * @see DoubleLinkedListADT
	 */
	public static <T> void sort(DoubleLinkedListADT<T> list, Comparator<T> c) {
		
		DoubleLinkedListADT<T> leftList = new DoubleLinkedList<T>();
		DoubleLinkedListADT<T> rightList = new DoubleLinkedList<T>();

		if(list.size()>1){

			int size = list.size();
			for(int i=0; i<size; i++){
				if(i<size/2){
					leftList.add(list.removeFirst());
				}
				else{
					rightList.add(list.removeFirst());
				}
			}

			sort(leftList, c);
			sort(rightList, c);	
		}
		
		while(leftList.size()!=0 && rightList.size()!=0){
			if( c.compare(leftList.first(), rightList.first())==-1){
				list.addToRear(leftList.removeFirst());
			}
			else{
				list.addToRear(rightList.removeFirst());
			}
		}
		if(leftList.size()!=0){
			int size = leftList.size();
			for(int i=0; i<size; i++){
					list.addToRear(leftList.removeFirst());
			}
		}
		if(rightList.size()!=0){
			int size = rightList.size();
			for (int i=0; i<size; i++){
					list.addToRear(rightList.removeFirst());
			}
		}
		

	}

	/**
	 * Finds the smallest element in a list according to the natural ordering of 
	 * list elements. Does not alter the order of list elements.
	 * DO NOT MODIFY THIS METHOD SIGNATURE
	 * 
	 * @param <T>
	 *            The type of object we are comparing
	 * @param list
	 *            The list we are passed
	 * @return The smallest element or null if list is empty
	 * @see DoubleLinkedListADT
	 */
	public static <T extends Comparable<T>> T findSmallest(DoubleLinkedListADT<T> list) {
		
		if(list.isEmpty()){
			return null;
		}
		ListIterator<T> lit = list.listIterator();
		return searchSmallest(lit);
	}

	
	/**
	 * Iterates through the list finding the smallest element in the list.
	 * @param lit
	 * @return
	 */
	private static <T extends Comparable<T>> T searchSmallest(ListIterator<T> lit){
		
		if(lit.hasNext()){
			return smallest(lit.next(), searchSmallest(lit));
		}
		return lit.previous();
	}
	
	/**
	 * Returns the element that is the smallest
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	private static <T extends Comparable<T>> T smallest(T obj1, T obj2){
		if(obj1.compareTo(obj2)==-1){
			return obj1;
		}
		return obj2;
	}


	/**
	 * Finds the smallest element in a list with a Custom comparator. Does not
	 * alter the order of list elements.
	 * DO NOT MODIFY THIS METHOD SIGNATURE
	 * 
	 * @param <T>
	 *            The type of object we are comparing
	 * @param list
	 *            The list we are passed
	 * @param c
	 *            The comparator to use
	 * @return The smallest element or null if list is empty
	 * @see DoubleLinkedListADT
	 */
	
	public static <T> T findSmallest(DoubleLinkedListADT<T> list, Comparator<T> c) {
		
		if(list.isEmpty()){
			return null;
		}
		ListIterator<T> lit = list.listIterator();
		return searchSmallest(lit,c);
	}

	
	/**
	 * Iterates through the list finding the smallest element in the list.
	 * @param lit
	 * @return
	 */
	private static <T> T searchSmallest(ListIterator<T> lit, Comparator<T> c){
		
		if(lit.hasNext()){
			return smallest(lit.next(), searchSmallest(lit, c), c);
		}
		return lit.previous();
	}
	
	/**
	 * Returns the element that is the smallest
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	private static <T> T smallest(T obj1, T obj2, Comparator<T> c){
		if(c.compare(obj1, obj2)==-1){
			return obj1;
		}
		return obj2;
	}

	/**
	 * Finds the largest element in a list according to the natural ordering of
	 * list elements. Does not alter the order of list elements.
	 * DO NOT MODIFY THIS METHOD SIGNATURE
	 * 
	 * @param <T>
	 *            The type of object we are comparing
	 * @param list
	 *            The list we are passed
	 * @return The largest element or null if list is empty
	 * @see DoubleLinkedListADT
	 */
	public static <T extends Comparable<T>> T findLargest(DoubleLinkedListADT<T> list) {
		if(list.isEmpty()){
			return null;
		}
		ListIterator<T> lit = list.listIterator();
		return searchLargest(lit);
	}

	
	/**
	 * Iterates through the list finding the largest element in the list.
	 * @param lit
	 * @return
	 */
	private static <T extends Comparable<T>> T searchLargest(ListIterator<T> lit){
		
		if(lit.hasNext()){
			return largest(lit.next(), searchLargest(lit));
		}
		return lit.previous();
	}
	
	/**
	 * Returns the element that is the largest
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	private static <T extends Comparable<T>> T largest(T obj1, T obj2){
		if(obj1.compareTo(obj2)==1){
			return obj1;
		}
		return obj2;
	}
	/**
	 * Finds the largest element in a list with a Custom comparator. Does not
	 * alter the order of list elements.
	 * DO NOT MODIFY THIS METHOD SIGNATURE
	 * 
	 * @param <T>
	 *            The type of object we are comparing
	 * @param list
	 *            The list we are passed
	 * @param c
	 *            The comparator to use
	 * @return The largest element or null if list is empty
	 * @see DoubleLinkedListADT
	 */
	public static <T> T findLargest(DoubleLinkedListADT<T> list, Comparator<T> c) {
		
		if(list.isEmpty()){
			return null;
		}
		ListIterator<T> lit = list.listIterator();
		return searchLargest(lit,c);
	}

	
	/**
	 * Iterates through the list finding the largest element in the list.
	 * @param lit
	 * @return
	 */
	private static <T> T searchLargest(ListIterator<T> lit, Comparator<T> c){
		
		if(lit.hasNext()){
			return largest(lit.next(), searchLargest(lit, c), c);
		}
		return lit.previous();
	}
	
	/**
	 * Returns the element that is the largest
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	private static <T> T largest(T obj1, T obj2, Comparator<T> c){
		if(c.compare(obj1, obj2)==1){
			return obj1;
		}
		return obj2;
	}
}
