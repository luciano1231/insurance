package com.solvd.insurance.dao;

import java.util.List;


import com.solvd.insurance.models.Model;

public interface IModelDAO extends IEntityDAO<Model>{
	public List<Model> getAllByBusinessEntityId(Long id);
}
