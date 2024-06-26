package com.sunmi.innerprinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程管理类
 * 
 * @author lenovo
 *
 */
public class ThreadPoolManager {
	private ExecutorService service;

	private ThreadPoolManager() {
		service = Executors.newSingleThreadExecutor();
	}

	private static final ThreadPoolManager manager = new ThreadPoolManager();

	public static ThreadPoolManager getInstance() {
		return manager;
	}

	public void executeTask(Runnable runnable) {
		service.execute(runnable);
	}

}
