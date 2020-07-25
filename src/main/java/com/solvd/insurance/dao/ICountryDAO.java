package com.solvd.insurance.dao;

import java.util.List;

import com.solvd.insurance.models.Country;

public interface ICountryDAO extends IEntityDAO<Country>{
	public List<Country> getAllByBusinessEntityId(Long id);
}
