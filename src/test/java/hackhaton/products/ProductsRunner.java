package hackhaton.products;

import com.intuit.karate.junit5.Karate;

class ProductsRunner {

    @Karate.Test
    Karate testUsers() {
        return new Karate().feature("sellers").relativeTo(getClass());
    }

}
