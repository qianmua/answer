package pres.hjc.entitymanage.config.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/11
 * Time: 19:56
 * To change this template use File | Settings | File Templates.
 */
@EnableWebSecurity
public class AuthSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*super.configure(http);*/
        http
                .authorizeRequests()
                .antMatchers("/","/html/**","/lg/**","").permitAll()
                .antMatchers("/admin/**").hasRole("get")
                .antMatchers("/admin/**").hasRole("admin")
        ;

        // return logins
        http.formLogin();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);

        //排除static
        web.ignoring().antMatchers("/static/**");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*super.configure(auth);*/

        //get mysql database
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("admin").password(new BCryptPasswordEncoder().encode("123456")).roles("get")
                .and()
                .withUser("test").password(new BCryptPasswordEncoder().encode("123456")).roles("admin");

    }
}
