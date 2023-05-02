package d;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest {
  @Test
  public void login() {
	  System.out.println("Logged in succesfully");
	  Assert.assertEquals(10, 15);
  }
  @Test(dependsOnMethods= {"Login"})
  public void Logout() {
	  System.out.println("Log out");
  }
}
