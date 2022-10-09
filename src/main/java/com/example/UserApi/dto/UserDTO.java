package com.example.UserApi.dto;


import com.example.UserApi.model.User;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Data
public class UserDTO {

    private int userId;
    private String userName;

    List<PostDTO> posts = new ArrayList<>();

    public UserDTO(User user){
        this.setUserId(user.getId());
        this.setUserName(user.getName());
        List<PostDTO> postDTO = user.getPosts().stream().map(PostDTO::new).collect(Collectors.toList());
        this.setPosts(postDTO);
    }
}
