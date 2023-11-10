package org.ecos.logic.serenityswag.authentication;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.ecos.logic.serenityswag.authentication.actions.LoginActions;
import org.ecos.logic.serenityswag.inventory.InventoryPage;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.serenitybdd.core.Serenity.reportThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.ecos.logic.serenityswag.authentication.User.STANDAR_USER;

@RunWith(SerenityRunner.class)
public class WhenLoggingOnTest {

    @Steps
    LoginActions login;

    InventoryPage inventoryPage;

    @Test
    public void usersCanLogOnViaTheHomePage(){
        this.login.as(STANDAR_USER);

        reportThat("Inventory page should be displayed with the correct tittle",()->
            assertThat(this.inventoryPage.getHeading()).isEqualToIgnoringCase("Products")
        );

    }
}
