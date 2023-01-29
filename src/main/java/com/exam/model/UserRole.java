package com.exam.model;

import jakarta.persistence.*;

@Entity
public class UserRole {

    public UserRole() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userRoleId;

    //User
    @ManyToOne(fetch = FetchType.EAGER)
    private User user ;

    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
