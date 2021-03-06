package com.qiaohk.service;

import java.util.List;

import com.qiaohk.po.AddressesCustom;

public interface AddressesService {

	public AddressesCustom findAddressById(Integer id) throws Exception;
	
	public List<AddressesCustom> getUserAddressesList(Integer user_id) throws Exception;

	public void createAddress(AddressesCustom addressesCustom) throws Exception;

	public void updateAddressById(AddressesCustom addressesCustom) throws Exception;
	
	public void deleteAddressById(Integer id) throws Exception;
}
