package com.nhr.springboot4.dao;

import com.nhr.springboot4.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {

    @Select("select * from city where id=#{id}")
    public City getById(long id);

    public City insert(City city);

}
