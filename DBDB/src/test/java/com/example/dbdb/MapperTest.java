package com.example.dbdb;

import com.example.dbdb.mapper.MemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapperTest {
    @Autowired
    private MemberMapper memberMapper;

	@Test
	public void test(){
//		MemberVo m1 = new MemberVo();
//
//		m1.setName("장발");
//		m1.setId("mr.bsoon");
//		m1.setPhone("000-333-8888");
//
//		System.out.println(m1);
//		memberMapper.insertMember(m1);

		System.out.println("-------------------------------------------------");
		System.out.println("레코드가 추가되었습니다.");
		System.out.println("-------------------------------------------------");
		memberMapper.selectMemberAll().forEach(System.out::println);
	}




}
