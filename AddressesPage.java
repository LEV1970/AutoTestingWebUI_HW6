package ru.geekbrains.HomeWork3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesPage extends BaseView{
    public AddressesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[@title='Add an address']")
    public WebElement addressAdd;

    public YourAddressesPage clickAddressAdd() {
        addressAdd.click();
        return new YourAddressesPage(driver);
    }
}
