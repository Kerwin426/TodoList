package dev.gkm.todoapp.controller;

import dev.gkm.todoapp.domain.Todo;
import dev.gkm.todoapp.service.TodoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//服务端代码


//表明这个类中的方法返回的是json格式的注解
@RestController
//这个控制器内所有请求映射为一个基本的路径
@RequestMapping("/api/todos")
public class TodoController {
    //将todoservice注册到todocontroller中
    @Resource
    private TodoService todoService;

    //用于将HTTP GET请求映射到getAllTodos方法上
    @GetMapping
    public List<Todo> getAllTodos(){
        return  todoService.getAllTodos();
    }

    //RequestBody是从HTTP请求体中获取数据并将其绑定到参数上，通常用于客户端发送的JSON数据然后将其转换为JAVA对象
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){
        return todoService.createTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable long id, @RequestBody Todo updatedTodo){
        return todoService.updateTodo(id,updatedTodo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable long id){
        todoService.deleteTodo(id);
    }
}
