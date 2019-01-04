package com.citi.gce.gls.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citi.gce.gls.entities.LiquiditySharingAccount;
import com.citi.gce.gls.entities.LiquiditySharingAccountId;
import com.citi.gce.gls.entities.LiquiditySharingSetup;

@Repository
public interface LiquiditySharingAccountRepository extends JpaRepository<LiquiditySharingAccount, LiquiditySharingAccountId>
{

}
