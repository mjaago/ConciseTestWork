package com.conciseTest.data;

import com.conciseTest.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DAO extends JpaRepository<Data, Integer> {
    List<Data> findByDataContaining(String pieceOfData);
}
