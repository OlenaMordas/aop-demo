package com.example.aopdemo.business;

import com.example.aopdemo.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String caculateSomethig(){
       String data = dao2.retrieveSomething();
       // some logic

        return data;
    }
}
