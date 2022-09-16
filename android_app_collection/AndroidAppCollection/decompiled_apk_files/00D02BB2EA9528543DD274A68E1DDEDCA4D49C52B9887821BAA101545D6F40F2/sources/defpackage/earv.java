package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: earv  reason: default package */
/* loaded from: classes6.dex */
public final class earv extends eaqp {
    private static final long serialVersionUID = 7670866536893052522L;
    final eaol E;
    final eaol F;
    private transient earv G;

    private earv(eaok eaokVar, eaol eaolVar, eaol eaolVar2) {
        super(eaokVar, null);
        this.E = eaolVar;
        this.F = eaolVar2;
    }

    private final eaox Y(eaox eaoxVar, HashMap<Object, Object> hashMap) {
        if (eaoxVar == null || !eaoxVar.b()) {
            return eaoxVar;
        }
        if (hashMap.containsKey(eaoxVar)) {
            return (eaox) hashMap.get(eaoxVar);
        }
        eart eartVar = new eart(this, eaoxVar);
        hashMap.put(eaoxVar, eartVar);
        return eartVar;
    }

    private final eaon Z(eaon eaonVar, HashMap<Object, Object> hashMap) {
        if (eaonVar == null || !eaonVar.c()) {
            return eaonVar;
        }
        if (hashMap.containsKey(eaonVar)) {
            return (eaon) hashMap.get(eaonVar);
        }
        ears earsVar = new ears(this, eaonVar, Y(eaonVar.s(), hashMap), Y(eaonVar.t(), hashMap), Y(eaonVar.v(), hashMap));
        hashMap.put(eaonVar, earsVar);
        return earsVar;
    }

    @Override // defpackage.eaqp, defpackage.eaqq, defpackage.eaok
    public final long U(long j, int i, int i2, int i3) {
        X(j, null);
        long U = this.a.U(j, i, i2, i3);
        X(U, "resulting");
        return U;
    }

    @Override // defpackage.eaqp
    protected final void V(eaqo eaqoVar) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        eaqoVar.l = Y(eaqoVar.l, hashMap);
        eaqoVar.k = Y(eaqoVar.k, hashMap);
        eaqoVar.j = Y(eaqoVar.j, hashMap);
        eaqoVar.i = Y(eaqoVar.i, hashMap);
        eaqoVar.h = Y(eaqoVar.h, hashMap);
        eaqoVar.g = Y(eaqoVar.g, hashMap);
        eaqoVar.f = Y(eaqoVar.f, hashMap);
        eaqoVar.e = Y(eaqoVar.e, hashMap);
        eaqoVar.d = Y(eaqoVar.d, hashMap);
        eaqoVar.c = Y(eaqoVar.c, hashMap);
        eaqoVar.b = Y(eaqoVar.b, hashMap);
        eaqoVar.a = Y(eaqoVar.a, hashMap);
        eaqoVar.E = Z(eaqoVar.E, hashMap);
        eaqoVar.F = Z(eaqoVar.F, hashMap);
        eaqoVar.G = Z(eaqoVar.G, hashMap);
        eaqoVar.H = Z(eaqoVar.H, hashMap);
        eaqoVar.I = Z(eaqoVar.I, hashMap);
        eaqoVar.x = Z(eaqoVar.x, hashMap);
        eaqoVar.y = Z(eaqoVar.y, hashMap);
        eaqoVar.z = Z(eaqoVar.z, hashMap);
        eaqoVar.D = Z(eaqoVar.D, hashMap);
        eaqoVar.A = Z(eaqoVar.A, hashMap);
        eaqoVar.B = Z(eaqoVar.B, hashMap);
        eaqoVar.C = Z(eaqoVar.C, hashMap);
        eaqoVar.m = Z(eaqoVar.m, hashMap);
        eaqoVar.n = Z(eaqoVar.n, hashMap);
        eaqoVar.o = Z(eaqoVar.o, hashMap);
        eaqoVar.p = Z(eaqoVar.p, hashMap);
        eaqoVar.q = Z(eaqoVar.q, hashMap);
        eaqoVar.r = Z(eaqoVar.r, hashMap);
        eaqoVar.s = Z(eaqoVar.s, hashMap);
        eaqoVar.u = Z(eaqoVar.u, hashMap);
        eaqoVar.t = Z(eaqoVar.t, hashMap);
        eaqoVar.v = Z(eaqoVar.v, hashMap);
        eaqoVar.w = Z(eaqoVar.w, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X(long j, String str) {
        eaol eaolVar = this.E;
        if (eaolVar == null || j >= eaolVar.a) {
            eaol eaolVar2 = this.F;
            if (eaolVar2 != null && j >= eaolVar2.a) {
                throw new earu(this, str, false);
            }
            return;
        }
        throw new earu(this, str, true);
    }

    @Override // defpackage.eaok
    public final eaok b() {
        return c(eaou.b);
    }

    @Override // defpackage.eaok
    public final eaok c(eaou eaouVar) {
        earv earvVar;
        if (eaouVar == null) {
            eaouVar = eaou.i();
        }
        if (eaouVar == a()) {
            return this;
        }
        if (eaouVar == eaou.b && (earvVar = this.G) != null) {
            return earvVar;
        }
        eaol eaolVar = this.E;
        if (eaolVar != null) {
            eapm G = eaolVar.G();
            G.d(eaouVar);
            eaolVar = G.c();
        }
        eaol eaolVar2 = this.F;
        if (eaolVar2 != null) {
            eapm G2 = eaolVar2.G();
            G2.d(eaouVar);
            eaolVar2 = G2.c();
        }
        earv W = W(this.a.c(eaouVar), eaolVar, eaolVar2);
        if (eaouVar == eaou.b) {
            this.G = W;
        }
        return W;
    }

    @Override // defpackage.eaqp, defpackage.eaqq, defpackage.eaok
    public final long d(int i, int i2, int i3, int i4) {
        long d = this.a.d(i, i2, i3, i4);
        X(d, "resulting");
        return d;
    }

    @Override // defpackage.eaqp, defpackage.eaqq, defpackage.eaok
    public final long e(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long e = this.a.e(i, i2, i3, i4, i5, i6, i7);
        X(e, "resulting");
        return e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof earv)) {
            return false;
        }
        earv earvVar = (earv) obj;
        return this.a.equals(earvVar.a) && easy.g(this.E, earvVar.E) && easy.g(this.F, earvVar.F);
    }

    public final int hashCode() {
        eaol eaolVar = this.E;
        int i = 0;
        int hashCode = (eaolVar != null ? eaolVar.hashCode() : 0) + 317351877;
        eaol eaolVar2 = this.F;
        if (eaolVar2 != null) {
            i = eaolVar2.hashCode();
        }
        return hashCode + i + (this.a.hashCode() * 7);
    }

    @Override // defpackage.eaok
    public final String toString() {
        String eaokVar = this.a.toString();
        eaol eaolVar = this.E;
        String str = "NoLimit";
        String eaqcVar = eaolVar == null ? str : eaolVar.toString();
        eaol eaolVar2 = this.F;
        if (eaolVar2 != null) {
            str = eaolVar2.toString();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(eaokVar).length() + 21 + String.valueOf(eaqcVar).length() + String.valueOf(str).length());
        sb.append("LimitChronology[");
        sb.append(eaokVar);
        sb.append(", ");
        sb.append(eaqcVar);
        sb.append(", ");
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    public static earv W(eaok eaokVar, eapp eappVar, eapp eappVar2) {
        if (eaokVar == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        if (eappVar == null) {
            eappVar = null;
        }
        if (eappVar2 == null) {
            eappVar2 = null;
        }
        if (eappVar == null || eappVar2 == null || eappVar.x(eappVar2)) {
            return new earv(eaokVar, (eaol) eappVar, (eaol) eappVar2);
        }
        throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
    }
}
