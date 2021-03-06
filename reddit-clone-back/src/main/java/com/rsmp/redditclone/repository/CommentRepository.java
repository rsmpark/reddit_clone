package com.rsmp.redditclone.repository;

import com.rsmp.redditclone.model.entity.Comment;
import com.rsmp.redditclone.model.entity.Post;
import com.rsmp.redditclone.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
