package com.example.demo entity;

import jakarta.persistance.*;
import jakarta.validation.constraints.*;

@Entity
public class studentEntity{
    @id
    @GeneratedValue(startegy=GenerationType.IDENTITY)private Long id;

    @NotBlank(messages="Name is not valid")
    private String name;

    @Email(messages="Email format is not valid")
}