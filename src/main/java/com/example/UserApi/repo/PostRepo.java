package com.example.UserApi.repo;

import com.example.UserApi.model.Post;
import com.example.UserApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {
    //List<Post> findAllByUserId(int id);

}
