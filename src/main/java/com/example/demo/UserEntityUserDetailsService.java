package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserEntityUserDetailsService implements UserDetailsService {
    private final UserEntityRepository userEntityRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> userEntity = userEntityRepository.findByMail(username);
        return userEntity.map(UserEntityUserDetails::new).orElseThrow(()-> new UsernameNotFoundException("User not found "+username));
    }
}
