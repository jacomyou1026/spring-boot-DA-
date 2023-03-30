package com.example.testingboard;

import com.example.testingboard.dto.MemberDTO;
import com.example.testingboard.mapper.MemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MapperTest {
    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void testInsert() {

        MemberDTO m1 = new MemberDTO();

        m1.setName("장순발");
        m1.setId("mr.bsoon");
        m1.setPhone("000-333-8888");

        System.out.println(m1);
        memberMapper.selectMemberAll();

        System.out.println("-------------------------------------------------");
        System.out.println("레코드가 추가되었습니다.");
        System.out.println("-------------------------------------------------");
    }
}
