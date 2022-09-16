package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axge  reason: default package */
/* loaded from: classes3.dex */
public final class axge implements dzab<dimq> {
    final /* synthetic */ axok a;
    final /* synthetic */ z b;
    final /* synthetic */ axgi c;

    public axge(axgi axgiVar, axok axokVar, z zVar) {
        this.c = axgiVar;
        this.a = axokVar;
        this.b = zVar;
    }

    @Override // defpackage.dzab
    public final void a(dzak dzakVar) {
    }

    @Override // defpackage.dzab
    public final void b(Throwable th) {
        z zVar = this.b;
        axgf e = ((axgh) zVar.h()).e();
        e.e(axgg.SUBSEQUENT_LOAD_ERROR);
        e.f(th);
        zVar.f(e.g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
        r0 = defpackage.dimp.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 == null) goto L41;
     */
    @Override // defpackage.dzab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void c(defpackage.dimq r9) {
        /*
            r8 = this;
            dimq r9 = (defpackage.dimq) r9
            axok r0 = defpackage.axok.FOLLOWERS
            axok r0 = r8.a
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 == r1) goto L19
            r2 = 2
            if (r0 == r2) goto L14
            r0 = 0
            goto L24
        L14:
            dimp r0 = r9.e
            if (r0 != 0) goto L24
            goto L22
        L19:
            dimp r0 = r9.d
            if (r0 != 0) goto L24
            goto L22
        L1e:
            dimp r0 = r9.b
            if (r0 != 0) goto L24
        L22:
            dimp r0 = defpackage.dimp.e
        L24:
            defpackage.dbsk.s(r0)
            z r2 = r8.b
            java.lang.Object r2 = r2.h()
            axgh r2 = (defpackage.axgh) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            dimp r4 = r2.b()
            dsrj<dqae> r4 = r4.c
            r3.<init>(r4)
            java.util.HashSet r4 = new java.util.HashSet
            dbrn r5 = defpackage.axgc.a
            java.util.List r5 = defpackage.dchl.k(r3, r5)
            r4.<init>(r5)
            java.util.HashSet r5 = new java.util.HashSet
            dsrj<dqae> r6 = r0.c
            dbrn r7 = defpackage.axgd.a
            java.util.List r6 = defpackage.dchl.k(r6, r7)
            r5.<init>(r6)
            r5.removeAll(r4)
            dsrj<dqae> r4 = r0.c
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L83
            java.lang.Object r6 = r4.next()
            dqae r6 = (defpackage.dqae) r6
            dqau r7 = r6.b
            if (r7 != 0) goto L6d
            dqau r7 = defpackage.dqau.e
        L6d:
            dqkn r7 = r7.b
            if (r7 != 0) goto L73
            dqkn r7 = defpackage.dqkn.e
        L73:
            java.lang.String r7 = r7.d
            boolean r7 = r5.contains(r7)
            if (r7 == 0) goto L7f
            r3.add(r6)
            goto L5b
        L7f:
            defpackage.axgi.g(r3, r6)
            goto L5b
        L83:
            z r4 = r8.b
            axgf r2 = r2.e()
            int r5 = r0.a
            r1 = r1 & r5
            if (r1 == 0) goto L91
            axgg r1 = defpackage.axgg.PARTIALLY_LOADED
            goto L93
        L91:
            axgg r1 = defpackage.axgg.LOADED
        L93:
            r2.e(r1)
            r1 = 5
            java.lang.Object r1 = r0.cu(r1)
            dsqp r1 = (defpackage.dsqp) r1
            r1.bC(r0)
            dimo r1 = (defpackage.dimo) r1
            boolean r0 = r1.c
            if (r0 == 0) goto Lac
            r1.bF()
            r0 = 0
            r1.c = r0
        Lac:
            MessageType extends dsqw<MessageType, BuilderType> r0 = r1.b
            dimp r0 = (defpackage.dimp) r0
            dsrj r5 = defpackage.dimp.ck()
            r0.c = r5
            r1.a(r3)
            dsqw r0 = r1.bK()
            dimp r0 = (defpackage.dimp) r0
            r2.d(r0)
            axgh r0 = r2.g()
            r4.f(r0)
            axgi r0 = r8.c
            z<dqas> r0 = r0.f
            dqas r9 = r9.g
            if (r9 != 0) goto Ld3
            dqas r9 = defpackage.dqas.c
        Ld3:
            r0.f(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axge.c(java.lang.Object):void");
    }
}
