package dao;

import java.sql.SQLException;
import java.util.List;

import model.Blog;

public class BlogDaoImpl implements BlogDaoInterface {

	@Override
	public void insertBlog(Blog blog) throws SQLException, Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Blog selectBlog(int blogid) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> selectAllBlogs() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBlog(int id) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBlog(Blog blog) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return false;
	}

}