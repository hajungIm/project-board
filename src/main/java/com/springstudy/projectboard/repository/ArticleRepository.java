package com.springstudy.projectboard.repository;

import com.springstudy.projectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
