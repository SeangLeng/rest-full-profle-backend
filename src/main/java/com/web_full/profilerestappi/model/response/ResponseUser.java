package com.web_full.profilerestappi.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUser {
    private String email;
    private String name;
    private String address;
    private String description;
}
