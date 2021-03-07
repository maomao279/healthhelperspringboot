package com.healthhelper.dao;

import com.healthhelper.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table healthhelper_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table healthhelper_user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table healthhelper_user
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table healthhelper_user
     *
     * @mbg.generated
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table healthhelper_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);

    /**
     * 判断用户名是否存在
     * select count(*) from user where username=xxx
     */
    Integer findByUsername(@Param("username") String username);

    /**
     * 根据用户名和密码查询
     */
    User findByUsernameAndPassword(@Param("username") String username,@Param("password") String password);

    /**
     * 判断邮箱是否存在
     * select count(*) from user where username=xxx
     */
    Integer findByEmail(@Param("email") String email);

}