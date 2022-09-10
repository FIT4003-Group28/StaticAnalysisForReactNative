package defpackage;

import android.os.Handler;
import android.util.Pair;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clnt  reason: default package */
/* loaded from: classes5.dex */
public final class clnt {
    public final clqv a;
    public int b;
    public boolean c;
    public clnq d;
    public clnq e;
    public clnq f;
    public int g;
    public Object h;
    private final cloz i = new cloz();
    private final clpa j = new clpa();
    private final Handler k;
    private long l;
    private long m;

    public clnt(clqv clqvVar, Handler handler) {
        this.a = clqvVar;
        this.k = handler;
    }

    private static cmeh l(clpb clpbVar, Object obj, long j, long j2, cloz clozVar) {
        clpbVar.g(obj, clozVar);
        int d = clozVar.d(j);
        if (d == -1) {
            return new cmeh(obj, j2, clozVar.e(j));
        }
        return new cmeh(obj, d, clozVar.c(d), j2, -1);
    }

    private final clnr m(clpb clpbVar, Object obj, long j, long j2, long j3) {
        long j4 = j;
        clpbVar.g(obj, this.i);
        int e = this.i.e(j4);
        cmeh cmehVar = new cmeh(obj, j3, e);
        boolean p = p(cmehVar);
        boolean n = n(clpbVar, cmehVar);
        boolean o = o(clpbVar, cmehVar, p);
        long b = e != -1 ? this.i.b(e) : -9223372036854775807L;
        long j5 = (b == -9223372036854775807L || b == Long.MIN_VALUE) ? this.i.d : b;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0L, (-1) + j5);
        }
        return new clnr(cmehVar, j4, j2, b, j5, p, n, o);
    }

    private final boolean n(clpb clpbVar, cmeh cmehVar) {
        if (!p(cmehVar)) {
            return false;
        }
        return clpbVar.u(clpbVar.g(cmehVar.a, this.i).c, this.j).m == clpbVar.i(cmehVar.a);
    }

    private final boolean o(clpb clpbVar, cmeh cmehVar, boolean z) {
        int i = clpbVar.i(cmehVar.a);
        return !clpbVar.u(clpbVar.y(i, this.i).c, this.j).i && clpbVar.v(i, this.i, this.j, this.b, this.c) == -1 && z;
    }

    private static final boolean p(cmeh cmehVar) {
        return !cmehVar.b() && cmehVar.e == -1;
    }

    public final boolean a(cmeg cmegVar) {
        clnq clnqVar = this.f;
        return clnqVar != null && clnqVar.a == cmegVar;
    }

    public final void b(long j) {
        clnq clnqVar = this.f;
        if (clnqVar != null) {
            cmmn.c(clnqVar.j());
            if (!clnqVar.d) {
                return;
            }
            clnqVar.a.g(clnqVar.b(j));
        }
    }

    public final clnq c() {
        clnq clnqVar = this.d;
        if (clnqVar == null) {
            return null;
        }
        if (clnqVar == this.e) {
            this.e = clnqVar.h;
        }
        clnqVar.h();
        int i = this.g - 1;
        this.g = i;
        if (i == 0) {
            this.f = null;
            clnq clnqVar2 = this.d;
            this.h = clnqVar2.b;
            this.m = clnqVar2.f.a.d;
        }
        this.d = this.d.h;
        h();
        return this.d;
    }

    public final boolean d(clnq clnqVar) {
        boolean z = false;
        cmmn.c(clnqVar != null);
        if (clnqVar.equals(this.f)) {
            return false;
        }
        this.f = clnqVar;
        while (true) {
            clnqVar = clnqVar.h;
            if (clnqVar != null) {
                if (clnqVar == this.e) {
                    this.e = this.d;
                    z = true;
                }
                clnqVar.h();
                this.g--;
            } else {
                this.f.i(null);
                h();
                return z;
            }
        }
    }

    public final void e() {
        if (this.g == 0) {
            return;
        }
        clnq clnqVar = this.d;
        cmmn.e(clnqVar);
        this.h = clnqVar.b;
        this.m = clnqVar.f.a.d;
        while (clnqVar != null) {
            clnqVar.h();
            clnqVar = clnqVar.h;
        }
        this.d = null;
        this.f = null;
        this.e = null;
        this.g = 0;
        h();
    }

    public final clnr f(clpb clpbVar, clnr clnrVar) {
        long j;
        cmeh cmehVar = clnrVar.a;
        boolean p = p(cmehVar);
        boolean n = n(clpbVar, cmehVar);
        boolean o = o(clpbVar, cmehVar, p);
        clpbVar.g(clnrVar.a.a, this.i);
        long j2 = -9223372036854775807L;
        if (cmehVar.b()) {
            this.i.f(cmehVar.b);
        } else {
            long j3 = clnrVar.d;
            if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
                j = j3;
                return new clnr(cmehVar, clnrVar.b, clnrVar.c, clnrVar.d, j, p, n, o);
            }
            j2 = this.i.d;
        }
        j = j2;
        return new clnr(cmehVar, clnrVar.b, clnrVar.c, clnrVar.d, j, p, n, o);
    }

    public final cmeh g(clpb clpbVar, Object obj, long j) {
        long j2;
        int i;
        int i2 = clpbVar.g(obj, this.i).c;
        Object obj2 = this.h;
        if (obj2 == null || (i = clpbVar.i(obj2)) == -1 || clpbVar.y(i, this.i).c != i2) {
            clnq clnqVar = this.d;
            while (true) {
                if (clnqVar == null) {
                    clnq clnqVar2 = this.d;
                    while (true) {
                        if (clnqVar2 != null) {
                            int i3 = clpbVar.i(clnqVar2.b);
                            if (i3 != -1 && clpbVar.y(i3, this.i).c == i2) {
                                j2 = clnqVar2.f.a.d;
                                break;
                            }
                            clnqVar2 = clnqVar2.h;
                        } else {
                            j2 = this.l;
                            this.l = 1 + j2;
                            if (this.d == null) {
                                this.h = obj;
                                this.m = j2;
                            }
                        }
                    }
                } else if (clnqVar.b.equals(obj)) {
                    j2 = clnqVar.f.a.d;
                    break;
                } else {
                    clnqVar = clnqVar.h;
                }
            }
        } else {
            j2 = this.m;
        }
        return l(clpbVar, obj, j, j2, this.i);
    }

    public final void h() {
        final dccx F = dcdc.F();
        for (clnq clnqVar = this.d; clnqVar != null; clnqVar = clnqVar.h) {
            F.g(clnqVar.f.a);
        }
        clnq clnqVar2 = this.e;
        final cmeh cmehVar = clnqVar2 == null ? null : clnqVar2.f.a;
        this.k.post(new Runnable(this, F, cmehVar) { // from class: clns
            private final clnt a;
            private final dccx b;
            private final cmeh c;

            {
                this.a = this;
                this.b = F;
                this.c = cmehVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                clnt clntVar = this.a;
                dccx dccxVar = this.b;
                cmeh cmehVar2 = this.c;
                clqv clqvVar = clntVar.a;
                dcdc f = dccxVar.f();
                clqu clquVar = clqvVar.b;
                clog clogVar = clqvVar.c;
                cmmn.f(clogVar);
                clquVar.b = dcdc.r(f);
                if (!f.isEmpty()) {
                    clquVar.d = (cmeh) f.get(0);
                    cmmn.f(cmehVar2);
                    clquVar.e = cmehVar2;
                }
                if (clquVar.c == null) {
                    clquVar.c = clqu.c(clogVar, clquVar.b, clquVar.d, clquVar.a);
                }
                clquVar.b(clogVar.n());
            }
        });
    }

    public final boolean i(clpb clpbVar) {
        clnq clnqVar;
        clnq clnqVar2 = this.d;
        if (clnqVar2 == null) {
            return true;
        }
        int i = clpbVar.i(clnqVar2.b);
        while (true) {
            i = clpbVar.v(i, this.i, this.j, this.b, this.c);
            while (true) {
                clnqVar = clnqVar2.h;
                if (clnqVar == null || clnqVar2.f.f) {
                    break;
                }
                clnqVar2 = clnqVar;
            }
            if (i == -1 || clnqVar == null || clpbVar.i(clnqVar.b) != i) {
                break;
            }
            clnqVar2 = clnqVar;
        }
        boolean d = d(clnqVar2);
        clnqVar2.f = f(clpbVar, clnqVar2.f);
        return !d;
    }

    public final clnr j(clpb clpbVar, clnq clnqVar, long j) {
        long j2;
        long j3;
        clnr clnrVar = clnqVar.f;
        long j4 = (clnqVar.k + clnrVar.e) - j;
        if (clnrVar.f) {
            int v = clpbVar.v(clpbVar.i(clnrVar.a.a), this.i, this.j, this.b, this.c);
            if (v == -1) {
                return null;
            }
            int i = clpbVar.h(v, this.i, true).c;
            Object obj = this.i.b;
            long j5 = clnrVar.a.d;
            if (clpbVar.u(i, this.j).l == v) {
                Pair<Object, Long> x = clpbVar.x(this.j, this.i, i, -9223372036854775807L, Math.max(0L, j4));
                if (x == null) {
                    return null;
                }
                obj = x.first;
                long longValue = ((Long) x.second).longValue();
                clnq clnqVar2 = clnqVar.h;
                if (clnqVar2 != null && clnqVar2.b.equals(obj)) {
                    j5 = clnqVar2.f.a.d;
                } else {
                    j5 = this.l;
                    this.l = 1 + j5;
                }
                j3 = longValue;
                j2 = -9223372036854775807L;
            } else {
                j2 = 0;
                j3 = 0;
            }
            return k(clpbVar, l(clpbVar, obj, j3, j5, this.i), j2, j3);
        }
        cmeh cmehVar = clnrVar.a;
        clpbVar.g(cmehVar.a, this.i);
        if (cmehVar.b()) {
            int i2 = this.i.f.d[cmehVar.b].a;
            return null;
        }
        int d = this.i.d(clnrVar.d);
        if (d == -1) {
            Object obj2 = cmehVar.a;
            long j6 = clnrVar.e;
            return m(clpbVar, obj2, j6, j6, cmehVar.d);
        }
        this.i.c(d);
        this.i.h(d);
        return null;
    }

    public final clnr k(clpb clpbVar, cmeh cmehVar, long j, long j2) {
        clpbVar.g(cmehVar.a, this.i);
        if (cmehVar.b()) {
            cloz clozVar = this.i;
            int i = cmehVar.b;
            int i2 = cmehVar.c;
            clozVar.h(i);
            return null;
        }
        return m(clpbVar, cmehVar.a, j2, j, cmehVar.d);
    }
}
