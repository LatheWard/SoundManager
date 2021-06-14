package com.example.SoundManager.UserStuff;


public class CustomUser {
    private Long id;
    private String email;
    private String password;
    private String firstName;

    public CustomUser() {
    }

    public CustomUser(Long id, String email, String password, String firstName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
    }

    public CustomUser(String email, String password, String firstName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "CustomUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
