package com.example.employeemanagement.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String dob;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String email;

    @CreationTimestamp
    private LocalDateTime createdOn;

    @UpdateTimestamp
    private LocalDateTime updatedOn;

    public Employee(Long id, String name, String dob, String gender, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
    }
}
