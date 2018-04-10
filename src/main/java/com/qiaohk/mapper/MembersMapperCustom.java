package com.qiaohk.mapper;

import com.qiaohk.po.MembersCustom;

public interface MembersMapperCustom {

	public MembersCustom findMemberByLoginName(String loginName) throws Exception;

	public void createMember(MembersCustom membersCustom) throws Exception;
}
