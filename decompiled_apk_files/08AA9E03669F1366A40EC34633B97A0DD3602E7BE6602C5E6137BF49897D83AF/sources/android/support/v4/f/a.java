package android.support.v4.f;

import android.os.Build;
/* compiled from: BuildCompat.java */
/* loaded from: classes.dex */
public class a {
    @Deprecated
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static boolean b() {
        return Build.VERSION.CODENAME.equals("P");
    }
}
