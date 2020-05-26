package com.yucoding.mongodb.repository;


import com.yucoding.mongodb.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticleRepository extends MongoRepository<Article,Long> {

    List<Article> findByTitleLike(String title);
}
