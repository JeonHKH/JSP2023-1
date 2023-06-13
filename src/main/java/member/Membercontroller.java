package member;

import java.io.IOException;
import java.util.Date;	

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Membercontroller
 */
@WebServlet("/mcontrol")
public class Membercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MemberDAO dao;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.int(config);
		dao = new MemberDAO();	
	}
	
	
       
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
    	String action = request.getParameter("action");
    	String view = "";
    	if(action == null) {
    		getServletContext().getRequestDispatcher("/mcontrol?action=list").forward(request,  resp);
    	}else {
    		switch(action) {
    		case "list": view = list(req, res); break;
    		case "insert": view = insert(req, res); break;
    		}
    		getServletContext().getRequestDispatcher(view).forward(request, resp);
    	}
    	getServletContext().
    	getRequestDispatcher(view).
    	forward(req, res); 
    	
    	public String list(HttpServletRequest request, HttpServletResponse response)
    	req.setAttribute("memberlist", dao.getAll());
    	return"/memberinfo.jsp";
    
     }
    public String inser(HttpServletRequest request, HttpServletResponse response);
    	Member m = new
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		dao = new MemberDAO();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Membercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
