package setandHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetAndHashSet {

	public static void main(String[] args) {
		//HashSet
//		Set<String> names = new HashSet<>();
//		names.add("Walter");
//		names.add("Ana");
//		names.add("Poo");
//		names.add("Madri");
//		names.add("Coco");
//		
//		names.remove("Madri");
//		
//		
//		System.out.println(names.size());
//		System.out.println(names.contains("Gus"));
//		System.out.println(names.isEmpty());
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
//		
//		//names.forEach(System.out :: println);
//		
//		Iterator<String> namesIterator = names.iterator();
//		while(namesIterator.hasNext()) {
//			System.out.println(namesIterator.next());
//		}
//		
//		
//		List<Integer> numberList = new ArrayList<>();
//		numberList.add(1);
//		numberList.add(2);
//		numberList.add(3);
//		numberList.add(1);
//		System.out.println(numberList);
//		
//		Set<Integer> numberSet = new HashSet<>();
//		numberSet.addAll(numberList);
//		System.out.println(numberSet);
//		
//		
//		
//		
//		names.clear();
//		System.out.println(names);
//		
//		
		
		
//		//TreeSet
//		Set<String> names = new TreeSet<>();
//		names.add("Walter");
//		names.add("Ana");
//		names.add("Poo");
//		names.add("Madri");
//		names.add("Coco");
//		
//		names.remove("Madri");
//		
//		
//		System.out.println(names.size());
//		System.out.println(names.contains("Gus"));
//		System.out.println(names.isEmpty());
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
//		
//		//names.forEach(System.out :: println);
//		
//		Iterator<String> namesIterator = names.iterator();
//		while(namesIterator.hasNext()) {
//			System.out.println(namesIterator.next());
//		}
//		
//		
//		List<Integer> numberList = new ArrayList<>();
//		numberList.add(1);
//		numberList.add(2);
//		numberList.add(3);
//		numberList.add(1);
//		System.out.println(numberList);
//		
//		Set<Integer> numberSet = new TreeSet<>();
//		numberSet.addAll(numberList);
//		System.out.println(numberSet);
//		

		
		
		//LinkedHashSet "should be used if we really want to maintain insertion ordering"
				Set<String> names = new LinkedHashSet<>();
				names.add("Walter");
				names.add("Ana");
				names.add("Poo");
				names.add("Madri");
				names.add("Coco");
				
				names.remove("Madri");
				
				
				System.out.println(names.size());
				System.out.println(names.contains("Gus"));
				System.out.println(names.isEmpty());
				
				for(String name : names) {
					System.out.println(name);
				}
				
				//names.forEach(System.out :: println);
				
				Iterator<String> namesIterator = names.iterator();
				while(namesIterator.hasNext()) {
					System.out.println(namesIterator.next());
				}
				
				
				List<Integer> numberList = new ArrayList<>();
				numberList.add(1);
				numberList.add(2);
				numberList.add(3);
				numberList.add(1);
				System.out.println(numberList);
				
				Set<Integer> numberSet = new LinkedHashSet<>();
				numberSet.addAll(numberList);
				System.out.println(numberSet);		
		
		

		}
		

	}


