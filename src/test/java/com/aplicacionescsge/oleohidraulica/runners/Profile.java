package com.aplicacionescsge.oleohidraulica.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/profile.feature",
        glue = {"com.aplicacionescsge.oleohidraulica.certification.stepdefinitions"}
)

public class Profile {
}
