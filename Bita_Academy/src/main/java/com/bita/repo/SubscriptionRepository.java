package com.bita.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bita.entity.SubscriptionEntity;

public interface SubscriptionRepository extends JpaRepository<SubscriptionEntity, Long> {

}
