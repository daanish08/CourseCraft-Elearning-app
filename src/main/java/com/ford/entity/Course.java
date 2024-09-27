package com.ford.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    private Double price;

    @ManyToMany(mappedBy = "courses")
    private Set<User> enrolledUsers = new HashSet<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<File> files;


}
