package com.vaadin.tutorial.addressbook;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// @SpringBootApplication
// public class AddressBookApplication extends SpringBootServletInitializer {
//     public static void main(String[] args) {
//         SpringApplication.run(AddressBookApplication.class, args);
//     }
// }

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
// import org.springframework.boot.web.support.SpringBootServletInitializer;  // OBSOLETE
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AddressBookApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AddressBookApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AddressBookApplication.class, args);
    }
}

