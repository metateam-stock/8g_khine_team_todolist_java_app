package net.task.model;

public class Task {
	private int id;
	private String taskName;
	private String personName;
	private String note;
	
	public Task(int id, String taskName, String personName, String note) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.personName = personName;
		this.note = note;
	}
	
	public Task(String taskName, String personName, String note) {
		super();
		this.taskName = taskName;
		this.personName = personName;
		this.note = note;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
