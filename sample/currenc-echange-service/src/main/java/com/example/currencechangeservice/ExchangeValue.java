package com.example.currencechangeservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
public class ExchangeValue {
    @Id
    private long id;
    @Column(name="first_Name")
    private String from;
    @Column(name="Last_name")
    private String to;
    private BigDecimal conversionmultiple;
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ExchangeValue() {
    }

    public ExchangeValue(long id, String from, String to, BigDecimal conversionmultiple) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionmultiple = conversionmultiple;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionmultiple() {
        return conversionmultiple;
    }

    public void setConversionmultiple(BigDecimal conversionmultiple) {
        this.conversionmultiple = conversionmultiple;
    }
}
