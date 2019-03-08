package com.test;

import com.bean.PostMeta;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.junit.Test;

import java.util.Map;

public class MainTest {

    @Test
    public void query() {

        Configuration configuration = new Configuration().configure("conf/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        transaction.begin();
        System.out.println("querying all the managed entities...");
        final Map metadataMap = session.getSessionFactory().getAllClassMetadata();
        for (Object key : metadataMap.keySet()) {
            final ClassMetadata classMetadata = (ClassMetadata) metadataMap.get(key);
            final String entityName = classMetadata.getEntityName();
            final Query query = session.createQuery("from " + entityName);
            System.out.println("executing: " + query.getQueryString());
            for (Object o : query.list()) {
                System.out.println("  " + ((PostMeta) o).getMetaKey());
            }
        }


        // 实现增加操作
        //        System.out.println("执行添加操作 ...");
        //        PostMeta postMeta_00 = new PostMeta();
        //        postMeta_00.setPostId("4");
        //        postMeta_00.setMetaKey("测试ID");
        //        postMeta_00.setMetaValue("Hello World!");
        //        session.save(postMeta_00);

        // 根据ID查询
        PostMeta postMeta_01 = (PostMeta) session.get(PostMeta.class, "9");
        System.out.println(postMeta_01.getMetaKey());
        System.out.println(postMeta_01.getMetaValue());

        // 修改
        postMeta_01.setMetaKey("东方不败");
        session.update(postMeta_01);

        // 删除方法
        session.delete(postMeta_01);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
