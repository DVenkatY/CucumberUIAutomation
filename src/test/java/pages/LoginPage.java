package pages;

import Runner.MyTestRunner;
import support.Events;

public class LoginPage {

    public final static String username="//*[@name='username']";
    public static void enterUserName(){
        Events.setText(username, MyTestRunner.configData.get("UserName"),"user name textbox");
    }

    public final static String password="//*[@name='password']";
    public static void enterPassword(){
        Events.setText(password, MyTestRunner.configData.get("Password"),"password textbox");
    }

    public final static String login="//*[@value='Log In']";
    public static void clickLogin(){
        Events.click(login,"login button");
    }
}
