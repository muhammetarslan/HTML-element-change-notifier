package com.irdbs.internetelementchangenotifier.model;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Request {

    @Id
    private long requestId;
    @NonNull
    private String email;
    @NonNull
    private String elementXPath;
    @NonNull
    private Date date;

}
