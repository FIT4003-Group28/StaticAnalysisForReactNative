package defpackage;

import android.net.TrafficStats;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cqyz  reason: default package */
/* loaded from: classes5.dex */
final class cqyz implements Executor {
    private final Executor a;

    public cqyz(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.a.execute(new Runnable(this, runnable) { // from class: cqyy
            private final cqyz a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = this.b;
                TrafficStats.setThreadStatsTag(0);
                try {
                    runnable2.run();
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        });
    }
}
