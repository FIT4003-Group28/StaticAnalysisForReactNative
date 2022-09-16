package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: bajl  reason: default package */
/* loaded from: classes2.dex */
public final class bajl extends bais {
    public static final bajl n;
    private static final ConcurrentHashMap o;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        o = concurrentHashMap;
        bajl bajlVar = new bajl(bajj.G);
        n = bajlVar;
        concurrentHashMap.put(baht.a, bajlVar);
    }

    private bajl(bahl bahlVar) {
        super(bahlVar, null);
    }

    public static bajl O() {
        return P(baht.k());
    }

    public static bajl P(baht bahtVar) {
        if (bahtVar == null) {
            bahtVar = baht.k();
        }
        ConcurrentHashMap concurrentHashMap = o;
        bajl bajlVar = (bajl) concurrentHashMap.get(bahtVar);
        if (bajlVar == null) {
            bajlVar = new bajl(bajp.O(n, bahtVar));
            bajl bajlVar2 = (bajl) concurrentHashMap.putIfAbsent(bahtVar, bajlVar);
            if (bajlVar2 != null) {
                return bajlVar2;
            }
        }
        return bajlVar;
    }

    private Object writeReplace() {
        return new bajk(z());
    }

    @Override // defpackage.bais
    protected final void N(bair bairVar) {
        if (this.a.z() == baht.a) {
            bairVar.H = new bajv(bajm.a, bahp.e);
            bairVar.G = new bake((bajv) bairVar.H, bahp.f);
            bairVar.C = new bake((bajv) bairVar.H, bahp.k);
            bairVar.k = bairVar.H.p();
        }
    }

    @Override // defpackage.bahl
    public final bahl a() {
        return n;
    }

    @Override // defpackage.bahl
    public final bahl b(baht bahtVar) {
        if (bahtVar == null) {
            bahtVar = baht.k();
        }
        return bahtVar == z() ? this : P(bahtVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bajl)) {
            return false;
        }
        return z().equals(((bajl) obj).z());
    }

    public final int hashCode() {
        return z().hashCode() + 800855;
    }

    public final String toString() {
        baht z = z();
        if (z != null) {
            String str = z.c;
            StringBuilder sb = new StringBuilder(str.length() + 15);
            sb.append("ISOChronology[");
            sb.append(str);
            sb.append(']');
            return sb.toString();
        }
        return "ISOChronology";
    }
}
