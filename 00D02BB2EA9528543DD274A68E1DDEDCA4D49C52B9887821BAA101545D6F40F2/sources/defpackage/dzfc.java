package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzfc  reason: default package */
/* loaded from: classes6.dex */
final class dzfc implements Runnable {
    private final Runnable a;
    private final dzff b;
    private final long c;

    public dzfc(Runnable runnable, dzff dzffVar, long j) {
        this.a = runnable;
        this.b = dzffVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b.c) {
            long d = dzff.d(TimeUnit.MILLISECONDS);
            long j = this.c;
            if (j > d) {
                try {
                    Thread.sleep(j - d);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    dzfy.a(e);
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
