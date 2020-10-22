package com.quedacoder.taskstracker.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.quedacoder.taskstracker.model.Task;
import com.quedacoder.taskstracker.repository.TaskRepository;

public class TaskServiceImpl implements TaskService {
	
	
	@Autowired
	TaskRepository repository;

	@Override
	public Task createTask(Task taskToSave) {
		
		return repository.save(taskToSave);
	}

	@Override
	public Iterator<Task> getAllTask() {
		List<Task> tasks = repository.findAll();
		return tasks.iterator();
	}

}
