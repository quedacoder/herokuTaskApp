package com.quedacoder.taskstracker.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task_comment")
public class TaskComment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "task_id")
	private long taskId;
	
	private String comment_text;
	
	private String status;
	
	private LocalDateTime createdate;
	
	public TaskComment() {}

	public TaskComment(Long id, Long taskId, String comment_text, String status, LocalDateTime createdate) {
		super();
		this.id = id;
		this.taskId = taskId;
		this.comment_text = comment_text;
		this.status = status;
		this.createdate = createdate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getComment_text() {
		return comment_text;
	}

	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreatedate() {
		return createdate;
	}

	public void setCreatedate(LocalDateTime createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return "TaskComment [id=" + id + ", taskId=" + taskId + ", comment_text=" + comment_text + ", status=" + status
				+ ", createdate=" + createdate + "]";
	}
}
