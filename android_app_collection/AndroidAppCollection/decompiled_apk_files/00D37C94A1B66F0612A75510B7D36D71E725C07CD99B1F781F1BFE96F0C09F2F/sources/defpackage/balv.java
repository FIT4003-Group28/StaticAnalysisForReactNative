package defpackage;
/* compiled from: PG */
/* renamed from: balv  reason: default package */
/* loaded from: classes2.dex */
final class balv {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public balv(char c, int i, int i2, int i3, boolean z, int i4) {
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

    public final long a(bahl bahlVar, long j) {
        try {
            return d(bahlVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                bais baisVar = (bais) bahlVar;
                if (!baisVar.m.s(j)) {
                    j = baisVar.m.e(j, 1);
                } else {
                    return d(bahlVar, j);
                }
            }
        }
    }

    public final long b(bahl bahlVar, long j) {
        try {
            return d(bahlVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                bais baisVar = (bais) bahlVar;
                if (!baisVar.m.s(j)) {
                    j = baisVar.m.e(j, -1);
                } else {
                    return d(bahlVar, j);
                }
            }
        }
    }

    public final long c(bahl bahlVar, long j) {
        bais baisVar = (bais) bahlVar;
        int a = this.d - baisVar.i.a(j);
        if (a != 0) {
            if (this.e) {
                if (a < 0) {
                    a += 7;
                }
            } else if (a > 0) {
                a -= 7;
            }
            return baisVar.i.e(j, a);
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof balv) {
            balv balvVar = (balv) obj;
            if (this.a == balvVar.a && this.b == balvVar.b && this.c == balvVar.c && this.d == balvVar.d && this.e == balvVar.e && this.f == balvVar.f) {
                return true;
            }
        }
        return false;
    }

    private final long d(bahl bahlVar, long j) {
        int i = this.c;
        if (i < 0) {
            bais baisVar = (bais) bahlVar;
            return baisVar.j.e(baisVar.l.e(baisVar.j.h(j, 1), 1), this.c);
        }
        return ((bais) bahlVar).j.h(j, i);
    }
}
