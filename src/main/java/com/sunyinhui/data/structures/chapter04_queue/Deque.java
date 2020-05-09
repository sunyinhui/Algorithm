package com.sunyinhui.data.structures.chapter04_queue;


import com.sunyinhui.data.structures.chapter04_queue.list.LinkedList;
import com.sunyinhui.data.structures.chapter04_queue.list.List;

/**
 *
 * 使用链表来实现双端队列，因为队列主要是队头和队尾操作，而链表有首尾指针
 *
 *
 */
public class Deque<E> {
	private List<E> list = new LinkedList<>();
	
	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void clear() {
		list.clear();
	}

	public void enQueueRear(E element) {
		list.add(element);
	}

	public E deQueueFront() {
		return list.remove(0);
	}

	public void enQueueFront(E element) {
		list.add(0, element);
	}

	public E deQueueRear() {
		return list.remove(list.size() - 1);
	}

	public E front() {
		return list.get(0);
	}

	public E rear() {
		return list.get(list.size() - 1);
	}
}
