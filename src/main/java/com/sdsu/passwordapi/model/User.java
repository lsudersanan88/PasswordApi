
package com.sdsu.passwordapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTO class for User data.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column (name = "uid")
    private Integer uid;
    @Column (name = "gid")
    private Integer gid;
    @Column (name = "name")
    private String name;
    @Column (name = "comment")
    private String comment;
    @Column (name = "home")
    private String home;
    @Column (name = "shell")
    private String shell;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", gid=" + gid +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", home='" + home + '\'' +
                ", shell='" + shell + '\'' +
                '}';
    }

}
