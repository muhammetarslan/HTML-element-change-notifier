package com.irdbs.internetelementchangenotifier.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.irdbs.internetelementchangenotifier.model.Request;
import com.irdbs.internetelementchangenotifier.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequestRestController {
    @Autowired
    private RequestService requestService;

    @GetMapping("/requests")
    @JsonFormat
    public List<Request> getRequestList(){
        return requestService.getAllRequests();
    }
}
