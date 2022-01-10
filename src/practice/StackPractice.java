package practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		
	Stack<String> integerStack =  new Stack<>();
		
	integerStack.push("월");
	integerStack.push("화");
	integerStack.push("수");
	integerStack.push("목");
	integerStack.push("금");
	integerStack.push("토");
	integerStack.push("일");
	
	System.out.println(integerStack);	
		
	
	Object[] arr = integerStack.toArray();
	
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	List<String> linkedList = new LinkedList<>();
	
	/* 요소를 추가할 때는 add를 이용한다. */
	linkedList.add("apple");
	linkedList.add("banana");
	linkedList.add("orange");
	linkedList.add("mango");
	linkedList.add("grape");
	
	/* 저정된 요소의 갯수는 size() 메소드를 이용한다. */
	System.out.println(linkedList.size());
	
	/* for문과 size()를 이용해서 반복문을 활용할 수도 있다, 
	 * 요소를 꺼내올 때는 get()을 사용하며, 인자로 전달하는 정수는 인덱스처럼 사용하면 된다.
	 * */
	for(int i = 0; i < linkedList.size(); i++) {
		System.out.println(i + " : " + linkedList.get(i));
	}
	
	/* 요소를 제거할 때는 remove() 메소드를 이용하며 인덱스를 활용한다. */
	linkedList.remove(1);
	
	/* 향상 된 for문도 사용 가능하다. */
	for(String s : linkedList) {
		System.out.println(s);
	}
	
	/* set() 메소드를 이용해서 요소를 수정할 수도 있다. */
	linkedList.set(0, "pineapple");
	
	/* toString() 메소드가 오버라이딩 되어 있어서 모든 요소 정보를 쉽게 볼 수 있다. */
	System.out.println(linkedList);
	
	/* isEmpty() 메소드를 이용해서 list가 비어 있는지 확인할 수 있다. */
	System.out.println(linkedList.isEmpty());
	
	/* 리스트 내 요소를 모두 제거하는 clear() 메소드를 이용할 수 도 있다. */
	linkedList.clear();
	
	System.out.println(linkedList.isEmpty());
	
	
	}

}
