package a.g.j;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
/* loaded from: classes.dex */
public class e {
    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
