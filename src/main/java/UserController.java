import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Томат on 30.06.2017.
 */
public class UserController extends HttpServlet {
    public static final String USER_NAME = "userName";
    public static final String USER_PASSWORD = "password";
    public static final String USER_PAGE = "userpage.jsp";
    public static final String LOGIN_PAGE="login.html";

    private DaoUser daoUser = new DaoUserMoc();

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>doPost");
            User user;

         if ((user =(daoUser.getUser(req.getParameter(USER_NAME), req.getParameter(USER_PASSWORD)))) != null) {
             System.out.println(">>>>> User ok, forvard");
           //  req.setAttribute("user" , user);
             req.setAttribute("userName", user.getUserName());
             RequestDispatcher requestDispatcher = req.getRequestDispatcher(USER_PAGE);
             requestDispatcher.forward(req, resp);
         }

         else {
            System.out.println(">>>>> redirect LOGIN_PAGE");
            resp.sendRedirect(LOGIN_PAGE);
        }


    }





}
