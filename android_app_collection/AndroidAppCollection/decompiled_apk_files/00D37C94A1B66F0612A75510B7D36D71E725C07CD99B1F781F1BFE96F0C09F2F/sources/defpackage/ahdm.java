package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ahdm  reason: default package */
/* loaded from: classes.dex */
public final class ahdm {
    private static final ActivityManager.RunningAppProcessInfo a = new ActivityManager.RunningAppProcessInfo();

    public static boolean a(Context context, Intent intent) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = a;
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 125) {
            ahdr.a = (runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200) ? false : true;
        }
        try {
            zgt.I(context, intent);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
