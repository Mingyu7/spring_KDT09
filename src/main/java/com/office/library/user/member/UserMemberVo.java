package com.office.library.user.member;

import lombok.Getter;
import lombok.Setter;
// lombok 자동 get,set함수 생성
@Getter
@Setter
public class UserMemberVo {
	
	int u_m_no;
	String u_m_id;
	String u_m_pw;
	String u_m_name;
	String u_m_gender;
	String u_m_mail;
	String u_m_phone;
	String u_m_reg_date;
	String u_m_mod_date;
	
}
