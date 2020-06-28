package com.irdbs.internetelementchangenotifier.service;

import com.irdbs.internetelementchangenotifier.model.Request;
import com.irdbs.internetelementchangenotifier.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RequestServiceImpl implements RequestService{

    @Autowired
    private RequestRepository requestRepository;


    @Override
    public String createRequest(String url, String email, String elementXPath, Date date) {
        Request request=new Request();
        request.setUrl(url);
        request.setDate(date);
        request.setEmail(email);
        request.setElementXPath(elementXPath);
        requestRepository.save(request);
        return "Request Created with: \n "+request.toString();
    }

    @Override
    public String createRequest(Request request) {
        requestRepository.save(request);
        return "Request Created with: \n "+request.toString();
    }

    @Override
    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }
}
