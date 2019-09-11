package ng.com.rad5.certificateverifier;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by akwa on 4/9/18.
 */

public class DatabaseUtil {

    private static FirebaseDatabase mDatabase;

    public static FirebaseDatabase getDatabase() {
        if (mDatabase == null) {
            mDatabase = FirebaseDatabase.getInstance();
            mDatabase.setPersistenceEnabled(true);
        }
        return mDatabase;
    }
}
