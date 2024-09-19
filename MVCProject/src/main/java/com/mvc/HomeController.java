package com.mvc;

import java.util.Date;
import java.util.List;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.mvc.DAO.ToDoDao;
import com.mvc.entities.ToDo;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class HomeController {

    @Autowired
    private ServletContext context;

    @Autowired
    private ToDoDao toDoDao;

    @GetMapping("/home")
    public String home(Model model) {
        String name = "Home";
        model.addAttribute("page", name);
        List<ToDo> todos = this.toDoDao.getAll();
        model.addAttribute("todos", todos);
        return "Home";
    }

    @GetMapping("/add")
    public String addTodo(Model model) {
        ToDo t = new ToDo();
        model.addAttribute("page", "add");
        model.addAttribute("todo", t);
        return "Home";
    }

    @GetMapping("/view")
    public String viewTodo(Model model) {
        model.addAttribute("page", "view");
        return "Home";
    }

    @PostMapping("/save")
    @Transactional
    public String saveTodo(@ModelAttribute("todo") ToDo t, Model model) {
        System.out.println(t);
        t.setTodoDate(new Date());
        this.toDoDao.save(t);
        return "Home";
    }
}
