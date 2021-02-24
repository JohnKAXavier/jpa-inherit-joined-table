package com.john.jpainheritjoinedtable.repository;

import com.john.jpainheritjoinedtable.model.Infantry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InfantryRepository extends CrudRepository<Infantry, Long> {
}
