package com.learning.hrassociationapi.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "com.learning.hrassociationapi")
@Data
public class CustomProperties {

  private String apiUrl;

}