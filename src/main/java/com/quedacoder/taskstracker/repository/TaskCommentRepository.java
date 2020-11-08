package com.quedacoder.taskstracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quedacoder.taskstracker.model.TaskComment;

@Repository
public interface TaskCommentRepository extends JpaRepository<TaskComment, Long> {
	
	@Query("FROM TaskComment as t WHERE t.taskId = ?1 ORDER BY t.createdate DESC")
	List<TaskComment> findAllByTaskId(Long taskId);

}
