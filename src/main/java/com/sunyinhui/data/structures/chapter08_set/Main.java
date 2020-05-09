package com.sunyinhui.data.structures.chapter08_set;

import com.sunyinhui.data.structures.chapter08_set.Times.Task;
import com.sunyinhui.data.structures.chapter08_set.file.FileInfo;
import com.sunyinhui.data.structures.chapter08_set.file.Files;
import com.sunyinhui.data.structures.chapter08_set.set.ListSet;
import com.sunyinhui.data.structures.chapter08_set.set.Set;
import com.sunyinhui.data.structures.chapter08_set.set.Set.Visitor;
import com.sunyinhui.data.structures.chapter08_set.set.TreeSet;

public class Main {
	
	static void test1() {

		Set<Integer> listSet = new ListSet<>();
		listSet.add(10);
		listSet.add(11);
		listSet.add(11);
		listSet.add(12);
		listSet.add(10);
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(12);
		treeSet.add(10);
		treeSet.add(7);
		treeSet.add(11);
		treeSet.add(10);
		treeSet.add(11);
		treeSet.add(9);
		
		treeSet.traversal(new Visitor<Integer>() {
			@Override
			public boolean visit(Integer element) {
				System.out.println(element);
				return false;
			}
		});
	}
	
	
	static void testSet(Set<String> set, String[] words) {
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
//		for (int i = 0; i < words.length; i++) {
//			set.contains(words[i]);
//		}
//		for (int i = 0; i < words.length; i++) {
//			set.remove(words[i]);
//		}
	}
	
	static void test2() {
		FileInfo fileInfo = Files.read("/Users/sunyinhui/jdk1.8.0_131/src/java/util/concurrent",
				new String[]{"java"});
		
		System.out.println("文件数量：" + fileInfo.getFiles());
		System.out.println("代码行数：" + fileInfo.getLines());
		final String[] words = fileInfo.words();
		System.out.println("单词数量：" + words.length);


		final Set<String> listset = new ListSet<>();
		Times.test("ListSet", new Task() {
			@Override
			public void execute() {
				testSet(listset, words);
				System.out.println(listset.size());
			}
		});

		final Set<String> treeset = new TreeSet<String>();
		Times.test("TreeSet", new Task() {
			@Override
			public void execute() {
				testSet(treeset, words);
				System.out.println(treeset.size());

			}
		});
	}

	public static void main(String[] args) {
		test2();
	}

}
