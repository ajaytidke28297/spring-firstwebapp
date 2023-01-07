package com.explanatory.myfirstwebapp.todo;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1,
                "explanatory",
                "Learn AWS",
                LocalDate.now().plusYears(1),
                false));

        todos.add(new Todo(2,
                "explanatory",
                "Learn Spring Boot",
                LocalDate.now().plusYears(2),
                false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(
            String username,
            String description,
            LocalDate targetDate,
            boolean done
    ) {
        Todo todo = new Todo(3, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(
            int id
    ) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Todo gotTodo = todos.stream().filter(todo -> todo.getId() == id).findFirst().get();
        return gotTodo;
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
