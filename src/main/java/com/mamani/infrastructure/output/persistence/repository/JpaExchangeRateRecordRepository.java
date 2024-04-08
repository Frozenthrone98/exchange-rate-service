package com.mamani.infrastructure.output.persistence.repository;

import com.mamani.infrastructure.output.persistence.entity.ExchangeRateRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaExchangeRateRecordRepository extends JpaRepository<ExchangeRateRecordEntity,Long> {
}
