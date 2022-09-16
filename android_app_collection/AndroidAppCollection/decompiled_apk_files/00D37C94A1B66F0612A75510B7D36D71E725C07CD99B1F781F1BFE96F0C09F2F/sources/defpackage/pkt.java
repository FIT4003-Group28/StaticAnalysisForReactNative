package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: pkt  reason: default package */
/* loaded from: classes4.dex */
public abstract class pkt {
    public static final pkt c = new pkq();

    public int a(boolean z) {
        return z() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (z()) {
            return -1;
        }
        return q() - 1;
    }

    public int d(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i != c(z)) {
                return i + 1;
            }
            return -1;
        } else if (i2 == 1) {
            return i;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            return i == c(z) ? a(z) : i + 1;
        }
    }

    public abstract pkr e(int i, pkr pkrVar, boolean z);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkt)) {
            return false;
        }
        pkt pktVar = (pkt) obj;
        if (pktVar.q() != q() || pktVar.p() != p()) {
            return false;
        }
        pks pksVar = new pks();
        pkr pkrVar = new pkr();
        pks pksVar2 = new pks();
        pkr pkrVar2 = new pkr();
        for (int i = 0; i < q(); i++) {
            if (!y(i, pksVar).equals(pktVar.y(i, pksVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < p(); i2++) {
            if (!e(i2, pkrVar, true).equals(pktVar.e(i2, pkrVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public pkr f(Object obj, pkr pkrVar) {
        return e(b(obj), pkrVar, true);
    }

    public abstract pks g(int i, pks pksVar, long j);

    public int hashCode() {
        pks pksVar = new pks();
        pkr pkrVar = new pkr();
        int q = q() + 217;
        for (int i = 0; i < q(); i++) {
            q = (q * 31) + y(i, pksVar).hashCode();
        }
        int p = (q * 31) + p();
        for (int i2 = 0; i2 < p(); i2++) {
            p = (p * 31) + e(i2, pkrVar, true).hashCode();
        }
        return p;
    }

    public abstract Object j(int i);

    public abstract int p();

    public abstract int q();

    public int t(int i, int i2) {
        if (i2 != 0) {
            return i2 != 1 ? i == a(false) ? c(false) : i - 1 : i;
        } else if (i != a(false)) {
            return i - 1;
        } else {
            return -1;
        }
    }

    public final int u(int i, pkr pkrVar, pks pksVar, int i2, boolean z) {
        int i3 = x(i, pkrVar).c;
        if (y(i3, pksVar).p == i) {
            int d = d(i3, i2, z);
            if (d != -1) {
                return y(d, pksVar).o;
            }
            return -1;
        }
        return i + 1;
    }

    public final Pair v(pks pksVar, pkr pkrVar, int i, long j) {
        Pair w = w(pksVar, pkrVar, i, j, 0L);
        ptx.a(w);
        return w;
    }

    public final Pair w(pks pksVar, pkr pkrVar, int i, long j, long j2) {
        ptx.g(i, q());
        g(i, pksVar, j2);
        if (j == -9223372036854775807L) {
            j = pksVar.m;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = pksVar.o;
        x(i2, pkrVar);
        while (i2 < pksVar.p && pkrVar.e != j) {
            int i3 = i2 + 1;
            if (x(i3, pkrVar).e > j) {
                break;
            }
            i2 = i3;
        }
        e(i2, pkrVar, true);
        long j3 = pkrVar.e;
        Object obj = pkrVar.b;
        ptx.a(obj);
        return Pair.create(obj, Long.valueOf(j - j3));
    }

    public final pkr x(int i, pkr pkrVar) {
        return e(i, pkrVar, false);
    }

    public final pks y(int i, pks pksVar) {
        return g(i, pksVar, 0L);
    }

    public final boolean z() {
        return q() == 0;
    }
}
