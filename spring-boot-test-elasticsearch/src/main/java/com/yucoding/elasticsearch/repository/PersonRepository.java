package com.yucoding.elasticsearch.repository;

import com.yucoding.elasticsearch.model.Person;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface PersonRepository extends ElasticsearchRepository<Person,Long> {

    List<Person> findByAgeBetween(Integer min, Integer max);
}
