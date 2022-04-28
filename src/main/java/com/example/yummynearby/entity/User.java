package com.example.yummynearby.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author watson
 * @date 2022/4/27 7:10 PM
 */

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    private String name;

    private String password;

}
