package com.smr.testing;

public class Son_Class extends Parent_Class{ //hirarichal inheritance b extends a
	public void jammu() {
System.out.println("srinagar");
	}
	private void ladakh() {
System.out.println("kargil");
	}
	protected void himachal() {
		System.out.println("shimla");
	}
	void punjab() {
System.out.println("amirstar");
	}
public static void main(String[] args) {
	Son_Class o = new Son_Class();
	o.jammu();
	o.ladakh();
	o.himachal();
	o.punjab();
	o.tamilnadu();
	o.karnataka();
	o.andhra();
}
}
