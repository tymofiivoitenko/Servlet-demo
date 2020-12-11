package model.ToDo;


import java.util.ArrayList;
import java.util.List;

public class ToDoService {

    public static List<ToDo> getAllToDos() {
        List<ToDo> listOfTodos = new ArrayList<ToDo>();
        listOfTodos.add(new ToDo("wake upe"));
        listOfTodos.add(new ToDo("brush teeth"));
        listOfTodos.add(new ToDo("go for a work"));

        return listOfTodos;
    }
}
