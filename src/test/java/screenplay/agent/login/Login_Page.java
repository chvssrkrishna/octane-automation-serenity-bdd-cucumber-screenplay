package screenplay.agent.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login_Page {

    public static Target USER_NAME = Target.the("USER NAME").located(By.cssSelector("input[id='user_login']"));

    public static Target USER_PASSWORD = Target.the("USER PASSWORD").located(By.cssSelector("input[id='user_login']"));

    public static Target SIGN_IN = Target.the("USER SIGN IN").located(By.cssSelector("input[name='commit']"));

    public static Target MFA_CONFIG_ID = Target.the("Select a verification method radio button").located(By.cssSelector("input[ng-model='mfaConfigId']"));

    public static Target SEND_CODE = Target.the("Send Code").located(By.cssSelector(":button[(ng-click,'sendMfaCodeAndNavigate')]"));

    public static Target MFA_CODE = Target.the("MFA CODE").located(By.cssSelector("input[name='mfa_code']"));

    public static Target TRUST_DEVICE = Target.the("Trust Device").located(By.cssSelector("input[name='trust_device']"));

    public static Target SIGN_IN_WITH_MFA = Target.the("Sign IN with MFA").located(By.cssSelector("input[contains(name,'validateMfaCode')]"));

}
