package cn.feng.dao.model;

import java.util.Date;

public class TUser {
    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private Date bithday;

    public TUser(Integer id, String username, String password, Integer age, Date bithday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.bithday = bithday;
    }

    public TUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBithday() {
        return bithday;
    }

    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }
}