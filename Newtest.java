import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
	Billa b; 
	@BeforeMethod
	   public void initialize() {
		 b=new Billa();
	}
	
  @Test(dataProvider = "test1")
  public void f(int n, int s, int r, int res) {
	  
      Assert.assertEquals(res, b.check(n,s,r));  
  }

  @DataProvider(name="test1")
  public Object[][] dp() {
      return new Object[][] {{1,2,3, 0}, {3,2,1, 0}, {2,2,2,0},{4,10,2,0}};
      
  }
}

