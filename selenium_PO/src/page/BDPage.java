package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BDPage {
	//����Ԫ�ر���
	/**����ٶ������������*/
	@FindBy(id="kw")
	@CacheLookup
	public WebElement keyword_input;
	
	/**����ٶ�������������ť*/
	@FindBy(id="su")
	@CacheLookup
	public WebElement search_button;
	//����һ�����캯�������ҵ��� PageFactory.initElements()��������ʼ��Ԫ�ء����仰˵����Ԫ��ӳ�䵽���Ƕ���õı����ϡ�
	public BDPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}
