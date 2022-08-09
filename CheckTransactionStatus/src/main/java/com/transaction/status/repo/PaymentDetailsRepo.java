package com.transaction.status.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.status.Client.ClientDetails;

public interface PaymentDetailsRepo extends JpaRepository<ClientDetails,Integer> {
	
}
