package org.api.repository;

import org.api.entity.Transaksis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaksiRepository extends CrudRepository<Transaksis, Integer> {
}
