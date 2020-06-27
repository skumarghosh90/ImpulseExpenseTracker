package com.impulsetech.ImpulseExpenseTracker.controller;

import java.util.Map;

import com.impulsetech.ImpulseExpenseTracker.domain.User;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "user")
public class UserController {

    @Autowired
    private OAuth2AuthorizedClientService authorizedClientService;

    @GetMapping("/loginSuccess")
    public String getLoginInfo(OAuth2AuthenticationToken authentication) {
        System.out.println(authentication.getName());
        /*
         * OAuth2AuthorizedClient client = authorizedClientService
         * .loadAuthorizedClient(authentication.getAuthorizedClientRegistrationId(),
         * authentication.getName());
         * 
         * String userInfoEndpointUri = client.getClientRegistration()
         * .getProviderDetails() .getUserInfoEndpoint() .getUri();
         * 
         * if (!StringUtils.isEmpty(userInfoEndpointUri)) { RestTemplate restTemplate =
         * new RestTemplate(); HttpHeaders headers = new HttpHeaders();
         * headers.add(HttpHeaders.AUTHORIZATION, "Bearer " +
         * client.getAccessToken().getTokenValue()); HttpEntity<Void> entity = new
         * HttpEntity<>(headers); ResponseEntity<Map> response =
         * restTemplate.exchange(userInfoEndpointUri, HttpMethod.GET, entity,
         * Map.class); if(HttpStatus.OK.equals(response.getStatusCode())) { Map
         * userAttributes = response.getBody(); model.addAttribute("name",
         * userAttributes.get("name")); } }
         */

        return "index";
    }
}