package com.personal.bean;

import org.springframework.jdbc.core.JdbcTemplate;

public class PostMeta {

    public PostMeta(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;
    private String metaId;
    private String postId;
    private String metaKey;
    private String metaValue;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public String getMetaId() {
        return metaId;
    }

    public String getMetaKey() {
        return metaKey;
    }

    public String getMetaValue() {
        return metaValue;
    }

    public String getPostId() {
        return postId;
    }

    public void setMetaId(String metaId) {
        this.metaId = metaId;
    }

    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }
}
