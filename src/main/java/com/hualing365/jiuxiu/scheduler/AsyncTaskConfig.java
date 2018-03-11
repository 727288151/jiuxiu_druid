/**
 * 
 */
package com.hualing365.jiuxiu.scheduler;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 线程池配置类
 * @author im.harley.lee@qq.com
 * @since Mar 10, 2018 10:31:28 PM
 */
@Configuration
@ComponentScan("com.hualing365.jiuxiu.scheduler")
@EnableAsync
public class AsyncTaskConfig implements AsyncConfigurer {

	@Override
	@Bean
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(2);
		taskExecutor.setMaxPoolSize(100);
		taskExecutor.setQueueCapacity(0);
		
		taskExecutor.initialize();

		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}
