package com.cg.WalletApplication.Exception;

public interface IBankException {

	String nameException ="Enter Valid Name";
	String mobileNumberException = "Enter Valid Mobile Number ";
	String passwordException ="Enter Valid Password";
	String emailIdException = " enter valid email id";
	String invalidDetails = "Given details are incorrect ";
	String insufficientFunds = "Insufficicnet account balance";
	String ACCOUNTEXISTS = "Account already exists with the given mobile number";
	String inputMismatch = "Enter Valid Details";
	String invalidAmount = "Enter valid amount";
}
