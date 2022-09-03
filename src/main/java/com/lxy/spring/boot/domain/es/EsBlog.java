package com.lxy.spring.boot.domain.es;

import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Blog document
 *
 */
@Document(indexName = "blog") //document
public class EsBlog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id //primary key
    private String id;
    private String title;
    private String summary;
    private String content;

    protected EsBlog() {// JPA uniform standard :prevent to use directly

    }

    public EsBlog(String title,String content,String summary) {

        this.title = title;
        this.content = content;
        this.summary = summary;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {

        return  String.format(
                "EsBlog[id='%s',title='%s',summary='%s',content='%s'",
                id,title,summary,content);

    }

}