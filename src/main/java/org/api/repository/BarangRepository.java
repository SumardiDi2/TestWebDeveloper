package org.api.repository;

import org.api.entity.Barangs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarangRepository extends CrudRepository<Barangs, Integer> {
}
