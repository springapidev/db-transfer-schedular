package com.example.demo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;


public class ByeJob implements Job {

    ByeService byeService=new ByeService();
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        byeService.sayBye();
    }
}
