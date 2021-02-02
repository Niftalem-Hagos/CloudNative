package com.example.raai;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

public class CustomerService {

    private final DataSource dataSource = new EmbeddedDatabaseBuilder()
            .setName("Customer").setType(EmbeddedDatabaseType.H2).build();


}
