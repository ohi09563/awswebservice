package com.ohi.book.springboot.config;


import com.ohi.book.springboot.config.auth.LoginUser;
import com.ohi.book.springboot.config.auth.LoginUserArgumntResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class WebConfig  implements WebMvcConfigurer {

    private final LoginUserArgumntResolver loginUserArgumntResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {

        argumentResolvers.add(loginUserArgumntResolver);
    }
}
