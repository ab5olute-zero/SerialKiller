package xyz.z3ro.serialkiller.UpdateChecker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

public class AppUtils {
    public static int getVersionCode(Context context) {
        if (context!= null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("version code",e.toString());
            }
        }
        return 0;
    }

    public static String getVersionName(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("version name",e.toString());
            }
        }
        return "";
    }
}
