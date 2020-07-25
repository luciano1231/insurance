package com.solvd.insurance.dao;

import java.util.List;


import com.solvd.insurance.models.Office;

public interface IOfficeDAO extends IEntityDAO<Office>{
	public List<Office> getAllByBusinessEntityId(Long id);
}
