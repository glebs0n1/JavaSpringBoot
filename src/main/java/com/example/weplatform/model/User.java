package com.example.weplatform.model;

import javax.validation.constraints.NotEmpty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotEmpty(message = "First name is required")
    private String firstName;

    @Column
    @NotEmpty(message = "Last name is required")
    private String lastName;
}
