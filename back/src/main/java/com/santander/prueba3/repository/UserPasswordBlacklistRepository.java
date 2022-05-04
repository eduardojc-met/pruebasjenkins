package com.santander.prueba3.repository;

import com.santander.prueba3.domain.UserPasswordBlacklist;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link UserPasswordBlacklist} entity.
 */
public interface UserPasswordBlacklistRepository extends JpaRepository<UserPasswordBlacklist, String> {}
