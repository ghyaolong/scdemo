package com.yao.service;

import org.springframework.stereotype.Component;

/**
 * Created by yaochenglong on 17/12/5.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
