package com.example.UserApi.model;


import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@Data
@Entity
@ToString
@Table(name = "TB_USER")
public class User implements Serializable {
    @Id
    private int id;
    private String name;

    @OneToMany(targetEntity=Post.class, mappedBy="user", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    List<Post> posts = new ArrayList<>();


}


