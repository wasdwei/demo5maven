package com.example.demo.mybatiscatalog.redis;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Personn, String> {
    List<Personn> findByLastname(String lastname);
    Page<Personn> findPersonByLastname(String lastname, Pageable page);
    List<Personn> findByFirstnameAndLastname(String firstname, String lastname);
    List<Personn> findByAddress_City(String city);
    List<Personn> findByFamilyList_Username(String username);
}
