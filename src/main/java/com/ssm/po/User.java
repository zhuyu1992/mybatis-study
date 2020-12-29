package com.ssm.po;

/**
 * @auther: zzzgyu
 *
 * CREATE TABLE `user` (
 *   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
 *   `name` varchar(30) DEFAULT NULL COMMENT '姓名',
 *   `age` int(11) DEFAULT NULL COMMENT '年龄',
 *   `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
 */

public class User {

    private Long id;

    private String name;

    private Integer age;

    private String email;


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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}
