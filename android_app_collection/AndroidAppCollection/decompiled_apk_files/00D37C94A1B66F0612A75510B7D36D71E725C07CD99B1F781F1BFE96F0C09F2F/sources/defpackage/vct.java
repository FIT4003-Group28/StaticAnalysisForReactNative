package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vct  reason: default package */
/* loaded from: classes4.dex */
final class vct implements Runnable {
    final /* synthetic */ ankx a;
    final /* synthetic */ long b;
    final /* synthetic */ TimeUnit c;

    public vct(ankx ankxVar, long j, TimeUnit timeUnit) {
        this.a = ankxVar;
        this.b = j;
        this.c = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        StringBuilder sb = new StringBuilder(28);
        sb.append("Memory state is: ");
        sb.append(i);
        Log.w("ProcessReaper", sb.toString());
        if (runningAppProcessInfo.importance >= 400) {
            Log.w("ProcessReaper", "Killing process to refresh experiment configuration");
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
        vsr.c(this.a.b(this, this.b, this.c));
    }
}
