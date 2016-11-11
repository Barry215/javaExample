package com.frank.people;

import com.frank.activity.SghActivity;
import com.frank.activity.Task;
import com.frank.apply.ApplyForClub;
import com.frank.organization.Organization;
import com.frank.other.Sex;

/**
 * Created by frank on 16/11/11.
 */
public class Student extends Person implements ApplyForClub {
    private String phone;
    private String email;


    public Student(){

    }

    public Student(String name, int age, String idCard, Sex sex, String phone) {
        super(name, age, idCard, sex);
        this.phone = phone;
    }

    public Student(String name, int age, String idCard, Sex sex, String phone, String email) {
        super(name, age, idCard, sex);
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean applyForChairman(Organization organization) {
        return organization.receiveApplyForChairman(this);
    }

    @Override
    public boolean applyForMember(Organization organization) {
        return organization.receiveApplyForMember(this);
    }

    @Override
    public boolean applyForLeave(Organization organization) {
        return false;
    }

    @Override
    public boolean applyForManager(Organization organization) {
        return organization.receiveApplyForManager(this);
    }

    public void assignTask(Person person, SghActivity activity, Task task){
        person.getTask(task,activity);
    }
}
