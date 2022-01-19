package com.example.repo.usermgmt.service;

import java.util.List;

import com.example.repo.usermgmt.domain.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserManagementRepoService  extends CrudRepository<User, Long>{

public List<User>  findByUserName(String userName);

}
