public class Contexts {

    private final String LoginContext = "//input[@placeholder=\"Телефон или почта\"]";
    private final String PasswordContext = "//input[@placeholder=\"Введите пароль\"]";
    private final String AuthButton_1 = "(//span[@class = 'FlatButton__in'])[4]";
    private final String AuthButton_2 = "//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[2]/button/span[1]";
    private final String AuthValid = "(//span [@class = 'left_label inl_bl']) [1]";


    public String getLoginContext() {
        return LoginContext;
    }

    public String getPasswordContext() {
        return PasswordContext;
    }

    public String getAuthButton_1() {
        return AuthButton_1;
    }

    public String getAuthButton_2() {
        return AuthButton_2;
    }

    public String getAuthValid() {
        return AuthValid;
    }
}
