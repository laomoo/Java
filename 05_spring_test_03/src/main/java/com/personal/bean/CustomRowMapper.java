package com.personal.bean;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomRowMapper implements RowMapper<PostMeta> {

    public PostMeta mapRow(ResultSet rs, int rowNum) throws SQLException {
        PostMeta postMeta = new PostMeta();
        postMeta.setMetaId(rs.getString(1));
        postMeta.setPostId(rs.getString(2));
        postMeta.setMetaKey(rs.getString(3));
        postMeta.setMetaValue(rs.getString(4));
        return postMeta;
    }
}
