package com.tdd.unittests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CustomerTest.class, MovieCatalogTest.class, MovieTest.class, RentalTest.class, ShoppingCartTest.class })
public class AllTests {

}
