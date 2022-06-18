package br.com.andersondev.api.resources;

import br.com.andersondev.api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById() {

        return ResponseEntity.ok().body(new User (1,"anderson","ander@hotmail.com","1234"));
    }
}
