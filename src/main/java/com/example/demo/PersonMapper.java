package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonMapper {


    public List<Person> findAll();


    public Person findById(@Param("id") Integer id);

}
