package com.example.aopdemo.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveSomething(){
        return "This is Dao1";
    }
}
