package com.offcn.bean;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private  int  id;
    private  String pname;
    private  int age;
    private  String paddress;
    private Date birthday;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", age=" + age +
                ", paddress='" + paddress + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
