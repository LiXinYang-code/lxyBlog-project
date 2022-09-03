package com.lxy.spring.boot.domain.repository.es;

import com.lxy.spring.boot.domain.es.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * EsBlog Repository Interface
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,String> {

    /**
     * 分页查询博客并去重
     * @param title
     * @param summary
     * @param content
     * @param pageable
     * @return
     */
    Page<EsBlog> findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(
            String title, String summary, String content, Pageable pageable);

}
