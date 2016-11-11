package com.frank.getdata;

import com.frank.other.Sex;
import com.frank.people.Student;
import com.frank.database.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by frank on 16/11/11.
 */
public class StudentDao {
    public static List<Student> getStudents(){
        Connection conn = DBUtil.getConnection();
        if (conn == null){
            System.out.println("数据库连接失败");
            return null;
        }else {
            String sql = "select * from person";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                List<Student> students = new ArrayList<>();
                while (rs.next()){
                    Student student = new Student();
                    student.setName(rs.getString("name"));
                    student.setIdCard(rs.getString("cardid"));
                    if (rs.getString("sex").equals(Sex.MAN.getType())){
                        student.setSex(Sex.MAN);
                    }else {
                        student.setSex(Sex.WOMAN);
                    }
                    student.setAge(rs.getInt("age"));
                    student.setDescribe(rs.getString("describe"));
                    student.setEmail(rs.getString("email"));
                    student.setPhone(rs.getString("phone"));
                    students.add(student);
                }
                return students;
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                DBUtil.closeConn(conn);
            }
            return null;
        }
    }
}
