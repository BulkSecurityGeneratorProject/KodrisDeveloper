package cpm.kodris.developer.cucumber.stepdefs;

import cpm.kodris.developer.KodrisDeveloperApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = KodrisDeveloperApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
