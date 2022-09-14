package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dyuu  reason: default package */
/* loaded from: classes6.dex */
final class dyuu {
    final int a;
    final long b;
    final long c;
    final double d;
    final Set<dyiy> e;

    public dyuu(int i, long j, long j2, double d, Set<dyiy> set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = dcep.K(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dyuu)) {
            return false;
        }
        dyuu dyuuVar = (dyuu) obj;
        return this.a == dyuuVar.a && this.b == dyuuVar.b && this.c == dyuuVar.c && Double.compare(this.d, dyuuVar.d) == 0 && dbsd.a(this.e, dyuuVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("maxAttempts", this.a);
        b.g("initialBackoffNanos", this.b);
        b.g("maxBackoffNanos", this.c);
        b.d("backoffMultiplier", this.d);
        b.b("retryableStatusCodes", this.e);
        return b.toString();
    }
}
