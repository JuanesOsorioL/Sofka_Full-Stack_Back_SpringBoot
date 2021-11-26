package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Todo;
import co.com.sofka.back.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

    public Iterable<Todo> list(){
        return repository.findAll();
    }

    public Todo save(Todo todo){
        return repository.save(todo);
    }

    public void delete(Long id){
         repository.delete(get(id));
    }

    public Todo get(Long id){
        return repository.findById(id).orElseThrow();
    }


}
