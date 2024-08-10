package com.shadcn.apigateway.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class IntrospectRequest {
    //change to token
    //change 2
    //change 3
    //change 4
    //change 5
    String token;
}