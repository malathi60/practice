package mypack;

import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void method1()
	{
		int x=10;
		int y=20;
		int w=x--;
		int v=++y;
		System.out.println("x: " + x +"y: " +y + "w: " + w +"v: " +v);
	}
}
