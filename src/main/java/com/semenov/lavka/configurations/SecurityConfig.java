package com.semenov.lavka.configurations;


import com.semenov.lavka.services.CustomUserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity//Встаиваем security в эту конфигурацию
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final CustomUserDetailService userDetailService;
    //Для того что бы сконфигурировать http.Какие url нам будут\небудут доступны
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /**
         * Символы "**"  указывают что идти может все что угодно
         * Любой запрос переводит на аутентификацию
         */
        http
                .authorizeRequests()
                .antMatchers("/", "/product/**", "/images/**", "/registration/**")
                .permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }
    //Определяет как мы будем авторизироваться
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //обращаемся к auth и указываем как именно нужно подгружать юзеров
        auth.userDetailsService(userDetailService)
                .passwordEncoder(passwordEncoder()); //указываем как именно он будет расшифровывать пароли (BCrypt)
    }
    //Создаем бин защиты паролья в 8 символов
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(8);
    }

}
