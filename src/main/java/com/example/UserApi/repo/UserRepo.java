package com.example.UserApi.repo;

import com.example.UserApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<User, Integer> {


}


