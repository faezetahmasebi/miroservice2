package com.example.currencechangeservice.controller;

import com.example.currencechangeservice.ExchangeValue;
import com.example.currencechangeservice.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("employee")
public class CurenecyExachangeController {
    @Autowired
    Environment environment;
    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/currencyExchange/from/{from}/to/{to}")
    public ExchangeValue retriveValue(@PathVariable String from,@PathVariable String to){
        //ExchangeValue exchangeValue= new ExchangeValue(1000L,from,to, BigDecimal.valueOf(65L));
        ExchangeValue exchangeValue =
                repository.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
         return exchangeValue;

    }
    @GetMapping("/hello")
    public String retriveValue(){
       // System.out.print("as"+Integer.parseInt(environment.getProperty("local.server.port")));
        return environment.getProperty("server.port") ;

    }
}
