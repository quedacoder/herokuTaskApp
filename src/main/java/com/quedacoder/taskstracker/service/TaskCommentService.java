package com.quedacoder.taskstracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quedacoder.taskstracker.model.TaskComment;

@Service
public interface TaskCommentService {
	
	List<TaskComment> getTaskCommentByTaskId(Long taskid);

}
