package defpackage;

import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: cqvo  reason: default package */
/* loaded from: classes.dex */
public final class cqvo extends eaou {
    cqvn a;
    private final TimeZone e;

    public cqvo(TimeZone timeZone) {
        super(timeZone.getID());
        this.a = new cqvn(Long.MIN_VALUE, Long.MIN_VALUE);
        this.e = timeZone;
    }

    private final long w(long j, boolean z, boolean z2) {
        int i = true != z2 ? -1 : 1;
        for (int i2 = 1; i2 < 5; i2++) {
            long j2 = (i2 * i * 7776000000L) + j;
            if (x(j2) != z) {
                return j2;
            }
        }
        return j;
    }

    private final boolean x(long j) {
        return this.e.getOffset(j) != this.e.getRawOffset();
    }

    @Override // defpackage.eaou
    public final String a(long j) {
        return this.e.getID();
    }

    @Override // defpackage.eaou
    public final int b(long j) {
        return this.e.getOffset(j);
    }

    @Override // defpackage.eaou
    public final int c(long j) {
        return this.e.getRawOffset();
    }

    @Override // defpackage.eaou
    public final boolean d() {
        return false;
    }

    @Override // defpackage.eaou
    public final long e(long j) {
        cqvn cqvnVar = this.a;
        if (cqvnVar.a(j)) {
            return cqvnVar.b;
        }
        cqvn g = g(j);
        if (g == null) {
            return j;
        }
        this.a = g;
        return g.b;
    }

    @Override // defpackage.eaou
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.e.equals(((cqvo) obj).e);
    }

    @Override // defpackage.eaou
    public final long f(long j) {
        long j2;
        cqvn cqvnVar = this.a;
        if (cqvnVar.a(j)) {
            j2 = cqvnVar.a;
        } else {
            cqvn g = g(j);
            if (g == null) {
                return j;
            }
            this.a = g;
            j2 = g.a;
        }
        return j2 - 1;
    }

    final cqvn g(long j) {
        boolean x = x(j);
        long w = w(j, x, true);
        if (w != j) {
            long w2 = w(j, x, false);
            if (w2 != j) {
                return new cqvn(h(w2, j, !x), h(j, w, x));
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.eaou
    public final int hashCode() {
        return this.e.hashCode();
    }

    final long h(long j, long j2, boolean z) {
        if (j2 <= j) {
            throw new AssertionError("upperBound must be greater than instant");
        }
        if (z != x(j2)) {
            long j3 = j / 1000;
            long j4 = j2 / 1000;
            do {
                long j5 = (j4 + j3) / 2;
                boolean x = x(j5 * 1000);
                if (x != z) {
                    j4 = j5;
                }
                if (x == z) {
                    j3 = j5;
                }
            } while (j4 - j3 > 1);
            long j6 = j3 * 1000;
            return x(j6) == z ? j4 * 1000 : j6;
        }
        throw new AssertionError("instant and upperBound must have different time zone offsets");
    }
}
