package com.lxy.spring.boot.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * user 实体
 *
 */

@Entity

@Table(name="UserLxy")

public class User {

    @Id //main key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //self increment strategy
    private Long id ;//实体的唯一标识
    private String name;
    private String email;

    protected User(){

    }

    public User(Long id, String name, String email){

        this.email = email;
        this.id = id;
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){

        return  String.format("User[id=%d,name='%s',email='%s']",id,name,email);

    }

}
