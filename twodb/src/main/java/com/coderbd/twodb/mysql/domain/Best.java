package com.coderbd.twodb.mysql.domain;

import javax.persistence.*;

@Entity
@Table(name = "ms_best")
public class Best {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public Best() {
    }

    public Best(String name) {
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
}
