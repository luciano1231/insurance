package com.solvd.insurance.dao;

import java.util.List;

import com.solvd.insurance.models.House;

public interface IHouseDAO extends IEntityDAO<House>{
	public List<House> getAllByBusinessEntityId(Long id);

}
