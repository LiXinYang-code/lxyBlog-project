package com.lxy.spring.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * security configuration class
 */
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.authorizeRequests()
                .antMatchers("/css/**","/js/**","/fonts/**","/index").permitAll()// permit all the access request
                .antMatchers("/users/**").hasRole("ADMIN")// onlu be accessed by relative role
                .and()
                //login auth based on Form
                .formLogin()
                .loginPage("/login").failureUrl("/login-error");

    }

    /**
     * authentication message management
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
        auth
            .inMemoryAuthentication() //save in main memory
                .withUser("lixinyang").password("{noop}love").roles("ADMIN");//initialize a user

    }




}
