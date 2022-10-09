package com.example.UserApi.model;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@ToString
@Table(name = "TB_COMMENT")
public class Comment implements Serializable {


    @Id
    private Integer id;
    private String name;
    private String email;
    private String body;

    @JoinColumn(name="post_id", nullable=false)
    private Post post;
}
