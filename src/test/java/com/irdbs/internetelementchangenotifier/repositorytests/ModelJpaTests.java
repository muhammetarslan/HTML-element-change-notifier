package com.irdbs.internetelementchangenotifier.repositorytests;

import com.irdbs.internetelementchangenotifier.repository.RequestRepository;
import com.irdbs.internetelementchangenotifier.utils.ConfigurationReader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelJpaTests {

    @Autowired
    private RequestRepository requestRepository;

    @Test
    public void requestTableAccessible() throws SQLException {
       Connection connection= DriverManager.getConnection(
               ConfigurationReader.getProperty("spring.datasource.url")
               ,ConfigurationReader.getProperty("spring.datasource.username")
               ,ConfigurationReader.getProperty("spring.datasource.password"));
       Statement statement=connection.createStatement();
       ResultSet resultSet=statement.executeQuery("SELECT * FROM request");
       int result = resultSet.getRow();
       assertEquals(result,0);

    }
}
