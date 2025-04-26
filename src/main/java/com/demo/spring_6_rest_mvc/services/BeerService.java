package com.demo.spring_6_rest_mvc.services;

import com.demo.spring_6_rest_mvc.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);

}
