package com.nhr.springboot4.service.impl;

import com.nhr.springboot4.bean.City;
import com.nhr.springboot4.dao.CityMapper;
import com.nhr.springboot4.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    @Override
    public City getById(Long id){
        return cityMapper.getById(id);
    }

    @Override
    public void saveCity(City city){
        cityMapper.insert(city);
    }
}
