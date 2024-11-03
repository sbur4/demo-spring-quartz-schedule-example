package org.example.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

@Slf4j
public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDataMap jobDataMap = context.getMergedJobDataMap();
//        String jobId = (String) jobDataMap.get("jobID");
        String jobId = context.getJobDetail().getKey().getName();
        log.info("Job [{}] executed at: {}", jobId, new Date());
    }
}