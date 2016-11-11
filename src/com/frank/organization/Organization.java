package com.frank.organization;

import com.frank.people.Person;

import java.util.Date;
import java.util.List;

/**
 * Created by frank on 16/11/10.
 */
public abstract class Organization {
    private String organizationName;

    private Person createUser;

    private Person chairman;

    private List<Person> members;

    private Date createTime;

    public Organization(){

    }

    public Organization(String organizationName, Date createTime,List<Person> people) {
        this.organizationName = organizationName;
        this.createTime = createTime;
        members = people;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public Person getCreateUser() {
        return createUser;
    }

    public Person getChairman() {
        return chairman;
    }

    public List<Person> getMembers() {
        return members;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setCreateUser(Person createUser) {
        this.createUser = createUser;
    }

    public void setChairman(Person chairman) {
        this.chairman = chairman;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    public abstract void addMember(Person person);

    public abstract boolean receiveApplyForMember(Person person);

    public abstract boolean receiveApplyForManager(Person person);

    public abstract boolean receiveApplyForChairman(Person person);

}
