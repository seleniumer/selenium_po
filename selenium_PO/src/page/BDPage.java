package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BDPage {
	//定义元素变量
	/**定义百度搜索的输入框*/
	@FindBy(id="kw")
	@CacheLookup
	public WebElement keyword_input;
	
	/**定义百度搜索的搜索按钮*/
	@FindBy(id="su")
	@CacheLookup
	public WebElement search_button;
	//创建一个构造函数，并且调用 PageFactory.initElements()方法来初始化元素。换句话说，将元素映射到我们定义好的变量上。
	public BDPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}
