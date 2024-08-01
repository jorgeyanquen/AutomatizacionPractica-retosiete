package com.practicasiete.Step;

import com.practicasiete.pages.HeroKuappPage;
import net.thucydides.core.annotations.Step;

public class HeroKuappValidationStep {

    HeroKuappPage heroKuappPage;

@Step
public void link_Hero(){
heroKuappPage.open();
}
}
