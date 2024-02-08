package org.sundo.member.entites;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Member {
	@Id @GeneratedValue
	private Long seq;
	
	@Column(length=40, unique=true)
	private String userId;

}
