package com.meb.ecommerce.config;/*
package com.ecommerce.config;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWpAuthorisationFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");
       // response.addHeader("Access-Control-Allow-Headers", "Origin, Accept, X-requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers, authorization");
      //  response.addHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin, Access-Control-Allow-Credentials, authorization");
        response.addHeader("Access-Control-Allow-Methods","GET,POST,UPDATE,DELETE,PATCH");

        if (request.getMethod().equals("OPTIONS")) {
            response.setStatus(HttpServletResponse.SC_OK);
        }
       */
/* } else if (request.getRequestURI().equals("/login")) {
            filterChain.doFilter(request, response);
            return;
        }*//*


        //verify the jwt signature

    }
}
*/
