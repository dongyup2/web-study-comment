package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CommentDao;
import dao.PostDao;
import vo.CommentVO;
import vo.PostVO;

@WebServlet("/SelectPostByIdServlet")
public class SelectPostByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int post_Mno = Integer.parseInt(request.getParameter("post_mno"));
		
		PostDao postDao = new PostDao();
		PostVO postVO = postDao.selectPostById(post_Mno);
		
		request.setAttribute("postVO", postVO);
		
		CommentDao commentDao = new CommentDao();
		List<CommentVO> comments = commentDao.selectCommentsByPostId(post_Mno);
	
		request.setAttribute("comments", comments);
		
		request.getRequestDispatcher("postDetail.jsp").forward(request, response);	
	}

}
