/**
 * Created by томат on 14.06.2017.
 */
public class User {
    private  String userName;
    private  String userPassword;

    public User(String userName, String password) {
        this.userName = userName;
        this.userPassword = password;
    }
    public String getUserName () {
        return userName;
    }
    public String getUserPassword () {
        return userPassword;

    }

}
