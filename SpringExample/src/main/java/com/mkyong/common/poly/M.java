package com.mkyong.common.poly;

import java.io.FileNotFoundException;
import java.io.IOException;

public class M {

	int i=10;
	
	protected void m1() throws FileNotFoundException, IOException{
		i = i+10;
		System.out.println("M > " + i);
	}
	
}
