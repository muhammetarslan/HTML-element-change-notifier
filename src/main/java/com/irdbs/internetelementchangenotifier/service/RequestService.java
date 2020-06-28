package com.irdbs.internetelementchangenotifier.service;

import com.irdbs.internetelementchangenotifier.model.Request;
import org.springframework.lang.NonNull;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;

public interface RequestService {
    /**
    @Id
    long requestId;
    @NonNull
    String url;
    @NonNull
    String email;
    @NonNull
    String elementXPath;
    @NonNull
    Date date;
    **/
    String createRequest(String url,String email,String elementXPath,Date date);

    String createRequest(Request request);

    List<Request> getAllRequests();
}
