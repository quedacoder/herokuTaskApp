package com.quedacoder.taskstracker.service;

import java.util.Iterator;

import com.quedacoder.taskstracker.model.Task;

public interface TaskService {
	
	Task createTask(Task taskToSave);
    Iterator<Task> getAllTask();

}
