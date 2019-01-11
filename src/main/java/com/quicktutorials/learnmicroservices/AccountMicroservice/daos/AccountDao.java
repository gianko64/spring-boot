package com.quicktutorials.learnmicroservices.AccountMicroservice.daos;

import com.quicktutorials.learnmicroservices.AccountMicroservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountDao extends JpaRepository<Account, String> {

    @Query(value="select * from accounts where fk_user=:user", nativeQuery = true)
    List<Account> getAllAccountPerUser(@Param("user") String user);

    List<Account> findByFkUser(String fkUser);
}
