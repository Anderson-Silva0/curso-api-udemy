package br.com.andersondev.api.services.impl;

import br.com.andersondev.api.domain.User;
import br.com.andersondev.api.repositories.UserRepository;
import br.com.andersondev.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
