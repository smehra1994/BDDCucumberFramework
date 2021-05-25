package com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	private WebDriver driver;

	private By accountSections = By.xpath("//div[@id='center_column']//span"); // this xpath match for 6 spans

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}


	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

	public int getAccountsSectionCount() {
		return driver.findElements(accountSections).size();
	}

	public List<String> getAccountsSectionList()       //earlier return type was void but returning accountsList so modified
	{
		List<String> accountsList=new ArrayList<>();
		List<WebElement> accountsHeaderList=driver.findElements(accountSections);
		
		for(WebElement e : accountsHeaderList )
		{
			String text= e.getText();
			System.out.println(text);
			accountsList.add(text);
		
	}
		return accountsList;
}
}