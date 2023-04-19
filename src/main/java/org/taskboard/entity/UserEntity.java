package org.taskboard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true, length = 20)
    private String surname;

    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean active;

    @ManyToMany
    private List<RoleEntity> role;

    @OneToMany(mappedBy = "user")
    private List<LogEntity> logs;

    @ManyToMany
    private List<ProjectEntity> project;
}
