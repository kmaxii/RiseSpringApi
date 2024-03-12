package me.kmaxi.springapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDataController {

    @PostMapping("/processUserData")
    public ResponseEntity<String> processUserData(@RequestBody UserDataListWrapper userDataListWrapper) {
        // Example of processing: Loop through each UserData object and print details
        for (UserData userData : userDataListWrapper.getUserDataList()) {
            // Add
        }
        return ResponseEntity.ok("Processed userDataList successfully");
    }
}
