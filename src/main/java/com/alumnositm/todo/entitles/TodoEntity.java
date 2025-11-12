package com.alumnositm.todo.entitles;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todos"
indexes = {
    @Index(name = "idx_title", columnList = "title"),
    @Index(name = "idx_status", columnList = "status")
    @Index(name = "idx_title_status", columnList = "title, status")
}

)
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = false, length = 1000)
    private String description;

    @Column(nullable = false)
    private TodoStatus status;
}