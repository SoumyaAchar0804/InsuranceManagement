package com.project.insurance.insureme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
class InsureMeApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testCreatePolicy() {
		Policy policy = new Policy(1, "Shubham", "Individual" , 10000, "10-Sep-2021", "10-Sep-2022");
		PolicyService pService = new PolicyService();
		//Policy outputPolicy = pService.CreatePolicy();
		assertEquals(policy.getPolicyId(), pService.generateDummyPolicy().getPolicyId());
		
	}
	
	@Test
	void testSearchPolicy() {
		PolicyService pService = new PolicyService();
		assertEquals(null,pService.searchPolicy());
	}

	
}
