package org.sundo.member;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.sundo.configs.MvcConfig;
import org.sundo.member.entites.Member;
import org.sundo.member.repositories.MemberRepository;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
class MembeTest {

	@Autowired
	private MemberRepository repository;

	@Test
	void test() {
//		long cnt = repository.count();
//		System.out.println(cnt);
		
		Member member = new Member();
		member.setUserId("user01");
		repository.saveAndFlush(member);
	}

}
