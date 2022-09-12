package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: earc  reason: default package */
/* loaded from: classes6.dex */
public final class earc extends eaqp {
    private static final eaon E = new eaqy();
    private static final ConcurrentHashMap<eaou, earc> F = new ConcurrentHashMap<>();
    private static final earc G = W(eaou.b);
    private static final long serialVersionUID = -3474595157769370126L;

    private earc(eaok eaokVar, Object obj) {
        super(eaokVar, obj);
    }

    public static earc W(eaou eaouVar) {
        if (eaouVar == null) {
            eaouVar = eaou.i();
        }
        ConcurrentHashMap<eaou, earc> concurrentHashMap = F;
        earc earcVar = concurrentHashMap.get(eaouVar);
        if (earcVar == null) {
            earc earcVar2 = new earc(earh.Z(eaouVar, null, 4), null);
            earc earcVar3 = new earc(earv.W(earcVar2, new eaol(1, 1, 1, 0, 0, 0, 0, earcVar2), null), "");
            earc putIfAbsent = concurrentHashMap.putIfAbsent(eaouVar, earcVar3);
            return putIfAbsent == null ? earcVar3 : putIfAbsent;
        }
        return earcVar;
    }

    private Object readResolve() {
        eaok eaokVar = this.a;
        return eaokVar == null ? G : W(eaokVar.a());
    }

    @Override // defpackage.eaqp
    protected final void V(eaqo eaqoVar) {
        if (this.b == null) {
            eaqoVar.E = new eatc(new eatj(this, eaqoVar.E), 543);
            eaqoVar.F = new easw(eaqoVar.E, eaop.d);
            eaqoVar.B = new eatc(new eatj(this, eaqoVar.B), 543);
            eaqoVar.H = new easx(new eatc(eaqoVar.F, 99), eaop.e);
            eaqoVar.G = new eatc(new eatg((easx) eaqoVar.H), eaop.f);
            eaqoVar.C = new eatc(new eatg(eaqoVar.B, eaop.k), eaop.k);
            eaqoVar.I = E;
        }
    }

    @Override // defpackage.eaok
    public final eaok b() {
        return G;
    }

    @Override // defpackage.eaok
    public final eaok c(eaou eaouVar) {
        if (eaouVar == null) {
            eaouVar = eaou.i();
        }
        return eaouVar == a() ? this : W(eaouVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof earc)) {
            return false;
        }
        return a().equals(((earc) obj).a());
    }

    public final int hashCode() {
        return a().hashCode() + 499287079;
    }

    @Override // defpackage.eaok
    public final String toString() {
        eaou a = a();
        if (a != null) {
            String str = a.d;
            StringBuilder sb = new StringBuilder(str.length() + 20);
            sb.append("BuddhistChronology");
            sb.append('[');
            sb.append(str);
            sb.append(']');
            return sb.toString();
        }
        return "BuddhistChronology";
    }
}
