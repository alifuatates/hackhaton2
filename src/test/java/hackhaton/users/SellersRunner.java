package hackhaton.users;

import com.intuit.karate.junit5.Karate;

class SellersRunner {
    
    @Karate.Test
    Karate testUsers() {
        return new Karate().feature("sellers").relativeTo(getClass());
    }    

}
