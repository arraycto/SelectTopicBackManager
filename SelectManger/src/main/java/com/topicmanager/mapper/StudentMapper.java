package com.topicmanager.mapper;

import com.topicmanager.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface StudentMapper extends Mapper<Student> {

    @Select("select * from student where loginName = #{ loginName }")
    Student login(@Param("loginName") String loginName);
}
