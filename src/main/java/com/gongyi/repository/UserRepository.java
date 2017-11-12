package com.gongyi.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gongyi.model.TestTableEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<TestTableEntity, Integer> {

}
