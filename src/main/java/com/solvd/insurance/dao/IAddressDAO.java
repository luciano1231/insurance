package com.solvd.insurance.dao;

import java.util.List;

import com.solvd.insurance.models.Address;

public interface IAddressDAO extends IEntityDAO<Address>{
	public List<Address> getAllByBusinessEntityId(Long id);
}
