package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: eary  reason: default package */
/* loaded from: classes6.dex */
public final class eary extends eaqp {
    private static final long serialVersionUID = -1079258847191166848L;

    private eary(eaok eaokVar, eaou eaouVar) {
        super(eaokVar, eaouVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean X(eaox eaoxVar) {
        return eaoxVar != null && eaoxVar.d() < 43200000;
    }

    private final long Y(long j) {
        eaou a = a();
        int p = a.p(j);
        long j2 = j - p;
        if (p == a.b(j2)) {
            return j2;
        }
        throw new eapc(j2, a.d);
    }

    private final eaox Z(eaox eaoxVar, HashMap<Object, Object> hashMap) {
        if (eaoxVar == null || !eaoxVar.b()) {
            return eaoxVar;
        }
        if (hashMap.containsKey(eaoxVar)) {
            return (eaox) hashMap.get(eaoxVar);
        }
        earx earxVar = new earx(eaoxVar, a());
        hashMap.put(eaoxVar, earxVar);
        return earxVar;
    }

    private final eaon aa(eaon eaonVar, HashMap<Object, Object> hashMap) {
        if (eaonVar == null || !eaonVar.c()) {
            return eaonVar;
        }
        if (hashMap.containsKey(eaonVar)) {
            return (eaon) hashMap.get(eaonVar);
        }
        earw earwVar = new earw(eaonVar, a(), Z(eaonVar.s(), hashMap), Z(eaonVar.t(), hashMap), Z(eaonVar.v(), hashMap));
        hashMap.put(eaonVar, earwVar);
        return earwVar;
    }

    @Override // defpackage.eaqp, defpackage.eaqq, defpackage.eaok
    public final long U(long j, int i, int i2, int i3) {
        return Y(this.a.U(a().b(j) + j, i, i2, i3));
    }

    @Override // defpackage.eaqp
    protected final void V(eaqo eaqoVar) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        eaqoVar.l = Z(eaqoVar.l, hashMap);
        eaqoVar.k = Z(eaqoVar.k, hashMap);
        eaqoVar.j = Z(eaqoVar.j, hashMap);
        eaqoVar.i = Z(eaqoVar.i, hashMap);
        eaqoVar.h = Z(eaqoVar.h, hashMap);
        eaqoVar.g = Z(eaqoVar.g, hashMap);
        eaqoVar.f = Z(eaqoVar.f, hashMap);
        eaqoVar.e = Z(eaqoVar.e, hashMap);
        eaqoVar.d = Z(eaqoVar.d, hashMap);
        eaqoVar.c = Z(eaqoVar.c, hashMap);
        eaqoVar.b = Z(eaqoVar.b, hashMap);
        eaqoVar.a = Z(eaqoVar.a, hashMap);
        eaqoVar.E = aa(eaqoVar.E, hashMap);
        eaqoVar.F = aa(eaqoVar.F, hashMap);
        eaqoVar.G = aa(eaqoVar.G, hashMap);
        eaqoVar.H = aa(eaqoVar.H, hashMap);
        eaqoVar.I = aa(eaqoVar.I, hashMap);
        eaqoVar.x = aa(eaqoVar.x, hashMap);
        eaqoVar.y = aa(eaqoVar.y, hashMap);
        eaqoVar.z = aa(eaqoVar.z, hashMap);
        eaqoVar.D = aa(eaqoVar.D, hashMap);
        eaqoVar.A = aa(eaqoVar.A, hashMap);
        eaqoVar.B = aa(eaqoVar.B, hashMap);
        eaqoVar.C = aa(eaqoVar.C, hashMap);
        eaqoVar.m = aa(eaqoVar.m, hashMap);
        eaqoVar.n = aa(eaqoVar.n, hashMap);
        eaqoVar.o = aa(eaqoVar.o, hashMap);
        eaqoVar.p = aa(eaqoVar.p, hashMap);
        eaqoVar.q = aa(eaqoVar.q, hashMap);
        eaqoVar.r = aa(eaqoVar.r, hashMap);
        eaqoVar.s = aa(eaqoVar.s, hashMap);
        eaqoVar.u = aa(eaqoVar.u, hashMap);
        eaqoVar.t = aa(eaqoVar.t, hashMap);
        eaqoVar.v = aa(eaqoVar.v, hashMap);
        eaqoVar.w = aa(eaqoVar.w, hashMap);
    }

    @Override // defpackage.eaqp, defpackage.eaok
    public final eaou a() {
        return (eaou) this.b;
    }

    @Override // defpackage.eaok
    public final eaok b() {
        return this.a;
    }

    @Override // defpackage.eaok
    public final eaok c(eaou eaouVar) {
        if (eaouVar == null) {
            eaouVar = eaou.i();
        }
        return eaouVar == this.b ? this : eaouVar == eaou.b ? this.a : new eary(this.a, eaouVar);
    }

    @Override // defpackage.eaqp, defpackage.eaqq, defpackage.eaok
    public final long d(int i, int i2, int i3, int i4) {
        return Y(this.a.d(i, i2, i3, i4));
    }

    @Override // defpackage.eaqp, defpackage.eaqq, defpackage.eaok
    public final long e(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return Y(this.a.e(i, i2, i3, i4, i5, i6, i7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eary)) {
            return false;
        }
        eary earyVar = (eary) obj;
        return this.a.equals(earyVar.a) && a().equals(earyVar.a());
    }

    public final int hashCode() {
        return (a().hashCode() * 11) + 326565 + (this.a.hashCode() * 7);
    }

    @Override // defpackage.eaok
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = a().d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + str.length());
        sb.append("ZonedChronology[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    public static eary W(eaok eaokVar, eaou eaouVar) {
        if (eaokVar == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        eaok b = eaokVar.b();
        if (b == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (eaouVar == null) {
            throw new IllegalArgumentException("DateTimeZone must not be null");
        }
        return new eary(b, eaouVar);
    }
}
