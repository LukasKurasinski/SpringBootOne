package com.SpringBootOne.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

    /**
     * Simple REST JSON endpoint. When /api url is requested with GET, json data is returned
     * The data type returned is defined with attribute "produces" in the @GetMapping annotation
     * @param fName
     * @param lName
     * @return
     */
    @GetMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getData(
            @RequestParam(value = "fName", defaultValue = "MOB") String fName,
            @RequestParam(value = "lName", required = false) String lName
    ){
        System.out.println("root");
        return "{\"fName\":\""+fName+"\", \"lName\":\""+lName+"\"}";
    }

    /**
     * REST JSON endpoint. When /api2/{fName}/{lName} url is requested with GET, json data is returned.
     * The mapping is expecting that the part of url that is not defined is going to be provided by
     * client connecting to this endpoint. For example in  a /api/Bob/Rob url, the Bob and Rob part
     * of the url will be used as variables fName and Lname in the method code.
     * The data type returned is defined with attribute "produces" in the @GetMapping annotation
     * @param fName
     * @param lName
     * @return
     */
    @GetMapping(value = "/api2/{fName}/{lName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUser(
            @PathVariable(value = "fName") String fName,
            @PathVariable(value = "lName") String lName
    ){
        System.out.println("root");
        return "{\"fName\":\""+fName+"\", \"lName\":\""+lName+"\"}";
    }

    /**
     * REST JSON endpoint. When /api2/{fName}/{lName} url is requested with GET, json data is returned.
     * The mapping is expecting that the part of url that is not defined is going to be provided by
     * client connecting to this endpoint. For example in  a /api/Bob/Rob url, the Bob and Rob part
     * of the url will be used as variables fName and Lname in the method code.
     * In addition, the url can have parameters defined. For example: a /api/Bob/Rob?tel=123 url
     * is going to be mapped in the method code to fName, lName, and tel.
     * Notice the difference in mapping of the url variables and parameter passed in the url.
     * The data type returned is defined with attribute "produces" in the @GetMapping annotation
     * @param fName
     * @param lName
     * @return
     */
    @GetMapping(value = "/api3/{fName}/{lName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getFullData(
            @PathVariable(value = "fName") String fName,
            @PathVariable(value = "lName") String lName,
            @RequestParam(value = "tel", required = false) String tel

            ){
        System.out.println("root");
        return "{\"fName\":\""+fName+"\", \"lName\":\""+lName+"\", \"tel\":"+tel+"}";
    }
}
