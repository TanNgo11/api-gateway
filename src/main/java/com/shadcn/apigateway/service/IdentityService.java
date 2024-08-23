package com.shadcn.apigateway.service;

import org.springframework.stereotype.Service;

import com.shadcn.apigateway.dto.request.IntrospectRequest;
import com.shadcn.apigateway.dto.response.ApiResponse;
import com.shadcn.apigateway.dto.response.IntrospectResponse;
import com.shadcn.apigateway.repository.IdentityClient;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class IdentityService {
    IdentityClient identityClient;

    public Mono<ApiResponse<IntrospectResponse>> introspect(String token) {
        return identityClient.introspect(
                IntrospectRequest.builder().token(token).build());
    }
}
