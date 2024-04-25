package com.OnlyNameInRequest.FatchDataAgainstName.Repo;

import com.OnlyNameInRequest.FatchDataAgainstName.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CallRepo extends JpaRepository<Customer,Long>{
    @Query("Select s from Customer s where s.name=:name")
        Customer findByName(@Param("name")String name);
}
