package com.quedacoder.taskstracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quedacoder.taskstracker.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
