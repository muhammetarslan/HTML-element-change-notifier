package com.irdbs.internetelementchangenotifier.controller;

import com.irdbs.internetelementchangenotifier.model.Request;
import com.irdbs.internetelementchangenotifier.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("requestForm",new Request());
        return "RequestForm";
    }

    @PostMapping("/")
    public String createRequest(@ModelAttribute("requestForm")Request request){
       return requestService.createRequest(request);
    }

}
