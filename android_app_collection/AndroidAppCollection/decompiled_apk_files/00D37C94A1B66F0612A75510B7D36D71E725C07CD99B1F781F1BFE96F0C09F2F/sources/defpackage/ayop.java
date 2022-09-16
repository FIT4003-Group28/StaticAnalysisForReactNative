package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayop  reason: default package */
/* loaded from: classes2.dex */
public final class ayop implements Runnable {
    final Runnable a;
    final ayqm b;
    final long c;
    long d;
    long e;
    long f;
    final /* synthetic */ ayoq g;

    public ayop(ayoq ayoqVar, long j, Runnable runnable, long j2, ayqm ayqmVar, long j3) {
        this.g = ayoqVar;
        this.a = runnable;
        this.b = ayqmVar;
        this.c = j3;
        this.e = j2;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        this.a.run();
        if (!this.b.e()) {
            long f = ayoq.f(TimeUnit.NANOSECONDS);
            long j2 = ayor.a;
            long j3 = this.e;
            if (j2 + f < j3 || f >= j3 + this.c + ayor.a) {
                long j4 = this.c;
                long j5 = f + j4;
                long j6 = this.d + 1;
                this.d = j6;
                this.f = j5 - (j4 * j6);
                j = j5;
            } else {
                long j7 = this.f;
                long j8 = this.d + 1;
                this.d = j8;
                j = j7 + (j8 * this.c);
            }
            this.e = f;
            ayqi.i(this.b, this.g.c(this, j - f, TimeUnit.NANOSECONDS));
        }
    }
}
