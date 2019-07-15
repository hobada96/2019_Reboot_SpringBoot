package com.ksu.kth.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter

@Entity
@Table

public class Basic implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String name;

    @Column
    private String label;

    @Column
    private String email;

    @Column
    private String phone;

    @Builder
    public Basic(String name, String label, String email, String phone) {
        this.name = name;
        this.label = label;
        this.email = email;
        this.phone = phone;
    }
}
