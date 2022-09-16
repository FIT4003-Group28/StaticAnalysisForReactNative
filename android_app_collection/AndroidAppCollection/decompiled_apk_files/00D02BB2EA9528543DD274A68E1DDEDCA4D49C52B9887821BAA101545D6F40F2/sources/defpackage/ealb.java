package defpackage;

import android.net.TrafficStats;
import org.chromium.net.ThreadStatsUid;
/* compiled from: PG */
/* renamed from: ealb  reason: default package */
/* loaded from: classes6.dex */
final class ealb implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ealh b;

    public ealb(ealh ealhVar, Runnable runnable) {
        this.b = ealhVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.b.b);
        ealh ealhVar = this.b;
        if (ealhVar.c) {
            ThreadStatsUid.set(ealhVar.d);
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
