package com.deppit.feature.toggle.exemple.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FEATURE", schema = "deppit")
public class FeatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "enable")
    private Boolean enable;
}
