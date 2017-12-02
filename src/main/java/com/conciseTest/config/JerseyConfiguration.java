package com.conciseTest.config;

import com.conciseTest.web.DataController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration(){
        register(DataController.class);
    }
}
