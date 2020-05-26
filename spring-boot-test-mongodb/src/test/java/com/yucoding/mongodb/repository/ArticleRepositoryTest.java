package com.yucoding.mongodb.repository;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONUtil;
import com.yucoding.mongodb.SpringBootTestApplication;
import com.yucoding.mongodb.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class ArticleRepositoryTest extends SpringBootTestApplication {
    @Autowired
    private ArticleRepository articleRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private Snowflake snowflake;

    @Test
    public void testSave(){
        Article article =new Article(1L, RandomUtil.randomString(20), RandomUtil.randomString(150), DateUtil.date(), DateUtil
                .date(), 0L, 0L);
        articleRepo.save(article);
        log.info("【article】= {}", JSONUtil.toJsonStr(article));
    }
    @Test
    public void testSaveList(){
        List<Article> articleList = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            articleList.add(new Article(snowflake.nextId(), RandomUtil.randomString(20), RandomUtil.randomString(150), DateUtil
                    .date(), DateUtil.date(), 0L, 0L));
        }
        articleRepo.saveAll(articleList);
        log.info("【articles】= {}", JSONUtil.toJsonStr(articleList.stream()
                .map(Article::getId)
                .collect(Collectors.toList())));
    }
    @Test
    public void testUpdate(){
    articleRepo.findById(1L).ifPresent(article -> {
        article.setTitle(article.getTitle()+"更新后的值");
        article.setUpdateTime(DateUtil.date());
        articleRepo.save(article);
        log.info("【article】= {}", JSONUtil.toJsonStr(article));
    });
    }
}
