package com.groupeisi.codequality.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetraitDaoTest {

    RetraitDao retraitDao;

    @BeforeEach
    void setUp() {
        retraitDao = new RetraitDao();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void montant() {
        assertEquals(2500, retraitDao.montant());
    }
}