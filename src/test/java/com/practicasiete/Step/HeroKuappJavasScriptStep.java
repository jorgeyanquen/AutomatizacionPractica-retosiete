package com.practicasiete.Step;

import com.practicasiete.pages.HeroKuappJavasScriptPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class HeroKuappJavasScriptStep {

    HeroKuappJavasScriptPage heroKuappJavasScriptPage;

    @Step
    public void validacion_botones_HeroKuapp(){
        heroKuappJavasScriptPage.verificarbotonesjsAlert();
    }
}
