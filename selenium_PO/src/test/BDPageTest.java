package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.BDPage;

public class BDPageTest {
	WebDriver driver;
  @Test
  public void f() {
	  //实例化BDPage对象
	  BDPage bdp = new BDPage(driver);
	  //bdp调用keyword_input元素，然后使用元素的sendKeys方法向输入框输入“你好”
	  bdp.keyword_input.sendKeys("你好");
	//bdp调用search_button元素，然后调用元素的click方法点击搜索按钮
	  bdp.search_button.click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","D:\\autotest\\driver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.baidu.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
