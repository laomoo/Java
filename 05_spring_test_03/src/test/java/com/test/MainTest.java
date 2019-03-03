package com.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.personal.bean.PostMeta;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainTest {

    public static void main(String[] args) {

        PlatformTransactionManager manager = new PlatformTransactionManager() {
            public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
                return null;
            }

            public void commit(TransactionStatus status) throws TransactionException {

            }

            public void rollback(TransactionStatus status) throws TransactionException {

            }
        };
    }

    public DriverManagerDataSource init() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:conf/spring-config.xml");
        DriverManagerDataSource driverManagerDataSource = context.getBean("dataSource", DriverManagerDataSource.class);
        System.out.println(driverManagerDataSource.getPassword());
        System.out.println(driverManagerDataSource.getUsername());
        System.out.println(driverManagerDataSource.getUrl());
        return driverManagerDataSource;
    }

    public void c3p0Test() {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("");
        dataSource.setPassword("");
        dataSource.setJdbcUrl("");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Test
    public void delete() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(this.init());
        StringBuffer sbSQL = new StringBuffer();
        sbSQL.append(" delete from wp_postmeta where meta_key = 'Hello' ");
        jdbcTemplate.update(sbSQL.toString());
    }

    @Test
    public void insert() {

        JdbcTemplate jdbcTemplate = new JdbcTemplate(this.init());
        StringBuffer sbSQL = new StringBuffer();
        sbSQL.append(" insert into wp_postmeta (post_id, meta_key, meta_value) values (2, 'Hello', 'World')");
        jdbcTemplate.update(sbSQL.toString());
    }

    @Test
    public void query() {

        JdbcTemplate jdbcTemplate_00 = new JdbcTemplate(this.init());
        StringBuffer sbSQL = new StringBuffer();
        sbSQL.append("select * from wp_postmeta");

        // 对象查询
        List<PostMeta> resultList = jdbcTemplate_00.query(sbSQL.toString(), new RowMapper<PostMeta>() {
            public PostMeta mapRow(ResultSet rs, int rowNum) throws SQLException {
                PostMeta postMeta = new PostMeta((JdbcTemplate) new Object());
                postMeta.setMetaId(rs.getString(1));
                postMeta.setPostId(rs.getString(2));
                postMeta.setMetaKey(rs.getString(3));
                postMeta.setMetaValue(rs.getString(4));
                return postMeta;
            }
        });
        for (PostMeta postMeta : resultList) {
            System.out.println(postMeta.getMetaKey() + " " + postMeta.getMetaValue());
        }
    }


    @Test
    public void test() {

        //        DriverManagerDataSource dataSource_00 = new DriverManagerDataSource();
        //        dataSource_00.setUsername("laomo_00");
        //        dataSource_00.setPassword("1234#qwer");
        //        dataSource_00.setUrl("jdbc:mysql://89.208.241.115:3306/laomo_00");
        //        dataSource_00.setDriverClassName("com.mysql.jdbc.Driver");

        JdbcTemplate jdbcTemplate_00 = new JdbcTemplate(this.init());
        StringBuffer sbSQL = new StringBuffer();
        sbSQL.append("select * from wp_options");
        List<Map<String, Object>> lists = jdbcTemplate_00.queryForList(sbSQL.toString());

        long index = 1;
        for (Map<String, Object> maps : lists) {
            System.out.println("第 " + (index++) + " 列：");
            Set<Map.Entry<String, Object>> sets = maps.entrySet();
            for (Map.Entry<String, Object> set : sets) {
                System.out.print(set.getKey() + ", " + set.getValue());
                System.out.print("|");
            }
            System.out.println();
        }

    }
}
