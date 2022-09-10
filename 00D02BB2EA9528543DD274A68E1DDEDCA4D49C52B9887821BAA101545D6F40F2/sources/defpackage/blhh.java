package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blhh  reason: default package */
/* loaded from: classes3.dex */
public final class blhh extends blii {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public blhh(defpackage.btvo r12, defpackage.buuy r13, defpackage.dehq r14, defpackage.cdqt r15, defpackage.blhw r16) {
        /*
            r11 = this;
            boolean r0 = r16.l()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            r0 = r15
            cdqb r0 = (defpackage.cdqb) r0
            cdqr r0 = r0.a
            dcdc r0 = r0.b()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L18
            goto L1a
        L18:
            r9 = 0
            goto L1b
        L1a:
            r9 = 1
        L1b:
            dbsg r0 = r16.f()
            dbty r2 = defpackage.blhg.a
            java.lang.Object r0 = r0.e(r2)
            djck r0 = (defpackage.djck) r0
            dsrj<docg> r2 = r0.g
            int r2 = r2.size()
            if (r2 <= 0) goto L3e
            dsrj<docg> r0 = r0.g
            java.lang.Object r0 = r0.get(r1)
            docg r0 = (defpackage.docg) r0
            cdja r1 = defpackage.cdja.PUBLISHED
            cdrr r0 = defpackage.cdrr.r(r0, r1)
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r10 = r0
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blhh.<init>(btvo, buuy, dehq, cdqt, blhw):void");
    }

    @Override // defpackage.blii
    protected final dbsg<blih> c(cdqt cdqtVar) {
        dbsg dbsgVar;
        if (!this.e.l()) {
            return dbpy.a;
        }
        dcdc<cdjd> b = cdqtVar.b().b();
        cdqr b2 = cdqtVar.b();
        boolean z = b2.c().d && b2.c().c;
        cdqr b3 = cdqtVar.b();
        if ((b3.c().a & 4) != 0) {
            dbsgVar = dbsg.i(b3.c().e);
        } else {
            dbsgVar = dbpy.a;
        }
        return dbsg.i(blih.d(b, z, dbsgVar));
    }
}
