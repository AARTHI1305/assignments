package com.springproject;

public class UserService {
    private UserRepository userRepository;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String name) {
        userRepository.saveUser(name);
    }
}
