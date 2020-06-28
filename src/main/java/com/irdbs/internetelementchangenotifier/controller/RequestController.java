package com.irdbs.internetelementchangenotifier.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.irdbs.internetelementchangenotifier.model.Request;
import com.irdbs.internetelementchangenotifier.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("requestForm",new Request());
        return "RequestForm";
    }

    @PutMapping("/")
    public String createRequest(@ModelAttribute("requestForm")Request request){
       return requestService.createRequest(request);
    }
    @GetMapping("/requests")
    @JsonFormat
    public List<Request> getRequestList(){
        return requestService.getAllRequests();
    }
}
