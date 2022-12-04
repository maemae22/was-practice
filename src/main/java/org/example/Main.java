package org.example;

// <GET> /calculate?operand1=11&operator=*&operand2=55 : 웹 애플리케이션

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8080).start();
    }
}