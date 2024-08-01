package com.practicasiete.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HeroKuappJavasScriptPage extends PageObject {

    //Boton
    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[1]/button")
    public WebElementFacade btnJsAlert;

    public void verificarbotonesjsAlert(){

        btnJsAlert.click();
        getDriver().switchTo().alert().accept();
    }

}
