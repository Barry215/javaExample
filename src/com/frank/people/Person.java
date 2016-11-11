package com.frank.people;

import com.frank.activity.SghActivity;
import com.frank.activity.Task;
import com.frank.other.Sex;

/**
 * Created by frank on 16/11/10.
 */
public class Person {
    private String name;
    private int age;
    private String idCard;
    private Sex sex;
    private String describe;

    public Person() {
    }

    public Person(String name, int age, String idCard, Sex sex) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void getTask(Task task, SghActivity activity){
        task.doTask(activity);
    }
}
