package com.table;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by wangzy on 2019/6/24.
 */
@Entity
@Table(name = "tb_user")
public class Tb_User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45, unique = true, nullable = false)
    private String loginname;            //登录名称，使用手机号,不可重复

    @Column(length = 45, nullable = false)
    private String userName;             //用户名，使用真实名称，可重复；

    @Column(length = 45, nullable = false)
    private String password;             //用户密码

    @Column(length = 45)
    private String superPassword;        //超级密码

    @Column(nullable = false)
    private Boolean isEnable = true;      //用户是否启用；

    @Column(length = 45)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSuperPassword() {
        return superPassword;
    }

    public void setSuperPassword(String superPassword) {
        this.superPassword = superPassword;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
