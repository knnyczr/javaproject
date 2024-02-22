package com.auth;

public class JWTMockUtil implements JWTUtil{

	@Override
	public boolean verifyToken(String jwt_token) {
		// mock tokens greater than 10 characters are always valid
	    if(jwt_token != null && jwt_token.length()> 10) {
	    	return true;
	    }
	    return false;
	}

	@Override
	public String getScopes(String jwt_token) {
//		mock method always returns the correct customer scope
//	    return "com.api.customer.r"; // return doggo scope?
		return null;
	}

	@Override
	public Token createToken(String scopes) {
		// create and return a mock token
	    Token token = new Token("lasjflasjdfasljk " + scopes + " sdjfkljd");
	    return token;
	}

}
