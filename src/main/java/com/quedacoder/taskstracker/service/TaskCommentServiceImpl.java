package com.quedacoder.taskstracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.quedacoder.taskstracker.model.TaskComment;
import com.quedacoder.taskstracker.repository.TaskCommentRepository;

public class TaskCommentServiceImpl implements TaskCommentService {
	
	@Autowired
	private TaskCommentRepository taskCommentRepository;

	@Override
	public List<TaskComment> getTaskCommentByTaskId(Long taskid) {
		// TODO Auto-generated method stub
		return taskCommentRepository.findAllByTaskId(taskid);
	}

}
