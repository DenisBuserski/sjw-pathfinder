package com.pathfinder.model;

import com.pathfinder.model.enums.UserRoles;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private UserRoles role;

    public Role() {
    }

    public long getId() {
        return id;
    }

    public Role setId(long id) {
        this.id = id;
        return this;
    }

    public UserRoles getRole() {
        return role;
    }

    public Role setRole(UserRoles role) {
        this.role = role;
        return this;
    }
}
