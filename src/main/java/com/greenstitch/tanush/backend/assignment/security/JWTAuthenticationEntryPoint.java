// package com.greenstitch.tanush.backend.assignment.security;

// import java.io.PrintWriter;

// import jakarta.servlet.ServletException;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

// public class JWTAuthenticationEntryPoint {
//     @Override
//     public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
//         response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//         PrintWriter writer = response.getWriter();
//         writer.println("Access Denied !! " + authException.getMessage());
//     }
// }
