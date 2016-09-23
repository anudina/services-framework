/**
 * 
 */
package com.verizon.ivapp.servicesframework.jpa;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The class is for performing generic CRUD operation by extending the base JPA
 * Repo feature. Any specific operations like search by or filter by etc can be
 * added later here in order to keep generic code intact
 * 
 * @author Anand
 *
 */

@Repository
@Transactional
public abstract class GenericCoreRepository<E extends Serializable, ID extends Serializable>
		implements JpaRepository<E, ID> {

	private static final Logger LOGGER = LoggerFactory.getLogger(GenericCoreRepository.class);
	/**
	 * 
	 */
	private Class<E> entityClazz;

	private Class<ID> idClazz;

	public GenericCoreRepository() {

	}

	/**
	 * @return the idClazz
	 */
	public Class<ID> getIdClazz() {
		return idClazz;
	}

	/**
	 * @param idClazz
	 *            the idClazz to set
	 */
	public void setIdClazz(Class<ID> idClazz) {
		this.idClazz = idClazz;
	}

	/**
	 * @return the entityClazz
	 */
	public Class<E> getEntityClazz() {
		return entityClazz;
	}

	/**
	 * @param entityClazz
	 *            the entityClazz to set
	 */
	public void setEntityClazz(Class<E> entityClazz) {
		this.entityClazz = entityClazz;
	}

	public List<E> queryEntitiesByCustomType() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Say if we have User domain which is querying based on meail and lastname 
	 * @param emailAddress
	 * @param lastname
	 * @return
	 */
	List<E> findByEmailAddressAndLastname(String emailAddress, String lastname){
		
		
		return null;
		
	}
	
	/**
	 * Say if we have Product domain which is querying product category 
	 * @param emailAddress
	 * @param lastname
	 * @return
	 */
	List<E> queryByProductId(String prodCat){
		
		return null;
	}
}