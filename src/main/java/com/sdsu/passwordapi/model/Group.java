package com.sdsu.passwordapi.model;

import java.util.Arrays;

/**
 * DTO class for Group data.
 */
public class Group {
    private String name;
    private Integer gid;
    private String[] members;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", gid=" + gid +
                ", members=" + Arrays.toString(members) +
                '}';
    }
}
