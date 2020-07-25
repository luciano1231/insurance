package com.solvd.insurance.dao;

import java.util.List;


import com.solvd.insurance.models.Phone;

public interface IPhoneDAO extends IEntityDAO<Phone>{
	public List<Phone> getAllByBusinessEntityId(Long id);
}
