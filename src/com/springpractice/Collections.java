package com.springpractice;
import java.util.*;

public class Collections {

	List list;
	Set set;
	Map hashMap;
	
	public List getList() {
		System.out.println("List: " + list);
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	public Set getSet() {
		System.out.println("Set: " + set);
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	
	public Map getHashMap() {
		System.out.println("HashMap: " + hashMap);
		return hashMap;
	}
	public void setHashMap(Map hashMap) {
		this.hashMap = hashMap;
	}

}
