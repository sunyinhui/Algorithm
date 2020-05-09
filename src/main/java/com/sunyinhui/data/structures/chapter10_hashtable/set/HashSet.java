package com.sunyinhui.data.structures.chapter10_hashtable.set;

import com.sunyinhui.data.structures.chapter10_hashtable.map.HashMap;
import com.sunyinhui.data.structures.chapter10_hashtable.map.Map;

/**
 * 利用HashSet（HashMap:链表+红黑树）实现Set 比TreeSet（TreeMap 红黑树）效率要高
 * @param <E>
 */
public class HashSet<E> implements Set<E> {
	private HashMap<E, Object> map = new HashMap<>();

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public boolean contains(E element) {
		return map.containsKey(element);
	}

	@Override
	public void add(E element) {
		map.put(element, null);
	}

	@Override
	public void remove(E element) {
		map.remove(element);
	}

	@Override
	public void traversal(final Visitor<E> visitor) {
		map.traversal(new Map.Visitor<E, Object>() {
			@Override
			public boolean visit(E key, Object value) {
				return visitor.visit(key);
			}
		});
	}

}
