package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aylw  reason: default package */
/* loaded from: classes2.dex */
final class aylw {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public aylw(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = amvn.p(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aylw)) {
            return false;
        }
        aylw aylwVar = (aylw) obj;
        return this.a == aylwVar.a && this.b == aylwVar.b && this.c == aylwVar.c && Double.compare(this.d, aylwVar.d) == 0 && akzj.f(this.e, aylwVar.e) && akzj.f(this.f, aylwVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.e("maxAttempts", this.a);
        c.f("initialBackoffNanos", this.b);
        c.f("maxBackoffNanos", this.c);
        c.c("backoffMultiplier", String.valueOf(this.d));
        c.b("perAttemptRecvTimeoutNanos", this.e);
        c.b("retryableStatusCodes", this.f);
        return c.toString();
    }
}
