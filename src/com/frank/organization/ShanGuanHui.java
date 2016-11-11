package com.frank.organization;

import com.frank.people.Person;
import com.frank.other.Sex;
import com.frank.apply.ApplyForClub;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by frank on 16/11/10.
 */
public class ShanGuanHui extends Organization{

    private static ShanGuanHui sgh;

    private ApplyForClub applyForClub;

    public ShanGuanHui(String organizationName, Date createTime, List<Person> people) {
        super(organizationName, createTime, people);
    }

    public static ShanGuanHui getInstance() {
        if (sgh == null) {
            String create_time = "2003-10-16 18:23:55";
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                Date date = df.parse(create_time);
                List<Person> members = new ArrayList<>();
                sgh = new ShanGuanHui("校学生膳食管理委员会",date,members);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return sgh;
    }

    public void setApplyForClub(ApplyForClub applyForClub){
        this.applyForClub = applyForClub;
    }

    @Override
    public void setOrganizationName(String name) {
        super.setOrganizationName(name);
    }

    @Override
    public void setChairman(Person person) {
        super.setChairman(person);
    }

    @Override
    public void addMember(Person person) {
        List<Person> members = getMembers();
        members.add(person);
        super.setMembers(members);
    }

    @Override
    public boolean receiveApplyForMember(Person person) {
        String describe = person.getDescribe();
        if (describe.length() > 5){
            addMember(person);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean receiveApplyForManager(Person person) {
        if (person.getAge() >= 20){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean receiveApplyForChairman(Person person) {
        if (person.getAge() >= 20 && person.getSex().equals(Sex.WOMAN)){
            return true;
        }else {
            return false;
        }
    }

}
