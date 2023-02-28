package net.task.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.task.dao.TaskDAO;
import net.task.model.Task;

/**
 * Servlet implementation class TaskServlet
 */
@WebServlet("/")
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TaskDAO taskDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskServlet() {
    	this.taskDAO = new TaskDAO();
    }
    
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		
		switch(action) {
		case"/":
			listTask(request,response);
			break;
		case"/edit":
			editTask(request,response);
			break;
		default:
			listTask(request,response);
			break;
		}
	}
	
	private void listTask(HttpServletRequest request, HttpServletResponse response){
	
		List<Task> ListTask = taskDAO.selectAllTasks();
		request.setAttribute ("ListTask", ListTask);
		RequestDispatcher dispatcher = request.getRequestDispatcher("task-list.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void editTask(HttpServletRequest request, HttpServletResponse response ){
		
	}

}
