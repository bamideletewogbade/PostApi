package com.example.UserApi.dto;

import com.example.UserApi.model.Comment;
import com.example.UserApi.model.Post;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class PostDTO {

    private int postId;
    private String postTitle;
    private String postBody;

    List<CommentDTO> comment = new ArrayList<>();

    public PostDTO(Post post){
        this.setPostId(post.getId());
        this.setPostTitle(post.getTitle());
        this.setPostBody(post.getBody());
        List<CommentDTO> commentDTO = post.getComments().stream().map(CommentDTO::new).collect(Collectors.toList());
        this.setComment(commentDTO);
    }

}
