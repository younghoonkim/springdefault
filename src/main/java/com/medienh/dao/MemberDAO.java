package com.medienh.dao;

import java.util.List;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;

import com.medienh.entity.Member;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<Member> selectMemberList()
	{
		return sqlSession.selectList("MemberSql.SelectMemberList");
	}
	
	public void insertMember(Member member)
	{
		sqlSession.insert("MemberSql.InsertMember", member);
	}
}
