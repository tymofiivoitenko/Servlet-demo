package login;

import model.ToDo.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    UserLoginService userLoginService = new UserLoginService();

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest, httpServletResponse);

    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String name = httpServletRequest.getParameter("name");
        String password = httpServletRequest.getParameter("password");
        boolean isUserValid = userLoginService.checkUserCredentials(name, password);
        if (isUserValid) {
            httpServletRequest.getSession().setAttribute("name", name);
            httpServletResponse.sendRedirect("/todo.do");
            return;
       }
        String message = "Username or password is wrong";
        httpServletRequest.setAttribute("message", message);
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest, httpServletResponse);
    }
}
