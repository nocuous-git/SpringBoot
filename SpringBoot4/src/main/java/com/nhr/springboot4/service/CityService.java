package com.nhr.springboot4.service;

import com.nhr.springboot4.bean.City;

public interface CityService {

    public City getById(Long id);

    public void saveCity(City city);


}
