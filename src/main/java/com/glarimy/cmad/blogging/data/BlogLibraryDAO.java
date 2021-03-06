package com.glarimy.cmad.blogging.data;
import java.util.List;

import com.glarimy.cmad.blogging.api.Blog;
import com.glarimy.cmad.blogging.api.Comment;

public interface BlogLibraryDAO {
	public void create(Blog blog);
	public Blog read(int blogid);
	public void update(Blog blog);
	public List<Blog> readAll();
	public void createComment(Comment comment);
	public List<Comment> readComments(int blogid);
}
