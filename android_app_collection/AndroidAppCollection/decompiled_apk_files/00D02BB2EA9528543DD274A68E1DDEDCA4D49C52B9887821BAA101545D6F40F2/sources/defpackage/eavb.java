package defpackage;
/* compiled from: PG */
/* renamed from: eavb  reason: default package */
/* loaded from: classes6.dex */
final class eavb {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public eavb(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            StringBuilder sb = new StringBuilder(15);
            sb.append("Unknown mode: ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final long a(eaok eaokVar, long j) {
        try {
            return d(eaokVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                eaqp eaqpVar = (eaqp) eaokVar;
                if (!eaqpVar.z.u(j)) {
                    j = eaqpVar.z.k(j, 1);
                } else {
                    return d(eaokVar, j);
                }
            }
        }
    }

    public final long b(eaok eaokVar, long j) {
        try {
            return d(eaokVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                eaqp eaqpVar = (eaqp) eaokVar;
                if (!eaqpVar.z.u(j)) {
                    j = eaqpVar.z.k(j, -1);
                } else {
                    return d(eaokVar, j);
                }
            }
        }
    }

    public final long c(eaok eaokVar, long j) {
        eaqp eaqpVar = (eaqp) eaokVar;
        int d = this.d - eaqpVar.s.d(j);
        if (d != 0) {
            if (this.e) {
                if (d < 0) {
                    d += 7;
                }
            } else if (d > 0) {
                d -= 7;
            }
            return eaqpVar.s.k(j, d);
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eavb) {
            eavb eavbVar = (eavb) obj;
            if (this.a == eavbVar.a && this.b == eavbVar.b && this.c == eavbVar.c && this.d == eavbVar.d && this.e == eavbVar.e && this.f == eavbVar.f) {
                return true;
            }
        }
        return false;
    }

    private final long d(eaok eaokVar, long j) {
        int i = this.c;
        if (i < 0) {
            eaqp eaqpVar = (eaqp) eaokVar;
            return eaqpVar.t.k(eaqpVar.y.k(eaqpVar.t.p(j, 1), 1), this.c);
        }
        return ((eaqp) eaokVar).t.p(j, i);
    }
}
