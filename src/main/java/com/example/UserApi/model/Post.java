package com.example.UserApi.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "TB_POST")
public class Post implements Serializable {


    @Id
    private Integer id;
    private String title;
    private String body;

    @OneToMany(targetEntity=Comment.class, mappedBy="post", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    @JoinColumn(name="user_id", nullable=false)
    private User user;

}
