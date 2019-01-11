package com.quicktutorials.learnmicroservices.AccountMicroservice.daos;

import com.quicktutorials.learnmicroservices.AccountMicroservice.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OperationDao extends JpaRepository<Operation, String> {

    @Query(value="select * from operations where fk_account1=:account or fk_account2=:account", nativeQuery = true)
    List<Operation> getAllOperationByAccount(@Param("account") String account);

}
