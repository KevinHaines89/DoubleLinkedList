import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;


/**
 * This is double link List implemented using a linearNode
 * @author Kevin Haines
 * @param <T> generic
 */
public class DoubleLinkedList<T> implements DoubleLinkedListADT<T>{
	private LinearNode<T> head, tail;
	private int size, modCount;

	/**
	 * List Constructor
	 */
	public DoubleLinkedList(){
		head = tail = null;
		size = 0;
		modCount = 0;
	}
	@Override
	public void addToFront(T element) {
		LinearNode<T> newNode = new LinearNode<T>(element);
		if(isEmpty()){
			head=tail=newNode;
		}
		else {
			head.setPrevious(newNode);
			newNode.setNext(head);
			head=newNode;
		}

		modCount++;
		size++;
	}

	@Override
	public void addToRear(T element) {
		LinearNode<T> newNode = new LinearNode<T>(element);
		if(isEmpty()){
			head=tail=newNode;
		}
		else {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail=newNode;
		}

		modCount++;
		size++;

	}

	@Override
	public void addAfter(T element, T target) {
		if(!contains(target)){
			throw new ElementNotFoundException("DoubleLinkedList");
		}
		LinearNode<T> tempNode = head;
		if(!head.getElement().equals(target)){
			while(!tempNode.getNext().getElement().equals(target)){
				tempNode = tempNode.getNext();
			}
			tempNode= tempNode.getNext();
		}
		
		LinearNode<T> newNode = new LinearNode<T>(element);
		
		if(size==1){
			head.setNext(newNode);
			newNode.setPrevious(head);
			tail = newNode;
		}
		else if(target.equals(tail.getElement())){
			tempNode.setNext(newNode);
			newNode.setPrevious(tail);
			tail=newNode;
		}
		else{
			newNode.setNext(tempNode.getNext());
			tempNode.getNext().setPrevious(newNode);
			tempNode.setNext(newNode);
			newNode.setPrevious(tempNode);
		}
		
		size++;
		modCount++;

	}

	@Override
	public T removeFirst() {
		if(isEmpty())
			throw new EmptyCollectionException("DoubleLinkedList");
		
		T temp;
		if(size==1){
			temp=head.getElement();
			head=tail=null;
		}
		else{
			temp = head.getElement();
			head = head.getNext(); 
			head.setPrevious(null);
		}

		size--;
		modCount++;
		return temp;
	}

	@Override
	public T removeLast() {
		if(isEmpty())
			throw new EmptyCollectionException("DoubleLinkedList");
		
		T temp;
		if(size==1){
			temp=tail.getElement();
			head=tail=null;
		}
		else{
			temp = tail.getElement();
			tail = tail.getPrevious();
			tail.setNext(null);
		}
		size--;
		modCount++;
		return temp;
	}

	@Override
	public T remove(T element) {
		if(!contains(element))
			throw new ElementNotFoundException("DoubleLinkedList");
		
		T temp;
		LinearNode<T> tempNode = head;

		if(!head.getElement().equals(element)){
			while(!tempNode.getNext().getElement().equals(element)){
				tempNode=tempNode.getNext();
			}
			tempNode = tempNode.getNext();
		}
		temp = tempNode.getElement();
		
		if(size==1){
			head=tail=null;
		}
		else if(tempNode==head){
			head = head.getNext(); 
			head.setPrevious(null);
		}
		else if (tempNode==tail){
			tail = tail.getPrevious();
			tail.setNext(null);
		}
		else{
			tempNode.getPrevious().setNext(tempNode.getNext());
			tempNode.getNext().setPrevious(tempNode.getPrevious());
		}
		
		size--;
		modCount++;

		return temp;
	}

	@Override
	public T first() {
		if(isEmpty())
			throw new EmptyCollectionException("DoubleLinkedList");

		return head.getElement();
	}

	@Override
	public T last() {
		if(isEmpty())
			throw new EmptyCollectionException("DoubleLinkedList");

		return tail.getElement();
	}

	@Override
	public boolean contains(T target) {
		LinearNode<T> tempNode = head;
		
		if(isEmpty())
			return false;
		if(head.getElement().equals(target)){
			return true;
		}
		for(int i=0; i<size-1;i++){
			if(tempNode.getNext().getElement().equals(target)){
				return true;
			}
			tempNode = tempNode.getNext();
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyListIterator<T>();
	}

	@Override
	public void add(int index, T element) {
		if(index<0 || index>size)
			throw new IndexOutOfBoundsException("DoubleLinkedList");
		
		LinearNode<T> newNode = new LinearNode<T>(element);
		LinearNode<T> tempNode = head;
		for(int i =0; i<index;i++){
			tempNode=tempNode.getNext();
		}
		
		if(isEmpty()){
			head=tail=newNode;
		}
		else if(tempNode==null){
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail=newNode;
		}
		else if(tempNode==head){
			head.setPrevious(newNode);
			newNode.setNext(head);
			head=newNode;
		}
		else if (tempNode==tail){
			newNode.setNext(tail);
			newNode.setPrevious(tail.getPrevious());

			tail.getPrevious().setNext(newNode);
			tail.setPrevious(newNode);

		}
		else{
			tempNode.getPrevious().setNext(newNode);
			newNode.setPrevious(tempNode.getPrevious());
			tempNode.setPrevious(newNode);
			newNode.setNext(tempNode);
		}
		size++;
		modCount++;
	}

	@Override
	public void set(int index, T element) {
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("DoubleLinkedList");
		
		LinearNode<T> tempNode = head;

		for(int i =0; i<index;i++){
			tempNode=tempNode.getNext();
		}
		tempNode.setElement(element);
		modCount++;
	}

	@Override
	public void add(T element) {
		
		addToRear(element);
	}

	@Override
	public T get(int index) {
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("DoubleLinkedList");
		LinearNode<T> tempNode = head;

		for(int i =0; i<index;i++){
			tempNode=tempNode.getNext();
		}
		return tempNode.getElement();
	}

	@Override
	public int indexOf(T element) {
		
		if(!contains(element)){
			return -1;
		}
		int count=0;
		LinearNode<T> tempNode = head;

		if(!element.equals(head.getElement())){
			while(count<size && !tempNode.getElement().equals(element)){
				tempNode = tempNode.getNext();
				count++;
			}
		}

		return count;
	}

	@Override
	public T remove(int index) {
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("DoubleLinkedList");

		
		LinearNode<T> tempNode = head;
		for(int i =0; i<index;i++){
			tempNode=tempNode.getNext();
		}
		

		if(size==1){
			head=tail=null;
		}
		else if(tempNode==head){
			head = head.getNext(); 
			head.setPrevious(null);
		}
		else if (tempNode==tail){
			tail = tail.getPrevious();
			tail.setNext(null);
		}
		else{
			tempNode.getPrevious().setNext(tempNode.getNext());
			tempNode.getNext().setPrevious(tempNode.getPrevious());
		}

		size--;
		modCount++;
		return tempNode.getElement();
	}

	@Override
	public ListIterator<T> listIterator() {
		return new MyListIterator<T>();
	}

	@Override
	public ListIterator<T> listIterator(int startingIndex) {
		return new MyListIterator<T>(startingIndex);
	}
	/**
	 * Returns a string representation of this list.
	 *
	 * @return a string representation of the list    
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		LinearNode<T> tempNode = head;
		for(int i=0; i<size; i++){
			sb.append(tempNode.getElement()+", ");
			tempNode= tempNode.getNext();
		}
		if(size!=0)
			sb.delete(sb.length()-2, sb.length());
		sb.append("]");
		return sb.toString();
				
	}

	/**
	 * Internal List iterator for navigating through the list
	 * Cursor functions as the node which is returned when
	 * next is called.
	 * @author Kevin Haines
	 * @param <E>
	 */
	private class MyListIterator<E> implements ListIterator<T>
	{
		private int itModCount;
		private int nextIndex;
		private LinearNode<T> cursor;
		private boolean nextCalled, prevCalled;


		/**
		 * Iterator Constructor starting the cursor at the very start of the list.
		 */
		public MyListIterator(){
			itModCount=modCount;
			nextCalled = false;
			prevCalled = false;
			nextIndex=0;
			cursor = head;

		}
		/**
		 * Iterator Constructor with a given starting point
		 * @param startingIndex the that points to the element which is returned when next is called.
		 */
		public MyListIterator(int startingIndex){
			if(startingIndex <0 || startingIndex>size)
				throw new IndexOutOfBoundsException("DoubleLinkedList");
			
			nextIndex = startingIndex;	
			nextCalled = false;
			prevCalled = false;
			itModCount=modCount;
			LinearNode<T> tempNode  = head;
			for(int i=0; i<startingIndex; i++){
				tempNode=tempNode.getNext();
			}
			cursor = tempNode;

		}
		@Override
		public void add(T e) {
			if(itModCount!=modCount)
				throw new ConcurrentModificationException("DoubleLinkedList");
			
			LinearNode<T> newNode = new LinearNode<T>(e);
			if(isEmpty()){
				head = tail = newNode;
			}
			else if(cursor==null){
				newNode.setPrevious(tail);
				tail.setNext(newNode);
				tail=newNode;
			}
			else if(cursor==head){
				newNode.setNext(head);
				head.setPrevious(newNode);
				head=newNode;

				
			}
			else{
				newNode.setNext(cursor);
				newNode.setPrevious(cursor.getPrevious());
				cursor.getPrevious().setNext(newNode);
				cursor.setPrevious(newNode);
				if(cursor==head){
					head = newNode;
				}
			}
			size++;
			nextIndex++;
			modCount++;
			itModCount++;
			
		}
		@Override
		public boolean hasNext() {
			if(itModCount!=modCount)
				throw new ConcurrentModificationException("DoubleLinkedList");
			
			return cursor!=null;
		}
		@Override
		public boolean hasPrevious() {
			if(itModCount!=modCount)
				throw new ConcurrentModificationException("DoubleLinkedList");
			if(isEmpty()){
				return false;
			}
			else if(cursor==null){
				return true;
			}
			return cursor.getPrevious() !=null;
		}
		@Override
		public T next() {
			if(itModCount!=modCount)
				throw new ConcurrentModificationException("DoubleLinkedList");
			if(cursor==null)
				throw new NoSuchElementException("DoubleLinkedList");
			
			LinearNode<T> tempNode = cursor;
			cursor=cursor.getNext();
			nextIndex++;
			nextCalled=true;
			prevCalled=false;
			return tempNode.getElement();
		}
		@Override
		public int nextIndex() {
			if(itModCount!=modCount)
				throw new ConcurrentModificationException("DoubleLinkedList");
			return nextIndex;
		}
		@Override
		public T previous() {
			if(itModCount!=modCount)
				throw new ConcurrentModificationException("DoubleLinkedList");
			if(cursor==head || isEmpty())
				throw new NoSuchElementException("DoubleLinkedList");
			nextIndex--;
			prevCalled=true;
			nextCalled=false;
			if(cursor==null){
				cursor=tail;
				return tail.getElement();
			}
			cursor = cursor.getPrevious();
			
			return cursor.getElement();
		}
		@Override
		public int previousIndex() {
			if(itModCount!=modCount)
				throw new ConcurrentModificationException("DoubleLinkedList");
			return --nextIndex;
		}
		@Override
		public void remove() {
			if(itModCount!=modCount)
				throw new ConcurrentModificationException("DoubleLinkedList");
			if(!nextCalled && !prevCalled)
				throw new IllegalStateException("DoubleLinkedList");
			
			if(nextCalled){
				nextIndex--;
				if(size==1){
					head=tail=cursor=null;		
				}
				else if(cursor==null){
					tail=tail.getPrevious();
					tail.setNext(null);
				}
				else{
					if(cursor.getPrevious() !=null && cursor.getPrevious().getPrevious()!=null){
						cursor.setPrevious(cursor.getPrevious().getPrevious());
						cursor.getPrevious().setNext(cursor);
					}
					else{
						cursor.setPrevious(null);
						head=cursor;
					}
				}
			}
			if(prevCalled){
				if(size==1){
					head=tail=cursor=null;
				}
				else if(cursor.getPrevious()==null){
					head = cursor.getNext();
					head.setPrevious(null);
				}
				else{
					if(cursor.getNext()!=null){
						cursor.getPrevious().setNext(cursor.getNext());
						cursor.getNext().setPrevious(cursor.getPrevious());
					}
					else{
						tail = tail.getPrevious();
						tail.setNext(null);
					}
				}
			}
			prevCalled=false;
			nextCalled=false;
			size--;
			modCount++;
			itModCount++;
		}
		@Override
		public void set(T e) {
			if(itModCount!=modCount)
				throw new ConcurrentModificationException("DoubleLinkedList");	
			if(!nextCalled && !prevCalled)
				throw new IllegalStateException("DoubleLinkedList");
			
			if(nextCalled){
				if(size==1){
					head.setElement(e);
					tail.setElement(e);
				}else if(cursor==null){
					tail.setElement(e);
				}
				else{
					cursor.getPrevious().setElement(e);
				}
			}
			if(prevCalled){
				cursor.setElement(e);
			}
			
			prevCalled=false;
			nextCalled=false;
			modCount++;
			itModCount++;
		}
		
	}

}
