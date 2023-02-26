package com.javacodegeeks.rest.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javacodegeeks.rest.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}