package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.Date;


public class ByeService {

    public void sayBye(){
        System.out.println("Good Bye "+new Date());
    }
}
