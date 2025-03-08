package TestDatatc;
import java.io.IOException;

import org.testng.annotations.Test;

import Utility.datamethod;

public class calling {
	
	@Test
	void met() throws IOException
	{
		String dat = datamethod.datautil("sheet1",1,1);
		System.out.println(dat);
	}
}
