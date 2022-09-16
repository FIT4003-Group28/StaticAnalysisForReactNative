package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/* compiled from: PG */
/* renamed from: clmt  reason: default package */
/* loaded from: classes5.dex */
public final class clmt extends cllr implements clog {
    final cmjr b;
    public final Handler c;
    public final clnc d;
    public final cmmz<clof> e;
    public final cloz f;
    public final List<clms> g;
    public final boolean h;
    public final Looper i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public cloc n;
    public int o;
    public long p;
    public cmfn q;
    private final cmjq r;
    private final Handler s;
    private final clma t;

    public clmt(clol[] clolVarArr, cmjq cmjqVar, cllv cllvVar, cmjz cmjzVar, clqv clqvVar, cloq cloqVar, cllu clluVar, cmmq cmmqVar, Looper looper) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = cmny.e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [");
        sb.append("ExoPlayerLib/2.12.1");
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        sb.toString();
        int length = clolVarArr.length;
        boolean z = false;
        cmmn.c(length > 0);
        clol[] clolVarArr2 = (clol[]) cmmn.f(clolVarArr);
        this.r = cmjqVar;
        this.h = true;
        this.i = looper;
        this.e = new cmmz<>();
        this.g = new ArrayList();
        this.q = new cmfn();
        cmjr cmjrVar = new cmjr(new cloo[length], new cmjm[length], null);
        this.b = cmjrVar;
        this.f = new cloz();
        this.o = -1;
        this.c = new Handler(looper);
        this.t = new clma(this);
        this.n = cloc.a(cmjrVar);
        cmmn.c((clqvVar.c == null || clqvVar.b.b.isEmpty()) ? true : z);
        clqvVar.c = this;
        b(clqvVar);
        Handler handler = new Handler(looper);
        cmjx cmjxVar = ((cmkn) cmjzVar).g;
        Iterator<cmjw> it = cmjxVar.a.iterator();
        while (it.hasNext()) {
            cmjw next = it.next();
            if (next.b == clqvVar) {
                next.c = true;
                cmjxVar.a.remove(next);
            }
        }
        cmjxVar.a.add(new cmjw(handler, clqvVar));
        clnc clncVar = new clnc(clolVarArr, cmjqVar, this.b, cllvVar, cmjzVar, clqvVar, cloqVar, clluVar, looper, cmmqVar, this.t);
        this.d = clncVar;
        this.s = new Handler(clncVar.a);
    }

    public static boolean u(cloc clocVar) {
        return clocVar.e == 3 && clocVar.l && clocVar.m == 0;
    }

    public final void b(clof clofVar) {
        this.e.a(clofVar);
    }

    public final int c() {
        return this.n.e;
    }

    @Override // defpackage.clog
    public final void d(int i, long j) {
        clpb clpbVar = this.n.b;
        if (i >= 0 && (clpbVar.t() || i < clpbVar.r())) {
            int i2 = 1;
            this.j++;
            if (j()) {
                this.t.a(new clmz(this.n));
                return;
            }
            if (c() != 1) {
                i2 = 2;
            }
            cloc r = r(this.n.d(i2), clpbVar, s(clpbVar, i, j));
            this.d.d.b(3, new clnb(clpbVar, i, cllt.b(j))).sendToTarget();
            p(r, true, 1, 0, 1, true);
            return;
        }
        throw new clnh();
    }

    public final void e(boolean z, cllz cllzVar) {
        cloc f;
        int i;
        cloc clocVar;
        int o;
        int i2;
        Pair<Object, Long> s;
        int i3;
        if (z) {
            int size = this.g.size();
            cmmn.a(size >= 0 && size <= this.g.size());
            int g = g();
            clpb n = n();
            int size2 = this.g.size();
            this.j++;
            v(size);
            clpb q = q();
            cloc clocVar2 = this.n;
            long m = m();
            if (n.t() || q.t()) {
                i = size;
                clocVar = clocVar2;
                int i4 = (n.t() || !q.t()) ? 0 : 1;
                if (i4 != 0) {
                    i2 = 1;
                    o = -1;
                } else {
                    o = o();
                    i2 = 1;
                }
                if (i2 == i4) {
                    m = -9223372036854775807L;
                }
                s = s(q, o, m);
            } else {
                i = size;
                s = n.w(this.a, this.f, g(), cllt.b(m));
                int i5 = cmny.a;
                Object obj = s.first;
                if (q.i(obj) != -1) {
                    clocVar = clocVar2;
                } else {
                    Object d = clnc.d(this.a, this.f, 0, false, obj, n, q);
                    if (d != null) {
                        q.g(d, this.f);
                        int i6 = this.f.c;
                        s = s(q, i6, q.u(i6, this.a).a());
                    } else {
                        s = s(q, -1, -9223372036854775807L);
                    }
                    clocVar = clocVar2;
                }
                i2 = 1;
            }
            cloc r = r(clocVar, q, s);
            int i7 = r.e;
            if (i7 == i2 || i7 == 4 || i <= 0) {
                i3 = i;
            } else {
                i3 = i;
                if (i3 == size2 && g >= r.b.r()) {
                    r = r.d(4);
                }
            }
            this.d.d.c(20, 0, i3, this.q).sendToTarget();
            f = r.e(null);
        } else {
            cloc clocVar3 = this.n;
            f = clocVar3.f(clocVar3.c);
            f.q = f.s;
            f.r = 0L;
        }
        cloc d2 = f.d(1);
        if (cllzVar != null) {
            d2 = d2.e(cllzVar);
        }
        this.j++;
        this.d.d.a(6).sendToTarget();
        p(d2, false, 4, 0, 1, false);
    }

    public final cloj f(cloi cloiVar) {
        return new cloj(this.d, cloiVar, this.n.b, g(), this.s);
    }

    @Override // defpackage.clog
    public final int g() {
        int o = o();
        if (o == -1) {
            return 0;
        }
        return o;
    }

    public final long h() {
        if (!j()) {
            clpb n = n();
            if (!n.t()) {
                return n.u(g(), this.a).b();
            }
            return -9223372036854775807L;
        }
        cloc clocVar = this.n;
        cmeh cmehVar = clocVar.c;
        clocVar.b.g(cmehVar.a, this.f);
        cloz clozVar = this.f;
        int i = cmehVar.b;
        int i2 = cmehVar.c;
        clozVar.f(i);
        return cllt.a(-9223372036854775807L);
    }

    @Override // defpackage.clog
    public final long i() {
        if (this.n.b.t()) {
            return this.p;
        }
        if (this.n.c.b()) {
            return cllt.a(this.n.s);
        }
        cloc clocVar = this.n;
        return t(clocVar.c, clocVar.s);
    }

    @Override // defpackage.clog
    public final boolean j() {
        return this.n.c.b();
    }

    @Override // defpackage.clog
    public final int k() {
        if (j()) {
            return this.n.c.b;
        }
        return -1;
    }

    @Override // defpackage.clog
    public final int l() {
        if (j()) {
            return this.n.c.c;
        }
        return -1;
    }

    @Override // defpackage.clog
    public final long m() {
        if (j()) {
            cloc clocVar = this.n;
            clocVar.b.g(clocVar.c.a, this.f);
            cloc clocVar2 = this.n;
            if (clocVar2.d == -9223372036854775807L) {
                return clocVar2.b.u(g(), this.a).a();
            }
            return this.f.a() + cllt.a(this.n.d);
        }
        return i();
    }

    @Override // defpackage.clog
    public final clpb n() {
        return this.n.b;
    }

    public final int o() {
        if (this.n.b.t()) {
            return this.o;
        }
        cloc clocVar = this.n;
        return clocVar.b.g(clocVar.c.a, this.f).c;
    }

    public final void p(final cloc clocVar, boolean z, final int i, final int i2, final int i3, boolean z2) {
        Pair pair;
        cloc clocVar2 = this.n;
        this.n = clocVar;
        int i4 = 1;
        boolean z3 = !clocVar2.b.equals(clocVar.b);
        clpb clpbVar = clocVar2.b;
        clpb clpbVar2 = clocVar.b;
        if (!clpbVar2.t() || !clpbVar.t()) {
            if (clpbVar2.t() != clpbVar.t()) {
                pair = new Pair(true, 3);
            } else {
                Object obj = clpbVar.u(clpbVar.g(clocVar2.c.a, this.f).c, this.a).b;
                Object obj2 = clpbVar2.u(clpbVar2.g(clocVar.c.a, this.f).c, this.a).b;
                int i5 = this.a.l;
                if (!obj.equals(obj2)) {
                    if (!z || i != 0) {
                        if (z && i == 1) {
                            i4 = 2;
                        } else if (!z3) {
                            throw new IllegalStateException();
                        } else {
                            i4 = 3;
                        }
                    }
                    pair = new Pair(true, Integer.valueOf(i4));
                } else {
                    pair = (z && i == 0 && clpbVar2.i(clocVar.c.a) == i5) ? new Pair(true, 0) : new Pair(false, -1);
                }
            }
        } else {
            pair = new Pair(false, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        if (!clocVar2.b.equals(clocVar.b)) {
            this.e.c(new cmmx(clocVar, i2) { // from class: clmm
                private final cloc a;
                private final int b;

                {
                    this.a = clocVar;
                    this.b = i2;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj3) {
                    cloc clocVar3 = this.a;
                    ((clof) obj3).RK(clocVar3.b, this.b);
                }
            });
        }
        if (z) {
            this.e.c(new cmmx(i) { // from class: clmn
                private final int a;

                {
                    this.a = i;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj3) {
                    ((clof) obj3).l(this.a);
                }
            });
        }
        if (booleanValue) {
            final clno clnoVar = !clocVar.b.t() ? clocVar.b.u(clocVar.b.g(clocVar.c.a, this.f).c, this.a).c : null;
            this.e.c(new cmmx(clnoVar, intValue) { // from class: clmo
                private final clno a;
                private final int b;

                {
                    this.a = clnoVar;
                    this.b = intValue;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj3) {
                    ((clof) obj3).RL(this.a, this.b);
                }
            });
        }
        cllz cllzVar = clocVar2.f;
        cllz cllzVar2 = clocVar.f;
        if (cllzVar != cllzVar2 && cllzVar2 != null) {
            this.e.c(new cmmx(clocVar) { // from class: clmp
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj3) {
                    ((clof) obj3).k(this.a.f);
                }
            });
        }
        cmjr cmjrVar = clocVar2.i;
        cmjr cmjrVar2 = clocVar.i;
        if (cmjrVar != cmjrVar2) {
            Object obj3 = cmjrVar2.d;
            this.e.c(new cmmx(clocVar) { // from class: clmq
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    cloc clocVar3 = this.a;
                    ((clof) obj4).RM(clocVar3.h, clocVar3.i.c);
                }
            });
        }
        if (!clocVar2.j.equals(clocVar.j)) {
            this.e.c(new cmmx(clocVar) { // from class: clmr
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    ((clof) obj4).RN(this.a.j);
                }
            });
        }
        if (clocVar2.g != clocVar.g) {
            this.e.c(new cmmx(clocVar) { // from class: clmb
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    ((clof) obj4).f(this.a.g);
                }
            });
        }
        if (clocVar2.e != clocVar.e || clocVar2.l != clocVar.l) {
            this.e.c(new cmmx(clocVar) { // from class: clmc
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    cloc clocVar3 = this.a;
                    ((clof) obj4).RO(clocVar3.l, clocVar3.e);
                }
            });
        }
        if (clocVar2.e != clocVar.e) {
            this.e.c(new cmmx(clocVar) { // from class: clmd
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    ((clof) obj4).g(this.a.e);
                }
            });
        }
        if (clocVar2.l != clocVar.l) {
            this.e.c(new cmmx(clocVar, i3) { // from class: clme
                private final cloc a;
                private final int b;

                {
                    this.a = clocVar;
                    this.b = i3;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    cloc clocVar3 = this.a;
                    ((clof) obj4).h(clocVar3.l, this.b);
                }
            });
        }
        if (clocVar2.m != clocVar.m) {
            this.e.c(new cmmx(clocVar) { // from class: clmf
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    ((clof) obj4).i(this.a.m);
                }
            });
        }
        if (u(clocVar2) != u(clocVar)) {
            this.e.c(new cmmx(clocVar) { // from class: clmg
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    ((clof) obj4).j(clmt.u(this.a));
                }
            });
        }
        if (!clocVar2.n.equals(clocVar.n)) {
            this.e.c(new cmmx(clocVar) { // from class: clmh
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    ((clof) obj4).m(this.a.n);
                }
            });
        }
        if (z2) {
            this.e.c(clmi.a);
        }
        if (clocVar2.o != clocVar.o) {
            this.e.c(new cmmx(clocVar) { // from class: clmj
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    boolean z4 = this.a.o;
                    ((clof) obj4).o();
                }
            });
        }
        if (clocVar2.p != clocVar.p) {
            this.e.c(new cmmx(clocVar) { // from class: clmk
                private final cloc a;

                {
                    this.a = clocVar;
                }

                @Override // defpackage.cmmx
                public final void a(Object obj4) {
                    boolean z4 = this.a.p;
                    ((clof) obj4).p();
                }
            });
        }
        this.e.d();
    }

    public final clpb q() {
        return new clok(this.g, this.q);
    }

    public final cloc r(cloc clocVar, clpb clpbVar, Pair<Object, Long> pair) {
        long j;
        cmmn.a(clpbVar.t() || pair != null);
        clpb clpbVar2 = clocVar.b;
        cloc c = clocVar.c(clpbVar);
        if (clpbVar.t()) {
            cmeh cmehVar = cloc.a;
            cloc f = c.b(cmehVar, cllt.b(this.p), cllt.b(this.p), 0L, TrackGroupArray.a, this.b, dcdc.e()).f(cmehVar);
            f.q = f.s;
            return f;
        }
        Object obj = c.c.a;
        int i = cmny.a;
        boolean z = !obj.equals(pair.first);
        cmeh cmehVar2 = z ? new cmeh(pair.first) : c.c;
        long longValue = ((Long) pair.second).longValue();
        long b = cllt.b(m());
        if (!clpbVar2.t()) {
            b -= clpbVar2.g(obj, this.f).e;
        }
        if (z || longValue < b) {
            cmmn.c(!cmehVar2.b());
            cloc f2 = c.b(cmehVar2, longValue, longValue, 0L, z ? TrackGroupArray.a : c.h, z ? this.b : c.i, z ? dcdc.e() : c.j).f(cmehVar2);
            f2.q = longValue;
            return f2;
        } else if (longValue != b) {
            cmmn.c(!cmehVar2.b());
            long max = Math.max(0L, c.r - (longValue - b));
            long j2 = c.q;
            if (c.k.equals(c.c)) {
                j2 = longValue + max;
            }
            cloc b2 = c.b(cmehVar2, longValue, longValue, max, c.h, c.i, c.j);
            b2.q = j2;
            return b2;
        } else {
            int i2 = clpbVar.i(c.k.a);
            if (i2 != -1 && clpbVar.y(i2, this.f).c == clpbVar.g(cmehVar2.a, this.f).c) {
                return c;
            }
            clpbVar.g(cmehVar2.a, this.f);
            if (cmehVar2.b()) {
                cloz clozVar = this.f;
                int i3 = cmehVar2.b;
                int i4 = cmehVar2.c;
                clozVar.f(i3);
                j = -9223372036854775807L;
            } else {
                j = this.f.d;
            }
            cloc f3 = c.b(cmehVar2, c.s, c.s, j - c.s, c.h, c.i, c.j).f(cmehVar2);
            f3.q = j;
            return f3;
        }
    }

    public final Pair<Object, Long> s(clpb clpbVar, int i, long j) {
        if (clpbVar.t()) {
            this.o = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.p = j;
            return null;
        }
        if (i == -1 || i >= clpbVar.r()) {
            i = clpbVar.e(false);
            j = clpbVar.u(i, this.a).a();
        }
        return clpbVar.w(this.a, this.f, i, cllt.b(j));
    }

    public final long t(cmeh cmehVar, long j) {
        long a = cllt.a(j);
        this.n.b.g(cmehVar.a, this.f);
        return a + this.f.a();
    }

    public final void v(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.g.remove(i2);
        }
        cmfn cmfnVar = this.q;
        int[] iArr = new int[cmfnVar.b.length - i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = cmfnVar.b;
            if (i3 < iArr2.length) {
                int i5 = iArr2[i3];
                if (i5 < 0 || i5 >= i) {
                    int i6 = i3 - i4;
                    if (i5 >= 0) {
                        i5 -= i;
                    }
                    iArr[i6] = i5;
                } else {
                    i4++;
                }
                i3++;
            } else {
                this.q = new cmfn(iArr, new Random(cmfnVar.a.nextLong()));
                this.g.isEmpty();
                return;
            }
        }
    }
}
