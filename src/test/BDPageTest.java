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
	  //ʵ����BDPage����
	  BDPage bdp = new BDPage(driver);
	  //bdp����keyword_inputԪ�أ�Ȼ��ʹ��Ԫ�ص�sendKeys��������������롰��á�
	  bdp.keyword_input.sendKeys("���");
	//bdp����search_buttonԪ�أ�Ȼ�����Ԫ�ص�click�������������ť
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
