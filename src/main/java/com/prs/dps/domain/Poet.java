package com.prs.dps.domain;

/**
 * Created by ffulauh on 2016/6/4.
 */
public class Poet {
    private Long id;
    private String username;
    private String password;
    private String fullName;

    private String email;
    private Integer updateByEmail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUpdateByEmail() {
        return updateByEmail;
    }

    public void setUpdateByEmail(Integer updateByEmail) {
        this.updateByEmail = updateByEmail;
    }
}
