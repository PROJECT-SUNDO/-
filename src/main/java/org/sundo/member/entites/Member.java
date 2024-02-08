package org.sundo.member.entites;

import javax.persistence.*;

@Entity
public class Member {
	@Id @GeneratedValue
	private Long seq;
	
	@Column(length=40, unique=true)
	private String userId;

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

}
