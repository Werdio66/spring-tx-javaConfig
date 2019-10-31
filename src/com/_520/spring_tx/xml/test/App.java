package com._520.spring_tx.xml.test;


import com._520.spring_tx.xml.service.IAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig
public class App {

    @Autowired
    private IAccountService service;
   @Test
    void trans(){
       service.trans(10086L, 10010L,1000);
   }
}
