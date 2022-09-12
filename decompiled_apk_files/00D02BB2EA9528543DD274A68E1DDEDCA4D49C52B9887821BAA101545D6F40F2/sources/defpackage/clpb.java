package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: clpb  reason: default package */
/* loaded from: classes5.dex */
public abstract class clpb {
    public static final clpb c = new cloy();

    public int c(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i != d(z)) {
                return i + 1;
            }
            return -1;
        } else if (i2 == 1) {
            return i;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            return i == d(z) ? e(z) : i + 1;
        }
    }

    public int d(boolean z) {
        if (t()) {
            return -1;
        }
        return r() - 1;
    }

    public int e(boolean z) {
        return t() ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clpb)) {
            return false;
        }
        clpb clpbVar = (clpb) obj;
        if (clpbVar.r() != r() || clpbVar.s() != s()) {
            return false;
        }
        clpa clpaVar = new clpa();
        cloz clozVar = new cloz();
        clpa clpaVar2 = new clpa();
        cloz clozVar2 = new cloz();
        for (int i = 0; i < r(); i++) {
            if (!u(i, clpaVar).equals(clpbVar.u(i, clpaVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < s(); i2++) {
            if (!h(i2, clozVar, true).equals(clpbVar.h(i2, clozVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public abstract clpa f(int i, clpa clpaVar, long j);

    public cloz g(Object obj, cloz clozVar) {
        return h(i(obj), clozVar, true);
    }

    public abstract cloz h(int i, cloz clozVar, boolean z);

    public final int hashCode() {
        clpa clpaVar = new clpa();
        cloz clozVar = new cloz();
        int r = r() + 217;
        for (int i = 0; i < r(); i++) {
            r = (r * 31) + u(i, clpaVar).hashCode();
        }
        int s = (r * 31) + s();
        for (int i2 = 0; i2 < s(); i2++) {
            s = (s * 31) + h(i2, clozVar, true).hashCode();
        }
        return s;
    }

    public abstract int i(Object obj);

    public abstract Object j(int i);

    public abstract int r();

    public abstract int s();

    public final boolean t() {
        return r() == 0;
    }

    public final clpa u(int i, clpa clpaVar) {
        return f(i, clpaVar, 0L);
    }

    public final int v(int i, cloz clozVar, clpa clpaVar, int i2, boolean z) {
        int i3 = y(i, clozVar).c;
        if (u(i3, clpaVar).m == i) {
            int c2 = c(i3, i2, z);
            if (c2 != -1) {
                return u(c2, clpaVar).l;
            }
            return -1;
        }
        return i + 1;
    }

    public final Pair<Object, Long> w(clpa clpaVar, cloz clozVar, int i, long j) {
        Pair<Object, Long> x = x(clpaVar, clozVar, i, j, 0L);
        cmmn.f(x);
        return x;
    }

    public final Pair<Object, Long> x(clpa clpaVar, cloz clozVar, int i, long j, long j2) {
        cmmn.g(i, r());
        f(i, clpaVar, j2);
        if (j == -9223372036854775807L) {
            j = clpaVar.n;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = clpaVar.l;
        long j3 = clpaVar.p + j;
        long j4 = h(i2, clozVar, true).d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < clpaVar.m) {
            j3 -= j4;
            i2++;
            j4 = h(i2, clozVar, true).d;
        }
        Object obj = clozVar.b;
        cmmn.f(obj);
        return Pair.create(obj, Long.valueOf(j3));
    }

    public final cloz y(int i, cloz clozVar) {
        return h(i, clozVar, false);
    }
}
