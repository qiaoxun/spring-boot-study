package com.study.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "custom")
public class CustomEndpoint {
    private Map<String, Custom> customs = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Custom> customs() {
        return customs;
    }

    @ReadOperation
    public Custom custom(@Selector String name) {
        return customs.get(name);
    }

    @WriteOperation
    public void configureCustom(@Selector String name, Custom custom) {
        customs.put(name, custom);
    }

    @DeleteOperation
    public void deleteFeature(@Selector String name) {
        customs.remove(name);
    }

    public static class Custom {
        private Boolean enabled;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }
    }
}
