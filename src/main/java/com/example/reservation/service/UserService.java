package com.example.reservation.service;

import com.example.reservation.domain.User;
import com.example.reservation.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User create(String username, String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        this.userRepository.save(user);
        return user;
    }
}
