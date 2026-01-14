package jpa2.service;


import jpa2.domain.Member;
import jpa2.repository.MemberRepository;
import jpa2.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

//    @Autowired
//    EntityManager em;

    @Test
//    @Rollback(value = false)
    @DisplayName("회원가입")
    void 회원가입() throws Exception {
        // given
        Member member = new Member();
        member.setName("김");

        // when
        Long savedId = memberService.join(member);

        // then
//        em.flush();
        assertEquals(member, memberRepository.findOne(savedId));
    }

    @Test
    @DisplayName("중복_회원_예외")
    void 중복_회원_예외() throws Exception {
        // given
        Member member1 = new Member();
        member1.setName("김1");

        Member member2 = new Member();
        member2.setName("김1");

        // when
        memberService.join(member1);

        // then
        assertThrows(IllegalStateException.class, () ->
                memberService.join(member2));
    }
}