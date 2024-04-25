package com.OnlyNameInRequest.FatchDataAgainstName.service;

import com.OnlyNameInRequest.FatchDataAgainstName.Repo.CallRepo;
import com.OnlyNameInRequest.FatchDataAgainstName.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CallRepo callRepo;

    public Customer findCustomerByName(String name){
        return callRepo.findByName(name);
    }
}
