package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD operation for specimen
 * @author Administrator
 *
 */
public interface ISpecimenService {
	/**
	 *Get specimens from persistence layer
	 * @param id= a unit lookup
	 * @return specimen with a matching ID
	 *
	 */
	
	SpecimenDTO fetchById(int id);
	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 *
	 */

	void save(SpecimenDTO specimenDTO);

}