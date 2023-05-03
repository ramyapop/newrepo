package com.hcl;

public class Child extends Up_Casting{
	@Override
	public void education() {
		super.education();
		System.out.println("village");
	}
@Override
public void property() {
	super.property();
} 
@Override
public void bussiness() {
	System.out.println("diamond");
}
private void international() {
System.out.println("link");
}
private void abroad_Moving() {
System.out.println("life settle");
}

public static void main(String[] args) {
	Child o=(Child) new Up_Casting();
o.education();
o.property();
o.abroad_Moving();
o.international();





}
}
