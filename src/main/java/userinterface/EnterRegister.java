package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class EnterRegister extends PageObject {
    public static final Target JOIN_TODAY= Target.the("button to enter the registry")
            .located(By.xpath("<a class=\"unauthenticated-nav-bar__sign-up\" ui-sref=\"signup.personal\" href=\"/signup/personal\">Join Today</a>"));
}
