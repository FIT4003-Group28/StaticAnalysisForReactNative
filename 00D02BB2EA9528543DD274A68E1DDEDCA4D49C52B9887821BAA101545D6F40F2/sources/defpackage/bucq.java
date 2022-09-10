package defpackage;
/* compiled from: PG */
/* renamed from: bucq  reason: default package */
/* loaded from: classes.dex */
public final class bucq implements buex, bubw {
    private static final dcqe a = dcqe.c("bucq");
    private final ckcw b;
    private final bufb c;
    private final buxc d;

    public bucq(ckcw ckcwVar, bufb bufbVar, buxc buxcVar) {
        this.b = ckcwVar;
        this.c = bufbVar;
        this.d = buxcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.buex
    @dzsi
    public final <Q extends dssj, S extends dssj> dyib<Q, S> a(Q q) {
        dyib<Q, S> dyibVar = null;
        for (dyib<? extends dssj, ? extends dssj> dyibVar2 : this.c.a(q.getClass())) {
            if (dyibVar == null || !"google.internal.mothership.maps.mobilemaps.v1.MobileMapsService".equals(dyibVar2.c)) {
                dyibVar = (dyib<Q, S>) dyibVar2;
            }
        }
        if (dyibVar != null) {
            ckcw ckcwVar = this.b;
            dyhy<S> dyhyVar = dyibVar.e;
            if (!(dyhyVar instanceof dyia)) {
                return dyibVar;
            }
            dyia dyiaVar = (dyia) dyhyVar;
            bubr bubrVar = new bubr(ckcwVar, dyiaVar, ((dssj) dyiaVar.a()).bY());
            dyhy dyhyVar2 = dyibVar.d;
            dyhx c = dyib.c();
            c.a = dyhyVar2;
            c.c = dyibVar.a;
            c.d = dyibVar.b;
            c.e = dyibVar.f;
            c.b = bubrVar;
            return c.a();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (defpackage.buxc.b(r1.e, r2) == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // defpackage.bubw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <Q extends defpackage.dssj> boolean b(Q r8) {
        /*
            r7 = this;
            dyib r0 = r7.a(r8)
            buxc r1 = r7.d
            java.lang.Class r2 = r8.getClass()
            dcep<java.lang.String> r3 = defpackage.buxc.b
            java.lang.String r4 = r2.getName()
            boolean r3 = r3.contains(r4)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1a
        L18:
            r1 = 1
            goto L59
        L1a:
            dzsj<dixz> r3 = r1.f
            java.lang.Object r3 = r3.a()
            dixz r3 = (defpackage.dixz) r3
            boolean r3 = r3.e
            if (r3 != 0) goto L58
            dxio<bvjj> r3 = r1.g
            java.lang.Object r3 = r3.a()
            bvjj r3 = (defpackage.bvjj) r3
            bvjk r6 = defpackage.bvjk.Z
            boolean r3 = r3.m(r6, r5)
            if (r3 != 0) goto L37
            goto L58
        L37:
            dcep<java.lang.String> r3 = defpackage.buxc.c
            java.lang.String r6 = r2.getName()
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L44
            goto L18
        L44:
            r1.a()
            dcep<java.lang.String> r3 = r1.d
            boolean r3 = defpackage.buxc.b(r3, r2)
            if (r3 != 0) goto L18
            dcep<java.lang.String> r1 = r1.e
            boolean r1 = defpackage.buxc.b(r1, r2)
            if (r1 == 0) goto L58
            goto L18
        L58:
            r1 = 0
        L59:
            if (r0 != 0) goto L79
            java.lang.Class r0 = r8.getClass()
            dcep<java.lang.String> r1 = defpackage.buxc.b
            java.lang.String r0 = r0.getName()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L7c
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Class r8 = r8.getClass()
            r0[r4] = r8
            java.lang.String r8 = "Found no descriptor for %s."
            defpackage.bvoo.h(r8, r0)
            goto L7c
        L79:
            if (r1 == 0) goto L7c
            return r5
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bucq.b(dssj):boolean");
    }
}
