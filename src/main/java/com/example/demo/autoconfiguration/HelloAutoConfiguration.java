package com.example.demo.autoconfiguration;


import com.example.demo.FormatTemplate;
import com.example.demo.format.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(FormatAutoConfiguration.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public FormatTemplate helloFormatTemplate(FormatProcessor formatProcessor){
        return new FormatTemplate(formatProcessor);
    }
}
