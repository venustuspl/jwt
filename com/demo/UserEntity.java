package com.example.demo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(generator = "users_id_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "users_id_seq",sequenceName = "users_id_seq", allocationSize = 1)
    private long id;
    @Column(unique = true)
    private String mail;
    private String password;
    @Column(name = "logindisabled")
    private boolean loginDisabled;
    private String roles;
}
