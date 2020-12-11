package login;

import model.ToDo.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/todo.do")
public class ToDoServlet extends HttpServlet {
    ToDoService toDoService  = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println("yummy");
        httpServletRequest.setAttribute("todos", toDoService.getAllToDos());
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/todos.jsp").forward(httpServletRequest, httpServletResponse);
    }
}
