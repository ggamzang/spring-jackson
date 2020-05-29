package com.example.jackson.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {
    private String name;
    private String id;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("phone")
    private String mobileNum;
    @JsonUnwrapped
    private AddressVO address;
}
