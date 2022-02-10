package Models.pages;


public class LoginPage {
    public static final String TEXTBOX_USERNAME ="//input[@name='username']";
    public static final String TEXTBOX_PASSWORD ="//input[@name='password']";
    public static final String BUTTON_LOGIN = "//input[@value='Log In']";
    public static final String TEXT_ACCOUNT_OVERVIEW = ".ng-scope .title";
    public static final String TEXT_ACCOUNT_TOTAL = "tbody tr:nth-child(14) td:nth-child(2) b ";

    public static String getTextboxUsername()
    {
        return TEXTBOX_USERNAME;
    }
    public static String getTextboxPassword()
    {
        return TEXTBOX_PASSWORD;
    }
    public static String getButtonLogin()
    {
        return BUTTON_LOGIN;
    }
    public static String getTextAccountOverview()
    {
        return TEXT_ACCOUNT_OVERVIEW;
    }
    public static String getTextAccountTotal()
    {
        return TEXT_ACCOUNT_TOTAL;
    }
}
