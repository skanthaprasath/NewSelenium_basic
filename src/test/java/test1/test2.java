package test1;

import java.io.IOException;

import Utility.readmethod;

public class test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String date = readmethod.uti("sheet1",3,1);
		System.out.println(date);
	}

}
