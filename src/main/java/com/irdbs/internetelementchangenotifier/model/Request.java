package com.irdbs.internetelementchangenotifier.model;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

@Entity
@Table
public class Request {

    @Id
    private long requestId;
    @NonNull
    private String url;
    @NonNull
    private String email;
    @NonNull
    private String elementXPath;
    @NonNull
    private Date date;
    public Request(){};

    public Request(long requestId, @NonNull String url, @NonNull String email, @NonNull String elementXPath, @NonNull Date date) {
        this.requestId = requestId;
        this.url = url;
        this.email = email;
        this.elementXPath = elementXPath;
        this.date = date;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(@NonNull String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public String getElementXPath() {
        return elementXPath;
    }

    public void setElementXPath(@NonNull String elementXPath) {
        this.elementXPath = elementXPath;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(@NonNull Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return requestId == request.requestId &&
                url.equals(request.url) &&
                email.equals(request.email) &&
                elementXPath.equals(request.elementXPath) &&
                date.equals(request.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, url, email, elementXPath, date);
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId=" + requestId +
                ", url='" + url + '\'' +
                ", email='" + email + '\'' +
                ", elementXPath='" + elementXPath + '\'' +
                ", date=" + date +
                '}';
    }
}
