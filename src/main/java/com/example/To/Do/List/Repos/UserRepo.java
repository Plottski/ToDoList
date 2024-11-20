package com.example.To.Do.List;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepo extends CrudRepository<User, Integer> {
    ArrayList<User> findAll();
    User findbyUserName(String userName);

}
