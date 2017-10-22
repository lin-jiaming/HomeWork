package com.stusys.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * Maven聚合之BaseDao
 * @author linjiaming
 *
 */
@Repository
public class BaseDao {
	@Resource
		private SessionFactory sessionFactory;

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		public Session getSession(){
			return sessionFactory.getCurrentSession();
		}
}

