package com.yuandu.user.dao.model;

import com.yuandu.mybatis.entity.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer sex;

    private Date birthday;

    @Column(name = "yuandu_id")
    private String yuanduId;

    private String mobeile;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return yuandu_id
     */
    public String getYuanduId() {
        return yuanduId;
    }

    /**
     * @param yuanduId
     */
    public void setYuanduId(String yuanduId) {
        this.yuanduId = yuanduId;
    }

    /**
     * @return mobeile
     */
    public String getMobeile() {
        return mobeile;
    }

    /**
     * @param mobeile
     */
    public void setMobeile(String mobeile) {
        this.mobeile = mobeile;
    }
}