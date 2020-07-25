package com.solvd.insurance.dao;

import java.util.List;


import com.solvd.insurance.models.Employee;

public interface IEmployeeDAO extends IEntityDAO<Employee>{
	public List<Employee> getAllByBusinessEntityId(Long id);
}
