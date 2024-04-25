package com.OnlyNameInRequest.FatchDataAgainstName.controller;

import com.OnlyNameInRequest.FatchDataAgainstName.entity.Customer;
import com.OnlyNameInRequest.FatchDataAgainstName.entity.CustomerData;
import com.OnlyNameInRequest.FatchDataAgainstName.entity.CustomerRequest;
import com.OnlyNameInRequest.FatchDataAgainstName.entity.CustomerResponse;
import com.OnlyNameInRequest.FatchDataAgainstName.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fatchDatafromName")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public ResponseEntity<?> createCustomer(@RequestBody CustomerRequest request) {
        Customer customer = customerService.findCustomerByName(request.getName());
        if (customer == null) {
            CustomerResponse response = new CustomerResponse();
            response.setResponsecode("02"); // Custom code for customer not found
            response.setMessages("Customer not found");
            response.setZmileUser(false);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        CustomerData data = new CustomerData();
        data.setCurrentCustomerTier(customer.getCurrentCustomerTier());
        data.setCurrentPoints(customer.getCurrentPoints());
        data.setNextCustomerTier(customer.getNextCustomerTier());
        data.setPointRequiredForNextTier(customer.getPointRequiredForNextTier());

        CustomerResponse response = new CustomerResponse();
        response.setResponsecode("00");
        response.setData(data);
        response.setMessages("Successful");
        response.setZmileUser(true);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

