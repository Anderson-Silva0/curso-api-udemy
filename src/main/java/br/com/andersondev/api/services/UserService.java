package br.com.andersondev.api.services;

import br.com.andersondev.api.domain.User;
import br.com.andersondev.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
