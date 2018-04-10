package com.qiaohk.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.qiaohk.exception.CustomException;
import com.qiaohk.mapper.AddressesMapperCustom;
import com.qiaohk.po.AddressesCustom;
import com.qiaohk.service.AddressesService;

public class AddressesServiceImpl implements AddressesService {

	@Autowired
	private AddressesMapperCustom addressesMapperCustom;

	@Autowired
	private HttpSession session;

	@Override
	public List<AddressesCustom> getUserAddressesList(Integer user_id) throws Exception {

		return addressesMapperCustom.getUserAddressesList(user_id);
	}

	@Override
	public void createAddress(AddressesCustom addressesCustom) throws Exception {

		addressesMapperCustom.createAddress(addressesCustom);
	}

	@Override
	public void updateAddressById(AddressesCustom addressesCustom) throws Exception {

		AddressesCustom address = addressesMapperCustom.findAddressById(addressesCustom.getId());
		Integer idUser = (Integer) session.getAttribute("idUser");

		if (address == null || !address.getUser_id().equals(idUser)) {
			throw new CustomException("商品不存在");
		}

		addressesMapperCustom.updateAddressById(addressesCustom);
	}

	@Override
	public AddressesCustom findAddressById(Integer id) throws Exception {
		AddressesCustom address = addressesMapperCustom.findAddressById(id);

		Integer idUser = (Integer) session.getAttribute("idUser");

		if (address == null || !address.getUser_id().equals(idUser)) {
			throw new CustomException("商品不存在");
		}

		return address;
	}

	@Override
	public void deleteAddressById(Integer id) throws Exception {
		AddressesCustom address = addressesMapperCustom.findAddressById(id);
		Integer idUser = (Integer) session.getAttribute("idUser");

		if (address == null || !address.getUser_id().equals(idUser)) {
			throw new CustomException("商品不存在");
		}

		addressesMapperCustom.deleteAddressById(id);

	}

}
