package org.F_Runner_Rerun_Class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Praveen\\eclipse-workspace_1\\AdacityCucumber\\src\\test\\java\\org\\E_FeatureFile"},
glue= "org.D_StepDefinition",
dryRun = false,
monochrome = true,
publish = true)

public class Runner {

}
