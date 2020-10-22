package com.quedacoder.taskstracker.controller;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String createTask(@RequestParam("action") String action, @ModelAttribute Task task, BindingResult result) {
		
		if (action.equalsIgnoreCase("cancel")) {
			return "redirect:/";
		}
		
		if (task != null) {
			taskService.createTask(task);
		}
		
		return "redirect:/tasks";
	}
	
	@GetMapping("/task/edit/{task_id}")
	public String getTaskFormForEdit(Model model, @PathVariable("task_id") Long task_id) {
		
		Optional<Task> task = taskService.findById(task_id);
		
		if (task.isPresent()) {
			model.addAttribute("task", task.get());
		}
		
		return "task-form";
	}

}
