package com.nestdigital.reciepebackend.Dao;

import com.nestdigital.reciepebackend.Model.ReciepeModel;
import org.springframework.data.repository.CrudRepository;

public interface ReciepeDao extends CrudRepository<ReciepeModel,Integer> {
}
