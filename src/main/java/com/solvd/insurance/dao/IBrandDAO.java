package com.solvd.insurance.dao;

import java.util.List;


import com.solvd.insurance.models.Brand;

public interface IBrandDAO extends IEntityDAO<Brand>{
	public List<Brand> getAllByBusinessEntityId(Long id);
}
