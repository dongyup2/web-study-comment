package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PostDao;
import vo.PostVO;

@WebServlet("/PostBoardServlet")
public class PostBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PostDao dao = new PostDao();
		ArrayList<PostVO> postList = dao.selectPostAll();
		
		request.setAttribute("postList", postList);
		request.getRequestDispatcher("postBoard.jsp").forward(request, response);
	}
}

