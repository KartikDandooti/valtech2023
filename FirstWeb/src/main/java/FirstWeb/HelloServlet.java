package FirstWeb;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {
	private int count;
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
//	super.init(config);
	System.out.println("servlet intializee");
	System.out.println("Driver class="+config.getInitParameter("driver-class"));
	System.out.println("Jdbc url="+config.getInitParameter("jdbc-url"));
	System.out.println("Username:"+config.getInitParameter("username"));
	System.out.println("Password:"+config.getInitParameter("password"));
}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String name=req.getParameter("name");
       resp.getWriter().print("Hello Servlet "+count++);
	}

// todo if name and pass is wrong show the login page with msg
	// if anme is less than 4 cahr then add msg and login page
	// if pass is less than 8 char then add msg and login page
}
