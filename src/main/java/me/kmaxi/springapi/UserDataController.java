package me.kmaxi.springapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDataController {

    @Autowired
    private UserDataRepository userDataRepository;

    @PostMapping("/processUserData")
    public ResponseEntity<String> processUserData(@RequestBody UserDataListWrapper userDataListWrapper) {

        int userId = (int) (Math.random() * Integer.MAX_VALUE);

        for (UserData userData : userDataListWrapper.getUserDataList()) {
            UserDataEntity userDataEntity = new UserDataEntity();
            userDataEntity.setUserID(userId);
            userDataEntity.setTime(userData.getTime());
            userDataEntity.setLongitude(userData.getLongitude());
            userDataEntity.setLatitude(userData.getLatitude());
            userDataEntity.setBusTransport(userData.getBusTransport());
            userDataEntity.setActivityChange(userData.getActivityChange());
            userDataEntity.setMoney(userData.getMoney());
            userDataEntity.setOnScooter(userData.isOnScooter());
            userDataEntity.setActivities(userData.getActivities());

            userDataRepository.save(userDataEntity);
        }
        return ResponseEntity.ok("Processed userDataList successfully");
    }
}