package contoller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Student;

/**
 * Servlet implementation class student
 */
@WebServlet("/student")
public class student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public student() {
        super();
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String marksValue=request.getParameter("marks");
		try {
			if(name==null||name.trim().isEmpty()||marksValue==null) {
				response.sendError(404,"Enter name or marks");
			}
			int marks= Integer.parseInt(marksValue);
			if(marks < 0 ||marks>100) {
				response.sendError(404,"Enter more than 0 or less than 100");
			}
			Student student =new Student(name.trim(),marks);
			request.setAttribute(marksValue, student);
			request.getRequestDispatcher("/output.jsp").forward(request,response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}