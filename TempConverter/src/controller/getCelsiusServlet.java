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
 * Servlet implementation class getCelsiusServlet
 */
@WebServlet("/getCelsiusServlet")
public class getCelsiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelsiusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Declare userCelsius variable and grab the input from the ctof.jsp
		String userCelsius = request.getParameter("userCelsius");
		
		//Create a new TempConverter object and parse the input to send to the object
		TempConverter userTemp = new TempConverter(Double.parseDouble(userCelsius));
		
		//Get the converted temperature back and send the results to the celsiusresult.jsp
		request.setAttribute("userCelsius", userTemp);
		
		getServletContext().getRequestDispatcher("/celsiusresult.jsp").forward(request, response);
		
		
	}

}
