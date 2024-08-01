package com.practicasiete.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("http://the-internet.herokuapp.com/")
public class HeroKuappPage  extends PageObject {

    //label del home a verificar
    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    public WebElementFacade lblHomePpal;

    //Boton
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[29]/a")
    public WebElementFacade btnjavascript;

    public void verificaHome() {
        String labelv = "Bootstrap-Admin-Template";
        String strMensaje = lblHomePpal.getText();
        assertThat(strMensaje, containsString("Welcome to the-internet"));

    }
    public void javascript() {

        btnjavascript.click();
    }
}
