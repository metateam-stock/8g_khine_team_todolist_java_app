package net.task.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.task.model.Task;

public class TaskDAO {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/task";
	private String jdbcUsername = "root";
	private String jdbcPassword = "Winttheingisoe@92";
	
	private static final String SELECT_ALL_TASKS = "select * from task";

	//get connection 
	protected Connection getConnection() {
		Connection connection = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	//select all tasks
	public List<Task> selectAllTasks(){
		List<Task> tasks = new ArrayList<>();
		
		//establish connection
		try(Connection connection = getConnection();
				//create statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TASKS);){
						
			//execute query
			System.out.println("test");
				System.out.println("test string");
				System.out.println("test sting");
			//ResultSet rs = preparedStatement.executeQuery();
			ResultSet rs = preparedStatement.executeQuery();

			//Process the ResultSet object
			while(rs.next()){
				int id = rs.getInt("id");
				String taskName = rs.getString("taskName");
				String personName = rs.getString("personName");
				String note = rs.getString("note");
				System.out.println(id);
				System.out.println(taskName);
				System.out.println(personName);
				tasks.add(new Task(id, taskName, personName, note));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tasks;
	}
}
