package com.quedacoder.taskstracker.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quedacoder.taskstracker.model.Task;
import com.quedacoder.taskstracker.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/tasks")
	public String getTasks(Model model) {		
		Iterator<Task> tasks = taskService.getAllTask();
		model.addAttribute("tasks", tasks);
		return "tasks";
	}
	
	@GetMapping("/task/create")
	public String getTaskForm(Model model) {
		Task task = new Task();
		model.addAttribute("task", task);
		return "task-form";
	}
	
	@PostMapping("/task/create/save")
	public String createTask(@RequestParam("action") String action, Model model, BindingResult result) {
		
		Task task = (Task) model.getAttribute("task");
		
		if (task != null) {
			task.setStatus("Not Started");
			task.setType("Enhancement");
			taskService.createTask(task);
		}
		
		return "redirect/tasks";

		
	}

}
