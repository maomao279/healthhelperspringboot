package com.healthhelper.dao;

import com.healthhelper.pojo.Sleep;
import java.util.List;

public interface SleepMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table healthhelper_sleep
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table healthhelper_sleep
     *
     * @mbg.generated
     */
    int insert(Sleep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table healthhelper_sleep
     *
     * @mbg.generated
     */
    Sleep selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table healthhelper_sleep
     *
     * @mbg.generated
     */
    List<Sleep> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table healthhelper_sleep
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Sleep record);
}