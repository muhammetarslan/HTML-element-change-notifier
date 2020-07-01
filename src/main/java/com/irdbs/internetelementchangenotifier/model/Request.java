package com.irdbs.internetelementchangenotifier.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long requestId;
    @NotNull
    private String url;
    @NotNull
    @Column(length = 35)
    private String email;
    @NotNull
    @Column(length = 80)
    private String elementXPath;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    @NotNull
    @Column(length = 15)
    private String disappearOfTheElement;

    public Request(){};




    public Request(long requestId, @NonNull String url, @NonNull String email, @NonNull String elementXPath, @NonNull Date date, String disappearOfTheElement) {
        this.requestId = requestId;
        this.url = url;
        this.email = email;
        this.elementXPath = elementXPath;
        this.date = date;
        this.disappearOfTheElement=disappearOfTheElement;
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

    public String getDisappearOfTheElement() {
        return disappearOfTheElement;
    }

    public void setDisappearOfTheElement(String disappearOfTheElement) {
        this.disappearOfTheElement = disappearOfTheElement;
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
                ", disappearTrueAppearFalse: " + disappearOfTheElement+
                '}';
    }
}
