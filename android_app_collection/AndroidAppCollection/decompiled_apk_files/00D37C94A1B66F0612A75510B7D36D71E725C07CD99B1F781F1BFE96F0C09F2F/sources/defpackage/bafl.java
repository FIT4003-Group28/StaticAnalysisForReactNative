package defpackage;

import android.net.TrafficStats;
import org.chromium.net.ThreadStatsUid;
/* compiled from: PG */
/* renamed from: bafl  reason: default package */
/* loaded from: classes2.dex */
final class bafl implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bafp b;

    public bafl(bafp bafpVar, Runnable runnable) {
        this.b = bafpVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.b.b);
        bafp bafpVar = this.b;
        if (bafpVar.c) {
            ThreadStatsUid.set(bafpVar.d);
        }
        try {
            this.a.run();
            if (this.b.c) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
        } catch (Throwable th) {
            if (this.b.c) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
            throw th;
        }
    }
}
