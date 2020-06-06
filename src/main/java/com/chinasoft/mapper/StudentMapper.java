package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.Student_u;

public interface StudentMapper {

	List<Student_u> SelectAllStudent();
	Student_u  SelectOneAll(int id);

	List<Student_u> SelectClassAll(int c_id);

	//Student_u SelectNotNullNameAuto(int id);
}
