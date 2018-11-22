package com.tw.dps.dao;

import com.tw.dps.model.Api;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiRepository extends JpaRepository<Api, Integer> {
}
