import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by томат on 14.06.2017.
 */
@WebFilter(filterName = "FilterLogin")
public class LoginFilter extends BaseFilter {
    public static final String LOGIN_PAGE="login.html";

    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("!!   "+ req.getParameter("userName")+" "+req.getParameter("password"));

        if ((req.getParameter("userName")==null | req.getParameter("password")==null) ||
                (req.getParameter("userName").trim().equals("") | req.getParameter("password").trim().equals("")))
                 {
            System.out.println("filter find not parameters");
            resp.sendRedirect(LOGIN_PAGE);
        }
        else {
            chain.doFilter(req, resp);
    }



}
