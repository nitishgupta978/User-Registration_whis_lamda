package test;

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import practice.InvalidUserException1;
import practice.UserRegistration;

class UserRegistrationTest {
	 UserRegistration userRegistration = new UserRegistration();
	 @Test
	    public void firstNameTestShouldReturnTrue(){
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$","Nrupesh","HAPPY");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertTrue(result);

	    }
	    @Test
	    public void firstNameTestShouldReturnFalse(){
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$","raghu","HAPPY");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertFalse(result);	    
	    

}
	    @Test
	    public void lastNameTestShouldReturnTrue() {
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.lastName("^[A-Z]{1}[a-z]{3,}$","Mhatre","Happy");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertTrue(result);
	    }
	    @Test
	    public void lastNameTestShouldReturnFalse() {
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.lastName("^[A-Z]{1}[a-z]{3,}$","kv","Happy");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertFalse(result);
	    }    
	    @Test
	    public void emailTestShouldReturnTrue() {
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","niha199831@gmail.com","Happy");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertTrue(result);
	    }
	    @Test
	    public void emailTestShouldReturnFalse() {
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","niharika199831#gmail.com","Happy");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertFalse(result);
	    }
	    @Test
	    public void phoneTestShouldReturnTrue() {
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$","917057114002","Happy");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertTrue(result);
	    }
	    @Test
	    public void phoneTestShouldReturnFalse() {
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$","91550167198","Happy");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertFalse(result);
	    }
	    @Test
	    public void passwordTestShouldReturnTrue() {
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.password("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])","raghu23A@","Happy");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertTrue(result);
	    }
	    @Test
	    public void passwordTestShouldReturnFalse() {
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.password("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])","raghu123A","Happy");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertFalse(result);
	    }
}
