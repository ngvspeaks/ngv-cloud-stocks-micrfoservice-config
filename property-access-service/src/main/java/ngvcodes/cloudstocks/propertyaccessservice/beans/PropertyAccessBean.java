package ngvcodes.cloudstocks.propertyaccessservice.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="property-file")
public class PropertyAccessBean {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PropertyAccessBean{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
