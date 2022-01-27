package com.egregius.Springboot_addressbook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface AddressbookRepository extends JpaRepository<AddressbookEntity, Integer> {

    }


