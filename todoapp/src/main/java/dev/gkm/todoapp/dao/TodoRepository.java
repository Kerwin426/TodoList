package dev.gkm.todoapp.dao;

import dev.gkm.todoapp.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

//数据库层

public interface TodoRepository extends JpaRepository<Todo, Long> {


}
