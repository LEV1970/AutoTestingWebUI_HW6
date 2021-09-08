package ru.geekbrains.HomeWork3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;


public class PageShopTest extends BaseShopTest {
    @Test
    void loginInCrmWithPageObjTest() {
        driver.get("http://automationpractice.com/index.php");
        new AuthPage(driver)
                .clickLoginSignIn()
                .fillInputEmail("lshubin@rambler.ru")
                .fillInputPasswd("123456")
                .clickLoginButton()
                .clickButtonMyAddresses()
                        .clickAddressAdd()
                                .fillInputAddress1("Red Square")
                                        .fillInputCity("Moscow")
                                                .selectState("Florida")
                                                        .fillInputPostCode("12345")
                                                                .fillInputPhone("1234567890")
                                                                        .fillInputPhoneMobile("9876543210")
                                                                                //.fillInputAliasAddress("1")
                                                                                        .clickButtonSubmitAddress();
        assertThat(new YourAddressesPage(driver).errorDuplicateAliasAddress, isDisplayed());
    }
}
