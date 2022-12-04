package org.example;

import com.sun.net.httpserver.Headers;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.http.HttpRequest;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestLineTest {
/*
    HttpRequest
    - RequestLine (GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1)
            - HttpMethod
            - path
            - queryString
            - protocal/version (일단 무시)
    - Header
    - Body

    HttpResponse
 */

    @Test
    void create() {
        RequestLine requestLine = new RequestLine("GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1");
        Assertions.assertThat(requestLine).isNotNull();
        assertThat(requestLine).isEqualTo(new RequestLine("GET", "/calculate", "operand1=11&operator=*&operand2=55"));
    }
}
