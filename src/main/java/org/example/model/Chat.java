package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter

@Entity(name = "chat")
public class Chat {
    @Id
    @Column(name = "id")
    private final Integer id;
    @Column(name = "name")
    private final String name;
    @Column(name = "admin_name")
    private final String adminName;
    @Column(name = "maxMembers")
    private final Integer maxMembers;
    @Column(name = "currentMembers")
    private List<User> currentMembers;
}
