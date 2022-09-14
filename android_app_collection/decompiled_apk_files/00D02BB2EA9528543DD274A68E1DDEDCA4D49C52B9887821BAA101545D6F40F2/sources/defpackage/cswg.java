package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: cswg  reason: default package */
/* loaded from: classes5.dex */
public final class cswg {
    private static cswg a;

    private cswg() {
    }

    public static final boolean a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.contains(context.getPackageName())) {
                    return runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200;
                }
            }
        }
        return false;
    }

    public static synchronized void b() {
        synchronized (cswg.class) {
            if (a == null) {
                a = new cswg();
            }
        }
    }
}
