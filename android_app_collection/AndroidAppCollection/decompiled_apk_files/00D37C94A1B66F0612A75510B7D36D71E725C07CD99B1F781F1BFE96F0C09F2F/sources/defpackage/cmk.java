package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
/* compiled from: PG */
/* renamed from: cmk  reason: default package */
/* loaded from: classes2.dex */
final class cmk extends Thread {
    final /* synthetic */ cml a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmk(cml cmlVar, Runnable runnable, String str) {
        super(runnable, str);
        this.a = cmlVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        if (this.a.a) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        } catch (Throwable th) {
            if (!Log.isLoggable("GlideExecutor", 6)) {
                return;
            }
            Log.e("GlideExecutor", "Request threw uncaught throwable", th);
        }
    }
}
