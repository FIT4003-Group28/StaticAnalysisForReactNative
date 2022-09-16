package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azno  reason: default package */
/* loaded from: classes2.dex */
final class azno implements Runnable {
    private final Runnable a;
    private final aznr b;
    private final long c;

    public azno(Runnable runnable, aznr aznrVar, long j) {
        this.a = runnable;
        this.b = aznrVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b.c) {
            long f = aznr.f(TimeUnit.MILLISECONDS);
            long j = this.c;
            if (j > f) {
                try {
                    Thread.sleep(j - f);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    azqc.d(e);
                    return;
                }
            }
            if (this.b.c) {
                return;
            }
            this.a.run();
        }
    }
}
