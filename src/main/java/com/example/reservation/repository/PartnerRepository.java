package com.example.reservation.repository;

import com.example.reservation.domain.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {
    //파트너 이름으로 조회하는 메서드
    Optional<Partner> findByName(String name);
}
