package com.example.repo.usermgmt.main;

import java.util.List;

import com.example.repo.usermgmt.domain.User;
import com.example.repo.usermgmt.service.UserManagementRepoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserDataLoader  implements CommandLineRunner{
    
    UserManagementRepoService userRepo;

    @Autowired
    public UserDataLoader(UserManagementRepoService userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        log.info( "Here...");

        User newUser  = new User(0L, "John", "Smith", "johnsmith", "john@johnsmith.com");
        User  retUser = userRepo.save(newUser);
        log.info("RetUser ID = " + retUser.getId());
        
        List<User> userList = userRepo.findByUserName("johnsmith");

        log.info("List size= " + userList.size());
        userList.forEach( k-> log.info(k.toString())) ;
    } 


    
}
