package com.example.reservation.service;

import com.example.reservation.domain.Partner;
import com.example.reservation.repository.PartnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PartnerService {

    private PartnerRepository partnerRepository;

    public Partner createPartner(Partner partner) {
        return partnerRepository.save(partner);
    }
}
