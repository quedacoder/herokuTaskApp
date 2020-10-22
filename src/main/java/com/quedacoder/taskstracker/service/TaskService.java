package com.quedacoder.taskstracker.service;

import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.quedacoder.taskstracker.model.Task;

@Service
public interface TaskService {
	
	Task createTask(Task taskToSave);
    Iterator<Task> getAllTask();

}
