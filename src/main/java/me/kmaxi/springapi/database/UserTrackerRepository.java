package me.kmaxi.springapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTrackerRepository extends JpaRepository<UserTrackerEntity, Integer>{
}
