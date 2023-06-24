package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DBcon;
import vo.CommentVO;

public class CommentDao {
	private DBcon pool;
	
	private String sql;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public CommentDao() {
		pool = DBcon.getInstance();
	}
	
	public ArrayList<CommentVO> selectCommentsByPostId(int post_mno) {
	    ArrayList<CommentVO> commentList = new ArrayList<CommentVO>();
	    sql = "SELECT * FROM comment_tbl WHERE post_mno = ?"; 
	    try {
	        con = pool.getConnection();
	        pstmt = con.prepareStatement(sql);
	        pstmt.setInt(1, post_mno); 
	        rs = pstmt.executeQuery();
	        
	        while (rs.next()) {
	            CommentVO comment = new CommentVO();
	            comment.setPost_mno(rs.getInt("post_mno"));
	            comment.setComment_mno(rs.getInt("comment_mno"));
	            comment.setComment(rs.getString("comment"));
	            comment.setAuthor(rs.getString("author"));

	            commentList.add(comment); 
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {	        
	        if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
	        if (pstmt != null) try { pstmt.close(); } catch (SQLException ignore) {}
	        if (con != null) try { con.close(); } catch (SQLException ignore) {}
	    }

	    return commentList;
	}

}
