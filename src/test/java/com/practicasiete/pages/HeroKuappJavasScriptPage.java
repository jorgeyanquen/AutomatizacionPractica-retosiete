package com.practicasiete.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class HeroKuappJavasScriptPage extends PageObject {

    //Boton
    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[1]/button")
    public WebElementFacade btnJsAlert;

    //Boton
    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[2]/button")
    public WebElementFacade btnJsConfirm;

    //Boton
    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[3]/button")
    public WebElementFacade btnJsPrompt;

    //label a verificar
    @FindBy(xpath = "//*[@id=\"result\"]")
    public WebElementFacade lblHomePpal;


    public void verificarbotonesjsAlert(){

        btnJsAlert.click();
        getDriver().switchTo().alert().accept();
    }
    public void verificabotonesjsConfirm(){
        btnJsConfirm.click();
        getDriver().switchTo().alert().dismiss();
    }

    public void verificarbotonesjsPrompt(){
        btnJsPrompt.click();
        getDriver().switchTo().alert().sendKeys("Hola Mundo");
        getDriver().switchTo().alert().accept();
        String strMensaje = lblHomePpal.getText();
        assertThat(strMensaje, containsString("You entered: Hola Mundo"));

    }
}
