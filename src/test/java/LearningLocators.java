public class LearningLocators {
    //xpath Login Page
    String xpathLoginPageTitle = "//h1[normalize-space()='Login']" ;
    String xpathEmailAddressTextbox = "//input[@id='email']";
    String xpathPasswordTextbox = "//input[@id='password']";
    String xpathRememberCheckbox ="//input[@id='remember']";
    String xpathRememberLabel = "//label[normalize-space()='Remember me']";
    String xpathLoginButton = "//button[normalize-space()='Login'] ";
    String xpathForgotPasswordLink = "//a[normalize-space()='Forgot Password?']";

    //Menu Customer
    String xpathCustomerMenu= "//span[normalize-space()='Customers']";

    //xpath New Customer page;
    //  Xpath of Customers Details Form
    String xpathCompanyTextbox ="//input[@id='company']";
    String xpathVATNumberTextbox = "//input[@id='vat']";
    String xpathPhoneTextbox ="//input[@id='phonenumber']";
    String xpathWebsiteTextbox ="//input[@id='website']";
    String xpathCityTextbox ="//input[@id='city']";
    String xpathStateTextbox ="//input[@id='state']";
    String xpathZipCodeTextbox ="//input[@id='zip']";

    //Menu Projects
   String xpathProjectMenu = "//span[normalize-space()='Projects']/ancestor::a";

}
