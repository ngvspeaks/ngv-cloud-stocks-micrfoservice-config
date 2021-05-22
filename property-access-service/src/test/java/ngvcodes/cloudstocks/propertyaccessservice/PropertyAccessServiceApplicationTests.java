package ngvcodes.cloudstocks.propertyaccessservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
		properties = {"spring.cloud.config.enabled=false"}
)class PropertyAccessServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
