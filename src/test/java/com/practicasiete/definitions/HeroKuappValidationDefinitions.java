package com.practicasiete.definitions;

import com.practicasiete.Step.HeroKuappValidationStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HeroKuappValidationDefinitions {
    @Steps
    HeroKuappValidationStep heroKuappValidationStep;

    @Given("the user enters the HeroKuapp page")
    public void the_user_enters_the_hero_kuapp_page() {
        heroKuappValidationStep.link_Hero();
    }
    @When("he selects the javascript_alerts link")
    public void he_selects_the_javascript_alerts_link() {
        heroKuappValidationStep.ingresar_form_javascrip();
    }
    @When("interacts with the controls on this screen")
    public void interacts_with_the_controls_on_this_screen() {

    }
    @Then("Learn how to handle JavaScript type alerts")
    public void learn_how_to_handle_java_script_type_alerts() {

    }
}
