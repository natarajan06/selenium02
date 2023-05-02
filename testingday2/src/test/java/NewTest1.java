import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest1 {
	public class testng2 {
	    int a=20;int b=20;
	    int c;
	    @Test
	    public void add() {
	        c=a+b;
	        System.out.print(c);
	        Assert.assertEquals(c, 40);
	    }
	    @Test
	    public void sub() {
	        c=a-b;
	        System.out.print(c);
	        Assert.assertEquals(c, 0);
	    }
	    @Test
	    public void mul() {
	        c=a*b;
	        System.out.print(c);
	        Assert.assertEquals(c, 400);
	    }
	    @Test
	    public void div() {
	        c=a/b;
	        System.out.print(c);
	        Assert.assertEquals(c, 1);
	    }
	  
  }
}
