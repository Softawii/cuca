package dev.softawii.entity;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long discordUserId;

    @Column(nullable = false, unique = true)
    private String email;

    public Student() {
    }

    public Student(Long discordUserId, String email) {
        this.discordUserId = discordUserId;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDiscordUserId() {
        return discordUserId;
    }

    public void setDiscordUserId(Long discordUserId) {
        this.discordUserId = discordUserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", discordUserId=" + discordUserId +
               ", email='" + email + '\'' +
               '}';
    }
}
