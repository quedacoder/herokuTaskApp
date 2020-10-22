package com.quedacoder.taskstracker.service;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quedacoder.taskstracker.model.Task;
import com.quedacoder.taskstracker.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	
	
	@Autowired
	TaskRepository repository;

	@Override
	public Task createTask(Task taskToSave) {
		
		switch (taskToSave.getStatus().toLowerCase()) {
			case "in progress":
				if (taskToSave.getActualStartDate() == null) {
					taskToSave.setActualStartDate(LocalDateTime.now());
				}
				break;
			case "completed":
				taskToSave.setActualFinishDate(LocalDateTime.now());
				break;
			default:
				break;
		}
		
		return repository.save(taskToSave);
	}

	@Override
	public Iterator<Task> getAllTask() {
		List<Task> tasks = repository.findAll();
		return tasks.iterator();
	}

	@Override
	public Optional<Task> findById(Long task_id) {
		return repository.findById(task_id);
	}

	@Override
	public void deleteTaskById(Long task_id) {
		
		repository.deleteById(task_id);
		
	}

}
