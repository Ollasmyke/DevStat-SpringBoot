package com.ollas.devstat.dao;

import com.ollas.devstat.entities.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataAccess extends CrudRepository <Language, Integer> {

}
