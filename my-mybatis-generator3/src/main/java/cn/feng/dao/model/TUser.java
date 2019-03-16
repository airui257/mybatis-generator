package cn.feng.dao.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class TUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return bithday
     */
    public Date getBithday() {
        return bithday;
    }

    /**
     * @param bithday
     */
    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }
}