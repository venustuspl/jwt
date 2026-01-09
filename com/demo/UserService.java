package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserEntityRepository userEntityRepository;

    public void createUser(UserEntity user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userEntityRepository.save(user);
    }
}
