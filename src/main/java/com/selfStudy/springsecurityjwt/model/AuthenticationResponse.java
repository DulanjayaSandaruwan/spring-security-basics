package com.selfStudy.springsecurityjwt.model;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 15/10/2022
 **/
public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    private String getJwt() {
        return jwt;
    }
}
