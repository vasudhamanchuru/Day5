package com.qt.java;

public class Twoandthreedimesional {

	public static void main(String[] args) {
		int[][][]i3D= {{{1,2},{3,4}},{{5,6},{7,8}}};
		System.out.println(i3D[0][0][0]);
		System.out.println(i3D[0][1][1]);
		System.out.println(i3D[1][1][1]);
		System.out.println(i3D[1][0][1]);
		char c='s';
		String sText="asDfg";
		System.out.println(sText.toUpperCase());
		System.out.println(sText.toLowerCase());
		System.out.println(sText.length());
		System.out.println(sText.indexOf("D"));
		System.out.println(sText.replaceAll("D","X"));
		System.out.println(sText.split(""));
		System.out.println("**************");
		String[]sAfterSplit=sText.split("D");
		for(String str:sAfterSplit) {
			System.out.println(str);
			System.out.println(sText.charAt(4));
			System.out.println(sText.contains("sf"));
			System.out.println(sText.contains("sD"));
			System.out.println(sText.equalsIgnoreCase("asdfg"));
			System.out.println(sText.equals("asdfg"));
			System.out.println(sText.equalsIgnoreCase("asdfg"));
			System.out.println(sText.substring(2));
		}

	}

}
