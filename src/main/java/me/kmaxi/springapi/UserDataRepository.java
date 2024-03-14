package me.kmaxi.springapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserDataEntity, Integer> {
}