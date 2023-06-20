package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DBcon;
import vo.PostVO;

public class PostDao {
	private DBcon pool;
	
	private String sql;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public PostDao() {
		pool = DBcon.getInstance();
	}
	public PostVO selectPostById(int post_Mno) {
	    PostVO postVO = null;
	    sql = "SELECT * FROM post_tbl WHERE post_mno = ?";
	    
	    try {
	        con = pool.getConnection();
	        pstmt = con.prepareStatement(sql);
	        pstmt.setInt(1, post_Mno);
	        rs = pstmt.executeQuery();
	        
	        if (rs.next()) {
	            postVO = new PostVO();
	            postVO.setPost_mno(rs.getInt("post_mno"));
	            postVO.setPost_name(rs.getString("post_name"));
	            postVO.setAuthor(rs.getString("author"));
	            postVO.setPost_content(rs.getString("post_content"));
	            
	        }
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        if (pstmt != null) {
	            try {
	                pstmt.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        if (con != null) {
	            try {
	                con.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    return postVO;
	}

	public ArrayList<PostVO> selectPostAll() {
		ArrayList<PostVO> postList = new ArrayList<PostVO>();
		sql = "select * from post_tbl";
		try {
			con = pool.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				PostVO postVO = new PostVO();
				postVO.setPost_mno(rs.getInt("post_mno"));
				postVO.setPost_name(rs.getString("post_name"));
				postVO.setAuthor(rs.getString("author"));
				postList.add(postVO);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return postList;
	}
}
