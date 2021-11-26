package co.com.sofka.back.Repository;

import co.com.sofka.back.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository  extends CrudRepository<Todo,Long> {
}
