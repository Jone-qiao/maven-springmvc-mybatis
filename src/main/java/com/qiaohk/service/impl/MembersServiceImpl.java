package com.qiaohk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.qiaohk.mapper.MembersMapperCustom;
import com.qiaohk.po.MembersCustom;
import com.qiaohk.service.MembersService;

public class MembersServiceImpl implements MembersService {

	@Autowired
	private MembersMapperCustom membersMapperCustom;

	@Override
	public MembersCustom findMemberByLoginName(String loginName) throws Exception {
		return membersMapperCustom.findMemberByLoginName(loginName);
	}

	@Override
	public void createMember(MembersCustom membersCustom) throws Exception {
		membersMapperCustom.createMember(membersCustom);
	}

}
