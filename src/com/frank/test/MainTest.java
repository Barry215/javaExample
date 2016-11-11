package com.frank.test;

import com.frank.activity.SghActivity;
import com.frank.activity.Task;
import com.frank.organization.ShanGuanHui;
import com.frank.people.Student;
import com.frank.getdata.StudentDao;

import java.util.List;

/**
 * Created by frank on 16/11/11.
 */
public class MainTest {
    public static void main(String[] args){
        List<Student> studentList = StudentDao.getStudents();
        Student XiaoHua = null;
        Student XiaoGang = null;
        Student XiaoBai = null;
        if (studentList == null || studentList.size() == 0){
            System.out.println("数据库获取人员失败");
        }else {
            for (Student student : studentList) {
                if (student.getName().equals("小花")) {
                    XiaoHua = student;
                    System.out.println("从前有个女孩叫小花");
                } else if (student.getName().equals("小刚")) {
                    XiaoGang = student;
                    System.out.println("然后有个男孩叫小刚");
                } else {
                    XiaoBai = student;
                    System.out.println("还有个女孩叫小白");
                }
            }

            System.out.println("获取膳管会实例");
            ShanGuanHui sgh = ShanGuanHui.getInstance();
            System.out.println("小花申请加入膳管会");
            if (sgh == null){
                System.out.println("膳管会不存在啦~");
            }else {
                if (XiaoHua.applyForMember(sgh)){
                    System.out.println("几天后，小花成功加入膳管会");

                    System.out.println("小花想当膳管会的会长");

                    if (XiaoHua.applyForChairman(sgh)){
                        System.out.println("几个月后，小花当上了膳管会的会长");

                        System.out.println("小刚申请加入膳管会");

                        if (XiaoGang.applyForMember(sgh)){
                            System.out.println("几天后，小刚成功加入膳管会");

                            System.out.println("几个月后,膳管会要有一个包饺子大赛的活动");

                            SghActivity activity = new SghActivity("包饺子大赛");

                            activity.startActivity();

                            XiaoHua.assignTask(XiaoGang, activity, new Task() {
                                @Override
                                public boolean doTask(SghActivity activity) {
                                    System.out.println("我完成了"+activity.getName()+"的任务！");
                                    return true;
                                }
                            });

                        }else {
                            System.out.println("小刚没能加入膳管会");
                        }
                    }else {
                        System.out.println("几个月后，小花没有当上膳管会的会长");
                    }
                }else {
                    System.out.println("小花没能加入膳管会");
                }

            }

        }

    }
}
