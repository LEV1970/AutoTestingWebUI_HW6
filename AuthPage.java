package ru.geekbrains.HomeWork3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AuthPage extends BaseView {
    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    public WebElement loginSignIn;

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "passwd")
    public WebElement inputPasswd;


    @FindBy(id = "SubmitLogin")
    public WebElement loginButton;

    public AuthPage clickLoginSignIn(){
        loginSignIn.click();
        return this;
    }

    public AuthPage fillInputEmail(String email) {
        inputEmail.sendKeys(email);
        return this;
    }

    public AuthPage fillInputPasswd(String passwd) {
        inputPasswd.sendKeys(passwd);
        return this;
    }


    public AccountPage clickLoginButton() {
        loginButton.click();
        return new AccountPage(driver);
    }

    public AuthPage(WebDriver driver) {
        super(driver);
    }
}

