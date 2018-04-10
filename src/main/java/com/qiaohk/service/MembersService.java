package com.qiaohk.service;

import com.qiaohk.po.MembersCustom;

public interface MembersService {

	public MembersCustom findMemberByLoginName(String loginName) throws Exception;

	public void createMember(MembersCustom membersCustom) throws Exception;
}
