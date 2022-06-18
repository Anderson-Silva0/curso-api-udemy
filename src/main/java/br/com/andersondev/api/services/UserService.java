package br.com.andersondev.api.services;

import br.com.andersondev.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
