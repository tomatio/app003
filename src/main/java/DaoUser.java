import java.util.List;

/**
 * Created by Томат on 30.06.2017.
 */
public interface DaoUser {
    public User getUser(String name, String password);
    public boolean isCreatedUser(String name);
    public List<User> selectAll ();
    public  boolean isValidUser (String name, String password);
}


