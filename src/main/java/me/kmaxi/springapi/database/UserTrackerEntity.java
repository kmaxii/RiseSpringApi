package me.kmaxi.springapi.database;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserTrackerEntity {

    @Id
    private int userID;

    private String ipHash;


    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setIpHash(String ipHash) {
        this.ipHash = ipHash;
    }
}
