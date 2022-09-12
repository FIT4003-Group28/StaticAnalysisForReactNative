package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: earp  reason: default package */
/* loaded from: classes6.dex */
public final class earp extends eaqp {
    public static final earp E;
    private static final ConcurrentHashMap<eaou, earp> F;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        ConcurrentHashMap<eaou, earp> concurrentHashMap = new ConcurrentHashMap<>();
        F = concurrentHashMap;
        earp earpVar = new earp(earn.H);
        E = earpVar;
        concurrentHashMap.put(eaou.b, earpVar);
    }

    private earp(eaok eaokVar) {
        super(eaokVar, null);
    }

    public static earp W() {
        return X(eaou.i());
    }

    public static earp X(eaou eaouVar) {
        earp putIfAbsent;
        if (eaouVar == null) {
            eaouVar = eaou.i();
        }
        ConcurrentHashMap<eaou, earp> concurrentHashMap = F;
        earp earpVar = concurrentHashMap.get(eaouVar);
        return (earpVar != null || (putIfAbsent = concurrentHashMap.putIfAbsent(eaouVar, (earpVar = new earp(eary.W(E, eaouVar))))) == null) ? earpVar : putIfAbsent;
    }

    private Object writeReplace() {
        return new earo(a());
    }

    @Override // defpackage.eaqp
    protected final void V(eaqo eaqoVar) {
        if (this.a.a() == eaou.b) {
            eaqoVar.H = new easx(earq.a, eaop.e);
            eaqoVar.G = new eatg((easx) eaqoVar.H, eaop.f);
            eaqoVar.C = new eatg((easx) eaqoVar.H, eaop.k);
            eaqoVar.k = eaqoVar.H.s();
        }
    }

    @Override // defpackage.eaok
    public final eaok b() {
        return E;
    }

    @Override // defpackage.eaok
    public final eaok c(eaou eaouVar) {
        if (eaouVar == null) {
            eaouVar = eaou.i();
        }
        return eaouVar == a() ? this : X(eaouVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof earp)) {
            return false;
        }
        return a().equals(((earp) obj).a());
    }

    public final int hashCode() {
        return a().hashCode() + 800855;
    }

    @Override // defpackage.eaok
    public final String toString() {
        eaou a = a();
        if (a != null) {
            String str = a.d;
            StringBuilder sb = new StringBuilder(str.length() + 15);
            sb.append("ISOChronology");
            sb.append('[');
            sb.append(str);
            sb.append(']');
            return sb.toString();
        }
        return "ISOChronology";
    }
}
