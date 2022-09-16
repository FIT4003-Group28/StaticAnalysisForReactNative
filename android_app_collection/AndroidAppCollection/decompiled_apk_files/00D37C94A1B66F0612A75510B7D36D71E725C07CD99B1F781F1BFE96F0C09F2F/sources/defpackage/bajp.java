package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: bajp  reason: default package */
/* loaded from: classes2.dex */
public final class bajp extends bais {
    private static final long serialVersionUID = -1079258847191166848L;

    private bajp(bahl bahlVar, baht bahtVar) {
        super(bahlVar, bahtVar);
    }

    public static bajp O(bahl bahlVar, baht bahtVar) {
        if (bahlVar != null) {
            bahl a = bahlVar.a();
            if (a == null) {
                throw new IllegalArgumentException("UTC chronology must not be null");
            }
            if (bahtVar == null) {
                throw new IllegalArgumentException("DateTimeZone must not be null");
            }
            return new bajp(a, bahtVar);
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean P(bahv bahvVar) {
        return bahvVar != null && bahvVar.e() < 43200000;
    }

    private final bahn Q(bahn bahnVar, HashMap hashMap) {
        if (bahnVar == null || !bahnVar.t()) {
            return bahnVar;
        }
        if (hashMap.containsKey(bahnVar)) {
            return (bahn) hashMap.get(bahnVar);
        }
        bajn bajnVar = new bajn(bahnVar, (baht) this.b, R(bahnVar.p(), hashMap), R(bahnVar.r(), hashMap), R(bahnVar.q(), hashMap));
        hashMap.put(bahnVar, bajnVar);
        return bajnVar;
    }

    private final bahv R(bahv bahvVar, HashMap hashMap) {
        if (bahvVar == null || !bahvVar.h()) {
            return bahvVar;
        }
        if (hashMap.containsKey(bahvVar)) {
            return (bahv) hashMap.get(bahvVar);
        }
        bajo bajoVar = new bajo(bahvVar, (baht) this.b);
        hashMap.put(bahvVar, bajoVar);
        return bajoVar;
    }

    @Override // defpackage.bais
    protected final void N(bair bairVar) {
        HashMap hashMap = new HashMap();
        bairVar.l = R(bairVar.l, hashMap);
        bairVar.k = R(bairVar.k, hashMap);
        bairVar.j = R(bairVar.j, hashMap);
        bairVar.i = R(bairVar.i, hashMap);
        bairVar.h = R(bairVar.h, hashMap);
        bairVar.g = R(bairVar.g, hashMap);
        bairVar.f = R(bairVar.f, hashMap);
        bairVar.e = R(bairVar.e, hashMap);
        bairVar.d = R(bairVar.d, hashMap);
        bairVar.c = R(bairVar.c, hashMap);
        bairVar.b = R(bairVar.b, hashMap);
        bairVar.a = R(bairVar.a, hashMap);
        bairVar.E = Q(bairVar.E, hashMap);
        bairVar.F = Q(bairVar.F, hashMap);
        bairVar.G = Q(bairVar.G, hashMap);
        bairVar.H = Q(bairVar.H, hashMap);
        bairVar.I = Q(bairVar.I, hashMap);
        bairVar.x = Q(bairVar.x, hashMap);
        bairVar.y = Q(bairVar.y, hashMap);
        bairVar.z = Q(bairVar.z, hashMap);
        bairVar.D = Q(bairVar.D, hashMap);
        bairVar.A = Q(bairVar.A, hashMap);
        bairVar.B = Q(bairVar.B, hashMap);
        bairVar.C = Q(bairVar.C, hashMap);
        bairVar.m = Q(bairVar.m, hashMap);
        bairVar.n = Q(bairVar.n, hashMap);
        bairVar.o = Q(bairVar.o, hashMap);
        bairVar.p = Q(bairVar.p, hashMap);
        bairVar.q = Q(bairVar.q, hashMap);
        bairVar.r = Q(bairVar.r, hashMap);
        bairVar.s = Q(bairVar.s, hashMap);
        bairVar.u = Q(bairVar.u, hashMap);
        bairVar.t = Q(bairVar.t, hashMap);
        bairVar.v = Q(bairVar.v, hashMap);
        bairVar.w = Q(bairVar.w, hashMap);
    }

    @Override // defpackage.bahl
    public final bahl a() {
        return this.a;
    }

    @Override // defpackage.bahl
    public final bahl b(baht bahtVar) {
        if (bahtVar == null) {
            bahtVar = baht.k();
        }
        return bahtVar == this.b ? this : bahtVar == baht.a ? this.a : new bajp(this.a, bahtVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bajp)) {
            return false;
        }
        bajp bajpVar = (bajp) obj;
        if (this.a.equals(bajpVar.a)) {
            if (((baht) this.b).equals(bajpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((baht) this.b).hashCode() * 11) + 326565 + (this.a.hashCode() * 7);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = ((baht) this.b).c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + str.length());
        sb.append("ZonedChronology[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.bais, defpackage.bahl
    public final baht z() {
        return (baht) this.b;
    }
}
