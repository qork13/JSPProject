package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;

/**
 * Servlet implementation class getFarenheitServlet
 */
@WebServlet("/getFarenheitServlet")
public class getFarenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFarenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Declare userFarenheit variable and get the input from the ftoc.jsp
		String userFarenheit = request.getParameter("userFarenheit");
		
		//Create a new TempConverter object and parse and send the input to the object to convert
		TempConverter userTemp = new TempConverter(Double.parseDouble(userFarenheit));
		
		//Get converted value and send the value to the farenheitresult.jsp to display to the user
		request.setAttribute("userFarenheit", userTemp);
		
		getServletContext().getRequestDispatcher("/farenheitresult.jsp").forward(request, response);
	}

}
