package com.example.UserApi.service;

import com.example.UserApi.dto.UserDTO;
import com.example.UserApi.model.Comment;
import com.example.UserApi.model.Post;
import com.example.UserApi.model.User;
import com.example.UserApi.repo.CommentRepo;
import com.example.UserApi.repo.PostRepo;
import com.example.UserApi.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.*;
import java.util.stream.Collectors;


@Service
@Slf4j
public class FetchService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PostRepo postRepo;
    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    DataSource dataSource;


    //Methods to fetch USERS from JSONPLACEHOLDER AND SAVE TO DB
//    @Async
//    public void getUsers() {
//        try {
//            String uri = "https://jsonplaceholder.typicode.com/users";
//            RestTemplate restTemplate = new RestTemplate();
//            User[] result = restTemplate.getForObject(uri, User[].class);
//            List<User> users = Arrays.asList(result);
//            System.out.println(users.toString());
//            List<User> savedUser = userRepo.saveAll(users);
//        } catch (Exception ex) {
//            System.out.println("Exeception occured " + ex);
//        }
//    }

//    Methods to fetch POSTS from JSONPLACEHOLDER AND SAVE TO DB
//    @Async
//    public void getPosts() {
//        try {
//            String uri = "https://jsonplaceholder.typicode.com/posts";
//            RestTemplate restTemplate = new RestTemplate();
//            Post[] result = restTemplate.getForObject(uri, Post[].class);
//            List<Post> posts = Arrays.asList(result);
//            System.out.println(posts.toString());
//            List<Post> savedPost = postRepo.saveAll(posts);
//        } catch (Exception ex) {
//            System.out.println("Exeception occured " + ex);
//        }
//    }

   //Methods to fetch COMMENTS from JSONPLACEHOLDER AND SAVE TO DB
//    @Async
//    public void getComments() {
//        try {
//            String uri = "https://jsonplaceholder.typicode.com/comments";
//            RestTemplate restTemplate = new RestTemplate();
//            Comment[] result = restTemplate.getForObject(uri, Comment[].class);
//            List<Comment> comments = Arrays.asList(result);
//            //System.out.println(comments.toString());
//            List<Comment> savedUser = commentRepo.saveAll(comments);
//        } catch (Exception ex) {
//            System.out.println("Exeception occured " + ex);
//        }
//    }


    //Method to fetch Users
    public List<User> fetchUsers(){
        List<User> users = userRepo.findAll().stream().map(User::new).collect(Collectors.toList());
        return users;
    }


    //Method to fetch Users
    public List<Post> fetchPosts(){
        List<Post> posts = postRepo.findAll();
        return posts;
    }

    //Method to fetch Users
    public List<Comment> fetchComments(){
        List<Comment> comments = commentRepo.findAll();
        return comments;
    }

//    public List<Post> fetchPostsByUserId(int id){
//        List<Post> posts = postRepo.findAllByUserId(id);
//        return posts;
//    }
//
//    public List<Comment> fetchCommentsByPostId(int id) {
//        List<Comment> comments = commentRepo.findAllByPostId(id);
//        return comments;
//    }

    public List<User> getUsers(){
        List<User> users = userRepo.findAll();
        return users;
    }

}
