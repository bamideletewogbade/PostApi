package com.example.UserApi.repo;

import com.example.UserApi.model.Comment;
import com.example.UserApi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
   // List<Comment> findAllByPostId(int postId);
}
