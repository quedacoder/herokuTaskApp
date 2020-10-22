package com.quedacoder.taskstracker.service;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.quedacoder.taskstracker.model.Task;

@Service
public interface TaskService {
	
	Task createTask(Task taskToSave);
    Iterator<Task> getAllTask();
	Optional<Task> findById(Long task_id);
	void deleteTaskById(Long task_id);

}
