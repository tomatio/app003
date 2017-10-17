

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Томат on 28.06.2017.
 */
public class SessionFilter extends BaseFilter {
    public static final String USER_PAGE = "userpage.jsp";

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {

        System.out.println(">>>> Inter SessionFilter!");
        if (request.getSession(false)!=null) {
            System.out.println(">>>> redirect to USER_PAGE");
            RequestDispatcher userPageDispatcher = request.getRequestDispatcher(USER_PAGE);
            userPageDispatcher.forward(request, response);
        }
        else {
            System.out.println("doFilter");
            chain.doFilter(request, response);
        }
    }
}
