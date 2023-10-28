package com.feem.reiss.model;

import javax.persistence.*;

@Entity
@Table(name = "PERMISSION")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERMISSION")
    private Integer idPermission;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PATH")
    private String path;

    public Integer getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(Integer idPermission) {
        this.idPermission = idPermission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
