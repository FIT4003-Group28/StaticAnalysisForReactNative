package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cxly  reason: default package */
/* loaded from: classes5.dex */
final class cxly {
    private static boolean a;

    private cxly() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(dehq dehqVar) {
        synchronized (cxly.class) {
            if (!a) {
                TimeUnit timeUnit = TimeUnit.MINUTES;
                cxlj.a(dehqVar.d(new cxlx(dehqVar, timeUnit), 10L, timeUnit));
                a = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        StringBuilder sb = new StringBuilder(28);
        sb.append("Memory state is: ");
        sb.append(i);
        sb.toString();
        if (runningAppProcessInfo.importance >= 400) {
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }
}
