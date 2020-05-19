package com.yucoding.task.quartz.job;

import cn.hutool.core.date.DateUtil;
import com.yucoding.task.quartz.job.base.BaseJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@Slf4j
public class HelloJob implements BaseJob {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.error("Hello Job 执行时间: {}", DateUtil.now());
    }
}
