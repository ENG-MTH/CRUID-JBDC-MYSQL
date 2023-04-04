package org.dutam.training.service;

import org.dutam.training.entity.Product;
import org.dutam.training.entity.UserEntity;
import org.dutam.training.repository.ProductRe;
import org.dutam.training.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserEntity saveNewUser(UserEntity user){
        return userRepository.save(user);
    }

    public List<UserEntity> findAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }

    public UserEntity updateUser(UserEntity user){
        return userRepository.save(user);
    }

    public UserEntity findUserById(Integer id){
        return userRepository.findById(id).orElse(new UserEntity());
    }
}






