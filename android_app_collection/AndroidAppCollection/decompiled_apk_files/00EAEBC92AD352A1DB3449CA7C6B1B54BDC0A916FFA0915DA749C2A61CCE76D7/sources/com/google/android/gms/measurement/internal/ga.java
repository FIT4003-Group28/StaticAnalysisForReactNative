package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ga extends o9 {

    /* renamed from: d  reason: collision with root package name */
    private String f7330d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Integer> f7331e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, ia> f7332f;

    /* renamed from: g  reason: collision with root package name */
    private Long f7333g;

    /* renamed from: h  reason: collision with root package name */
    private Long f7334h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ga(r9 r9Var) {
        super(r9Var);
    }

    private final ia a(int i) {
        if (this.f7332f.containsKey(Integer.valueOf(i))) {
            return this.f7332f.get(Integer.valueOf(i));
        }
        ia iaVar = new ia(this, this.f7330d, null);
        this.f7332f.put(Integer.valueOf(i), iaVar);
        return iaVar;
    }

    private final boolean a(int i, int i2) {
        if (this.f7332f.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return ia.a(this.f7332f.get(Integer.valueOf(i))).get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x062d, code lost:
        r7 = c().v();
        r9 = com.google.android.gms.measurement.internal.z3.a(r46.f7330d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x063f, code lost:
        if (r8.n() == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0641, code lost:
        r8 = java.lang.Integer.valueOf(r8.o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x064a, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x064b, code lost:
        r7.a("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r8));
        r11 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x02ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<c.e.a.b.d.g.g1> a(java.lang.String r47, java.util.List<c.e.a.b.d.g.i1> r48, java.util.List<c.e.a.b.d.g.q1> r49, java.lang.Long r50, java.lang.Long r51) {
        /*
            Method dump skipped, instructions count: 1799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ga.a(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.o9
    protected final boolean s() {
        return false;
    }
}
