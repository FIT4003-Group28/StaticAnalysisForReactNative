package a.g.j;

import android.os.Build;
/* loaded from: classes.dex */
public class a {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 30 || Build.VERSION.CODENAME.equals("R");
    }
}
