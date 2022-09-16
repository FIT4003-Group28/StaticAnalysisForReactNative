package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: cllj  reason: default package */
/* loaded from: classes5.dex */
public abstract class cllj extends clpb {
    private final int a;
    private final cmfn b;

    public cllj(cmfn cmfnVar) {
        this.b = cmfnVar;
        this.a = cmfnVar.a();
    }

    public static Object a(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    private final int z(int i, boolean z) {
        if (!z) {
            if (i < this.a - 1) {
                return i + 1;
            }
            return -1;
        }
        cmfn cmfnVar = this.b;
        int i2 = cmfnVar.c[i] + 1;
        int[] iArr = cmfnVar.b;
        if (i2 >= iArr.length) {
            return -1;
        }
        return iArr[i2];
    }

    @Override // defpackage.clpb
    public final int c(int i, int i2, boolean z) {
        int l = l(i);
        int p = p(l);
        int c = n(l).c(i - p, i2 == 2 ? 0 : i2, z);
        if (c != -1) {
            return p + c;
        }
        int z2 = z(l, z);
        while (z2 != -1 && n(z2).t()) {
            z2 = z(z2, z);
        }
        if (z2 != -1) {
            return p(z2) + n(z2).e(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return e(z);
    }

    @Override // defpackage.clpb
    public final int d(boolean z) {
        int i;
        int i2 = this.a;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.b.b;
            int length = iArr.length;
            i = length > 0 ? iArr[length - 1] : -1;
        } else {
            i = i2 - 1;
        }
        while (n(i).t()) {
            if (z) {
                cmfn cmfnVar = this.b;
                int i3 = cmfnVar.c[i] - 1;
                if (i3 >= 0) {
                    i = cmfnVar.b[i3];
                    continue;
                }
                i = -1;
                continue;
            } else {
                if (i > 0) {
                    i--;
                    continue;
                }
                i = -1;
                continue;
            }
            if (i == -1) {
                return -1;
            }
        }
        return p(i) + n(i).d(z);
    }

    @Override // defpackage.clpb
    public final int e(boolean z) {
        if (this.a == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.b.b;
            i = iArr.length > 0 ? iArr[0] : -1;
        }
        while (n(i).t()) {
            i = z(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return p(i) + n(i).e(z);
    }

    @Override // defpackage.clpb
    public final clpa f(int i, clpa clpaVar, long j) {
        int l = l(i);
        int p = p(l);
        int o = o(l);
        n(l).f(i - p, clpaVar, j);
        Object q = q(l);
        if (!clpa.a.equals(clpaVar.b)) {
            q = Pair.create(q, clpaVar.b);
        }
        clpaVar.b = q;
        clpaVar.l += o;
        clpaVar.m += o;
        return clpaVar;
    }

    @Override // defpackage.clpb
    public final cloz g(Object obj, cloz clozVar) {
        Object a = a(obj);
        Object b = b(obj);
        int m = m(a);
        int p = p(m);
        n(m).g(b, clozVar);
        clozVar.c += p;
        clozVar.b = obj;
        return clozVar;
    }

    @Override // defpackage.clpb
    public final cloz h(int i, cloz clozVar, boolean z) {
        int k = k(i);
        int p = p(k);
        n(k).h(i - o(k), clozVar, z);
        clozVar.c += p;
        if (z) {
            Object q = q(k);
            Object obj = clozVar.b;
            cmmn.f(obj);
            clozVar.b = Pair.create(q, obj);
        }
        return clozVar;
    }

    @Override // defpackage.clpb
    public final int i(Object obj) {
        int i;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object a = a(obj);
        Object b = b(obj);
        int m = m(a);
        if (m != -1 && (i = n(m).i(b)) != -1) {
            return o(m) + i;
        }
        return -1;
    }

    @Override // defpackage.clpb
    public final Object j(int i) {
        int k = k(i);
        return Pair.create(q(k), n(k).j(i - o(k)));
    }

    protected abstract int k(int i);

    protected abstract int l(int i);

    protected abstract int m(Object obj);

    protected abstract clpb n(int i);

    protected abstract int o(int i);

    protected abstract int p(int i);

    protected abstract Object q(int i);
}
