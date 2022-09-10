package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: earh  reason: default package */
/* loaded from: classes6.dex */
public final class earh extends eaqp {
    public static final eapd E = new eapd(-12219292800000L);
    private static final ConcurrentHashMap<eard, earh> I = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    public earr F;
    public earn G;
    public long H;
    private eapd J;
    private long K;

    private earh(eaok eaokVar, earr earrVar, earn earnVar, eapd eapdVar) {
        super(eaokVar, new Object[]{earrVar, earnVar, eapdVar});
    }

    public static long W(long j, eaok eaokVar, eaok eaokVar2) {
        return eaokVar2.d(eaokVar.N().d(j), eaokVar.L().d(j), eaokVar.D().d(j), eaokVar.n().d(j));
    }

    public static long X(long j, eaok eaokVar, eaok eaokVar2) {
        return eaokVar2.n().p(eaokVar2.C().p(eaokVar2.G().p(eaokVar2.I().p(0L, eaokVar.I().d(j)), eaokVar.G().d(j)), eaokVar.C().d(j)), eaokVar.n().d(j));
    }

    public static earh Y() {
        return Z(eaou.b, E, 4);
    }

    public static earh Z(eaou eaouVar, eapr eaprVar, int i) {
        eaou e = eaor.e(eaouVar);
        if (eaprVar == null) {
            eaprVar = E;
        } else if (new eapg(((eapd) eaprVar).a, earn.aB(e)).r() <= 0) {
            throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
        }
        eapd eapdVar = (eapd) eaprVar;
        eard eardVar = new eard(e, eapdVar, i);
        ConcurrentHashMap<eard, earh> concurrentHashMap = I;
        earh earhVar = concurrentHashMap.get(eardVar);
        if (earhVar == null) {
            if (e == eaou.b) {
                earhVar = new earh(earr.aC(e, i), earn.aC(e, i), eapdVar);
            } else {
                earh Z = Z(eaou.b, eaprVar, i);
                earhVar = new earh(eary.W(Z, e), Z.F, Z.G, Z.J);
            }
            earh putIfAbsent = concurrentHashMap.putIfAbsent(eardVar, earhVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return earhVar;
    }

    private Object readResolve() {
        return Z(a(), this.J, aa());
    }

    @Override // defpackage.eaqp
    protected final void V(eaqo eaqoVar) {
        Object[] objArr = (Object[]) this.b;
        earr earrVar = (earr) objArr[0];
        earn earnVar = (earn) objArr[1];
        eapd eapdVar = (eapd) objArr[2];
        long j = eapdVar.a;
        this.K = j;
        this.F = earrVar;
        this.G = earnVar;
        this.J = eapdVar;
        if (this.a == null) {
            if (((eaqt) earrVar).G != ((eaqt) earnVar).G) {
                throw new IllegalArgumentException();
            }
            this.H = j - ab(j);
            eaqoVar.a(earnVar);
            if (earnVar.i.d(this.K) == 0) {
                eaqoVar.m = new eare(this, earrVar.h, eaqoVar.m, this.K);
                eaqoVar.n = new eare(this, earrVar.i, eaqoVar.n, this.K);
                eaqoVar.o = new eare(this, earrVar.j, eaqoVar.o, this.K);
                eaqoVar.p = new eare(this, earrVar.k, eaqoVar.p, this.K);
                eaqoVar.q = new eare(this, earrVar.l, eaqoVar.q, this.K);
                eaqoVar.r = new eare(this, earrVar.m, eaqoVar.r, this.K);
                eaqoVar.s = new eare(this, earrVar.n, eaqoVar.s, this.K);
                eaqoVar.u = new eare(this, earrVar.p, eaqoVar.u, this.K);
                eaqoVar.t = new eare(this, earrVar.o, eaqoVar.t, this.K);
                eaqoVar.v = new eare(this, earrVar.q, eaqoVar.v, this.K);
                eaqoVar.w = new eare(this, earrVar.r, eaqoVar.w, this.K);
            }
            eaqoVar.I = new eare(this, earrVar.D, eaqoVar.I, this.K);
            eaqoVar.z = new eare(this, earrVar.u, eaqoVar.z, earnVar.z.G(this.K));
            eaqoVar.A = new eare(this, earrVar.v, eaqoVar.A, earnVar.w.G(this.K), true);
            eaqoVar.E = new earf(this, earrVar.z, eaqoVar.E, this.K);
            eaqoVar.j = eaqoVar.E.s();
            eaqoVar.F = new earf(this, earrVar.A, eaqoVar.F, eaqoVar.j, this.K);
            eaqoVar.G = new earf(this, earrVar.B, eaqoVar.G, eaqoVar.j, this.K);
            eaqoVar.H = new earf(this, earrVar.C, eaqoVar.H, this.K);
            eaqoVar.k = eaqoVar.H.s();
            eaqoVar.D = new earf(this, earrVar.y, eaqoVar.D, this.K);
            eaqoVar.i = eaqoVar.D.s();
            eaqoVar.B = new earf(this, earrVar.w, eaqoVar.B, null, this.K, true);
            eaqoVar.C = new earf(this, earrVar.x, eaqoVar.C, eaqoVar.h, this.K);
            eaqoVar.h = eaqoVar.B.s();
            eare eareVar = new eare(this, earrVar.t, eaqoVar.y, this.K);
            eareVar.f = eaqoVar.i;
            eaqoVar.y = eareVar;
        }
    }

    @Override // defpackage.eaqp, defpackage.eaok
    public final eaou a() {
        eaok eaokVar = this.a;
        if (eaokVar != null) {
            return eaokVar.a();
        }
        return eaou.b;
    }

    public final int aa() {
        return ((eaqt) this.G).G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long ab(long j) {
        return W(j, this.F, this.G);
    }

    @Override // defpackage.eaok
    public final eaok b() {
        return c(eaou.b);
    }

    @Override // defpackage.eaok
    public final eaok c(eaou eaouVar) {
        if (eaouVar == null) {
            eaouVar = eaou.i();
        }
        return eaouVar == a() ? this : Z(eaouVar, this.J, aa());
    }

    @Override // defpackage.eaqp, defpackage.eaqq, defpackage.eaok
    public final long d(int i, int i2, int i3, int i4) {
        eaok eaokVar = this.a;
        if (eaokVar != null) {
            return eaokVar.d(i, i2, i3, i4);
        }
        long d = this.G.d(i, i2, i3, i4);
        if (d < this.K) {
            d = this.F.d(i, i2, i3, i4);
            if (d >= this.K) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return d;
    }

    @Override // defpackage.eaqp, defpackage.eaqq, defpackage.eaok
    public final long e(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long j;
        int i8;
        int i9;
        eaok eaokVar = this.a;
        if (eaokVar != null) {
            return eaokVar.e(i, i2, i3, i4, i5, i6, i7);
        }
        try {
            j = this.G.e(i, i2, i3, i4, i5, i6, i7);
            i8 = i2;
            i9 = i3;
        } catch (eapb e) {
            if (i2 != 2 || i3 != 29) {
                throw e;
            }
            long e2 = this.G.e(i, 2, 28, i4, i5, i6, i7);
            if (e2 >= this.K) {
                throw e;
            }
            j = e2;
            i8 = 2;
            i9 = 29;
        }
        if (j < this.K) {
            j = this.F.e(i, i8, i9, i4, i5, i6, i7);
            if (j >= this.K) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof earh) {
            earh earhVar = (earh) obj;
            if (this.K == earhVar.K && aa() == earhVar.aa() && a().equals(earhVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode() + 25025 + aa() + this.J.hashCode();
    }

    @Override // defpackage.eaok
    public final String toString() {
        eatp eatpVar;
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology");
        stringBuffer.append('[');
        stringBuffer.append(a().d);
        if (this.K != E.a) {
            stringBuffer.append(",cutover=");
            if (((eaqp) b()).u.H(this.K) == 0) {
                eatpVar = eaul.c;
            } else {
                eatpVar = eaul.g;
            }
            eatpVar.b(b()).e(stringBuffer, this.K);
        }
        if (aa() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(aa());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    private earh(earr earrVar, earn earnVar, eapd eapdVar) {
        super(null, new Object[]{earrVar, earnVar, eapdVar});
    }
}
