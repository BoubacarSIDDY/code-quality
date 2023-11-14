package com.groupeisi.codequality;

import com.groupeisi.codequality.dao.RetraitDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodeQualityApplicationTests {

	RetraitDao retraitDao = new RetraitDao();

	@Test
	void contextLoads() {
		assertEquals(2500, retraitDao.montant());
	}

}
