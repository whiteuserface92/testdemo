package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "user")
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "input_date")
    private LocalDateTime inputDate;

    @Column(name = "input_user_id")
    private String inputUserId;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

    @Column(name = "update_user_id")
    private String UpdateUserId;

}
