package com.demo.spring_6_rest_mvc.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class BeerControllerTest {

    @Autowired
    BeerController beerController;

    @Test
    void getBeerById() {
        System.out.println(beerController.getBeerById(UUID.randomUUID()));
    }

}
