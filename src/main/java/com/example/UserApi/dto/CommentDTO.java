package com.example.UserApi.dto;

import com.example.UserApi.model.Comment;
import lombok.Data;

@Data
public class CommentDTO {

    private String commentEmail;
    private String commentBody;
    private String commentName;

    public CommentDTO(Comment comment){
        this.setCommentName(comment.getName());
        this.setCommentEmail(comment.getEmail());
        this.setCommentBody(comment.getBody());
    }
}
