package com.learning.hrassociationwebapi.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "com.learning.hrassociationwebapi")
@Data
public class CustomProperties {

  private String apiUrl;

}