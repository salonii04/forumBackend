package com.forum.forum_backend.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String role; // Admin or User

    // Constructors, getters, and setters
    // Omitted for brevity
}
