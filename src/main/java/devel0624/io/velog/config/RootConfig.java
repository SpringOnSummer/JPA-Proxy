package devel0624.io.velog.config;

import devel0624.io.velog.Base;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Base.class)
public class RootConfig {

}
