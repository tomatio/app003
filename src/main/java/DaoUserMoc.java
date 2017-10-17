import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Томат on 30.06.2017.
 */
public class DaoUserMoc implements DaoUser {
    private final Map<Integer, User> allUsers = new ConcurrentHashMap<>();
    public DaoUserMoc () {
        this.allUsers.put(1, new User("Dima", "123"));
        this.allUsers.put(2, new User("Lena", "123"));
        this.allUsers.put(3, new User("Ira", "123"));
    }


    @Override
    public User getUser(String name, String password) {
        for(User user: users() ) {
            if(user.getUserName().equals(name) & user.getUserPassword().equals(password)) return user;
        }
        return null;
    }

    @Override
    public boolean isCreatedUser(String name) {
        return false;
    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public boolean isValidUser(String name, String password) {
        return false;
    }

    private List<User> users() {
        return new ArrayList<>(allUsers.values());
    }
}