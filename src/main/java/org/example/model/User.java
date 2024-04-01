package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity(name = "user")
public class User {
    @Id
    @Column(name = "id")
    private final Integer id;
    @Column(name = "roomId")
    private Integer roomId;
    @Column(name = "username")
    private String username;

}
