package org.drip.services;

import java.util.List;

import org.drip.model.Account;
import org.drip.model.BillSummary;
import org.drip.model.Payment;

public interface AccountService {
	
	List<Account> getAccounts(Long customerId);
	
	List<Payment> getPayments(String accountId);
	
	List<BillSummary> getBillSummaries(String accountNumber);
	
}
