package com.nik.dao;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.nik.model.Blog;

@Repository
@ComponentScan("com.nik")
public interface BlogDao {
void addBlog(Blog blog);

List<Blog> viewBlogs();

void deleteBlog(Blog blog);
void updateBlog(Blog blog);
/*void updateBlogs(Blog blog);*/
List<Blog> viewMyBlogs(String postedby);
}
