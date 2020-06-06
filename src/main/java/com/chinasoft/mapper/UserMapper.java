package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.User;

public interface UserMapper {

	void addUserNoPar();

	void addUserByPar(User user);

	User selectOneByPar(int id);

	@Select("select * from user")
	List<User>  selectAll();

	//login
	User selectLogin(User user);

	//use $ to select order by
	List<User> selectOrderBy(@Param("column")String column);

	//select some user
	List<User> selectSomeUser(List list);
}
