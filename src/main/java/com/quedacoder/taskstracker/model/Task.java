package com.quedacoder.taskstracker.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	@Column(nullable = false, length = 25)
	private String type;
	
	@Column(nullable = false)
	private LocalDate plannedStartDate;
	
	@Column(nullable = false, length = 40)
	private String teamRequestedBy;
	
	@Column(nullable = false)
	private LocalDate requestedFinishDate;
	
	@Column(nullable = false, length = 300)
	private String description;
	
	private String comment;
	
	@Column(nullable = false)
	private String status;
	
	private LocalDateTime actualStartDate;
	
	private LocalDateTime actualFinishDate;
	
	public Task() {
		
	}

	public Task(int id, String name, String type, LocalDate plannedStartDate, String teamRequestedBy,
			LocalDate requestedFinishDate, String description, String comment, String status,
			LocalDateTime actualStartDate, LocalDateTime actualFinishDate) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.plannedStartDate = plannedStartDate;
		this.teamRequestedBy = teamRequestedBy;
		this.requestedFinishDate = requestedFinishDate;
		this.description = description;
		this.comment = comment;
		this.status = status;
		this.actualStartDate = actualStartDate;
		this.actualFinishDate = actualFinishDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(LocalDate plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public String getTeamRequestedBy() {
		return teamRequestedBy;
	}

	public void setTeamRequestedBy(String teamRequestedBy) {
		this.teamRequestedBy = teamRequestedBy;
	}

	public LocalDate getRequestedFinishDate() {
		return requestedFinishDate;
	}

	public void setRequestedFinishDate(LocalDate requestedFinishDate) {
		this.requestedFinishDate = requestedFinishDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(LocalDateTime actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public LocalDateTime getActualFinishDate() {
		return actualFinishDate;
	}

	public void setActualFinishDate(LocalDateTime actualFinishDate) {
		this.actualFinishDate = actualFinishDate;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", type=" + type + ", plannedStartDate=" + plannedStartDate
				+ ", teamRequestedBy=" + teamRequestedBy + ", requestedFinishDate=" + requestedFinishDate
				+ ", description=" + description + ", comment=" + comment + ", status=" + status + ", actualStartDate="
				+ actualStartDate + ", actualFinishDate=" + actualFinishDate + "]";
	}
}
