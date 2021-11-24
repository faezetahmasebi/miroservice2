package com.example.account.controller;

import com.example.account.model.CurrencyConversionBean;
import com.example.account.proxy.AccountServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("customer")
public class accountController {
    @Autowired
    private AccountServiceProxy accountServiceProxy;
/*
    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
*/  @GetMapping("/findName/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
                                                  @PathVariable BigDecimal quantity) {

//        Map<String,String> uriVariables=new HashMap<>();
//        uriVariables.put("from",from);
//        uriVariables.put("to",to);
//        ResponseEntity<CurrencyConversionBean> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",CurrencyConversionBean.class,uriVariables);
        CurrencyConversionBean response=accountServiceProxy.convertCurrency(from,to);
        return new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),quantity,response.getConversionMultiple(),response.getPort());
}
    @GetMapping("/haha")
    public String haha(){
        System.out.println(accountServiceProxy.hello());;
        return "hi every body";
    }
    @GetMapping("/hello")
    public String hello(){
        System.out.println(accountServiceProxy.hello());;
        return "hi every body";
    }

}
