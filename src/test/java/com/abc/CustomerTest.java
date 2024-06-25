package com.abc;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void testTotalInterestEarned() {
        // Create a mock account
        Account mockAccount = Mockito.mock(Account.class);
        
        // Set up the interest earned for the mock account
        Mockito.when(mockAccount.interestEarned()).thenReturn(10.0);
        
        // Create a customer
        Customer customer = new Customer("John Doe", 123);
        
        // Open the mock account for the customer
        customer.openAccount(mockAccount);
        
        // Calculate the total interest earned
        double totalInterest = customer.totalInterestEarned();
        
        // Verify that the total interest earned is correct
        assertEquals(10.0, totalInterest, 0.001);
    }
}