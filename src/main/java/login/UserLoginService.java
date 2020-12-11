package login;

public class UserLoginService {

    public boolean checkUserCredentials(String userName, String password) {
        if (userName.equals("tima") && password.equals("q")) {
            return true;
        }
        return false;
    }

}
