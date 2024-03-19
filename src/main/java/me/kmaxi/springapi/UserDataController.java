package me.kmaxi.springapi;

import me.kmaxi.springapi.database.UserDataEntity;
import me.kmaxi.springapi.database.UserDataRepository;
import me.kmaxi.springapi.database.UserTrackerEntity;
import me.kmaxi.springapi.database.UserTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

@RestController
public class UserDataController {

    @Autowired
    private UserDataRepository userDataRepository;

    @Autowired
    private UserTrackerRepository userTrackerRepository;

    @PostMapping("/processUserData")
    public ResponseEntity<String> processUserData(@RequestBody UserDataListWrapper userDataListWrapper, HttpServletRequest request) {

        String ipAddress = request.getRemoteAddr();

        for (UserData userData : userDataListWrapper.getUserDataList()) {
            UserDataEntity userDataEntity = new UserDataEntity();
            userDataEntity.setUserID(userData.getId());
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

        UserTrackerEntity userTrackerEntity = new UserTrackerEntity();
        userTrackerEntity.setUserID(userDataListWrapper.getUserDataList().get(0).getId());

        // Hash the ip with SHA-256
        ipAddress = Hashing.sha256(ipAddress);
        userTrackerEntity.setIpHash(ipAddress);
        userTrackerRepository.save(userTrackerEntity);


        return ResponseEntity.ok("Processed userDataList successfully");
    }
}