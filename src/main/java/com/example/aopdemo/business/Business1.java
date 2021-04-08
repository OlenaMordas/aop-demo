package com.example.aopdemo.business;

import com.example.aopdemo.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String caculateSomethig(){
       String data = dao1.retrieveSomething();
       // some logic

        return data;
    }
}
