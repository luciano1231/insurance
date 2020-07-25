package com.solvd.insurance.dao;

import java.util.List;

import com.solvd.insurance.models.Car;

public interface ICarDAO extends IEntityDAO<Car>{
	public List<Car> getAllByBusinessEntityId(Long id);

}
