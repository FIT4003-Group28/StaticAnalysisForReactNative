package defpackage;

import android.os.Process;
import android.os.StrictMode;
/* compiled from: PG */
/* renamed from: byw  reason: default package */
/* loaded from: classes.dex */
final class byw extends Thread {
    final /* synthetic */ byx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byw(byx byxVar, Runnable runnable, String str) {
        super(runnable, str);
        this.a = byxVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        if (this.a.a) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        } catch (Throwable unused) {
        }
    }
}
