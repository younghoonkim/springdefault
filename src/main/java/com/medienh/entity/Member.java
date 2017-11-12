package com.medienh.entity;

import org.codehaus.jackson.annotate.JsonProperty;

public class Member {

	@JsonProperty("memberSeq")
	private int memberSeq;
	@JsonProperty("memberId")
	private String memberId;
	@JsonProperty("password")
	private String password;
	@JsonProperty("memberName")
	private String memberName;
	
	public int getMemberSeq() {
		return memberSeq;
	}
	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	
}
