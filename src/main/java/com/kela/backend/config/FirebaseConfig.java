package com.kela.backend.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@Configuration
public class FirebaseConfig {


    static final String GOOGLE_APPLICATION_CREDENTIALS = "firebase/kela-backend-firebase-adminsdk.json";
    String firebaseDatabaseUrl = "https://kela-app.firebaseio.com";


    @Primary
    @Bean
    public void firebaseInit() throws IOException {
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials
                        .fromStream(new ClassPathResource(GOOGLE_APPLICATION_CREDENTIALS).getInputStream()))
                .setDatabaseUrl(firebaseDatabaseUrl).build();
        if (FirebaseApp.getApps().isEmpty()) {
            FirebaseApp.initializeApp(options);
        }
    }

   /* void run() {

        try {

            UserRecord userRecord = FirebaseAuth.getInstance().getUser("PLA8lwZgdfPHexNdn5maiZRrbhf1");
            // See the UserRecord reference doc for the contents of userRecord.
            System.out.println("\nSuccessfully fetched user data: " + userRecord.getUid());
            System.out.println("\nUser email: " + userRecord.getEmail());

            // Start listing users from the beginning, 1000 at a time.
            ListUsersPage page = FirebaseAuth.getInstance().listUsers(null);
            while (page != null) {
                for (ExportedUserRecord user : page.getValues()) {
                    System.out.println("User: " + user.getUid() + " email: " + user.getEmail() + " username : " + user.getDisplayName());
                }
                page = page.getNextPage();
            }

            // Iterate through all users. This will still retrieve users in batches,
            // buffering no more than 1000 users in memory at a time.
            page = FirebaseAuth.getInstance().listUsers(null);
            for (ExportedUserRecord user : page.iterateAll()) {
                System.out.println("User: " + user.getUid() + " email: " + user.getEmail());
            }

        }
        catch(Exception exception) {
            System.out.println(exception.getStackTrace());
        }

    }*/


}
