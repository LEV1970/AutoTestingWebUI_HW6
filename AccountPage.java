package ru.geekbrains.HomeWork3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountPage extends BaseView{
    public AccountPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//a[@title='Addresses']")
    public WebElement buttonMyAddresses;


    public AddressesPage clickButtonMyAddresses(){
        buttonMyAddresses.click();
        return new AddressesPage(driver);
    }
}
