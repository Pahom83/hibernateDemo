package ru.netology.hibernatedemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableGlobalMethodSecurity(
        securedEnabled = true,
        prePostEnabled = true,
        jsr250Enabled = true
)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}adminPassword").authorities("read", "write").roles("READ", "WRITE")
                .and()
                .withUser("superAdmin").password("{noop}superAdmin")
                .authorities("read", "delete").roles("READ", "DELETE")
                .and()
                .withUser("user").password("{noop}userPassword").authorities("read").roles("READ");
    }
}
