package org.sundo.member.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sundo.member.entites.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{
	

}
