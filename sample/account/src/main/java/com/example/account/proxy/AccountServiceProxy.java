package com.example.account.proxy;

import com.example.account.configuration.LoadBalancerConfiguration;
import com.example.account.model.CurrencyConversionBean;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;

//@FeignClient(name="currency-exchnage-service",url="http://localhost:8001/employee/hello")

@FeignClient(name="currency-exchnage-service")
@LoadBalancerClient(name = "currency-exchnage-service",
        configuration= LoadBalancerConfiguration.class)
//@RibbonClient("currency-exchnage-service")
public interface AccountServiceProxy {
    @GetMapping("employee/currencyExchange/from/{from}/to/{to}")
    public CurrencyConversionBean convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to);

    @GetMapping("employee/hello")
    public String hello();



}
