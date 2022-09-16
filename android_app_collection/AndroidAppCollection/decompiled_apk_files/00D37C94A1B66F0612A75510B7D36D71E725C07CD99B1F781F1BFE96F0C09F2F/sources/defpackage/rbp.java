package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: rbp  reason: default package */
/* loaded from: classes4.dex */
public final class rbp {
    long a = -1;
    long b = -1;

    public final long a() {
        qnm.c(this.b != -1);
        return TimeUnit.NANOSECONDS.toMillis(b() - this.b);
    }

    public final long b() {
        long j = this.a;
        if (j == -1) {
            return System.nanoTime();
        }
        this.a = -1L;
        return j;
    }

    public final void c() {
        this.b = b();
    }
}
