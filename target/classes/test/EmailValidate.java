package test;

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;

import practice.InvalidUserException1;
import practice.UserRegistration;

@RunWith(Parameterized.class)

class EmailValidate {
	private final String email2Test;
    private final boolean expectedResult;
    public EmailValidate(String email, boolean expectedResult) {
        this.email2Test = email;
        this.expectedResult = expectedResult;
    }
    
    @Parameter.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false}
        });
    }
    
    @Test
    public void shouldValidateAllTheEmailSamples() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException1.class);
            result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", this.email2Test, "Happy");
        } catch (InvalidUserException1 e) {
            e.printStackTrace();
        }
        assertEquals(this.expectedResult, result);
    
	}

}