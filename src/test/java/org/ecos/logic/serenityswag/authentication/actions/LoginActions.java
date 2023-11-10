package org.ecos.logic.serenityswag.authentication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.ecos.logic.serenityswag.authentication.User;
import org.openqa.selenium.Keys;

public class LoginActions extends UIInteractionSteps {

    @Step("Log in as {0}")
    public void as(User user){
        this.openUrl("https://www.saucedemo.com");

        this.$("[data-test=\"username\"]").sendKeys(user.getUsername());
        this.$("[data-test=\"password\"]").sendKeys(user.getPassword());
        this.$("[data-test=\"login-button\"]").sendKeys(Keys.ENTER);
    }
}
