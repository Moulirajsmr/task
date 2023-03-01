package com.smr.testing;

public class Parent_Class {
	public void tamilnadu() {
System.out.println("chennai");
	}

	private void kerala() {
System.out.println("kochi");
	}
	protected void karnataka() {
		System.out.println("bangalore");

	}

	void andhra() {
System.out.println("vizag");
	}

	public static void main(String[] args) {
		Parent_Class s = new Parent_Class();
		s.tamilnadu();
		s.kerala();
		s.karnataka();
		s.andhra();
	}
}
