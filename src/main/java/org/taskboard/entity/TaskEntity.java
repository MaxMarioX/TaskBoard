package org.taskboard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = true, length = 255)
    private String description;

    @Column(nullable = false)
    private Boolean status;

    @ManyToOne
    private ProjectEntity project;

    @OneToMany(mappedBy = "task")
    private List<ReportEntity> reports;
}
