package LamdaExp;

import java.util.regex.Pattern;

public class UserRegistrion_without_lambda {
	public boolean firstName(String pattern,String firstName,String mood) throws InvalidUserException1 {
        try {
            if (mood.equals("SAD")) {
                if (Pattern.matches(pattern, firstName))
                    return true;
                else
                    return false;
            } else
                return false;
        }catch (NullPointerException e) {
            throw new InvalidUserException1("Please enter proper message");
        }
    }
	public boolean lastName(String pattern,String lastName,String mood) throws InvalidUserException1 {
        try {
            if (mood.equals("SAD")) {
                if (Pattern.matches(pattern, lastName))
                    return true;
                else
                    return false;
            } else
                return false;
        }catch (NullPointerException e) {
            throw new InvalidUserException1("Please enter proper message");
        }
    }
	 public boolean email(String pattern,String email,String mood) throws InvalidUserException1 {
	        try {
	            if (mood.equals("Happy")) {
	                if (Pattern.matches(pattern, email))
	                    return true;
	                else
	                    return false;
	            } else
	                return false;
	        }catch (NullPointerException e) {
	            throw new InvalidUserException1("Please enter proper message");
	        }
	    }
	 public boolean phone(String pattern,String phone,String mood) throws InvalidUserException1 {
	        try {
	            if (mood.equals("SAD")) {
	                if (Pattern.matches(pattern, phone))
	                    return true;
	                else
	                    return false;
	            } else
	                return false;
	        }catch (NullPointerException e) {
	            throw new InvalidUserException1("Please enter proper message");
	        }
	    }
	 public boolean password(String pattern,String password,String mood) throws InvalidUserException1 {
	        try {
	            if (mood.equals("SAD")) {
	                if (Pattern.matches(pattern, password))
	                    return true;
	                else
	                    return false;
	            } else
	                return false;
	        }catch (NullPointerException e) {
	            throw new InvalidUserException1("Please enter proper message");
	        }
	    }
}


	

