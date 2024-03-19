package me.kmaxi.springapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserDataEntity, Integer> {
}